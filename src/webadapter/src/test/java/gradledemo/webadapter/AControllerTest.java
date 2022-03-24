package gradledemo.webadapter;

import gradledemo.domain.AForm;
import gradledemo.domain.AService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


class AControllerTest {
    private final AService aService = mock(AService.class);

    private final AController aController = new AController(aService);

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(aController)
                .build();
    }

    @Test
    void runHome_expectsStatusOk() throws Exception {
        when(aService.getForm()).thenReturn(new AForm());

        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("generateForm", instanceOf(AForm.class)))
                .andExpect(view().name("generateForm"));
    }
}
