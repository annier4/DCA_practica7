import java.io.File;
import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	
	PApplet app = Main.app;	
	String ruta = "data/images/";
	
	public Logica() {

		ArrayList<String> exts =  new ArrayList<>();
		exts.add(".png");
		exts.add(".jpg");
		exts.add(".bmp");		
		File carpeta = new File(ruta);
		String[] nombres = carpeta.list(new MiFiltroDeNombres(exts));
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
	}
	
	

}