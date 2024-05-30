package application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SenderGridMailService implements  MailService {

//    @Autowired
    private HelloService helloService;


    @Autowired

    public SenderGridMailService(HelloService helloService){ //this is a constructor dependency

        System.out.println("creating sendgridmailService");
//        System.out.println("crating hello service");
        this.helloService = helloService;
    }

    @Override
    public void sendMailTo(String email){
        System.out.println("mail sent to " + email+ " using sendgrid");
    }


}
