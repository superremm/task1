package com.example.tarea1.controller;


import com.example.tarea1.ServiceTask2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

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
        when(serviceTask2.getTask2()).thenReturn("Hello ServiceTask2");

        mockMvc.perform(get("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello ServiceTask2"));

        verify(serviceTask2, times(1)).getTask2();
    }

    @Test
    void testPost() throws Exception {
        when(serviceTask2.post()).thenReturn("Post ServiceTask2");

        mockMvc.perform(post("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Post ServiceTask2"));

        verify(serviceTask2, times(1)).post();
    }

    @Test
    void testPut() throws Exception {
        when(serviceTask2.put()).thenReturn("Updated ServiceTask2");

        mockMvc.perform(put("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Updated ServiceTask2"));

        verify(serviceTask2, times(1)).put();
    }

    @Test
    void testDelete() throws Exception {
        when(serviceTask2.delete()).thenReturn("Deleted ServiceTask2");

        mockMvc.perform(delete("/task2/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Deleted ServiceTask2"));

        verify(serviceTask2, times(1)).delete();
    }

}