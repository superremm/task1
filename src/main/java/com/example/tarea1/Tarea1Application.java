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
		funtionloca(1,2,3,4,5);
		return ResponseEntity.ok(serviceTask1.delete());
	}

	private void funtionloca(int a, int b, int c, int d, int e) {
		System.out.println(a + b + c + d + e);
	}

}
