package helloWorld;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class WebServerTest {

    private WebServer webServer = new WebServer();
    private MockMvc app = standaloneSetup(webServer).build();

    @Test
    public void should_return_200_with_body_for_hello_world() throws Exception {
        app.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));
    }
}