package fr.eni.rcda032p.demospringi.beans.controller;

import fr.eni.rcda032p.demospringi.beans.bll.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    public void afficherFormateurs() {
        System.out.println(formateurService.getFormateurs());
    }
}
