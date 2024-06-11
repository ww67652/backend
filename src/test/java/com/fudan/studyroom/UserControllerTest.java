package com.fudan.studyroom;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fudan.studyroom.controller.UserController;
import com.fudan.studyroom.entity.User;
import com.fudan.studyroom.service.UserService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    private final String url = "/{username}";

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_be_success_when_get_user() throws Exception {
//        User user = new User();
//        user.setUsername("john_doe");
//        user.setPassword("123456");
//
//        when(userService.selectByName("john_doe")).thenReturn(user);
//
//        User resultUser = queryUser("john_doe");
//
//        Assert.assertEquals(user.getUsername(), resultUser.getUsername());
    }

    private User queryUser(String username) throws Exception {
        MvcResult result = mockMvc.perform(get(url, username)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        return new ObjectMapper().readValue(
                result.getResponse().getContentAsString(), new TypeReference<User>() {
                });
    }
}
