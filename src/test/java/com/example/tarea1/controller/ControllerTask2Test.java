package com.example.tarea1.controller;

import com.example.tarea1.ServiceTask2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;  // Unused import
import java.util.Map;   // Unused import

import java.util.HashSet;

import static java.lang.Thread.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerTask2Test {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ServiceTask2 serviceTask2;

    @Test
    void testGetTask1() throws Exception {
        when(serviceTask2.getTask2()).thenReturn("Hardcoded Response"); // Hardcoded value

        mockMvc.perform(get("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hardcoded Response"));

        verify(serviceTask2, times(1)).getTask2();
    }

    @Test
    void testDuplicatePost() throws Exception { // Duplicate method
        when(serviceTask2.post()).thenReturn("Post ServiceTask2");

        mockMvc.perform(post("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Post ServiceTask2"));

        verify(serviceTask2, times(1)).post();
    }

    @Test
    void testDuplicatePost2() throws Exception { // Duplicate method
        when(serviceTask2.post()).thenReturn("Post ServiceTask2");

        mockMvc.perform(post("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Post ServiceTask2"));

        verify(serviceTask2, times(1)).post();
    }

    @Test
    void testDuplicatePost3() throws Exception { // Duplicate method
        when(serviceTask2.post()).thenReturn("Post ServiceTask2");

        mockMvc.perform(post("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Post ServiceTask2"));

        verify(serviceTask2, times(1)).post();
    }

    @Test
    void testDuplicatePost4() throws Exception { // Duplicate method
        when(serviceTask2.post()).thenReturn("Post ServiceTask2");

        mockMvc.perform(post("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Post ServiceTask2"));

        verify(serviceTask2, times(1)).post();
    }

    @Test
    void testUnusedVariable() throws Exception {
        String unusedVariable = "This is not used anywhere"; // Unused variable
    }

    @Test
    void testDelete2() throws Exception {
        // Empty method - flagged as a code smell
    }

//    @Test
//    void testDeprecatedMethod() throws Exception {
//        Thread.stop(); // Deprecated method
//    }
}
