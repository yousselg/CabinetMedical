package edu.ilisi.cabinet.model.actors;

import static edu.ilisi.cabinet.configurations.security.RoleConstants.ADMIN_AUTORITY;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Home
 * @version 1.0
 * @created 12-nov.-2017 02:58:56
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Secretaire extends Personne {
  /**
  * 
  */
  @Transient
  private static final long serialVersionUID = 521427618501270324L;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return AuthorityUtils.createAuthorityList(ADMIN_AUTORITY);
  }

}