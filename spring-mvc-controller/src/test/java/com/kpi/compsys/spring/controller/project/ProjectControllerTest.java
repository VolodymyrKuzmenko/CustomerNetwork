package com.kpi.compsys.spring.controller.project;

import com.kpi.compsys.service.ProjectService;
import com.kpi.compsys.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


/**
 * Created by Vova on 12/23/2015.
 */
//@ContextConfiguration(locations = {"classpath:spring-servlet.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
public class ProjectControllerTest {

//    @InjectMocks
//    private MockMvc mockMvc;
//
//
////    @Mock
////    private ProjectService projectService;
////
////    @Mock
////    private UserService userService;
//
// //   @Before
//    public void setup() {
//        // Process mock annotations
//        MockitoAnnotations.initMocks(this);
//        System.out.println("tttttttttttt");
//        // Setup Spring test in standalone mode
//        this.mockMvc = MockMvcBuilders.standaloneSetup(mockMvc).build();
//        System.out.println("bbbbbbbbb");
//    }
//
//
//    @Test
//    public void testGetProjectById() throws Exception {
//        System.out.println("==========");
//        ResultActions resultActions = mockMvc.perform(get("/projects"));
//        System.out.println("!!!!");
//        resultActions.andExpect(MockMvcResultMatchers.view().name("projects"));
//    }


}