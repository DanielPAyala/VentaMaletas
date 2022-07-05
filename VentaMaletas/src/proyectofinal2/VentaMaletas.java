package proyectofinal2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class VentaMaletas extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmListarMaletas;
	private JMenuItem mntmModificarMaleta;
	private JMenuItem mntmConsultarMaleta;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenuItem mntmAcercaTienda;

	/**
	 * Variables Globales
	 */
	// Datos mínimos de la primera maleta
	public static String modelo0 = "Aviator";
	public static double precio0 = 124.9;
	public static double ancho0 = 63.5;
	public static double alto0 = 30.9;
	public static double fondo0 = 29.2;

	// Datos mínimos del segundo maleta
	public static String modelo1 = "Century";
	public static double precio1 = 174.9;
	public static double ancho1 = 75.0;
	public static double alto1 = 28.5;
	public static double fondo1 = 30.0;

	// Datos mínimos del tercer maleta
	public static String modelo2 = "Benneton";
	public static double precio2 = 159.9;
	public static double ancho2 = 65.2;
	public static double alto2 = 31.2;
	public static double fondo2 = 29.4;

	// Datos mínimos del cuarto maleta
	public static String modelo3 = "Lucas";
	public static double precio3 = 99.9;
	public static double ancho3 = 45.0;
	public static double alto3 = 70.0;
	public static double fondo3 = 25.0;

	// Datos mínimos del quinto maleta
	public static String modelo4 = "Samsonite";
	public static double precio4 = 84.9;
	public static double ancho4 = 50.2;
	public static double alto4 = 60.4;
	public static double fondo4 = 25.0;

	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;

	// Obsequios
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	public static String obsequio1 = "USB";
	public static String obsequio2 = "Cuaderno";
	public static String obsequio3 = "Lapicero";
	
	// Ventas
	public static int numeroVentas = 0;
	public static double importeAcumulado = 0;
	public static double cuotaDiaria = 10000;
	public static int cantidadOptima = 10;
	
	public static int numeroVentas0 = 0;
	public static int numeroVentas1 = 0;
	public static int numeroVentas2 = 0;
	public static int numeroVentas3 = 0;
	public static int numeroVentas4 = 0;
	
	public static int unidadesVendidas0 = 0;
	public static int unidadesVendidas1 = 0;
	public static int unidadesVendidas2 = 0;
	public static int unidadesVendidas3 = 0;
	public static int unidadesVendidas4 = 0;
	
	public static double importeAcumulado0 = 0;
	public static double importeAcumulado1 = 0;
	public static double importeAcumulado2 = 0;
	public static double importeAcumulado3 = 0;
	public static double importeAcumulado4 = 0;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
 
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentaMaletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaMaletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaMaletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaMaletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					VentaMaletas frame = new VentaMaletas();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentaMaletas() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 421);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);

		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);

		mntmConsultarMaleta = new JMenuItem("Consultar maleta");
		mntmConsultarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmConsultarMaleta);

		mntmModificarMaleta = new JMenuItem("Modificar maleta");
		mntmModificarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmModificarMaleta);

		mntmListarMaletas = new JMenuItem("Listar maletas");
		mntmListarMaletas.addActionListener(this);
		mnMantenimiento.add(mntmListarMaletas);

		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);

		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);

		JMenu mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);

		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequios);

		mntmConfigurarCantidadOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);

		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigurarCuotaDiaria.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);

		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		mntmAcercaTienda = new JMenuItem("Acerca de tienda");
		mntmAcercaTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaTienda);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcercaTienda) {
			actionPerformedBtnAcercaDeTienda();
		} else if (e.getSource() == mntmSalir) {
			actionPerformedBtnSalir();
		} else if (e.getSource() == mntmListarMaletas) {
			actionPerformedBtnListarMaletas();
		} else if (e.getSource() == mntmModificarMaleta) {
			actionPerformedBtnModificarMaleta();
		} else if (e.getSource() == mntmConsultarMaleta) {
			actionPerformedBtnConsultarMaleta();
		} else if (e.getSource() == mntmGenerarReportes) {
			actionPerformedBtnGenerarReportes();
		} else if (e.getSource() == mntmVender) {
			actionPerformedBtnVender();
		} else if (e.getSource() == mntmConfigurarCuotaDiaria) {
			actionPerformedBtnConfigurarCuotaDiaria();
		} else if (e.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedBtnConfigurarCantidadOptima();
		} else if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedBtnConfigurarObsequios();
		} else if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedBtnConfigurarDescuentos();
		}
	}

	private void actionPerformedBtnConfigurarObsequios() {
		ConfigurarObsequios obj = new ConfigurarObsequios(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnConfigurarCantidadOptima() {
		ConfigurarCantidadOptima obj = new ConfigurarCantidadOptima(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnConfigurarCuotaDiaria() {
		ConfigurarCuotaDiaria obj = new ConfigurarCuotaDiaria(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnConfigurarDescuentos() {
		PorcentajeDescuento obj = new PorcentajeDescuento(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnGenerarReportes() {
		GenerarReporte obj = new GenerarReporte(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnVender() {
		Vender obj  = new Vender(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnModificarMaleta() {
		ModificarMaleta obj = new ModificarMaleta(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnConsultarMaleta() {
		ConsultarMaleta obj = new ConsultarMaleta(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnListarMaletas() {
		ListadoMaletas obj = new ListadoMaletas(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

	private void actionPerformedBtnSalir() {
//		this.setVisible(false);
//		this.dispose();
		System.exit(0);
	}

	private void actionPerformedBtnAcercaDeTienda() {
		// JOptionPane.showMessageDialog(null, "Hola");
		AcercaTienda obj = new AcercaTienda(this, true);
		obj.setLocationRelativeTo(this);
		obj.setVisible(true);
	}

}
