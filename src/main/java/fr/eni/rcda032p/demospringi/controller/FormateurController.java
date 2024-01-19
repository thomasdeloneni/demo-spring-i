package fr.eni.rcda032p.demospringi.controller;

import fr.eni.rcda032p.demospringi.bll.FormateurService;
import fr.eni.rcda032p.demospringi.bo.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/formateurs")
public class FormateurController {
    private FormateurService formateurService;

    @Autowired
    public FormateurController(FormateurService formateurService) {
        this.formateurService = formateurService;
    }

    @GetMapping
    public String afficherFormateurs(Model model) {
        List<Formateur> formateurs = formateurService.getFormateurs();
        model.addAttribute("listeFormateurs", formateurs);
        return "view-formateurs";
    }

    @GetMapping("/detail")
    public String detailFormateurParParametre(@RequestParam(name = "email", defaultValue = "coach@campus-eni.fr", required = false) String emailFormateur, Model model) {
        System.out.printf("Le paramètre reçu est : %s%n", emailFormateur);

        Formateur formateur = formateurService.findByEmail(emailFormateur);

        model.addAttribute("formateur", formateur);

        return "view-formateur-detail";
    }

    @PostMapping("/detail")
    public String sauvegarderFormateur(@RequestParam String prenom, @RequestParam String nom, @RequestParam String email) {
        System.out.println("Les paramètres reçus sont :");
        System.out.printf("Prénom : %s%n", prenom);
        System.out.printf("Nom : %s%n", nom);
        System.out.printf("Email : %s%n", email);
        return "redirect:/formateurs";
    }
    @GetMapping({"/detail/variable/","/detail/variable/{email}"})
    public String detailFormateurParVariable(@PathVariable(name = "email", required = false) String emailFormateur) {
        if (null == emailFormateur) {
            emailFormateur = "coach@campus-eni.fr";
        }
        System.out.printf("La variable reçue est : %s%n", emailFormateur);
        return "redirect:/formateurs";
    }
}

