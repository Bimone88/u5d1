package simonemanca.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import simonemanca.u5d1.entities.Menu;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);

		// Utilizziamo il contesto di Spring per ottenere il bean del menù e stamparne il contenuto
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d1Application.class)) {
			Menu menu = context.getBean(Menu.class);
			menu.printMenu();
		}
	}
}

