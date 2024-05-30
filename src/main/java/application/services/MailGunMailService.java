package application.services;

import org.springframework.stereotype.Component;

@Component
public class MailGunMailService implements MailService{

    @Override
    public void sendMailTo(String email){
        System.out.println("mail delivered to" + email+ "using mailGun");
    }
}
