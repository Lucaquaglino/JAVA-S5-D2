package S5D1.entities;

public class MargheritaPizza implements Pizza {
	@Override
	public String getName() {
		return "Margherita";
	}

	@Override
	public double getPrice() {
		return 5.0;
	}

	@Override
	public double getNutritionalInfo() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String toString() {
		return "MargheritaPizza [nome=" + getName() + ", prezzo=" + getPrice() + ", info nutrizionali="
				+ getNutritionalInfo() + "]";
	}

}