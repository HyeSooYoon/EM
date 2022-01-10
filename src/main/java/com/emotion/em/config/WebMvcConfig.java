package com.emotion.em.config;

import java.io.IOException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { 
            "classpath:/static/", 
            "classpath:/public/",
            "classpath:/", 
            "classpath:/resources/", 
            "classpath:/resources/templates/", 
            "classpath:/META-INF/resources/",
            "classpath:/META-INF/resources/webjars/" 
        };

    @Override 
    public void addViewControllers(ViewControllerRegistry registry) { 
        registry.addViewController("/").setViewName("forward:/main");  
        registry.addViewController("/main").setViewName("main");  
        registry.addViewController("/em").setViewName("main");  
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);  
    } 

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS)
                                .resourceChain(true)
                                .addResolver(new PathResourceResolver() {
            @Override
            protected Resource getResource(String resourcePath, Resource location) throws IOException {
                Resource requestedResource = location.createRelative(resourcePath);
                return requestedResource.exists() && requestedResource.isReadable() ? requestedResource : new ClassPathResource("/templates/main.html");
            }
        });
    }    
    
}
