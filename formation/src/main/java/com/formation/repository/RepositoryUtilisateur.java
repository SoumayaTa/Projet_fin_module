package com.formation.repository;

import com.formation.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUtilisateur extends JpaRepository<Utilisateur, Long> {
    public UserDetails findByUsername(String username);
}
