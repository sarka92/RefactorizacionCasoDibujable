package ual.casodibujable;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
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
		;// m�todos de la interface WindowsListener
	}

	@Override
	public void windowClosed(WindowEvent e) {
		;// m�todos de la interface WindowsListener
	}

	@Override
	public void windowClosing(WindowEvent e) {
		;//m�todos de la interface WindowsListener
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		;// m�todos de la interface WindowsListener
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		;// m�todos de la interface WindowsListener
	}
	@Override
	public void windowIconified(WindowEvent e) {
		;// m�todos de la interface WindowsListener
	}
	@Override
	public void windowOpened(WindowEvent e) {
		;// m�todos de la interface WindowsListener
	}
}
