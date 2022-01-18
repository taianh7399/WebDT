package com.example.webbandienthoai.apconfig;


import com.example.webbandienthoai.service.security.CustomUserDetails;
import com.example.webbandienthoai.service.security.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){ return new BCryptPasswordEncoder();}


    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/admin").hasAuthority("Admin")
                .antMatchers("/user").hasAuthority("User")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll();

//        http
//
//                .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll();
//        http
//                .authorizeRequests()
//                .antMatchers("/index").hasAuthority("Admin")
//                .antMatchers("/user").hasAuthority("User")
//                .anyRequest().authenticated()
//                .and().formLogin()
//
//                .permitAll();
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/login").permitAll();
//        http.authorizeRequests().antMatchers("/admin").access("hasAnyRole('Admin','User')");
//        http.authorizeRequests().and().formLogin()
//                .loginProcessingUrl("/j_spring_security_check")
//                .loginPage("/login")
//                .defaultSuccessUrl("/index")
//                .failureUrl("/login?error=true")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");



    }

}
