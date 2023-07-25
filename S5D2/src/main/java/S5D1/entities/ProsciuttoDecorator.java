package S5D1.entities;

public class ProsciuttoDecorator extends ToppingDecorator {
	private final double price = 1.5;
	private final double nutritionalInfo = 2.0;

	public ProsciuttoDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getName() {
		return super.getName() + " + Prosciutto";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + price;
	}

	@Override
	public double getNutritionalInfo() {
		// TODO Auto-generated method stub
		return super.getNutritionalInfo() + nutritionalInfo;
	}

	@Override
	public String toString() {
		return "Ingrediente prosciutto [price=" + price + ", nutritionalInfo=" + nutritionalInfo + "]";
	}

}
