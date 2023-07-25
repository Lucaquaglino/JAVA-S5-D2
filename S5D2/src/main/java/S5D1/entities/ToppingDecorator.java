package S5D1.entities;

public abstract class ToppingDecorator implements Pizza {
	protected Pizza pizza;

	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getName() {
		return pizza.getName();
	}

	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

	@Override
	public double getNutritionalInfo() {
		return pizza.getNutritionalInfo();
	}
}
