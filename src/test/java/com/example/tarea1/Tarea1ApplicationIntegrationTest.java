package com.example.tarea1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;

@SpringBootTest
@AutoConfigureMockMvc
class Tarea1ApplicationIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ServiceTask1 serviceTask1;

    @Test
    void testGetTask1() throws Exception {
        when(serviceTask1.getTask1()).thenReturn("Task1 response");

        mockMvc.perform(get("/task1/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Task1 response"));

        verify(serviceTask1, times(1)).getTask1();
    }

    @Test
    void testPost() throws Exception {
        when(serviceTask1.post()).thenReturn("Post response");

        mockMvc.perform(post("/task1/api/v1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Post response"));

        verify(serviceTask1, times(1)).post();
    }

    @Test
    void testPut() throws Exception {
        when(serviceTask1.put()).thenReturn("Put response");

        mockMvc.perform(put("/task1/api/v1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Put response"));

        verify(serviceTask1, times(1)).put();
    }

    @Test
    void testDelete() throws Exception {
        when(serviceTask1.delete()).thenReturn("Delete response");

        mockMvc.perform(delete("/task1/api/v1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Delete response"));

        verify(serviceTask1, times(1)).delete();
    }

    @Test
    void testDelete2() throws Exception {
        when(serviceTask1.delete()).thenReturn("Delete response");

        mockMvc.perform(delete("/task1/api/v1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Delete response"));

        verify(serviceTask1, times(1)).delete();
    }

    @Test
    void testDelete3() throws Exception {
        when(serviceTask1.delete()).thenReturn("Delete response");

        mockMvc.perform(delete("/task1/api/v1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Delete response"));

        verify(serviceTask1, times(1)).delete();
    }

    @Test
    void testDelete4() throws Exception {
        when(serviceTask1.delete()).thenReturn("Delete response");

        mockMvc.perform(delete("/task1/api/v1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Delete response"));

        verify(serviceTask1, times(1)).delete();
    }

    @Test
    void testDelete5() throws Exception {
        when(serviceTask1.delete()).thenReturn("Delete response");

        mockMvc.perform(delete("/task1/api/v1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Delete response"));

        verify(serviceTask1, times(1)).delete();
    }
}
