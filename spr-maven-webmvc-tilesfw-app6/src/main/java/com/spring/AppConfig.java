package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.spring")
public class AppConfig {

	

	/**
	*Configure TilesConfigurer.
	**/
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/views/**/tiles.xml"});

		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;

	}
	
	/**
	*configure ViewResolvers to deliver preferred views.
	*/


	public void configureViewResolvers(ViewResolverRegistry registry) {

		TilesViewResolver viewResolver = new TilesViewResolver();

		registry.viewResolver(viewResolver);
	}
	/**
	*configure ResourceHandlers to serve static resources like CSS/Javascript etc..
	*/
	

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		
		registry.addResourceHandler("/static/**");
	}

}
