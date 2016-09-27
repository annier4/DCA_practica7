import processing.core.PApplet;
import java.io.File;
import java.util.ArrayList;
import processing.core.PImage;

public class Logica {
	
	PApplet app = new PApplet();
	PImage fondo;
	PImage herramientas;
	PImage zoomOut;
	String ruta = "data/images/";
	ArrayList<String> exts;
	ArrayList<String> images;
	
	public Logica() {
		//fondo = app.loadImage("../data/fondo.png");
		//herramientas = app.loadImage("../data/herramientas.png");
		//zoomOut = app.loadImage("../data/herramientas.png");
		
		this.exts =  new ArrayList<>();
		exts.add(".png");
		exts.add(".jpg");
		exts.add(".bmp");
		this.images = new ArrayList<String>();
		File carpeta = new File(ruta);
		String[] nombres = carpeta.list(new MiFiltroDeNombres(exts));
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
			images.add(nombres[i]);
		}
	}
	
	public void pintar(PApplet app) {
		//app.image(fondo,0,0);
		
		System.out.println(images.size());
		for (int i = 0; i < images.size(); i++) {
			String name = "../"+ruta+images.get(i);
			//PImage imgN = app.loadImage(name);
			//app.image(imgN, 0, 0);
			app.fill(0);
			//app.text(images.get(i), 20, 10+(50*i));
		}
	}
}