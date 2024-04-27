package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentGenerarReportes extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblTipoDeReporte;
	private JComboBox cmbReporte;
	private JButton btnCerrarVGR;
	private JTextArea txaBoleta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentGenerarReportes dialog = new VentGenerarReportes();
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
	public VentGenerarReportes() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblTipoDeReporte = new JLabel("Tipo de Reporte");
		lblTipoDeReporte.setBounds(10, 15, 83, 14);
		getContentPane().add(lblTipoDeReporte);
		
		cmbReporte = new JComboBox();
		cmbReporte.setBounds(97, 11, 189, 22);
		getContentPane().add(cmbReporte);
		
		btnCerrarVGR = new JButton("Cerrar");
		btnCerrarVGR.addActionListener(this);
		btnCerrarVGR.setBounds(335, 11, 89, 23);
		getContentPane().add(btnCerrarVGR);
		
		txaBoleta = new JTextArea();
		txaBoleta.setBounds(10, 40, 414, 210);
		getContentPane().add(txaBoleta);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrarVGR) {
			actionPerformedBtnCerrarVGR(e);
		}
	}
	protected void actionPerformedBtnCerrarVGR(ActionEvent e) {
		dispose();
	}
}
