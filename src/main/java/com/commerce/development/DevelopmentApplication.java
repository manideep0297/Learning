package com.commerce.development;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevelopmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevelopmentApplication.class, args);
    }

}

/*
MVC - Model View Controller

hotel ->
                                      (Repository)
order -> servent -> kitchen (chef) -> fridge(ingredents) -> goto market to get ingredientds
       (controller) (he will use raw data and cook up something)
                    (Service)

                    view -> to make the data look clean & user friendly (JSP/React)
                    Model -> whatever the data that is going in between we call it as model



 */