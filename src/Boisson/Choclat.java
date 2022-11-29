package Boisson;

public class Choclat extends AbstractDecorateur {
	

	public Choclat(Boisson boisson) {
		super(boisson);
		this.boisson=boisson;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return boisson.cout()+7 ;
	}
	 @Override
	public String getDescription() {
		return null;
	}

}
