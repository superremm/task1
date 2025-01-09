package com.example.tarea1.controller;

import com.example.tarea1.ServiceTask2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("task2/api/v1")
public class ControllerTask2 {

    private final ServiceTask2 serviceTask2;

    public ControllerTask2(ServiceTask2 serviceTask2) {
        this.serviceTask2 = serviceTask2;
    }

    @GetMapping
    public String getTask1() {
        return serviceTask2.getTask2();
    }

    @PostMapping("")
    public ResponseEntity<String> post() {
        return ResponseEntity.ok(serviceTask2.post());
    }

    @PutMapping("")
    public ResponseEntity<String> put() {
        return ResponseEntity.ok(serviceTask2.put());
    }

    @DeleteMapping("")
    public ResponseEntity<String> delete() {
        return ResponseEntity.ok(serviceTask2.delete());
    }
}
