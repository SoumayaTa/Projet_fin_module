package com.formation.service;

import com.formation.repository.RepositoryUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ServiceUtilisateur implements UserDetailsService {
    @Autowired
    RepositoryUtilisateur ru;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ru.findByUsername(username);
    }
}
