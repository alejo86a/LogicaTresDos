package co.edu.udea.vista;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.udea.controlador.CtrlPrincipal;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

import com.udea.edu.util.Validacion;

import java.awt.event.KeyAdapter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class GUIPrincipal extends JFrame{

	private CtrlPrincipal miCtrlPrincipal;

	/**
	 * Crea el frame
	 * 
	 * @param miCtrlPrincipal
	 */
	public GUIPrincipal(CtrlPrincipal miCtrlPrincipal) {
		this.miCtrlPrincipal = miCtrlPrincipal;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 734, 361);
		//panel.setLayout(null);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JFormattedTextField frmtdtxtfldEcuUno = new JFormattedTextField();
		frmtdtxtfldEcuUno.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				quitarTextoFondo(frmtdtxtfldEcuUno);
			}
			@Override
			public void focusLost(FocusEvent e) {
				asignarTextoFondo(frmtdtxtfldEcuUno);
			}
		});
		frmtdtxtfldEcuUno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Validacion.validar(e,frmtdtxtfldEcuUno.getText());
			}
		});
		frmtdtxtfldEcuUno.setBounds(25, 22, 300, 20);
		frmtdtxtfldEcuUno.setText("EcuUno");
		panel.add(frmtdtxtfldEcuUno);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(25, 120, 300, 185);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLineauno = new JLabel("");
		lblLineauno.setBounds(210, 2, 15, 180);
		lblLineauno.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/com/edu/udea/recursos/linea.png")));
		panel_1.add(lblLineauno);
		
		JFormattedTextField frmtdtxtfldEcudos = new JFormattedTextField();
		frmtdtxtfldEcudos.setText("EcuDos");
		frmtdtxtfldEcudos.setBounds(25, 53, 300, 20);
		panel.add(frmtdtxtfldEcudos);
		
		JFormattedTextField frmtdtxtfldEcutres = new JFormattedTextField();
		frmtdtxtfldEcutres.setText("EcuTres");
		frmtdtxtfldEcutres.setBounds(25, 84, 300, 20);
		panel.add(frmtdtxtfldEcutres);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(409, 120, 300, 185);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLineados = new JLabel("");
		lblLineados.setBounds(210, 2, 15, 180);
		lblLineados.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/com/edu/udea/recursos/linea.png")));
		panel_2.add(lblLineados);
		
		JRadioButton rdbtnRadiogauss = new JRadioButton();
		rdbtnRadiogauss.setBounds(360, 175, 21, 23);
		panel.add(rdbtnRadiogauss);
		
		JRadioButton rdbtnRadiocrammer = new JRadioButton();
		rdbtnRadiocrammer.setBounds(360, 237, 21, 23);
		panel.add(rdbtnRadiocrammer);
		
		JLabel lblGauss = new JLabel("Gauss Jordan");
		lblGauss.setBounds(331, 160, 103, 14);
		panel.add(lblGauss);
		
		JLabel lblCrammer = new JLabel("Crammer");
		lblCrammer.setBounds(344, 219, 64, 14);
		panel.add(lblCrammer);
		
		JLabel lblTitulometodo = new JLabel("TItulo Metodo");
		lblTitulometodo.setBounds(547, 25, 76, 14);
		panel.add(lblTitulometodo);
		
		JLabel lblPaso = new JLabel("Paso:");
		lblPaso.setBounds(409, 56, 300, 14);
		panel.add(lblPaso);
		
		JLabel lblDeterminante = new JLabel("Determinante:");
		lblDeterminante.setBounds(409, 87, 300, 14);
		panel.add(lblDeterminante);
		
		JLabel lblOriginal = new JLabel("Original");
		lblOriginal.setBounds(140, 336, 46, 14);
		panel.add(lblOriginal);
		
		JLabel lblNueva = new JLabel("Nueva");
		lblNueva.setBounds(537, 336, 46, 14);
		panel.add(lblNueva);
		
		JLabel lblFlechaizquierda = new JLabel("");
		lblFlechaizquierda.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/com/edu/udea/recursos/izquierda.png")));
		lblFlechaizquierda.setBounds(462, 322, 46, 14);
		panel.add(lblFlechaizquierda);
		
		JLabel lblFlechaderecha = new JLabel("");
		lblFlechaderecha.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/com/edu/udea/recursos/derecha.png")));
		lblFlechaderecha.setBounds(641, 322, 46, 14);
		panel.add(lblFlechaderecha);
		setVisible(true);
	}
	
    private void asignarTextoFondo(JTextField caja) {
        if (caja.getText().equalsIgnoreCase("")) {
            caja.setText("Expresion Uno");
            caja.setForeground(Color.LIGHT_GRAY);
        }
    }
    private void quitarTextoFondo(JTextField caja) {
        if (!caja.getText().equalsIgnoreCase("")) {
            caja.setText("");
            caja.setForeground(Color.black);
        }
    }
}
