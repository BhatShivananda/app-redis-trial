/**
 * 
 */
package com.trial.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;


/**
 * @author z078713
 *
 */
@Configuration
public class ConnectionConfiguration {
	@Bean
    public JedisPoolConfig poolConfig() {
        final JedisPoolConfig jedisPoolConfig =  new JedisPoolConfig();         
        jedisPoolConfig.setTestOnBorrow( true );
        jedisPoolConfig.setMaxTotal( 10 );
        return jedisPoolConfig;
    }
    
    @Bean
    public JedisConnectionFactory connectionFactory() {
        final JedisConnectionFactory connectionFactory = 
            new JedisConnectionFactory( poolConfig() );     
        connectionFactory.setHostName( "localhost" );
        connectionFactory.setDatabase( Protocol.DEFAULT_DATABASE );
        connectionFactory.setPort( 22122 );        
        return connectionFactory;
    }
    
    @Bean
    public RedisTemplate<String, Object> redisTemplate( 
            final JedisConnectionFactory connectionFactory ) {        
        final RedisTemplate< String, Object > template = 
            new RedisTemplate< String, Object >();        
        template.setConnectionFactory( connectionFactory );
        template.setKeySerializer( new StringRedisSerializer() );
        return template;
    }
    
}
