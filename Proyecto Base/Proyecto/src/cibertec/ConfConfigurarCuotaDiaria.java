package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfConfigurarCuotaDiaria extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblCuotaDiariaEsperada;
	private JTextField txt1;
	private JButton btnAceptarCCCD;
	private JButton btnCerrarCCCD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfConfigurarCuotaDiaria dialog = new ConfConfigurarCuotaDiaria();
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
	public ConfConfigurarCuotaDiaria() {
		setBounds(100, 100, 450, 120);
		getContentPane().setLayout(null);
		
		lblCuotaDiariaEsperada = new JLabel("Cuota Diaria Esperada (S/.)");
		lblCuotaDiariaEsperada.setBounds(10, 14, 159, 14);
		getContentPane().add(lblCuotaDiariaEsperada);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(179, 11, 146, 20);
		getContentPane().add(txt1);
		
		btnAceptarCCCD = new JButton("Aceptar");
		btnAceptarCCCD.setBounds(335, 14, 89, 23);
		getContentPane().add(btnAceptarCCCD);
		
		btnCerrarCCCD = new JButton("Cerrar");
		btnCerrarCCCD.addActionListener(this);
		btnCerrarCCCD.setBounds(335, 46, 89, 23);
		getContentPane().add(btnCerrarCCCD);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrarCCCD) {
			actionPerformedBtnCerrarCCCD(e);
		}
	}
	protected void actionPerformedBtnCerrarCCCD(ActionEvent e) {
		dispose();
	}
}
