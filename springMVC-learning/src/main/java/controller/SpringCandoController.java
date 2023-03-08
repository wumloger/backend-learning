package controller;

import entity.Func;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class SpringCandoController{
   @GetMapping("/cando")
    public ModelAndView cando(){
       ModelAndView md = new ModelAndView();
        ArrayList<Func> list = new ArrayList<>();

        Func f1 = new Func();
        f1.setfImg("https://spring.io/img/icons/microservices.svg");
        f1.setfName("Microservices");
        f1.setfDec("Quickly deliver \n production-grade \n features with \n independently evolvable \n microservices");

       Func f2 = new Func();
       f2.setfImg("https://spring.io/img/icons/reactive.svg");
       f2.setfName("Reactive");
       f2.setfDec("Spring's asynchronous,\n nonblocking architecture \n means you can get more \n from your computing \n resources.");

       Func f3 = new Func();
       f3.setfImg("https://spring.io/img/icons/cloud.svg");
       f3.setfName("Cloud");
       f3.setfDec("Your code, any cloud— \n we’ve got you covered.\n Connect and scale your \n services, whatever your \n platform.");

       Func f4 = new Func();
       f4.setfImg("https://spring.io/img/icons/web-apps.svg");
       f4.setfName("Web apps");
       f4.setfDec("Frameworks for fast,\n secure, and responsive \n web applications \n connected to any data \n store.");

       Func f5 = new Func();
       f5.setfImg("https://spring.io/img/icons/serverless.svg");
       f5.setfName("Serverless");
       f5.setfDec("The ultimate flexibility.\n Scale up on demand and \n scale to zero when \n there’s no demand.");

       Func f6 = new Func();
       f6.setfImg("https://spring.io/img/icons/event-driven.svg");
       f6.setfName("Event Driven");
       f6.setfDec("Integrate with your \n enterprise. React to \n business events. Act on \n your streaming data in \n realtime.");

       Func f7 = new Func();
       f7.setfImg("https://spring.io/img/icons/batch.svg");
       f7.setfName("Batch");
       f7.setfDec("Automated tasks. Offline \n processing of data at a \n time to suit you.");

       list.add(f1);
       list.add(f2);
       list.add(f3);
       list.add(f4);
       list.add(f5);
       list.add(f6);
       list.add(f7);

       md.setViewName("/func");
       md.addObject("list",list);
       md.addObject("hello","hello");
       return md;
   }

}
