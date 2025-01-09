package com.example.tarea1;

import org.springframework.stereotype.Service;

@Service
public class ServiceTask2 {
    public String getTask2() {
        return "Hello ServiceTask2";
    }

    public String post() {
        return "Post ServiceTask2";
    }

    public String put() {
        return "Updated ServiceTask2";
    }

    public String delete() {
        return "Deleted ServiceTask2";
    }
}
