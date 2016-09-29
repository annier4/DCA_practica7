import processing.core.PApplet;
import processing.core.PImage;

public class Imagen {
	PApplet app;
	int x;
	int y;
	String ruta;
	String nom_img;
	String rutaCompleta;
	PImage image;
	private float scale;
	
	public Imagen(PApplet app, int x, int y, String ruta, String nom_img){
		this.app = app;
		this.x = x;
		this.y = y;
		this.ruta = ruta;
		this.nom_img = nom_img;
		this.rutaCompleta = "../"+ruta+nom_img;
		this.image = app.loadImage(rutaCompleta);
		this.scale = (float) 0.3;
	}
	
	public void pintar(PApplet app){
		
		float imgW = (float) (image.width*scale);
		float imgH = (float) (image.height*scale);
		
		app.image(image, x, y, imgW, imgH);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getNom_img() {
		return nom_img;
	}

	public void setNom_img(String nom_img) {
		this.nom_img = nom_img;
	}
	
}
