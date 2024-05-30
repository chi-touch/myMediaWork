package application;

import application.config.ProjectConfig;
import application.services.HelloService;
import application.services.MailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

//        HelloService helloService = context.getBean(HelloService.class);

//        System.out.println("HelloService been retrieved from context " + helloService);
        System.out.println("beans in context" + Arrays.toString(context.getBeanDefinitionNames()));

//        helloService.sayHello("chichi");

//        BigDecimal amount = context.getBean(BigDecimal.class);

//        System.out.println(amount);

        MailService mailService = context.getBean(MailService.class);

        Class<? extends  MailService>mailServiceClass = mailService.getClass();
        Method declaredMethod = mailServiceClass.getDeclaredMethods()[0];
        declaredMethod.setAccessible(true);
        declaredMethod.canAccess(mailService);
        System.out.println(declaredMethod.canAccess(mailService));


        mailService.sendMailTo("Chichi@gmail.com");
    }
}
