package com.dnsoft.springlessons.lesson3JUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//排除不要的类
/*@ComponentScan(excludeFilters={
		  @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=CDPlayer.class)
		  })*/
public class CDPlayerConfig {
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
}
