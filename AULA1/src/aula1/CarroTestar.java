package aula1;

public class CarroTestar {
	public static void main(String  [] args){
	
		Carro c1 = new Carro();
		
		c1.nome	= "Sorento";
		c1.marca = "Kia";
		c1.ano = 2015;
		c1.vel = 65;
		
		c1.acelerar(10);
		
		System.out.println ("Velocidade:" 	+ c1.vel + "km/h");
		
		c1.freiar(30);
		
		System.out.println ("Velocidade:" 	+ c1.vel + "km/h");
		
}
}
