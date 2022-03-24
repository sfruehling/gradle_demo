package gradledemo.application.e2e;

import gradledemo.application.Application;
import gradledemo.application.ApplicationConfig;
import gradledemo.application.WebConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest(classes = {Application.class,
        ApplicationConfig.class,
        WebConfig.class})
@AutoConfigureMockMvc
@TestPropertySource(properties = {
        "management.endpoint.health.show-details=always"
})
public class ActuatorIT {

    @Autowired
    MockMvc mockMvc;

    @Test
    void healthEndpointReturns200OnHealthUp() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/actuator/health")
        )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


}
