package com.example.tarea1.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceTask3 {
    public String getTask2() {
        return "Hello ServiceTask3";
    }

    public String post() {
        return "Post ServiceTask3";
    }

    public String put() {
        return "Updated ServiceTask3";
    }

    public String delete() {
        return "Deleted ServiceTask3";
    }
}
