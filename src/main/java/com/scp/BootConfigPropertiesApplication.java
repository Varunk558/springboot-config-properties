package com.scp;

import com.scp.beans.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
//This annotation is optional from springboot 3 onwards --> @EnableConfigurationProperties
public class BootConfigPropertiesApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext  = SpringApplication.run(BootConfigPropertiesApplication.class,args);
        Book book = applicationContext.getBean(Book.class);
        System.out.println(book);


    }
}
