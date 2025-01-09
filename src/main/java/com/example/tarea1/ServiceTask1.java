package com.example.tarea1;

import org.springframework.stereotype.Service;

@Service
public class ServiceTask1 {

    public String getTask1() {
        return "Hello World";
    }

    public String post() {
        return "Hello World";
    }

    public String put() {
        return "Updated Hello World";
    }

    public String delete() {
        return "Deleted";
    }
}
