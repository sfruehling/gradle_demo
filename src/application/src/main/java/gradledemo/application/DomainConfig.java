package gradledemo.application;

import gradledemo.domain.AService;
import gradledemo.domain.TheService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

    @Bean
    public AService iSiteLoadingService() {
        return new TheService();
    }

}
