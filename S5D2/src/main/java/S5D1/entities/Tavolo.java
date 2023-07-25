package S5D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Tavolo {

	public Tavolo(int numero, int copertiMassimi, boolean occupato) {
		super();
		this.numero = numero;
		this.copertiMassimi = copertiMassimi;
		this.occupato = occupato;
	}

	private int numero;
	private int copertiMassimi;
	private boolean occupato;

}
