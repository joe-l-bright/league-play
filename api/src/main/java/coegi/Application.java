package coegi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class Application {
    private static final String APPLICATION_NAME = "leagueplay-api";

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        System.setProperty("info.app.name", APPLICATION_NAME);
        SpringApplication.run(Application.class, args);
    }

}
