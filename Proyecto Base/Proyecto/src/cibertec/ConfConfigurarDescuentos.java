package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfConfigurarDescuentos extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txt4;
	private JTextField txt3;
	private JTextField txt2;
	private JTextField txt1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnAceptarCCD;
	private JButton btnCerrarCCD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfConfigurarDescuentos dialog = new ConfConfigurarDescuentos();
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
	public ConfConfigurarDescuentos() {
		setTitle("Configurar Porcentajes de Descuentos");
		setBounds(100, 100, 450, 170);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setBounds(10, 14, 98, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("6 a 10 unidades");
		lblNewLabel_1.setBounds(10, 45, 98, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("11 a 15 unidades");
		lblNewLabel_2.setBounds(10, 76, 98, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("M\u00E1s de 15 unidades");
		lblNewLabel_3.setBounds(10, 107, 98, 14);
		getContentPane().add(lblNewLabel_3);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(118, 104, 86, 20);
		getContentPane().add(txt4);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(118, 73, 86, 20);
		getContentPane().add(txt3);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(118, 42, 86, 20);
		getContentPane().add(txt2);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(118, 11, 86, 20);
		getContentPane().add(txt1);
		
		lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(214, 14, 98, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(214, 45, 98, 14);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(214, 76, 98, 14);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(214, 107, 98, 14);
		getContentPane().add(lblNewLabel_7);
		
		btnAceptarCCD = new JButton("Aceptar");
		btnAceptarCCD.setBounds(335, 14, 89, 23);
		getContentPane().add(btnAceptarCCD);
		
		btnCerrarCCD = new JButton("Cerrar");
		btnCerrarCCD.addActionListener(this);
		btnCerrarCCD.setBounds(335, 46, 89, 23);
		getContentPane().add(btnCerrarCCD);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrarCCD) {
			actionPerformedBtnCerrarCCD(e);
		}
	}
	protected void actionPerformedBtnCerrarCCD(ActionEvent e) {
		dispose();
	}
}
