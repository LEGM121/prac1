package com.lab.com.Actividad_lu2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActividadLu2Application {
    public class ActividadLabApplication {
        @GetMapping("/saludo")
        public String saludar() {
            return "Bienvenido a la actividad";
        }

        @GetMapping("/saludar")
        public String contexto() {
            return " la hora de empezar a programar cd/ci";
        }
    }


        public static void main(String[] args) {
            SpringApplication.run(ActividadLu2Application.class, args);
        }

    }
