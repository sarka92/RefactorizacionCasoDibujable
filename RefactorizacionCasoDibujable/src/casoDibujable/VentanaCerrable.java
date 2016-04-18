package casoDibujable;

import java.awt.*;
import java.awt.event.*;

class VentanaCerrable extends Frame implements WindowListener {
	// constructores
	public VentanaCerrable() {
		super();
	}

	public VentanaCerrable(String title) {
		super(title);
		setSize(500, 500);
		addWindowListener(this);
	}

	@Override
	
	public void windowActivated(WindowEvent e) {
		;// métodos de la interface WindowsListener
	}

	public void windowClosed(WindowEvent e) {
		;// métodos de la interface WindowsListener
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e) {
		;// métodos de la interface WindowsListener
	}

	public void windowDeiconified(WindowEvent e) {
		;// métodos de la interface WindowsListener
	}

	public void windowIconified(WindowEvent e) {
		;// métodos de la interface WindowsListener
	}

	public void windowOpened(WindowEvent e) {
		;// métodos de la interface WindowsListener
	}
}
