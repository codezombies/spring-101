import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codingzombies.PrinterService;

/**
 * Coding Zombies, LLC 2016
 */

public class PrinterServiceJavaConfigTest {

    public static void main(String[] args) {

        try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.codingzombies")) {
            PrinterService printerService = context.getBean(PrinterService.class);
            printerService.print("Braaaaaaains");
        }
    }

}
