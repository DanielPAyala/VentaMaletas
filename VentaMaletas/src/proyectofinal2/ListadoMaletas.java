package proyectofinal2;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ListadoMaletas extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JScrollPane scpListado;
	private JTextArea txtAreaListado;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ListadoMaletas dialog = new ListadoMaletas();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setResizable(false);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ListadoMaletas(Frame parent, boolean modal) {
		super(parent, modal);
		this.setResizable(false);
		setTitle("Listado de maletas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		scpListado = new JScrollPane();
		scpListado.setBounds(10, 23, 416, 193);
		contentPanel.add(scpListado);

		txtAreaListado = new JTextArea();
		scpListado.setViewportView(txtAreaListado);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(112, 226, 85, 21);
		contentPanel.add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(226, 226, 85, 21);
		contentPanel.add(btnListar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar();
		else if (e.getSource() == btnListar)
			actionPerformedBtnListar();
	}

	private void actionPerformedBtnListar() {
		txtAreaListado.setText("");
		imprimir("LISTADO DE MALETAS");
		imprimir("");
		imprimir("Modelo\t: " + VentaMaletas.modelo0);
		imprimir("Precio\t: S/  " + VentaMaletas.precio0);
		imprimir("Profundidad\t: " + VentaMaletas.fondo0 + " cm");
		imprimir("Ancho\t: " + VentaMaletas.ancho0 + " cm");
		imprimir("Alto\t: " + VentaMaletas.alto0 + " cm");
		imprimir("");
		imprimir("Modelo\t: " + VentaMaletas.modelo1);
		imprimir("Precio\t: S/  " + VentaMaletas.precio1);
		imprimir("Profundidad\t: " + VentaMaletas.fondo1 + " cm");
		imprimir("Ancho\t: " + VentaMaletas.ancho1 + " cm");
		imprimir("Alto\t: " + VentaMaletas.alto1 + " cm");
		imprimir("");
		imprimir("Modelo\t: " + VentaMaletas.modelo2);
		imprimir("Precio\t: S/  " + VentaMaletas.precio2);
		imprimir("Profundidad\t: " + VentaMaletas.fondo2 + " cm");
		imprimir("Ancho\t: " + VentaMaletas.ancho2 + " cm");
		imprimir("Alto\t: " + VentaMaletas.alto2 + " cm");
		imprimir("");
		imprimir("Modelo\t: " + VentaMaletas.modelo3);
		imprimir("Precio\t: S/  " + VentaMaletas.precio3);
		imprimir("Profundidad\t: " + VentaMaletas.fondo3 + " cm");
		imprimir("Ancho\t: " + VentaMaletas.ancho3 + " cm");
		imprimir("Alto\t: " + VentaMaletas.alto3 + " cm");
		imprimir("");
		imprimir("Modelo\t: " + VentaMaletas.modelo4);
		imprimir("Precio\t: S/  " + VentaMaletas.precio4);
		imprimir("Profundidad\t: " + VentaMaletas.fondo4 + " cm");
		imprimir("Ancho\t: " + VentaMaletas.ancho4 + " cm");
		imprimir("Alto\t: " + VentaMaletas.alto4 + " cm");
	}

	private void actionPerformedBtnCerrar() {
		this.setVisible(false);
		this.dispose();
	}

	void imprimir(String cad) {
		txtAreaListado.append(cad + "\n");
	}
}
