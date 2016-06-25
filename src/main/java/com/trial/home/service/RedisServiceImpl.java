/**
 * 
 */
package com.trial.home.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trial.entities.SSAUser;


/**
 * @author z078713
 *
 */
@Service
public class RedisServiceImpl implements RedisService {

	Logger LOGGER = LoggerFactory.getLogger(RedisServiceImpl.class);
	
	private final RedisTemplate<String, Object> redisTemplate;
	
	@Autowired
	public RedisServiceImpl(RedisTemplate<String, Object> redisTemplate){
		this.redisTemplate = redisTemplate;
	}
	
	@Override
	public void setMyOfferInCache() {
		ValueOperations<String, Object> values = redisTemplate.opsForValue();
		SSAUser user = getUserObject();
		
		long startTime = new Date().getTime();
		values.set(user.getUserId(), user);
		long endTime = new Date().getTime();
		LOGGER.info("set executed in --- "+ (endTime - startTime));
		
		startTime = new Date().getTime();
		Object userValue = values.get(user.getUserId());
		endTime = new Date().getTime();
		LOGGER.info("get executed in --- "+ (endTime - startTime));
	}
	
	
	private SSAUser getUserObject() {
		ObjectMapper mapper = new ObjectMapper();
		InputStream is = SSAUser.class.getResourceAsStream("/user.json");
		try {
			return mapper.readValue(is, SSAUser.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
