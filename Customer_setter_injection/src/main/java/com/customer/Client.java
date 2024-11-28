package com.customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.customer.service.CustomerServiceImpl;
import com.customer.util.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        CustomerServiceImpl service = null;
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        service = (CustomerServiceImpl) context.getBean("customerService");
        System.out.println(service.fetchCustomer());
        context.close();
    }
}
