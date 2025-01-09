package com.example.tarea1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("task1/api/v1")
public class Tarea1Application {

	public final ServiceTask1 serviceTask1;

    public Tarea1Application(ServiceTask1 serviceTask1) {
        this.serviceTask1 = serviceTask1;
    }

    public static void main(String[] args) {
		SpringApplication.run(Tarea1Application.class, args);
	}

	@GetMapping
	public String getTask1() {
		System.out.println(serviceTask1.getTask1());
		return serviceTask1.getTask1();
	}

	@PostMapping("")
	public ResponseEntity<String> post() {
		return ResponseEntity.ok(serviceTask1.post());
	}

	@PutMapping("")
	public ResponseEntity<String> put() {
		return ResponseEntity.ok(serviceTask1.put());
	}

	@DeleteMapping("")
	public ResponseEntity<String> delete() {
		return ResponseEntity.ok(serviceTask1.delete());
	}

}
