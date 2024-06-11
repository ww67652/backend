package com.fudan.studyroom;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fudan.studyroom.controller.RoomController;
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

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomControllerTest {
    private final String url = "/rooms";
    private final String roomUrl = "/rooms/{roomName}";

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
    public void should_be_success_when_add_a_new_room() throws Exception {
//        addNewRoom("room1");
//        List<String> rooms = getAllRooms();
//        Assert.assertTrue(rooms.contains("room1"));
    }

    @Test
    public void should_be_success_when_delete_a_room() throws Exception {
//        addNewRoom("room2");
//        mockMvc.perform(delete(roomUrl, "room2")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//        List<String> rooms = getAllRooms();
//        Assert.assertFalse(rooms.contains("room2"));
    }

    private void addNewRoom(String roomName) throws Exception {
        mockMvc.perform(post(roomUrl, roomName)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    private List<String> getAllRooms() throws Exception {
        MvcResult result = mockMvc.perform(get(url)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        return new ObjectMapper().readValue(
                result.getResponse().getContentAsString(), new TypeReference<List<String>>() {
                });
    }
}
