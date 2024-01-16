package fr.eni.rcda032p.demospringi.beans.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myComponent")
@Scope("prototype")
public class WelcomeComponent {
    public void welcome(){
        System.out.println("Hello, world!");
    }
}
