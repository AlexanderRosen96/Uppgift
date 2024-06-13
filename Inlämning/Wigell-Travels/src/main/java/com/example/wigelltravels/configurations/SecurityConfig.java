package com.example.wigelltravels.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/api/v2/customers").hasRole("ADMIN")
                        .requestMatchers("/api/v2/add-destination").hasRole("ADMIN")
                        .requestMatchers("/api/v2/deletedestination/*").hasRole("ADMIN")
                        .requestMatchers("/api/v2/updatedestination/*").hasRole("ADMIN")
                        .requestMatchers("/api/v2/trips").hasRole("USER")
                        .requestMatchers("/api/v2/trips", "/api/v2/booktrip", "/api/v2/updatetrip/*", "/api/v2/mybookings").hasRole("USER")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .logout((logout) -> logout.logoutSuccessUrl("/"))
                .csrf().disable();
        http.cors(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("hej")
                .roles("ADMIN")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("user")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

}
