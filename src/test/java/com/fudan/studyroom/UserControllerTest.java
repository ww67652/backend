package com.huawei.ibooking.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fudan.studyroom.entity.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.fudan.studyroom.controller.UserController.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@WebAppConfiguration
public class UserControllerTest {
    private final String url = "/user/student";
    private final String queryStuByNumUrl = "/user/student/{id}";

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
    public void should_be_success_when_add_a_new_student() throws Exception {
        final User stuDo = addNewStudent();
        final User queryDo = queryStudent(stuDo);

        Assert.assertEquals(stuDo.getUsername(), queryDo.getUsername());
        Assert.assertEquals(stuDo.getPassword(), queryDo.getPassword());
    }
    private User addNewStudent() {
        // to be continue
        return null;
    }

    @Test
    public void should_be_fail_when_adding_the_same_student() {
        // to be continue
    }


    private User queryStudent(User stuDo) throws Exception {
        final MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                        .get(queryStuByNumUrl, stuDo.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        return new ObjectMapper().readValue(
                result.getResponse().getContentAsString(), new TypeReference<User>() {
                });
    }
}