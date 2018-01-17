package edu.ilisi.cabinet.configurations.security;

import static edu.ilisi.cabinet.configurations.security.RoleConstants.ADMIN_AUTORITY;
import static edu.ilisi.cabinet.configurations.security.RoleConstants.SECRETAIRE_AUTORITY;
import static edu.ilisi.cabinet.configurations.security.SecurityConstants.SIGN_UP_URL_DOCTEUR;
import static edu.ilisi.cabinet.configurations.security.SecurityConstants.SIGN_UP_URL_PATIENT;
import static edu.ilisi.cabinet.configurations.security.SecurityConstants.SIGN_UP_URL_SECRETAIRE;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
  private UserDetailsService userDetailsService;
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  public WebSecurity(UserDetailsService userDetailsService,
      BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.userDetailsService = userDetailsService;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.cors().and().csrf().disable().authorizeRequests()
        .antMatchers(HttpMethod.POST, SIGN_UP_URL_DOCTEUR, SIGN_UP_URL_PATIENT,
            SIGN_UP_URL_SECRETAIRE)
        .permitAll()
        /*************************** EXCLUDE SWAGGER *****************************/
        .antMatchers("/", "/v2/api-docs", "/configuration/ui", "/swagger-resources",
            "/configuration/security", "/swagger-ui.html", "/webjars/**",
            "/swagger-resources/configuration/ui", "/swagger-ui.html",
            "/swagger-resources/configuration/security")
        /************************************************************************/
        .permitAll().antMatchers(HttpMethod.POST, "/docteur", "secretaire").hasAnyAuthority(ADMIN_AUTORITY)
        .antMatchers(HttpMethod.POST, "/*").hasAnyAuthority(ADMIN_AUTORITY, SECRETAIRE_AUTORITY)
        .antMatchers(HttpMethod.PUT, "/*").hasAnyAuthority(ADMIN_AUTORITY, SECRETAIRE_AUTORITY)
        .antMatchers(HttpMethod.DELETE, "/*").hasAnyAuthority(ADMIN_AUTORITY, SECRETAIRE_AUTORITY).anyRequest()
        .authenticated().and().addFilter(new JWTAuthenticationFilter(authenticationManager()))
        .addFilter(new JWTAuthorizationFilter(authenticationManager()))
        .logout();
        //.and()
        // this disables session creation on Spring Security
        //.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  }

  @Override
  public void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    auth.inMemoryAuthentication().withUser("admin").password("password").roles(ADMIN_AUTORITY);
  }

  @Bean
  CorsConfigurationSource corsConfigurationSource() {
    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
    return source;
  }
}