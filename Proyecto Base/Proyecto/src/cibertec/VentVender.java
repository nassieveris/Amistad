package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class VentVender extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JComboBox cmbModelo;
	private JButton btnVenderVV;
	private JButton btnCerrarVV;
	private JTextField txtPrecio;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtCantidad;
	private JTextArea txaBoleta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentVender dialog = new VentVender();
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
	public VentVender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 15, 46, 14);
		getContentPane().add(lblNewLabel);
		
		cmbModelo = new JComboBox();
		cmbModelo.setBounds(86, 11, 200, 22);
		getContentPane().add(cmbModelo);
		
		btnVenderVV = new JButton("Vender");
		btnVenderVV.setBounds(335, 11, 89, 23);
		getContentPane().add(btnVenderVV);
		
		btnCerrarVV = new JButton("Cerrar");
		btnCerrarVV.setBounds(335, 43, 89, 23);
		getContentPane().add(btnCerrarVV);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(85, 44, 203, 20);
		getContentPane().add(txtPrecio);
		
		lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(10, 47, 64, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setBounds(10, 78, 76, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(85, 75, 203, 20);
		getContentPane().add(txtCantidad);
		
		txaBoleta = new JTextArea();
		txaBoleta.setBounds(10, 103, 414, 147);
		getContentPane().add(txaBoleta);

	}

}
