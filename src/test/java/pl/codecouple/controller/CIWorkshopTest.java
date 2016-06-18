package pl.codecouple.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Krzysztof Chruściel.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(pl.codecouple.Runner.class)
@WebAppConfiguration
public class CIWorkshopTest {

    @Autowired
    WebApplicationContext webCtx;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webCtx).build();
    }

    @Test
    public void shouldReturn200() throws Exception {
        // Then
        mockMvc.perform(get("/")).andExpect(status().is(200));

    }
}