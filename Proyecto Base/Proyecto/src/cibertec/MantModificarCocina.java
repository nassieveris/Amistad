package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MantModificarCocina extends JDialog {

	private static final long serialVersionUID = 1L;
	private JComboBox cmbModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnGrabarMMC;
	private JButton btnCerrarMMC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantModificarCocina dialog = new MantModificarCocina();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public MantModificarCocina() {
		setTitle("Modificar Cocina");
		setBounds(100, 100, 450, 245);
		getContentPane().setLayout(null);
		
		cmbModelo = new JComboBox();
		cmbModelo.setBounds(86, 11, 200, 22);
		getContentPane().add(cmbModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(85, 44, 203, 20);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(85, 75, 203, 20);
		getContentPane().add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(85, 106, 203, 20);
		getContentPane().add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(85, 137, 203, 20);
		getContentPane().add(txtFondo);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(84, 168, 204, 20);
		getContentPane().add(txtQuemadores);
		
		lblNewLabel = new JLabel("Quemadores");
		lblNewLabel.setBounds(10, 171, 64, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fondo(cm)");
		lblNewLabel_1.setBounds(10, 140, 64, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Alto (cm)");
		lblNewLabel_2.setBounds(10, 109, 64, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Ancho (cm)");
		lblNewLabel_3.setBounds(10, 78, 76, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Precio (S/)");
		lblNewLabel_4.setBounds(10, 47, 64, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Modelo");
		lblNewLabel_5.setBounds(10, 15, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		btnGrabarMMC = new JButton("Grabar");
		btnGrabarMMC.setBounds(335, 11, 89, 23);
		getContentPane().add(btnGrabarMMC);
		
		btnCerrarMMC = new JButton("Cerrar");
		btnCerrarMMC.setBounds(335, 43, 89, 23);
		getContentPane().add(btnCerrarMMC);

	}

}
