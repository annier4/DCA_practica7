import processing.core.PApplet;
import java.io.File;
import java.util.ArrayList;
import processing.core.PImage;

public class Logica {
	
	PApplet app = Main.app;
	PImage fondo;
	PImage herramientas;
	PImage zoomOut;
	String ruta = "data/images/";
	ArrayList<String> exts;
	ArrayList<String> images;
	String[] nombres;
	
	public Logica() {
		fondo = app.loadImage("../data/fondo.png");
		herramientas = app.loadImage("../data/herramientas.png");
		zoomOut = app.loadImage("../data/herramientas.png");
		
		this.exts =  new ArrayList<>();
		exts.add(".png");
		exts.add(".jpg");
		exts.add(".bmp");
		this.images = new ArrayList<String>();
		File carpeta = new File(ruta);
		nombres = carpeta.list(new MiFiltroDeNombres(exts));
		
//		for (int i = 0; i < nombres.length; i++) {
//			System.out.println(nombres[i]);
//			images.add(nombres[i]);
//		}
	}
	
	public void pintar() {
		app.image(fondo,0,0);
		
		int j=0;
		for (int i = 0; i < nombres.length; i++) {
			app.text(nombres[i], 13, 60+(j*20));
			images.add(nombres[i]);
			j++;
		}
		
		//System.out.println(images.size());
//		for (int i = 0; i < images.size(); i++) {
//			String name = "../"+ruta+images.get(i);
//			PImage imgN = app.loadImage(name);
//			app.image(imgN, 0, 0);
//			app.fill(0);
//			app.text(images.get(i), 20, 10+(50*i));
//		}
		System.out.println("x= "+app.mouseX + "y= "+app.mouseY);
	}
}