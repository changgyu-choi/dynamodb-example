package com.amazonaws.codesamples;

import com.amazonaws.codesamples.job.Job;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        if (args.length == 0) {
            SpringApplication.run(Application.class, args);
        } else {
            String beanName = args[0];

            ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class);
            Job job = (Job) applicationContext.getBean(beanName);

            try {
                job.start(args[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                job.start();
            }
            System.exit(0);
        }
    }

}
