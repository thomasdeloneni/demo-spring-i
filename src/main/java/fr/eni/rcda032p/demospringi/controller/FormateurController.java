package fr.eni.rcda032p.demospringi.controller;

import fr.eni.rcda032p.demospringi.bll.CoursService;
import fr.eni.rcda032p.demospringi.bll.FormateurService;
import fr.eni.rcda032p.demospringi.bo.Cours;
import fr.eni.rcda032p.demospringi.bo.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/formateurs")
@SessionAttributes({"coursSesssion"})
public class FormateurController {
    private FormateurService formateurService;

    private CoursService coursService;

    @Autowired
    public FormateurController(FormateurService formateurService, CoursService coursService) {
        this.formateurService = formateurService;
        this.coursService = coursService;
    }

    @ModelAttribute("coursSession")
    public List<Cours> chargerCours(){
        System.out.println("Chargement des cours en session...");
        return coursService.getCours();
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

        Formateur formateur = formateurService.findByEmail(email);
        if(formateur!= null) {
            formateur.setNom(nom);
            formateur.setPrenom(prenom);
            formateurService.update(formateur);
        }
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

    @PostMapping("/cours")
    public String ajouterCours(@RequestParam String email, @RequestParam(name = "idCours") String id){
        formateurService.updateCoursFormateur(email, Long.parseLong(id));
        return "redirect:/formateurs/detail?email="+email;
    }
}

