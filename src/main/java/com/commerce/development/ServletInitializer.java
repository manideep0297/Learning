package com.commerce.development;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DevelopmentApplication.class);
    }

}


/*
Tomcat -> webserver

webcontainer -> servlets

previous - we use servlets (war)

this is also similar to servlet application so that webcontainer will not get confused by spring
 */