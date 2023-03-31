package com.example.L18filterloggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(1)
public class RequestFilter2 extends HttpFilter {

    private static final Logger logger = LoggerFactory.getLogger(RequestFilter2.class);

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        logger.info("In second Filter");
        logger.info("In second Filter: {}", request.getRequestURI());
        logger.info("In second Filter: {}", request.getQueryString());
        filterChain.doFilter(request, response);
        logger.info("In second Filter: {}, after execution of controller", request.getQueryString());
    }
}
