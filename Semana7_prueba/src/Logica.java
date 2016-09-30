import processing.core.PApplet;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

import processing.core.PImage;

public class Logica {
	
	private PApplet app;
	private int pX;
	private PImage fondo;	
	private Imagen image;
	private ArrayList<Imagen> imagenes;
	
	PImage herramientas;
	PImage zoomOut;
	
	public Logica(PApplet app) {
		
		this.app = app;
		fondo = app.loadImage("../data/fondo.png");	
		imagenes = new ArrayList<Imagen>();
		cargarImagenes();
	}
	

	public void pintar() { 
		
		
		app.imageMode(PApplet.CENTER);
		image = imagenes.get(pX);
		image.pintar();
		imagenes.get(pX).pintarPequeñas(150, 150);
		
		app.imageMode(PApplet.CORNER);
		app.image(fondo,0,0);
		
			
	}
	public void cargarImagenes(){
		String carpeta = "./data/images/";
		File carpetaImage = new File(carpeta);
		if (carpetaImage.exists()) {
			File[] archivosTemp = carpetaImage.listFiles();
			for (int i = 0; i < archivosTemp.length; i++) {
				crearImagen(archivosTemp[i]);
			}
		} else {
			System.err.println("No Files Found on: " + carpeta);
		}
	}
	
	public void crearImagen(File files) {

		String nom_img = files.getName();
		String[] arregloTipo = nom_img.split(Pattern.quote("."));
		String tipo = arregloTipo[1];
		PImage image = app.loadImage("../data/images/" + nom_img);

		Imagen insta = new Imagen(app,image, tipo, nom_img);

		imagenes.add(insta);
	}

	public void click() {
	
				
	}
	
}