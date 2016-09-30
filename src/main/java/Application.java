import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Application.class);

        SpringApplication.run(Application.class,args);

        logger.info("Hello from Application.class");
    }
}
