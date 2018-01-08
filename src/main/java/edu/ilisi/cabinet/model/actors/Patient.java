package edu.ilisi.cabinet.model.actors;

import static edu.ilisi.cabinet.configurations.security.RoleConstants.PATIENT_AUTORITY;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.ilisi.cabinet.model.dossiersmedicaux.Maladie;
import edu.ilisi.cabinet.model.rendezvous.RendezVous;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Home+
 *
 *
 * @version 1.0
 * @created 12-nov.-2017 01:01:55
 */
@Data
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "idPersonne")
@EqualsAndHashCode(callSuper = true)
public class Patient extends Personne {

  /**
   * 
   */
  @Transient
  private static final long serialVersionUID = 4441261846552800186L;

  public Patient() {
    super();
    maladies = new ArrayList<>();
    listRendezVous = new HashSet<>();
  }

  @ManyToMany(mappedBy = "patients", cascade = CascadeType.PERSIST)
  private List<Maladie> maladies;
  @ManyToOne(cascade = CascadeType.REFRESH)
  private RefSex refSex;

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "patient", cascade = CascadeType.ALL)
  private Set<RendezVous> listRendezVous;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return AuthorityUtils.createAuthorityList(PATIENT_AUTORITY);
  }

}