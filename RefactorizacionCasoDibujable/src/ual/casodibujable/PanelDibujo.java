package ual.casodibujable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("serial")
public class PanelDibujo<Object> extends Panel {
	// variable miembro
	private ArrayList<Object> v;

	// constructor
	public PanelDibujo(ArrayList<Object> va) {
		super(new FlowLayout());
		this.v = va;
	}

	@Override
	// redefinición del método paint()
	public void paint(Graphics g) {
		Dibujable dib;
		Iterator<?> it;
		it = v.iterator();
		while (it.hasNext()) {
			dib = (Dibujable) it.next();
			dib.dibujar(g);
		}
	}
}