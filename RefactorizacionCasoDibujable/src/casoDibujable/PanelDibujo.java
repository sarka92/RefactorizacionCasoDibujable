package casoDibujable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PanelDibujo extends Panel {
	// variable miembro
	private ArrayList v;

	// constructor
	public PanelDibujo(ArrayList va) {
		super(new FlowLayout());
		this.v = va;
	}

	// redefinici�n del m�todo paint()
	public void paint(Graphics g) {
		Dibujable dib;
		Iterator it;
		it = v.iterator();
		while (it.hasNext()) {
			dib = (Dibujable) it.next();
			dib.dibujar(g);
		}
	}
}