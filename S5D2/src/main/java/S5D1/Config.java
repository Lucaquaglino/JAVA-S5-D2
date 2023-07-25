package S5D1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import S5D1.entities.AnanasDecorator;
import S5D1.entities.Bevande;
import S5D1.entities.MargheritaPizza;
import S5D1.entities.Pizza;
import S5D1.entities.ProsciuttoDecorator;

@Configuration
public class Config {

	@Bean("margherita")
	Pizza margheritaPizza() {
		return new MargheritaPizza();
	}

	@Bean("prosciutto")
	Pizza prosciuttoDecorator() {
		return new ProsciuttoDecorator(margheritaPizza());
	}

	@Bean("ananas")
	Pizza ananasDecorator() {
		return new AnanasDecorator(margheritaPizza());
	}

	@Bean("hawaiian")
	Pizza hawaiianPizza() {
		return new AnanasDecorator(new ProsciuttoDecorator(new MargheritaPizza()));
	}

	@Bean("wine")
	Bevande wine() {
		return new Bevande("Wine", 3, 3);
	}

//	@Value("${costo.coperto}")
//	private int costoCoperto;

//	@Bean
//	Ordine ordine() {
//		return new Ordine(StatoOrdine.IN_CORSO, 3, LocalDateTime.now());
//	}

//	@Bean
//	StatoOrdine statoOrdine() {
//		return StatoOrdine.IN_CORSO;
//	}

}
