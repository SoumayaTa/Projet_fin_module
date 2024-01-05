package com.formation.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlleurUtilisateur {

    @GetMapping("accueil")
    public String accueil() {
        return "Page d'accueil";
    }

    @GetMapping("admin")
    public String admin() {
        return "Page d'ADMIN";
    }

    @GetMapping("user")
    public String user() {
        return "Page d'user";
    }
}
