package proyectofinal2;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConsultarMaleta extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JButton btnCerrar;
	private JLabel lblFondo;
	private JLabel lblAlto;
	private JLabel lblAncho;
	private JLabel lblPrecio;
	private JLabel lblModelo;
	private JComboBox<String> cmbModelo;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ConsultarMaleta dialog = new ConsultarMaleta();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ConsultarMaleta(Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Consultar maleta");
		setBounds(100, 100, 450, 229);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(23, 67, 57, 13);
		contentPanel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(23, 90, 79, 13);
		contentPanel.add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(23, 113, 69, 13);
		contentPanel.add(lblAncho);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(23, 136, 69, 13);
		contentPanel.add(lblAlto);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(23, 159, 79, 13);
		contentPanel.add(lblFondo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(329, 63, 85, 21);
		contentPanel.add(btnCerrar);
		
		cmbModelo = new JComboBox<String>();
		cmbModelo.setModel(new DefaultComboBoxModel<String>(new String[] {
				VentaMaletas.modelo0,
				VentaMaletas.modelo1,
				VentaMaletas.modelo2,
				VentaMaletas.modelo3,
				VentaMaletas.modelo4
		}));
		cmbModelo.addActionListener(this);
		cmbModelo.setBounds(111, 63, 179, 21);
		contentPanel.add(cmbModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(111, 87, 179, 19);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(111, 110, 179, 19);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setBounds(111, 133, 179, 19);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setBounds(112, 156, 179, 19);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);
		
		cmbModelo.setSelectedIndex(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cmbModelo)
			actionPerformedSelectedModelo();
		else if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar();
	}

	private void actionPerformedBtnCerrar() {
		this.setVisible(false);
		this.dispose();
	}

	private void actionPerformedSelectedModelo() {
		int index = cmbModelo.getSelectedIndex();
		
		switch(index) {
			case 0:
				txtPrecio.setText(Double.toString(VentaMaletas.precio0));
				txtAncho.setText(Double.toString(VentaMaletas.ancho0));
				txtAlto.setText(Double.toString(VentaMaletas.alto0));
				txtFondo.setText(Double.toString(VentaMaletas.fondo0));
				break;
			case 1:
				txtPrecio.setText(Double.toString(VentaMaletas.precio1));
				txtAncho.setText(Double.toString(VentaMaletas.ancho1));
				txtAlto.setText(Double.toString(VentaMaletas.alto1));
				txtFondo.setText(Double.toString(VentaMaletas.fondo1));
				break;
			case 2:
				txtPrecio.setText(Double.toString(VentaMaletas.precio2));
				txtAncho.setText(Double.toString(VentaMaletas.ancho2));
				txtAlto.setText(Double.toString(VentaMaletas.alto2));
				txtFondo.setText(Double.toString(VentaMaletas.fondo2));
				break;
			case 3:
				txtPrecio.setText(Double.toString(VentaMaletas.precio3));
				txtAncho.setText(Double.toString(VentaMaletas.ancho3));
				txtAlto.setText(Double.toString(VentaMaletas.alto3));
				txtFondo.setText(Double.toString(VentaMaletas.fondo3));
				break;
			case 4:
				txtPrecio.setText(Double.toString(VentaMaletas.precio4));
				txtAncho.setText(Double.toString(VentaMaletas.ancho4));
				txtAlto.setText(Double.toString(VentaMaletas.alto4));
				txtFondo.setText(Double.toString(VentaMaletas.fondo4));
				break;
			default:
				txtPrecio.setText("");
				txtAncho.setText("");
				txtAlto.setText("");
				txtFondo.setText("");
				break;
		}
	}
}
