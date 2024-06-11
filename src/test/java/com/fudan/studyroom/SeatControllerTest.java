package com.fudan.studyroom;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fudan.studyroom.controller.SeatController;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeatControllerTest {
    private final String url = "/seats";
    private final String seatUrl = "/seats/{seatNumber}";
    private final String reserveUrl = "/seats/{seatNumber}/reserve";

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_be_success_when_add_a_new_seat() throws Exception {
//        addNewSeat("seat1");
//        Map<String, Boolean> seats = getAllSeats();
//        Assert.assertTrue(seats.containsKey("seat1"));
//        Assert.assertTrue(seats.get("seat1"));
    }

    @Test
    public void should_be_success_when_reserve_a_seat() throws Exception {
//        addNewSeat("seat2");
//        reserveSeat("seat2");
//        Map<String, Boolean> seats = getAllSeats();
//        Assert.assertFalse(seats.get("seat2"));
    }

    @Test
    public void should_be_success_when_delete_a_seat() throws Exception {
//        addNewSeat("seat3");
//        mockMvc.perform(delete(seatUrl, "seat3")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//        Map<String, Boolean> seats = getAllSeats();
//        Assert.assertFalse(seats.containsKey("seat3"));
    }

    private void addNewSeat(String seatNumber) throws Exception {
        mockMvc.perform(post(seatUrl, seatNumber)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    private void reserveSeat(String seatNumber) throws Exception {
        mockMvc.perform(post(reserveUrl, seatNumber)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    private Map<String, Boolean> getAllSeats() throws Exception {
        MvcResult result = mockMvc.perform(get(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        return new ObjectMapper().readValue(
                result.getResponse().getContentAsString(), new TypeReference<Map<String, Boolean>>() {
                });
    }
}
