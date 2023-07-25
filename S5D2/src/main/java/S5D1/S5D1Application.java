package S5D1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class S5D1Application {

	public static void main(String[] args) {
		SpringApplication.run(S5D1Application.class, args);
//		menu();
//		configWithComponent();
	}

//	public static void menu() {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//		Pizza margherita = ctx.getBean("margherita", Pizza.class);
//		Pizza hawaiian = ctx.getBean("hawaiian", Pizza.class);
//
//		System.out.println("Pizza Margherita: " + margherita.getName() + ", Prezzo: " + margherita.getPrice()
//				+ ", Info Nutrizionali: " + margherita.getNutritionalInfo());
//		System.out.println("Pizza Hawaiian: " + hawaiian.getName() + ", Prezzo: " + hawaiian.getPrice()
//				+ ", Info Nutrizionali: " + hawaiian.getNutritionalInfo());
//		log.info(ctx.getBean("margherita").toString());
//		log.info(ctx.getBean("hawaiian").toString());
//		log.info(ctx.getBean("wine").toString());
//
//	}

//	public static void configWithComponent() {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S5D1Application.class);
//
//		OrderRunner test = ctx.getBean(OrderRunner.class);
//
//		System.out.println(test.toString());
//
//		ctx.close();
//	}

}
