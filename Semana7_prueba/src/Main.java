import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main("Main");
	}
	
	static PApplet app;
	Logica log;
	
	public void settings() {
		size(1200,700);
	}
	
	public void setup() {
		app = this;
		log = new Logica();
	
	}
	
	public void draw() {
		background(0);
		log.pintar(this);
	}

}
