package ual.casodibujable;

import java.awt.Graphics;
import java.awt.Color;

public class CirculoGrafico extends Circulo implements Dibujable {
	// se heredan las variables y m�todos de la clase Circulo
	Color color;

	// constructor
	public CirculoGrafico(double x, double y, double r, Color unColor) {
		// llamada al constructor de Circulo
		super(x, y, r);
		this.color = unColor;
	}

	// m�todos de la interface Dibujable
	@Override
	public void dibujar(Graphics dw) {
		dw.setColor(color);
		dw.drawOval((int) (getX() - getR()), (int) (getY() - getR()), (int) (2 * getR()), (int) (2 * getR()));
	}

	@Override
	public void setPosicion(double x, double y) {
		setX(x);
		setY(y);
	}
}
