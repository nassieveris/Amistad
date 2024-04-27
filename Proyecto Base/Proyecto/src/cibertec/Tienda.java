package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Datos mínimos del primer colchón
	public static String marca0 = "Suavestar";
	public static double precio0 = 499.0;
	public static int garantia0 = 7;
	public static String tamaño0 = "1 1/2 Plaza";
	public static String material0 = "Tela Tricot Acolchada";
	
	// Datos mínimos del segundo colchón
	public static String marca1 = "Springwall";
	public static double precio1 = 679.0;
	public static int garantia = 10;
	public static String tamaño1 = "2 Plazas";
	public static String material1 = "Tejido de Punto con Algodón Orgánico";
	
	// Datos mínimos del tercer colchón
	public static String marca2 = "Paraiso";
	public static double precio2 = 479.0;
	public static int garantia2 = 5;
	public static String tamaño2 = "1 1/2 Plazas";
	public static String material2 = "Tejido de Punto";
	
	// Datos mínimos del cuarto colchón
	public static String marca3 = "Drimer";
	public static double precio3 = 749.0;
	public static int garantia3 = 4;
	public static String tamaño3 = "Queen";
	public static String material3 = "Jacquard";
	
	// Datos mínimos del quinto colchón
	public static String marca4 = "Cisne";
	public static double precio4 = 389.0;
	public static int garantia4 = 2;
	public static String tamaño4 = "1 1/2 Plazas";
	public static String material4 = "Tejido de Punto";
	
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	
	// Cantidad óptima de colchones vendidos
	public static int cantidadOptima = 10;
	
	// Cantidad mínima de colchones adquiridos para acceder al obsequio
	public static int cantidadMinimaObsequiable = 3;
		
	// Obsequio por cantidad mínima de colchones adquiridos
	public static String obsequio = "USB";
	
	// Número de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	
	// Premio sorpresa
	public static String premioSorpresa = "Un polo";
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 /**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 399);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("Consultar cocina");
		mntmNewMenuItem_1.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Modificar cocina");
		mntmNewMenuItem_2.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Listar cocinas");
		mntmNewMenuItem_3.addActionListener(this);
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mnNewMenu_2 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_4 = new JMenuItem("Vender");
		mntmNewMenuItem_4.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Generar reportes");
		mntmNewMenuItem_5.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		mnNewMenu_3 = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_6 = new JMenuItem("Configurar descuentos");
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("Configurar obsequios");
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Configurar cantidad \u00F3ptima");
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("Configurar cuota diaria");
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_10 = new JMenuItem("Acerca de Tienda");
		mntmNewMenuItem_10.addActionListener(this);
		mnNewMenu_4.add(mntmNewMenuItem_10);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_5) {
			actionPerformedMntmNewMenuItem_5(e);
		}
		if (e.getSource() == mntmNewMenuItem_4) {
			actionPerformedMntmNewMenuItem_4(e);
		}
		if (e.getSource() == mntmNewMenuItem_3) {
			actionPerformedMntmNewMenuItem_3(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mntmNewMenuItem_10) {
			actionPerformedMntmNewMenuItem_10(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
		
	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
		
		dispose();
	}
	protected void actionPerformedMntmNewMenuItem_10(ActionEvent e) {
		//se crea copia
		AcercaDe d1= new AcercaDe();
		//para colocar en el centro del forulario
		d1.setLocationRelativeTo(this);
		// vara que sea visible en la pantalla
		d1.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
		MantConsultaCocina d2= new MantConsultaCocina();
		d2.setLocationRelativeTo(this);
		d2.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
		MantModificarCocina d3= new MantModificarCocina();
		d3.setLocationRelativeTo(this);
		d3.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {
		MantListarCocinas d4= new MantListarCocinas();
		d4.setLocationRelativeTo(this);
		d4.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_4(ActionEvent e) {
		VentVender d5= new VentVender();
		d5.setLocationRelativeTo(this);
		d5.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_5(ActionEvent e) {
		VentGenerarReportes d6= new VentGenerarReportes();
		d6.setLocationRelativeTo(this);
		d6.setVisible(true);
	}
}
