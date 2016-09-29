import processing.core.PApplet;
import java.io.File;
import java.util.ArrayList;
import processing.core.PImage;

public class Logica {
	
	PApplet app;
	PImage fondo;
	PImage herramientas;
	PImage zoomOut;
	
	String ruta = "data/images/";
	String[] nombres;
	ArrayList<String> exts;
	ArrayList<Imagen> imagenes;

	
	public Logica(PApplet app) {
		this.app = app;
		fondo = app.loadImage("../data/fondo.png");
		herramientas = app.loadImage("../data/herramientas.png");
		zoomOut = app.loadImage("../data/herramientas.png");
		
		this.exts =  new ArrayList<>();
		exts.add(".png");
		exts.add(".jpg");
		exts.add(".bmp");
		this.imagenes = new ArrayList<Imagen>();
		File carpeta = new File(ruta);
		nombres = carpeta.list(new MiFiltroDeNombres(exts));
		

		for (int i = 0; i < nombres.length; i++) {
			imagenes.add(new Imagen(app, 350, 100, ruta, nombres[i]));
		} 
	}
	

	public void pintar(PApplet app) { 
		app.image(fondo,0,0);
		
		for (int i = 0; i < imagenes.size(); i++) {
			imagenes.get(i).pintar(app);
			app.fill(255);
			app.text(imagenes.get(i).getNom_img(), 20, 10+(50*i));

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