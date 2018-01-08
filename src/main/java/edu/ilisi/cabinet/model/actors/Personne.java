package edu.ilisi.cabinet.model.actors;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 01:01:56
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne implements UserDetails, CredentialsContainer {

  /**
   * 
   */
  @Transient
  private static final long serialVersionUID = 9131691332444173429L;
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long idPersonne;
  private String nom;
  private String prenom;
  private String email;
  private String CIN;
  private String telephone;
  @Temporal(TemporalType.DATE)
  private Date dateNaissance;
  @Column(unique = true)
  private String username;
  @JsonProperty(access = Access.WRITE_ONLY)
  private String password;

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public void eraseCredentials() {
    password = null;
  }
}