package edu.ilisi.cabinet.servicesimpl.actors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.ilisi.cabinet.model.actors.Personne;
import edu.ilisi.cabinet.repositories.actors.PersonneRepository;

@Service

public class PersonneServiceImpl implements UserDetailsService {

  @Autowired
  private PersonneRepository<Personne> repository;

  @Override
  public UserDetails loadUserByUsername(String username) {
    UserDetails applicationUser = repository.findByUsername(username);
    if (applicationUser == null) {
      throw new UsernameNotFoundException(username);
    }
    return new User(applicationUser.getUsername(), applicationUser.getPassword(),
        applicationUser.getAuthorities());
  }

}