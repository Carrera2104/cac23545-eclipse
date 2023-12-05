package ar.com.cac2023;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		boolean flag = true;//false
		
		//operadores logicos: boolean/relacioneales: boolean/arimeticos
		/*
		&& 
		& (no los vamos a ver) 
		||
		| (no investigar )
		! 
		*/
		int a = 4;
		int b = 20;
		
		/*relacionales dan un boolean
		>  
		<
		>=
		<=
		!=
		*/
		boolean mayoresa5 = a > 5 && b > 5;
		boolean algunoEsMayora5 = a > 5 || b > 5;
		boolean ninguno = a < 5 && b < 5;
		
		/*aritmeticos*/
		long c = a + b; //ojo con estas cosas!!!
		
		//Math investigar !!!
		
		/*if/else*/
		if(mayoresa5) {
			System.out.println("Son mayores");
		}else if(a > 5){
			System.out.println("a si es mayor");
		}else {
			System.out.println("alguno es menor");
		}
	}

	
}