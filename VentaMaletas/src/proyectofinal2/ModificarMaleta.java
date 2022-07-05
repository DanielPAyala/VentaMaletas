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

public class ModificarMaleta extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JComboBox<String> cmbModelo;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ModificarMaleta dialog = new ModificarMaleta();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ModificarMaleta(Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Modificar maleta");
		setBounds(100, 100, 450, 209);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(28, 36, 75, 13);
		contentPanel.add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(28, 59, 92, 13);
		contentPanel.add(lblPrecio);

		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(28, 82, 92, 13);
		contentPanel.add(lblAncho);

		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(28, 105, 92, 13);
		contentPanel.add(lblAlto);

		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(28, 128, 92, 13);
		contentPanel.add(lblFondo);

		cmbModelo = new JComboBox<String>();
		cmbModelo.setModel(new DefaultComboBoxModel<String>(new String[] { VentaMaletas.modelo0, VentaMaletas.modelo1,
				VentaMaletas.modelo2, VentaMaletas.modelo3, VentaMaletas.modelo4 }));
		cmbModelo.setBounds(141, 32, 151, 21);
		cmbModelo.addActionListener(this);
		contentPanel.add(cmbModelo);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(141, 56, 151, 19);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);

		txtAncho = new JTextField();
		txtAncho.setBounds(141, 79, 151, 19);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);

		txtAlto = new JTextField();
		txtAlto.setBounds(141, 102, 151, 19);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);

		txtFondo = new JTextField();
		txtFondo.setBounds(141, 125, 151, 19);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(327, 32, 85, 21);
		btnCerrar.addActionListener(this);
		contentPanel.add(btnCerrar);

		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(327, 55, 85, 21);
		btnGrabar.addActionListener(this);
		contentPanel.add(btnGrabar);

		cmbModelo.setSelectedIndex(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar();
		} else if (e.getSource() == cmbModelo)
			actionPerformedSelectedModelo();
		else if(e.getSource() == btnCerrar)
			actionPerformedBtnCerrar();
	}

	private void actionPerformedBtnCerrar() {
		this.setVisible(false);
		this.dispose();
	}

	private void actionPerformedSelectedModelo() {
		int index = cmbModelo.getSelectedIndex();

		switch (index) {
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

	private void actionPerformedBtnGrabar() {
		int index = cmbModelo.getSelectedIndex();

		switch (index) {
			case 0:
				VentaMaletas.precio0 = Double.parseDouble(txtPrecio.getText());
				VentaMaletas.ancho0 = Double.parseDouble(txtAncho.getText());
				VentaMaletas.alto0 = Double.parseDouble(txtAlto.getText());
				VentaMaletas.fondo0 = Double.parseDouble(txtFondo.getText());
				break;
			case 1:
				VentaMaletas.precio0 = Double.parseDouble(txtPrecio.getText());
				VentaMaletas.ancho0 = Double.parseDouble(txtAncho.getText());
				VentaMaletas.alto0 = Double.parseDouble(txtAlto.getText());
				VentaMaletas.fondo0 = Double.parseDouble(txtFondo.getText());
				break;
			case 2:
				VentaMaletas.precio0 = Double.parseDouble(txtPrecio.getText());
				VentaMaletas.ancho0 = Double.parseDouble(txtAncho.getText());
				VentaMaletas.alto0 = Double.parseDouble(txtAlto.getText());
				VentaMaletas.fondo0 = Double.parseDouble(txtFondo.getText());
				break;
			case 3:
				VentaMaletas.precio0 = Double.parseDouble(txtPrecio.getText());
				VentaMaletas.ancho0 = Double.parseDouble(txtAncho.getText());
				VentaMaletas.alto0 = Double.parseDouble(txtAlto.getText());
				VentaMaletas.fondo0 = Double.parseDouble(txtFondo.getText());
				break;
			case 4:
				VentaMaletas.precio0 = Double.parseDouble(txtPrecio.getText());
				VentaMaletas.ancho0 = Double.parseDouble(txtAncho.getText());
				VentaMaletas.alto0 = Double.parseDouble(txtAlto.getText());
				VentaMaletas.fondo0 = Double.parseDouble(txtFondo.getText());
				break;
		}
		
		this.setVisible(false);
		this.dispose();
	}

}
