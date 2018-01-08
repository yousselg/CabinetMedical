package edu.ilisi.cabinet.model.actors;

import static edu.ilisi.cabinet.configurations.security.RoleConstants.ADMIN_AUTORITY;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "idPersonne")
public class Administrateur extends Personne {

  /**
   * 
   */
  @Transient
  private static final long serialVersionUID = -5989666173632415970L;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return AuthorityUtils.createAuthorityList(ADMIN_AUTORITY);
  }

}
