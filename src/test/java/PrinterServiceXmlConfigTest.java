import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codingzombies.PrinterService;

/**
 * Coding Zombies, LLC 2016
 */

public class PrinterServiceXmlConfigTest {

    public static void main(String[] args) {

        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            PrinterService printerService = context.getBean(PrinterService.class);
            printerService.print("Kill all zombies!!!!");
        }
    }

}
