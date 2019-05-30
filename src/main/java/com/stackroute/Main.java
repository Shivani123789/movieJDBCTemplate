package com.stackroute;

import com.stackroute.config.SpringJdbcConfig;
import com.stackroute.controller.SpringJdbcController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringJdbcConfig.class);
        ctx.refresh();

        SpringJdbcController springJdbcController =(SpringJdbcController) ctx.getBean("springJdbcController");
//
        System.out.println(springJdbcController.read());
        System.out.println(springJdbcController.getAll());
    }
}
