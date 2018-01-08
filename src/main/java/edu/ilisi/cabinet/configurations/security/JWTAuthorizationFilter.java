package edu.ilisi.cabinet.configurations.security;

import static edu.ilisi.cabinet.configurations.security.SecurityConstants.HEADER_STRING;
import static edu.ilisi.cabinet.configurations.security.SecurityConstants.SECRET;
import static edu.ilisi.cabinet.configurations.security.SecurityConstants.TOKEN_PREFIX;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Jwts;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

  public JWTAuthorizationFilter(AuthenticationManager authManager) {
    super(authManager);
  }

  @Override
  protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res,
      FilterChain chain) throws IOException, ServletException {
    String header = req.getHeader(HEADER_STRING);

    if (header == null || !header.startsWith(TOKEN_PREFIX)) {
      chain.doFilter(req, res);
      return;
    }

    UsernamePasswordAuthenticationToken authentication = getAuthentication(req);

    SecurityContextHolder.getContext().setAuthentication(authentication);

    System.out.println("/*************************************/");

    if (authentication != null)
      System.out.println(authentication.getName() + "  " + authentication.getAuthorities());

    System.out.println("/*************************************/");

    chain.doFilter(req, res);
  }

  private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
    String token = request.getHeader(HEADER_STRING);
    if (token != null) {
      // parse the token.
      String user = Jwts.parser().setSigningKey(SECRET.getBytes())
          .parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody().getSubject();
      String authority = Jwts.parser().setSigningKey(SECRET.getBytes())
          .parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody().getAudience();

      if (user != null) {
        return new UsernamePasswordAuthenticationToken(user, null,
            AuthorityUtils.createAuthorityList(authority));
      }
      return null;
    }
    return null;
  }
}
