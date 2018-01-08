package edu.ilisi.cabinet.configurations.security;

public class RoleConstants {

  private RoleConstants() {
    throw new IllegalStateException("Utility class");
  }
  
  public static final String ADMIN_AUTORITY="ADMIN_AUTORITY";
  public static final String DOCTEUR_AUTORITY="DOCTEUR_AUTORITY";
  public static final String SECRETAIRE_AUTORITY="SECRETAIRE_AUTORITY";
  public static final String PATIENT_AUTORITY="PATIENT_AUTORITY";
}
