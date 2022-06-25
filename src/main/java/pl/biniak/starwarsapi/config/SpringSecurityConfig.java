package pl.biniak.starwarsapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Arrays;

@Configuration
public class SpringSecurityConfig {

  @Bean
  public PasswordEncoder getPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public InMemoryUserDetailsManager get() {
    UserDetails user = User
        .withUsername("user")
        .password(getPasswordEncoder().encode("user"))
        .roles("USER")
        .build();
    UserDetails admin = User
        .withUsername("admin")
        .password(getPasswordEncoder().encode("admin"))
        .roles("ADMIN")
        .build();
    return new InMemoryUserDetailsManager(Arrays.asList(user, admin));
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests()
        .antMatchers("/swagger-ui.html").permitAll()
        .antMatchers("/swagger-ui.html/**").hasRole("ADMIN")
        .antMatchers("/swagger-resources/**").permitAll()
        .antMatchers("/v2/api-docs").permitAll()
        .antMatchers("/webjars/**").permitAll()
        .antMatchers("/characters/**").permitAll()
        .antMatchers("/console/**").permitAll();
    httpSecurity
        .formLogin()
        .permitAll();

    return httpSecurity.build();
  }

}
