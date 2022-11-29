package Boisson;

public  abstract class AbstractDecorateur extends Boisson    {
	public AbstractDecorateur(Boisson boisson) {
	
		super();
		this.boisson = boisson;
	}

	protected Boisson  boisson;

	public Boisson getBoisson() {
		return boisson;
	}

	public void setBoisson(Boisson boisson) {
		this.boisson = boisson;
	}
	
	public  abstract  String getDescription() ;
	
	

}
 