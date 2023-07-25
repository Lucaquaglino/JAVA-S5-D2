//package S5D1.entities;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Getter
//@Setter
////@PropertySource("classpath:application.properties")
//@Component
//public class Ordine {
//	private int numeroOrdine;
//	private StatoOrdine stato;
//	private int numeroCoperti;
//	private LocalDateTime oraAcquisizione;
//	private List<OrdineMenu> elementiMenu;
//	@Value("${application.costo.coperto}")
//	private int costoCoperto;
//	private Tavolo tavolo;
//
//	public Ordine(int numeroOrdine, StatoOrdine stato, int numeroCoperti, LocalDateTime oraAcquisizione,
//			Tavolo tavolo) {
//		this.numeroOrdine = numeroOrdine;
//		this.stato = stato;
//		this.numeroCoperti = numeroCoperti;
//		this.oraAcquisizione = oraAcquisizione;
//
//		this.elementiMenu = new ArrayList<>();
//
//		this.tavolo = tavolo;
//	}
//
//	public double getImportoTotale() {
//		int numeroCoperti = getNumeroCoperti();
//		int costoCoperto = getCostoCoperto();
//		double importoTotale = numeroCoperti * costoCoperto;
//
//		for (OrdineMenu elemento : elementiMenu) {
//			importoTotale += elemento.getPrezzo();
//		}
//
//		return importoTotale;
//	}
//
//}

package S5D1.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@Component
public class Ordine {
	private int numeroOrdine;
	private StatoOrdine stato;
	private int numeroCoperti;
	private LocalDateTime oraAcquisizione;
	private List<OrdineMenu> elementiMenu;
	@Value("${application.costo.coperto}")
	private int costoCoperto;
	private Tavolo tavolo;

	public Ordine() {
		this.elementiMenu = new ArrayList<>();
	}

	public double getImportoTotale() {
		int numeroCoperti = getNumeroCoperti();
		int costoCoperto = getCostoCoperto();
		double importoTotale = numeroCoperti * costoCoperto;

		for (OrdineMenu elemento : elementiMenu) {
			importoTotale += elemento.getPrezzo();
		}

		return importoTotale;
	}
}
