package Boisson;

public class Caramel extends AbstractDecorateur {

	public Caramel(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 10+boisson.cout();
	}

}
