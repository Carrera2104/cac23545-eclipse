ackage ar.com.cac2023;

/*
 * public es un modificador de visibilidad
 * class indica que es una clase
 * HolaMundo el nombre de la clase
*/
public class HolaMundo {

	/*
	 * public modificador de visibilidad
	 * static idica que no pertence a un objeto, sino a la clase
	 * void es un tipo de retorno
	 * main nombre de metodo
	 * String[] args es una variable array de tipo string
	*/
	public static void main(String[] args) {
		System .out.println("Hola mundo");
		
		// si algo nace de un tipo, no puede cambiar
		
		//variables y tipos de datos
		// numero enteros
		byte b = 1;
		short s = 2;
		int i = 10;
		long l = 30;
		
		//numeros flotante (reales, decimales)
		float alturaDeUnPersona = 10.5F;
		double d = 10.5;//no necesita una letra porque para java, por defecto, los decimales con double
		
		//entendamos:
		// byte < short < int < long < float < double
		var edad = 15.5f;//es float
		edad = 25.5f;
		
		int aux = b + s;
	}

}
