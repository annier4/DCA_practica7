import processing.core.PApplet;
import processing.core.PImage;

public class Imagen {
	PApplet app;
	int x;
	int y;
	int escalarX, escalarY; // para escalar la imagen 
	int escalarMenosX, escalarMenosY;// para devolver la escala
	int girar; // para girar el angulo
	private String tipo;
	private String nom_img;
	private PImage image;

	
	public Imagen(PApplet app,PImage image, String tipo, String nom_img){
		this.app = app;
		this.x = x;
		this.y = y;
		this.tipo = tipo;
		this.nom_img = nom_img;
		this.image =  image;

		escalarX = image.width;
		escalarY = image.height;
		escalarMenosX = image.width;
		escalarMenosY = image.height;
		girar = 0;
	}
	
	public void pintar(){
		app.image(image, 758,322,escalarX, escalarY);
		
		//411,39
	}
	
	public void pintarPequeñas(int posX,int posY){
		
		app.image(image, posX, posY, (int)(image.width/5), (int)(image.height/5));
		app.fill(0,159,227);
		app.text(nom_img, posX/3, posY+70);
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
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public PImage getImage() {
		return image;
	}
	public void setImage(PImage image) {
		this.image = image;
	}
	
}
