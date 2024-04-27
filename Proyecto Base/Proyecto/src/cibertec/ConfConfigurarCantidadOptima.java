package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfConfigurarCantidadOptima extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblCantidadptimaDe;
	private JTextField txt1;
	private JButton btnAceptarCCCO;
	private JButton btnCerrarCCCO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfConfigurarCantidadOptima dialog = new ConfConfigurarCantidadOptima();
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
	public ConfConfigurarCantidadOptima() {
		setTitle("Configurar Cantidad \u00D3ptima");
		setBounds(100, 100, 450, 120);
		getContentPane().setLayout(null);
		
		lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblCantidadptimaDe.setBounds(10, 14, 219, 14);
		getContentPane().add(lblCantidadptimaDe);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(239, 11, 86, 20);
		getContentPane().add(txt1);
		
		btnAceptarCCCO = new JButton("Aceptar");
		btnAceptarCCCO.setBounds(335, 14, 89, 23);
		getContentPane().add(btnAceptarCCCO);
		
		btnCerrarCCCO = new JButton("Cerrar");
		btnCerrarCCCO.addActionListener(this);
		btnCerrarCCCO.setBounds(335, 46, 89, 23);
		getContentPane().add(btnCerrarCCCO);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrarCCCO) {
			actionPerformedBtnCerrarCCCO(e);
		}
	}
	protected void actionPerformedBtnCerrarCCCO(ActionEvent e) {
		dispose();
	}
}
