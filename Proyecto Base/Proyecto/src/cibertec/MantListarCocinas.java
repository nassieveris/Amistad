package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MantListarCocinas extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea txaListar;
	private JButton btnCerrarMLC;
	private JButton btnListarMLC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantListarCocinas dialog = new MantListarCocinas();
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
	public MantListarCocinas() {
		setTitle("Listar Cocinas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		txaListar = new JTextArea();
		txaListar.setBounds(10, 11, 414, 211);
		getContentPane().add(txaListar);
		
		btnCerrarMLC = new JButton("Cerrar");
		btnCerrarMLC.addActionListener(this);
		btnCerrarMLC.setBounds(85, 227, 89, 23);
		getContentPane().add(btnCerrarMLC);
		
		btnListarMLC = new JButton("Listar");
		btnListarMLC.setBounds(259, 227, 89, 23);
		getContentPane().add(btnListarMLC);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrarMLC) {
			actionPerformedBtnCerrarMLC(e);
		}
	}
	protected void actionPerformedBtnCerrarMLC(ActionEvent e) {
		dispose();
	}
}
