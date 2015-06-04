package coegi.leagueplay;

import org.springframework.web.servlet.ModelAndView;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginControllerTest {
    @Test
    public void loginIsAvailable() {
        LoginController loginController = new LoginController();

        ModelAndView index = loginController.login();

        assertEquals(index.getViewName(), "login", "must set view name as \'login\'");
    }
}
