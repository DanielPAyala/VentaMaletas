package proyectofinal2;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Point;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GenerarReporte extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTipoReporte;
	private JComboBox<String> cmbTipoReporte;
	private JButton btnCerrar;
	private JScrollPane scpReporte;
	private JTextArea txtAreaReporte;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			GenerarReporte dialog = new GenerarReporte(null, false);
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public GenerarReporte(Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Generar reportes");
		setBounds(100, 100, 693, 311);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblTipoReporte = new JLabel("Tipo de reporte");
		lblTipoReporte.setBounds(10, 33, 112, 13);
		contentPanel.add(lblTipoReporte);

		cmbTipoReporte = new JComboBox<String>();
		cmbTipoReporte.addActionListener(this);
		cmbTipoReporte.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Ventas por modelo", "Raz\u00F3n de precios en relaci\u00F3n al precio mayor",
						"Estad\u00EDstica sobre la cantidad \u00F3ptima", "Estad\u00EDstica sobre el precio" }));
		cmbTipoReporte.setBounds(132, 29, 359, 21);
		contentPanel.add(cmbTipoReporte);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(564, 29, 85, 21);
		contentPanel.add(btnCerrar);

		scpReporte = new JScrollPane();
		scpReporte.setBounds(10, 78, 659, 170);
		contentPanel.add(scpReporte);

		txtAreaReporte = new JTextArea();
		scpReporte.setViewportView(txtAreaReporte);
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmbTipoReporte) {
			actionPerformedCmbTipoReporte(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
		this.dispose();
	}

	protected void actionPerformedCmbTipoReporte(ActionEvent e) {
		int indice = cmbTipoReporte.getSelectedIndex();
		
		switch(indice) {
			case 0:
				txtAreaReporte.setText("");
				imprimir("VENTAS POR MODELO");
				imprimir("");
				imprimir("Modelo\t\t\t: " + VentaMaletas.modelo0);
				imprimir("Cantidad de ventas\t\t: " + VentaMaletas.numeroVentas0);
				imprimir("Cantidad de unidades vendidas\t\t: " + VentaMaletas.unidadesVendidas0);
				imprimir("Importe total vendido\t\t: S/." + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado0));
				imprimir("Aporte a la cuota diaria\t\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado0 * 100 / VentaMaletas.cuotaDiaria) + "%");
				
				imprimir("");
				imprimir("Modelo\t\t\t: " + VentaMaletas.modelo1);
				imprimir("Cantidad de ventas\t\t: " + VentaMaletas.numeroVentas1);
				imprimir("Cantidad de unidades vendidas\t\t: " + VentaMaletas.unidadesVendidas1);
				imprimir("Importe total vendido\t\t: S/." + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado1));
				imprimir("Aporte a la cuota diaria\t\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado1 * 100 / VentaMaletas.cuotaDiaria) + "%");
				
				imprimir("");
				imprimir("Modelo\t\t\t: " + VentaMaletas.modelo2);
				imprimir("Cantidad de ventas\t\t: " + VentaMaletas.numeroVentas2);
				imprimir("Cantidad de unidades vendidas\t\t: " + VentaMaletas.unidadesVendidas2);
				imprimir("Importe total vendido\t\t: S/." + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado2));
				imprimir("Aporte a la cuota diaria\t\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado2 * 100 / VentaMaletas.cuotaDiaria) + "%");
				
				imprimir("");
				imprimir("Modelo\t\t\t: " + VentaMaletas.modelo3);
				imprimir("Cantidad de ventas\t\t: " + VentaMaletas.numeroVentas3);
				imprimir("Cantidad de unidades vendidas\t\t: " + VentaMaletas.unidadesVendidas3);
				imprimir("Importe total vendido\t\t: S/." + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado3));
				imprimir("Aporte a la cuota diaria\t\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado3 * 100 / VentaMaletas.cuotaDiaria) + "%");
				
				imprimir("");
				imprimir("Modelo\t\t\t: " + VentaMaletas.modelo4);
				imprimir("Cantidad de ventas\t\t: " + VentaMaletas.numeroVentas4);
				imprimir("Cantidad de unidades vendidas\t\t: " + VentaMaletas.unidadesVendidas4);
				imprimir("Importe total vendido\t\t: S/." + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado4));
				imprimir("Aporte a la cuota diaria\t\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.importeAcumulado4 * 100 / VentaMaletas.cuotaDiaria) + "%");

				scpReporte.getViewport().setViewPosition(new Point(0,0));
				txtAreaReporte.setCaretPosition(0);
				break;
			case 1:
				ArrayList<Double> arr0 = new ArrayList<Double>();
				arr0.add(VentaMaletas.precio0);
				arr0.add(VentaMaletas.precio1);
				arr0.add(VentaMaletas.precio2);
				arr0.add(VentaMaletas.precio3);
				arr0.add(VentaMaletas.precio4);
				arr0.sort(null);
				double mayor = arr0.get(arr0.size() - 1);
				
				txtAreaReporte.setText("");
				imprimir("RAZÓN DE PRECIOS EN RELACIÓN AL PRECIO MAYOR");
				imprimir("");
				imprimir("Modelo\t: " + VentaMaletas.modelo0);
				imprimir("Precio\t: S/." + VentaMaletas.precio0);
				imprimir("Razón\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.precio0 / mayor));
				imprimir("");
				imprimir("Modelo\t: " + VentaMaletas.modelo1);
				imprimir("Precio\t: S/." + VentaMaletas.precio1);
				imprimir("Razón\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.precio1 / mayor));
				imprimir("");
				imprimir("Modelo\t: " + VentaMaletas.modelo2);
				imprimir("Precio\t: S/." + VentaMaletas.precio2);
				imprimir("Razón\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.precio2 / mayor));
				imprimir("");
				imprimir("Modelo\t: " + VentaMaletas.modelo3);
				imprimir("Precio\t: S/." + VentaMaletas.precio3);
				imprimir("Razón\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.precio3 / mayor));
				imprimir("");
				imprimir("Modelo\t: " + VentaMaletas.modelo4);
				imprimir("Precio\t: S/." + VentaMaletas.precio4);
				imprimir("Razón\t: " + new DecimalFormat("#0.0#").format(VentaMaletas.precio4 / mayor));
				

				scpReporte.getViewport().setViewPosition(new Point(0,0));
				txtAreaReporte.setCaretPosition(0);
				break;
			case 2:
				int supero=0, igualo=0, noSupero=0;
				
				ArrayList<Integer> arr1 = new ArrayList<>();
				arr1.add(VentaMaletas.unidadesVendidas0);
				arr1.add(VentaMaletas.unidadesVendidas1);
				arr1.add(VentaMaletas.unidadesVendidas2);
				arr1.add(VentaMaletas.unidadesVendidas3);
				arr1.add(VentaMaletas.unidadesVendidas4);
				
				for (Integer u: arr1) {
					if (u > VentaMaletas.cantidadOptima) {
						supero++;
					} else if (u == VentaMaletas.cantidadOptima) {
						igualo++;
					} else if (u < VentaMaletas.cantidadOptima) {
						noSupero++;
					}
				}
				
				txtAreaReporte.setText("");
				imprimir("ESTADÍSTICA SOBRE LA CANTIDAD ÓPTIMA");
				imprimir("");
				imprimir("Cantidad de modelos que superaron la cantidad óptima\t: " + supero);
				imprimir("Cantidad de modelos que no superaron la cantidad óptima\t: " + noSupero);
				imprimir("Cantidad de modelos que igualaron la cantidad óptima\t: " + igualo);
				
				scpReporte.getViewport().setViewPosition(new Point(0,0));
				txtAreaReporte.setCaretPosition(0);
				break;
			case 3:
				ArrayList<Double> arr2 = new ArrayList<Double>();
				arr2.add(VentaMaletas.precio0);
				arr2.add(VentaMaletas.precio1);
				arr2.add(VentaMaletas.precio2);
				arr2.add(VentaMaletas.precio3);
				arr2.add(VentaMaletas.precio4);
				arr2.sort(null);
				double ma = arr2.get(arr2.size() - 1);
				double me = arr2.get(0);
				double pro = (VentaMaletas.precio0 + VentaMaletas.precio1 + VentaMaletas.precio2 + VentaMaletas.precio3 + VentaMaletas.precio4) / 5;
				
				txtAreaReporte.setText("");
				imprimir("ESTADÍSTICA SOBRE EL PRECIO");
				imprimir("");
				imprimir("Precio promedio\t: S/." + pro);
				imprimir("Precio mayor\t\t: S/." + ma);
				imprimir("Precio menor\t\t: S/." + me);
				break;
		}
	}
	
	void imprimir(String cad) {
		txtAreaReporte.append(cad + "\n");
	}
}
