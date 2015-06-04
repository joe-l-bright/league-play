package coegi.leagueplay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("logi");
    }
}
