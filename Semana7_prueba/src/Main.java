import processing.core.PApplet;

public class Main extends PApplet{
	
	static PApplet app;
	private Logica log;

	public static void main(String[] args) {
		PApplet.main("Main");
	}
	
	
	public void settings() {
		size(1200,700);
	}
	public void setup() {
		app = this;
		log = new Logica(app);

	}
	
	public void draw() {
		background(6,6,50);
		log.pintar();
	}
	
	public void mouseClicked(){
		log.click();
	}

}
