import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;

public class MiFiltroDeNombres implements FilenameFilter {

	ArrayList<String> extensiones;

	public MiFiltroDeNombres(ArrayList<String> extensiones) {
		this.extensiones = extensiones;
	}

	public boolean accept(File ruta, String name) {
		boolean permitido = false;
		for (int i = 0; i < extensiones.size(); i++) {
			permitido = name.toLowerCase().endsWith(extensiones.get(i));			
			if (permitido) {
				break;
			}			
		}
		return permitido;
	}
}
