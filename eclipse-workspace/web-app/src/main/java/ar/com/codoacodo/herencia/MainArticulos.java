package ar.com.codoacodo.herencia;

public class MainArticulos {

	public static void main(String[] args) {
		/*Articulo art = new Articulo("titulo1", 1500.5f, "http://img.com/titulo1.jpg");
		art.setAutor("autor de titulo1");
		System.out.println(art);*/
		
		Musica mu = new Musica("musica1", 2500.5f, "http://img.com/musica1.jpg");
		mu.getTemas();//propio
		mu.getTitulo();//padre
		
		System.out.println(mu);//f5/f6/f7/f8
		
		//Articulo artMusica = new Musica("musica2", 3500.5f, "http://img.com/musica2.jpg");
	}

}