package proyectofinal2;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtTipoObsequio;
	private JTextField txtCantidad1;
	private JTextField txtCantidad2;
	private JTextField txtCantidad3;
	private JLabel lblTipoObsequio;
	private JLabel lbl1A5;
	private JLabel lbl6A10;
	private JLabel lbl11Amas;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ConfigurarObsequios dialog = new ConfigurarObsequios();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequios(Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Configurar obsequios");
		this.setResizable(false);
		setBounds(100, 100, 450, 176);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblTipoObsequio = new JLabel("Tipo de obsequio");
		lblTipoObsequio.setBounds(26, 33, 117, 13);
		contentPanel.add(lblTipoObsequio);

		lbl1A5 = new JLabel("1 a 5 unidades");
		lbl1A5.setBounds(26, 56, 106, 13);
		contentPanel.add(lbl1A5);

		lbl6A10 = new JLabel("6 a 10 unidades");
		lbl6A10.setBounds(26, 79, 117, 13);
		contentPanel.add(lbl6A10);

		lbl11Amas = new JLabel("11 a m\u00E1s unidades");
		lbl11Amas.setBounds(26, 102, 117, 13);
		contentPanel.add(lbl11Amas);

		txtTipoObsequio = new JTextField();
		txtTipoObsequio.setText(VentaMaletas.tipoObsequio);
		txtTipoObsequio.setBounds(173, 30, 96, 19);
		contentPanel.add(txtTipoObsequio);
		txtTipoObsequio.setColumns(10);

		txtCantidad1 = new JTextField();
		txtCantidad1.setText(VentaMaletas.obsequioCantidad1 + "");
		txtCantidad1.setBounds(173, 53, 96, 19);
		contentPanel.add(txtCantidad1);
		txtCantidad1.setColumns(10);

		txtCantidad2 = new JTextField();
		txtCantidad2.setText(VentaMaletas.obsequioCantidad2 + "");
		txtCantidad2.setBounds(173, 76, 96, 19);
		contentPanel.add(txtCantidad2);
		txtCantidad2.setColumns(10);

		txtCantidad3 = new JTextField();
		txtCantidad3.setText(VentaMaletas.obsequioCantidad3 + "");
		txtCantidad3.setBounds(173, 99, 96, 19);
		contentPanel.add(txtCantidad3);
		txtCantidad3.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(327, 29, 85, 21);
		contentPanel.add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(327, 52, 85, 21);
		contentPanel.add(btnCancelar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		VentaMaletas.tipoObsequio = txtTipoObsequio.getText();
		VentaMaletas.obsequioCantidad1 = Integer.parseInt(txtCantidad1.getText());
		VentaMaletas.obsequioCantidad2 = Integer.parseInt(txtCantidad2.getText());
		VentaMaletas.obsequioCantidad3 = Integer.parseInt(txtCantidad3.getText());
		this.setVisible(false);
		this.dispose();
	}
	
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.setVisible(false);
		this.dispose();
	}
}
