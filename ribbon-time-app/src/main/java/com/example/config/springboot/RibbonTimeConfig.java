package com.example.config.springboot;

import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class RibbonTimeConfig {

	public IRule ribbonRule() {
		return new RandomRule();
	}
	
}
