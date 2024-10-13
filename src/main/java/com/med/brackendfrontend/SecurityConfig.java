//package com.med.brackendfrontend;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(AbstractHttpConfigurer::disable // Adjust CSRF handling based on your application requirements
//                )
//                .authorizeHttpRequests(authz -> authz
//                        .requestMatchers("/public/**").permitAll() // Allow public access to these endpoints
//                        .anyRequest().authenticated() // Require authentication for all other requests
//                )
//                .formLogin(form -> form
//                        .loginPage("/login") // Custom login page
//                        .permitAll() // Allow everyone to access the login page
//                )
//                .logout(LogoutConfigurer::permitAll // Allow everyone to access logout
//                );
//
//        return http.build();
//    }
//}
