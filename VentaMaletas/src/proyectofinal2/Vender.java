package proyectofinal2;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Vender extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JScrollPane scpBoleta;
	private JTextArea txtAreaBoleta;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JLabel lblModelo;
	private JComboBox<String> cmbModelo;
	private JButton btnVender;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Vender dialog = new Vender();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Vender(Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Vender");
		this.setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(24, 35, 82, 13);
		contentPanel.add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(24, 58, 82, 13);
		contentPanel.add(lblPrecio);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(24, 81, 82, 13);
		contentPanel.add(lblCantidad);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(341, 31, 85, 21);
		contentPanel.add(btnVender);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(341, 54, 85, 21);
		contentPanel.add(btnCerrar);

		cmbModelo = new JComboBox<String>();
		cmbModelo.setModel(new DefaultComboBoxModel<String>(new String[] { VentaMaletas.modelo0, VentaMaletas.modelo1,
				VentaMaletas.modelo2, VentaMaletas.modelo3, VentaMaletas.modelo4 }));
		cmbModelo.addActionListener(this);
		cmbModelo.setBounds(116, 31, 164, 21);
		contentPanel.add(cmbModelo);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(116, 55, 164, 19);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(116, 78, 164, 19);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);

		scpBoleta = new JScrollPane();
		scpBoleta.setBounds(24, 115, 402, 138);
		contentPanel.add(scpBoleta);

		txtAreaBoleta = new JTextArea();
		scpBoleta.setViewportView(txtAreaBoleta);

		cmbModelo.setSelectedIndex(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmbModelo)
			actionPerformedSelectedModelo();
		else if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar();
		else if (e.getSource() == btnVender)
			actionPerformedBtnVender();
	}

	private void actionPerformedBtnVender() {
		double precio = 0, iComp = 0, iDesc = 0, iPaga = 0;
		int cantidad = 0, obsequios = 0;
		String modelo;
		int indice = cmbModelo.getSelectedIndex();
		
		modelo = cmbModelo.getSelectedItem().toString();
		precio = Double.parseDouble(txtPrecio.getText());
		cantidad = Integer.parseInt(txtCantidad.getText());

		iComp = cantidad * precio;

		if (cantidad >= 1 && cantidad < 6)
			iDesc = iComp * VentaMaletas.porcentaje1 / 100;
		else if (cantidad >= 6 && cantidad < 11)
			iDesc = iComp * VentaMaletas.porcentaje2 / 100;
		else if (cantidad >= 11 && cantidad < 16)
			iDesc = iComp * VentaMaletas.porcentaje3 / 100;
		else if (cantidad >= 16)
			iDesc = iComp * VentaMaletas.porcentaje4 / 100;

		iPaga = iComp - iDesc;

		if (cantidad >= 1 && cantidad < 6)
			obsequios = VentaMaletas.obsequioCantidad1;
		else if (cantidad >= 6 && cantidad < 11)
			obsequios = VentaMaletas.obsequioCantidad2;
		else if (cantidad >= 11)
			obsequios = VentaMaletas.obsequioCantidad3;

		VentaMaletas.numeroVentas++;
		VentaMaletas.importeAcumulado += iPaga;
		
		switch(indice) {
		case 0:
			VentaMaletas.numeroVentas0++;
			VentaMaletas.unidadesVendidas0 += cantidad;
			VentaMaletas.importeAcumulado0 += iPaga;
			break;
		case 1:
			VentaMaletas.numeroVentas1++;
			VentaMaletas.unidadesVendidas1 += cantidad;
			VentaMaletas.importeAcumulado1 += iPaga;
			break;
		case 2:
			VentaMaletas.numeroVentas2++;
			VentaMaletas.unidadesVendidas2 += cantidad;
			VentaMaletas.importeAcumulado2 += iPaga;
			break;
		case 3:
			VentaMaletas.numeroVentas3++;
			VentaMaletas.unidadesVendidas3 += cantidad;
			VentaMaletas.importeAcumulado3 += iPaga;
			break;
		case 4:
			VentaMaletas.numeroVentas4++;
			VentaMaletas.unidadesVendidas4 += cantidad;
			VentaMaletas.importeAcumulado4 += iPaga;
			break;
		}

		txtAreaBoleta.setText("");
		imprimir("BOLETA DE VENTA");
		imprimir("");
		imprimir("Modelo\t\t: " + modelo);
		imprimir("Precio\t\t: S/. " + new DecimalFormat("#.0#").format(precio));
		imprimir("Cantidad adquirida\t: " + cantidad);
		imprimir("Importe compra\t\t: S/. " + iComp);
		imprimir("Importe descuento\t: S/. " + new DecimalFormat("#.0#").format(iDesc));
		imprimir("Importe pagar\t\t: S/. " + new DecimalFormat("#.0#").format(iPaga));
		imprimir("Tipo obsequio\t\t: " + VentaMaletas.tipoObsequio);
		imprimir("Unidades obsequiadas\t: " + obsequios);

		double porcentajeCuotaDiaria = VentaMaletas.importeAcumulado * 100 / VentaMaletas.cuotaDiaria;
		String porcentaje = new DecimalFormat("#.0#").format(porcentajeCuotaDiaria);
		String importeTotal = new DecimalFormat("#.0#").format(VentaMaletas.importeAcumulado);
		
		if (VentaMaletas.numeroVentas % 5 == 0) {
			JOptionPane.showMessageDialog(this,
					"Venta Nro. " + VentaMaletas.numeroVentas + "\nImporte total general acumulado: S/." + importeTotal
							+ "\nPorcentaje de cuota diaria: " + porcentaje + "%");
		}
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
			break;
		case 1:
			txtPrecio.setText(Double.toString(VentaMaletas.precio1));
			break;
		case 2:
			txtPrecio.setText(Double.toString(VentaMaletas.precio2));
			break;
		case 3:
			txtPrecio.setText(Double.toString(VentaMaletas.precio3));
			break;
		case 4:
			txtPrecio.setText(Double.toString(VentaMaletas.precio4));
			break;
		default:
			txtPrecio.setText("");
			break;
		}
	}

	void imprimir(String cad) {
		txtAreaBoleta.append(cad + "\n");
	}

}
