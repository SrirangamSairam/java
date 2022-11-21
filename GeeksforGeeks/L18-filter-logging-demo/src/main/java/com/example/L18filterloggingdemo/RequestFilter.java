package com.example.L18filterloggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(2)
public class RequestFilter extends HttpFilter {

    private static final Logger logger = LoggerFactory.getLogger(RequestFilter.class);
    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        MDC.put("requestId", request.getHeader("requestId"));
        logger.info("logging a message before going to controller");
        logger.info("In first Filter: {}", request.getRequestURI());
        logger.info("In first Filter: {}", request.getQueryString());
        filterChain.doFilter(request, response);
        logger.info("In first Filter: {}, after execution of controller", request.getQueryString());
        MDC.clear();
    }
}
