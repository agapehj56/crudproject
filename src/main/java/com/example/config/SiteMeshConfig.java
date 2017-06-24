package com.example.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SiteMeshConfig {
	
	@Bean
	FilterRegistrationBean siteMeshFilter() {
		FilterRegistrationBean filter = new FilterRegistrationBean();
		filter.setFilter(new ConfigurableSiteMeshFilter() {
			@Override
			protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
				builder.addDecoratorPath("/country/*", "/WEB-INF/decorators/default.jsp");
				builder.addDecoratorPath("/city/*", "/WEB-INF/decorators/default.jsp");
				builder.addDecoratorPath("/*", "/WEB-INF/decorators/default.jsp");
				builder.addExcludedPath("/memo/unregister/*");
			}
		});
		return filter;
	}
}
