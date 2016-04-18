package casoDibujable;

import java.awt.Graphics;
import java.awt.Color;

class RectanguloGrafico extends Rectangulo implements Dibujable {
	// nueva variable miembro
	Color color;

	// constructor
	public RectanguloGrafico(double x1, double y1, double x2, double y2,
			Color unColor) {
		// llamada al constructor de Rectangulo
		super(x1, y1, x2, y2);
		this.color = unColor; // en este caso this es opcional
	}
	@Override
	// m�todos de la interface Dibujable
	public void dibujar(Graphics dw) {
		dw.setColor(color);
		dw.drawRect((int) x1, (int) y1, (int) (x2 - x1), (int) (y2 - y1));
	}

	@Override
	public void setPosicion(double x, double y) {
		; // m�todo vac�o, pero necesario de definir
	}
}
