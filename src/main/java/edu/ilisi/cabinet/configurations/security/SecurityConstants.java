package edu.ilisi.cabinet.configurations.security;

public class SecurityConstants {

  private SecurityConstants() {
    throw new IllegalStateException("Utility class");
  }

  public static final String SECRET = "SecretKeyToGenJWTs";
  public static final long EXPIRATION_TIME = 864_000_000; // 10 days
  public static final String TOKEN_PREFIX = "Bearer ";
  public static final String HEADER_STRING = "Authorization";
  public static final String SIGN_UP_URL_DOCTEUR = "/docteur";
  public static final String SIGN_UP_URL_PATIENT = "/patient";
  public static final String SIGN_UP_URL_SECRETAIRE = "/secretaire";
  public static final String SWAGGER_URL = "/swagger-ui.html/**";
  public static final String WEB_JARS = "/webjars/**";

}
