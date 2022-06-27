package pl.biniak.starwarsapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

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
    httpSecurity.csrf().
        disable();
    httpSecurity.headers()
        .frameOptions()
        .disable();
    httpSecurity.authorizeRequests()
        .antMatchers("/swagger-ui.html").hasAnyRole("USER", "ADMIN")
        .antMatchers("/swagger-ui.html/**").hasRole("ADMIN")
        .antMatchers("/swagger-resources/**").hasAnyRole("USER", "ADMIN")
        .antMatchers("/v2/api-docs").hasAnyRole("USER", "ADMIN")
        .antMatchers("/webjars/**").hasAnyRole("USER", "ADMIN")
        .antMatchers("/characters/**").hasAnyRole("USER", "ADMIN")
        .antMatchers("/health").hasAnyRole("USER", "ADMIN")
        .antMatchers("/metrics").hasAnyRole("USER", "ADMIN")
        .antMatchers("/actuator").hasAnyRole("USER", "ADMIN")
        .anyRequest().authenticated()
        .and()
        .exceptionHandling()
        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));

    httpSecurity
        .formLogin()
        .permitAll();
    return httpSecurity.build();
  }

}
