package co.edu.udea.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.udea.controlador.CtrlPrincipal;

public class GUIPrincipal extends JFrame {

	private CtrlPrincipal miCtrlPrincipal;
	
	private JPanel contentPane;

	/**
	 * Crea el frame
	 * 
	 * @param miCtrlPrincipal
	 */
	public GUIPrincipal(CtrlPrincipal miCtrlPrincipal) {
		this.miCtrlPrincipal = miCtrlPrincipal;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
