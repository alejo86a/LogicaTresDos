package co.edu.udea.vista;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.udea.controlador.CtrlPrincipal;

import javax.swing.ButtonGroup;
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
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIPrincipal extends JFrame{

	private CtrlPrincipal miCtrlPrincipal;
	
	/**
	 * Declara variables globales
	 */
	private JPanel panelPrincipal;
	private JPanel matIzq;
	private JPanel matDer;
	private JLabel lblLineauno;
	private JLabel lblLineados;
	private JFormattedTextField frmtdtxtfldEcuUno;
	private JFormattedTextField frmtdtxtfldEcudos;
	private JFormattedTextField frmtdtxtfldEcutres;
	private ButtonGroup rdbtnButtonGroup;
	private JRadioButton rdbtnRadiogauss;
	private JRadioButton rdbtnRadiocrammer;
	private JLabel lblGauss;
	private JLabel lblCrammer;
	private JLabel lblTitulometodo;
	private JLabel lblPaso;
	private JLabel lblDeterminante;
	private JLabel lblOriginal;
	private JLabel lblNueva;
	private JButton lblFlechaizquierda;
	private JButton lblFlechaderecha;
	
	private JLabel [][] matrizLblsUno;
	private JLabel [][] matrizLblsDos;
	
	private JLabel lblUnoxuno;
	private JLabel lblUnoyuno;
	private JLabel lblUnozuno;
	private JLabel lblUnoduno;
	private JLabel lblUnoxdos;
	private JLabel lblUnoydos;
	private JLabel lblUnozdos;
	private JLabel lblUnoddos;
	private JLabel lblUnoxtres;
	private JLabel lblUnoytres;
	private JLabel lblUnoztres;
	private JLabel lblUnodtres;
	
	private JLabel lblDosxuno;
	private JLabel lblDosyuno;
	private JLabel lblDoszuno;
	private JLabel lblDosduno;
	private JLabel lblDosxdos;
	private JLabel lblDosydos;
	private JLabel lblDoszdos;
	private JLabel lblDosddos;
	private JLabel lblDosxtres;
	private JLabel lblDosytres;
	private JLabel lblDosztres;
	private JLabel lblDosdtres;
	
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
		iniComponentes();
		setVisible(true);
	}
	
	public void iniComponentes(){
		
		frmtdtxtfldEcuUno = new JFormattedTextField();
		frmtdtxtfldEcuUno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Validacion.validar(e, ((JTextField) e.getSource()).getText());
			}
		});
		frmtdtxtfldEcuUno.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				quitarTextoFondo((JFormattedTextField) e.getSource());
			}
			@Override
			public void focusLost(FocusEvent e) {
				asignarTextoFondo((JFormattedTextField) e.getSource());
			}
		});
		frmtdtxtfldEcuUno.setBounds(25, 22, 300, 20);
		frmtdtxtfldEcuUno.setText("");
		
		
		frmtdtxtfldEcudos = new JFormattedTextField();
		frmtdtxtfldEcudos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Validacion.validar(e, ((JTextField) e.getSource()).getText());
			}
		});
		frmtdtxtfldEcudos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				quitarTextoFondo((JFormattedTextField) e.getSource());
			}
			@Override
			public void focusLost(FocusEvent e) {
				asignarTextoFondo((JFormattedTextField) e.getSource());
			}
		});
		frmtdtxtfldEcudos.setText("");
		frmtdtxtfldEcudos.setBounds(25, 53, 300, 20);
		
		frmtdtxtfldEcutres = new JFormattedTextField();
		frmtdtxtfldEcutres.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Validacion.validar(e, ((JTextField) e.getSource()).getText());
			}
		});
		frmtdtxtfldEcutres.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				quitarTextoFondo((JFormattedTextField) e.getSource());
			}
			@Override
			public void focusLost(FocusEvent e) {
				asignarTextoFondo((JFormattedTextField) e.getSource());
			}
		});
		frmtdtxtfldEcutres.setText("");
		frmtdtxtfldEcutres.setBounds(25, 84, 300, 20);

		lblLineauno = new JLabel("");
		lblLineauno.setBounds(210, 2, 15, 180);
		lblLineauno.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/com/edu/udea/recursos/linea.png")));
		
		lblLineados = new JLabel("");
		lblLineados.setBounds(210, 2, 15, 180);
		lblLineados.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/com/edu/udea/recursos/linea.png")));
		
		rdbtnRadiogauss = new JRadioButton();
		rdbtnRadiogauss.setSelected(true);
		rdbtnRadiogauss.setBounds(360, 175, 21, 23);
		
		rdbtnRadiocrammer = new JRadioButton();
		rdbtnRadiocrammer.setBounds(360, 237, 21, 23);
		
		rdbtnButtonGroup = new ButtonGroup();
		rdbtnButtonGroup.add(rdbtnRadiogauss);
		rdbtnButtonGroup.add(rdbtnRadiocrammer);
		
		lblGauss = new JLabel("Gauss Jordan");
		lblGauss.setBounds(331, 160, 103, 14);
		
		lblCrammer = new JLabel("Crammer");
		lblCrammer.setBounds(344, 219, 64, 14);
		
		lblTitulometodo = new JLabel("TItulo Metodo");
		lblTitulometodo.setBounds(547, 25, 76, 14);
		
		lblPaso = new JLabel("Paso:");
		lblPaso.setBounds(409, 56, 300, 14);
		
		lblDeterminante = new JLabel("Determinante:");
		lblDeterminante.setBounds(409, 87, 300, 14);
		
		lblOriginal = new JLabel("Original");
		lblOriginal.setBounds(140, 336, 46, 14);
		
		lblNueva = new JLabel("Nueva");
		lblNueva.setBounds(546, 336, 46, 14);
		
		lblFlechaizquierda = new JButton();
		lblFlechaizquierda.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/com/edu/udea/recursos/izquierda.png")));
		lblFlechaizquierda.setBounds(462, 322, 35, 28);
		
		lblFlechaderecha = new JButton();
		lblFlechaderecha.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/com/edu/udea/recursos/derecha.png")));
		lblFlechaderecha.setBounds(621, 322, 35, 28);
		
		iniPanelPrincipal();
	}
	
	public void iniPanelPrincipal(){
		panelPrincipal = new JPanel();
		panelPrincipal.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				quitarTextoFondo((JFormattedTextField) e.getSource());
			}
			@Override
			public void focusLost(FocusEvent e) {
				asignarTextoFondo((JFormattedTextField) e.getSource());
			}
		});
		panelPrincipal.setBounds(0, 0, 734, 361);
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		iniMatIzq();
		iniMatDer();
		panelPrincipal.add(frmtdtxtfldEcuUno);
		panelPrincipal.add(frmtdtxtfldEcudos);
		panelPrincipal.add(frmtdtxtfldEcutres);
		panelPrincipal.add(rdbtnRadiogauss);
		panelPrincipal.add(rdbtnRadiocrammer);
		panelPrincipal.add(lblGauss);
		panelPrincipal.add(lblCrammer);
		panelPrincipal.add(lblTitulometodo);
		panelPrincipal.add(lblPaso);
		panelPrincipal.add(lblDeterminante);
		panelPrincipal.add(lblOriginal);
		panelPrincipal.add(lblNueva);
		panelPrincipal.add(lblFlechaizquierda);
		panelPrincipal.add(lblFlechaderecha);
		panelPrincipal.add(matIzq);
		panelPrincipal.add(matDer);
	}
	
	public void iniMatIzq(){
		matIzq = new JPanel();
		matIzq.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		matIzq.setBounds(25, 120, 300, 185);
		matIzq.setLayout(null);
		
		matIzq.add(lblLineauno);
		
		matrizLblsUno = new JLabel[4][3];
		
		lblUnoxuno = new JLabel("");
		lblUnoxuno.setBounds(10, 25, 46, 14);
		matIzq.add(lblUnoxuno);
		
		lblUnoyuno = new JLabel("");
		lblUnoyuno.setBounds(80, 25, 46, 14);
		matIzq.add(lblUnoyuno);
		
		lblUnozuno = new JLabel("");
		lblUnozuno.setBounds(153, 25, 46, 14);
		matIzq.add(lblUnozuno);
		
		lblUnoduno = new JLabel("");
		lblUnoduno.setBounds(244, 25, 46, 14);
		matIzq.add(lblUnoduno);
		
		lblUnoxdos = new JLabel("");
		lblUnoxdos.setBounds(10, 85, 46, 14);
		matIzq.add(lblUnoxdos);
		
		lblUnoydos = new JLabel("");
		lblUnoydos.setBounds(80, 85, 46, 14);
		matIzq.add(lblUnoydos);
		
		lblUnozdos = new JLabel("");
		lblUnozdos.setBounds(153, 85, 46, 14);
		matIzq.add(lblUnozdos);
		
		lblUnoddos = new JLabel("");
		lblUnoddos.setBounds(244, 85, 46, 14);
		matIzq.add(lblUnoddos);
		
		lblUnoxtres = new JLabel("");
		lblUnoxtres.setBounds(10, 145, 46, 14);
		matIzq.add(lblUnoxtres);
		
		lblUnoytres = new JLabel("");
		lblUnoytres.setBounds(80, 145, 46, 14);
		matIzq.add(lblUnoytres);
		
		lblUnoztres = new JLabel("");
		lblUnoztres.setBounds(153, 145, 46, 14);
		matIzq.add(lblUnoztres);
		
		lblUnodtres = new JLabel("");
		lblUnodtres.setBounds(244, 145, 46, 14);
		matIzq.add(lblUnodtres);
		
		iniMatrizJlblsUno();
	}

	public void iniMatDer(){
		matDer = new JPanel();
		matDer.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		matDer.setBounds(409, 120, 300, 185);
		matDer.setLayout(null);

		matDer.add(lblLineados);
		
		lblDosxuno = new JLabel("");
		lblDosxuno.setBounds(10, 25, 46, 14);
		matDer.add(lblDosxuno);
		
		matrizLblsDos = new JLabel [14][3];
		
		lblDosyuno = new JLabel("");
		lblDosyuno.setBounds(80, 25, 46, 14);
		matDer.add(lblDosyuno);
		
		lblDoszuno = new JLabel("");
		lblDoszuno.setBounds(153, 25, 46, 14);
		matDer.add(lblDoszuno);
		
		lblDosduno = new JLabel("");
		lblDosduno.setBounds(244, 25, 46, 14);
		matDer.add(lblDosduno);
		
		lblDosxdos = new JLabel("");
		lblDosxdos.setBounds(10, 85, 46, 14);
		matDer.add(lblDosxdos);
		
		lblDosydos = new JLabel("");
		lblDosydos.setBounds(80, 85, 46, 14);
		matDer.add(lblDosydos);
		
		lblDoszdos = new JLabel("");
		lblDoszdos.setBounds(153, 85, 46, 14);
		matDer.add(lblDoszdos);
		
		lblDosddos = new JLabel("");
		lblDosddos.setBounds(244, 85, 46, 14);
		matDer.add(lblDosddos);
		
		lblDosxtres = new JLabel("");
		lblDosxtres.setBounds(10, 145, 46, 14);
		matDer.add(lblDosxtres);
		
		lblDosytres = new JLabel("");
		lblDosytres.setBounds(80, 145, 46, 14);
		matDer.add(lblDosytres);
		
		lblDosztres = new JLabel("");
		lblDosztres.setBounds(153, 145, 46, 14);
		matDer.add(lblDosztres);
		
		lblDosdtres = new JLabel("");
		lblDosdtres.setBounds(244, 145, 46, 14);
		matDer.add(lblDosdtres);
		
		iniMatrizJlblsDos();
	}
	
	private void asignarTextoFondo(JFormattedTextField frmTxt) {
        if (frmTxt == frmtdtxtfldEcudos) {
            if (frmtdtxtfldEcuUno.getText().equalsIgnoreCase("")) {
                frmtdtxtfldEcuUno.setText("Ecuación uno");
                frmtdtxtfldEcuUno.setForeground(Color.LIGHT_GRAY);
            }
        }
        if (frmTxt == frmtdtxtfldEcudos){
            if (frmtdtxtfldEcudos.getText().equalsIgnoreCase("")) {
                frmtdtxtfldEcudos.setText("Ecuación dos");
                frmtdtxtfldEcudos.setForeground(Color.LIGHT_GRAY);
            }
        }
        if (frmTxt == frmtdtxtfldEcutres){
            if (frmtdtxtfldEcutres.getText().equalsIgnoreCase("")) {
                frmtdtxtfldEcutres.setText("Ecuación tres");
                frmtdtxtfldEcutres.setForeground(Color.LIGHT_GRAY);
            }
        }
    }
    private void quitarTextoFondo(JFormattedTextField frmText) {
        if(frmText == frmtdtxtfldEcuUno) {
            if (frmtdtxtfldEcuUno.getText().equalsIgnoreCase("Ecuación uno")) {
                frmtdtxtfldEcuUno.setText("");
                frmtdtxtfldEcuUno.setForeground(Color.black);
            }
        }
        if (frmText == frmtdtxtfldEcudos) {
            if (frmtdtxtfldEcudos.getText().equalsIgnoreCase("Ecuación dos")) {
                frmtdtxtfldEcudos.setText("");
                frmtdtxtfldEcutres.setForeground(Color.black);
            }
        }
        if (frmText == frmtdtxtfldEcutres) {
            if (frmtdtxtfldEcutres.getText().equalsIgnoreCase("Ecuación tres")) {
                frmtdtxtfldEcutres.setText("");
                frmtdtxtfldEcutres.setForeground(Color.black);
            }
        }
    }
    
    private void iniMatrizJlblsUno() {
    	matrizLblsUno[0][0]=lblUnoxuno;
    	matrizLblsUno[1][0]=lblUnoyuno;
    	matrizLblsUno[2][0]=lblUnozuno;
    	matrizLblsUno[3][0]=lblUnoduno;
    	matrizLblsUno[0][1]=lblUnoxdos;
    	matrizLblsUno[1][1]=lblUnoydos;
    	matrizLblsUno[2][1]=lblUnozdos;
    	matrizLblsUno[3][1]=lblUnoddos;
    	matrizLblsUno[0][2]=lblUnoxtres;
    	matrizLblsUno[1][2]=lblUnoytres;
    	matrizLblsUno[2][2]=lblUnoztres;
    	matrizLblsUno[3][2]=lblUnodtres;		
	}
    
    private void iniMatrizJlblsDos(){
    	matrizLblsDos[0][0]=lblDosxuno;
    	matrizLblsDos[1][0]=lblDosyuno;
    	matrizLblsDos[2][0]=lblDoszuno;
    	matrizLblsDos[3][0]=lblDosduno;
    	matrizLblsDos[0][1]=lblDosxdos;
    	matrizLblsDos[1][1]=lblDosydos;
    	matrizLblsDos[2][1]=lblDoszdos;
    	matrizLblsDos[3][1]=lblDosddos;
    	matrizLblsDos[0][2]=lblDosxtres;
    	matrizLblsDos[1][2]=lblDosytres;
    	matrizLblsDos[2][2]=lblDosztres;
    	matrizLblsDos[3][2]=lblDosdtres;
    }
}
