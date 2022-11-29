package Boisson;

public class test {
	public static void main(String[] args) {
		Boisson b=new Espresso();
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		b=new Choclat(b);
		System.out.println(b.cout());
		b=new Caramel(b);
		System.out.println(b.cout());
		 
	}

}
