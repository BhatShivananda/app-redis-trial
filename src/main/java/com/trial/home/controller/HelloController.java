/**
 * 
 */
package com.trial.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trial.home.service.RedisService;

/**
 * @author Shivananda Bhat
 *
 */
@RestController
public class HelloController {
	
	private final RedisService redisService;
	
	@Autowired
	public HelloController(RedisService redisService) {
		this.redisService = redisService;
	}
	
	@RequestMapping("/testRedis")
	public String testRedis() {
		redisService.setMyOfferInCache();
		return "Redis! Redis";
	}
}
