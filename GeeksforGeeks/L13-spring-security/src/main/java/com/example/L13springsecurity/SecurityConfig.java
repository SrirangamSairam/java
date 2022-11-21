package com.example.L13springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AppUserDetailsService appUserDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("sai").password("$2a$10$1K9cpMAvxk9ZrojVljdzCeUEUPW2nnFc5KXmfyTonUF./avVgDRkq").authorities("user")
//                .and().withUser("ram").password("$2a$10$BBTPc3tj7uusN2.0Yyyz9OksBZ7qfbzzBQczZrDZY7Kufl/DOmSrq").authorities("admin");
        auth.userDetailsService(appUserDetailsService);
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests().antMatchers("/admin/*").hasAuthority("admin")
                .antMatchers("/user/*").hasAuthority("user");
        httpSecurity.formLogin();
        httpSecurity.httpBasic();
        httpSecurity.csrf().disable();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
        return new BCryptPasswordEncoder();
    }

}
