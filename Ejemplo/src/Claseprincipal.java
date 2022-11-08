import java.util.Scanner;

public class Claseprincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("buena");
		System.out.println("adios");
		int edad= 18; 
		System.out.println(edad);
		
				
		int x= 5+2*8/2;
		int y= 6;
		int z= x + y;
		
		
		System.out.println(z);
		
		String nombre="Pepe";
		String Apellido="SanchezToledo";
		
		System.out.println(nombre + Apellido);
		
		int base;
		int altura;
		int area;
		
		base=3;
		altura=4;
		area= base * altura;
		
		Scanner datos = new Scanner(System.in); 
		String Nombre2;
		String Apellido2;
		
		System.out.println("indique su nombre");
		Nombre2=datos.nextLine(); 
		
		System.out.println("indique su apellido");
		Apellido2=datos.nextLine();
		
		
		System.out.println("Su nombre es" + Nombre2 + Apellido2);
		
		//Scanner Cuadrado = new Scanner (System.in);
		
		//int lado;
		//int Area;
		
		//System.out.println("indique la medida del lado del cuadrado");
		 //lado=Cuadrado.nextInt();	
		
		//Area= lado * lado; 
		//System.out.println("El area es" + Area);
		
		Scanner Bienes = new Scanner (System.in);
		
		int dinero;
		System.out.println("indique su cantidad de dinero");
		//dinero=Bienes.nextInt();
		//if dinero>=100000 {
		
		System.out.println("Te has forrado");
		
		
		//else dinero<10000; System.out.println("Te falta dinero");
		
		
		int repeticion=1;
		while(repeticion<=2) {
			System.out.println("hola");
			repeticion=repeticion+1;
		}
		
		
		int cuenta= 0;
		while(cuenta<101) {
			System.out.println(cuenta);
		cuenta=cuenta+1;
		}
		
		
		
		
		
		
		
		
				
		
	}

}
