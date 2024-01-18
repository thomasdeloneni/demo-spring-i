package fr.eni.rcda032p.demospringi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/formateurs")
public class FormateurController {

    //  @RequestMapping(method = "GET", path = "/formateurs"
    @GetMapping()
    public String afficherFormateurs() {
        System.out.println("Ici nous chargerons la list de nos formateurs via FormateurService");
        return "view-formateurs";
    }

    @GetMapping("/detail")
    public String detailsFormateurParParametre(@RequestParam(name="email", defaultValue = "coach@campus-eni.fr", required = false) String emailFormateur) {
        System.out.printf("Le paramètre reçu est : %s%n", emailFormateur);
        return "view-formateur-detail";
    }

    @PostMapping("/detail")
    public String sauvegarderFormateur(@RequestParam String prenom, @RequestParam String nom,@RequestParam String email) {
        System.out.println( "Les paramètres reçus sont :");
        System.out.printf("Prénom: %s%n", prenom);
        System.out.printf("Nom: %s%n", nom);
        System.out.printf("Email: %s%n", email);
        return "view-formateurs";
    }
    @GetMapping({"/detail/variable/","/detail/variable/{email}"})
    public String detailFormateurParVariable(@PathVariable(name="email", required = false) String emailFormateur){
        if(emailFormateur ==null){
            emailFormateur="coach@campus-eni.fr";
        }
        System.out.printf("La variable reçue est : %s%n", emailFormateur);
        return "view-formateur-detail";
    }
}
