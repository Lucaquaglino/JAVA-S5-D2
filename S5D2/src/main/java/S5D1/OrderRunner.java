//package S5D1;
//
//import java.time.LocalDateTime;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
//import S5D1.entities.Bevande;
//import S5D1.entities.Ordine;
//import S5D1.entities.OrdineMenu;
//import S5D1.entities.Pizza;
//import S5D1.entities.StatoOrdine;
//import S5D1.entities.Tavolo;
//
//@Component
//@PropertySource("classpath:application.properties")
//
//public class OrderRunner implements CommandLineRunner {
//	@Value("${application.costo.coperto}")
//	private int costoCoperto;
//	private final Pizza margherita;
//	private final Pizza hawaiian;
//	private final Bevande wine;
//
//	public OrderRunner(Pizza margherita, Pizza hawaiian, Bevande wine) {
//		this.margherita = margherita;
//		this.hawaiian = hawaiian;
//		this.wine = wine;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		OrdineMenu pizzaMargherita = new OrdineMenu("Margherita", margherita.getPrice(), "Senza pomodoro");
//		OrdineMenu pizzaHawaiian = new OrdineMenu("Hawaiian", hawaiian.getPrice(), "Extra ananas");
//		OrdineMenu bevandaOrdinata = new OrdineMenu(wine.getName(), wine.getPrice(), "Con ghiaccio");
//		Tavolo tavolo = new Tavolo(2, 10, true);
//		Ordine nuovoOrdine = new Ordine(1, StatoOrdine.IN_CORSO, 4, LocalDateTime.now(), tavolo);
//		nuovoOrdine.getElementiMenu().add(pizzaMargherita);
//		nuovoOrdine.getElementiMenu().add(pizzaHawaiian);
//		nuovoOrdine.getElementiMenu().add(bevandaOrdinata);
//		nuovoOrdine.setTavolo(tavolo);
//
//		System.out.println("Ordine:");
//		System.out.println("Numero Ordine: " + nuovoOrdine.getNumeroOrdine());
//		System.out.println("Numero Tavolo: " + tavolo.getNumero());
//		System.out.println("Tavolo Occupato: " + tavolo.isOccupato());
//		System.out.println("Stato: " + nuovoOrdine.getStato());
//		System.out.println("Numero Coperti: " + nuovoOrdine.getNumeroCoperti());
//		System.out.println("Ora di Acquisizione: " + nuovoOrdine.getOraAcquisizione());
//		System.out.println("Costo Coperto: " + nuovoOrdine.getCostoCoperto());
//		System.out.println("Elementi Menu Ordinati: ");
//		for (OrdineMenu elemento : nuovoOrdine.getElementiMenu()) {
//			System.out.println(
//					"- " + elemento.getNome() + ", Prezzo: " + elemento.getPrezzo() + ", Nota: " + elemento.getNote());
//		}
//		System.out.println("Importo Totale: " + nuovoOrdine.getImportoTotale());
//	}
//}

package S5D1;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import S5D1.entities.Bevande;
import S5D1.entities.Ordine;
import S5D1.entities.OrdineMenu;
import S5D1.entities.Pizza;
import S5D1.entities.StatoOrdine;
import S5D1.entities.Tavolo;

@Component
public class OrderRunner implements CommandLineRunner {
	@Autowired
	private Ordine nuovoOrdine;
	private final Pizza margherita;
	private final Pizza hawaiian;
	private final Bevande wine;

	public OrderRunner(Pizza margherita, Pizza hawaiian, Bevande wine) {
		this.margherita = margherita;
		this.hawaiian = hawaiian;
		this.wine = wine;
	}

	@Override
	public void run(String... args) throws Exception {

		OrdineMenu pizzaMargherita = new OrdineMenu("Margherita", margherita.getPrice(), "Senza pomodoro");
		OrdineMenu pizzaHawaiian = new OrdineMenu("Hawaiian", hawaiian.getPrice(), "Extra ananas");
		OrdineMenu bevandaOrdinata = new OrdineMenu(wine.getName(), wine.getPrice(), "Con ghiaccio");
		Tavolo tavolo = new Tavolo(2, 10, true);
		nuovoOrdine.setNumeroOrdine(1);
		nuovoOrdine.setStato(StatoOrdine.IN_CORSO);
		nuovoOrdine.setNumeroCoperti(4);
		nuovoOrdine.setOraAcquisizione(LocalDateTime.now());
		nuovoOrdine.setTavolo(tavolo);
		nuovoOrdine.getElementiMenu().add(pizzaMargherita);
		nuovoOrdine.getElementiMenu().add(pizzaHawaiian);
		nuovoOrdine.getElementiMenu().add(bevandaOrdinata);
		nuovoOrdine.setTavolo(tavolo);

		System.out.println("Ordine:");
		System.out.println("Numero Ordine: " + nuovoOrdine.getNumeroOrdine());
		System.out.println("Numero Tavolo: " + tavolo.getNumero());
		System.out.println("Tavolo Occupato: " + tavolo.isOccupato());
		System.out.println("Stato: " + nuovoOrdine.getStato());
		System.out.println("Numero Coperti: " + nuovoOrdine.getNumeroCoperti());
		System.out.println("Ora di Acquisizione: " + nuovoOrdine.getOraAcquisizione());
		System.out.println("Costo Coperto: " + nuovoOrdine.getCostoCoperto());
		System.out.println("Elementi Menu Ordinati: ");
		for (OrdineMenu elemento : nuovoOrdine.getElementiMenu()) {
			System.out.println(
					"- " + elemento.getNome() + ", Prezzo: " + elemento.getPrezzo() + ", Nota: " + elemento.getNote());
		}
		System.out.println("Importo Totale: " + nuovoOrdine.getImportoTotale());
	}
}
