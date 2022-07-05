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

public class ConfigurarCantidadOptima extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidadOptima;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblCantidadOptima;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ConfigurarCantidadOptima dialog = new ConfigurarCantidadOptima();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarCantidadOptima(Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Configurar cantidad \u00F3ptima");
		setBounds(100, 100, 571, 117);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblCantidadOptima = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
			lblCantidadOptima.setBounds(26, 29, 239, 13);
			contentPanel.add(lblCantidadOptima);
		}
		{
			txtCantidadOptima = new JTextField();
			txtCantidadOptima.setText(VentaMaletas.cantidadOptima + "");
			txtCantidadOptima.setBounds(271, 26, 96, 19);
			contentPanel.add(txtCantidadOptima);
			txtCantidadOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(439, 10, 85, 21);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(439, 41, 85, 21);
			contentPanel.add(btnCancelar);
		}
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
		VentaMaletas.cantidadOptima = Integer.parseInt(txtCantidadOptima.getText());
		this.setVisible(false);
		this.dispose();
	}
	
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.setVisible(false);
		this.dispose();
	}
}
