package gradledemo.webadapter;

import gradledemo.domain.AService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AController {

    private AService aService;

    public AController(AService aService) {
        this.aService = aService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("generateForm", aService.getForm());
        return "generateForm";
    }
}
