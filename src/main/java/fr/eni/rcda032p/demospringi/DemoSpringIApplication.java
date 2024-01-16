package fr.eni.rcda032p.demospringi;

import fr.eni.rcda032p.demospringi.beans.controller.FormateurController;
import fr.eni.rcda032p.demospringi.beans.controller.WelcomeComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringIApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoSpringIApplication.class, args);

        //Injection par nom
        WelcomeComponent welcomeComponent = (WelcomeComponent) ctx.getBean("myComponent");
        welcomeComponent.welcome();
        System.out.println("WelcomeComponent 1 :" + welcomeComponent);

        //Injection par Type
        WelcomeComponent welcomeComponentType = (WelcomeComponent) ctx.getBean("myComponent");
        welcomeComponentType.welcome();
        System.out.println("WelcomeComponent 2 :" + welcomeComponentType);

        //Même object si on ne declare pas le @scope("prototype") car le comportement par defaut est scope("singleton")

        //Injection par propriété
        FormateurController formateurController = ctx.getBean(FormateurController.class);
        formateurController.afficherFormateurs();


    }
}
