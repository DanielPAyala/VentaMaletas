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

public class ConfigurarCuotaDiaria extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCuotaEsperada;
	private JTextField txtCuotaEsperada;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ConfigurarCuotaDiaria dialog = new ConfigurarCuotaDiaria();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarCuotaDiaria(Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 488, 172);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblCuotaEsperada = new JLabel("Cuota diaria esperada (S/.)");
			lblCuotaEsperada.setBounds(10, 43, 174, 13);
			contentPanel.add(lblCuotaEsperada);
		}
		{
			txtCuotaEsperada = new JTextField();
			txtCuotaEsperada.setText(VentaMaletas.cuotaDiaria + "");
			txtCuotaEsperada.setBounds(188, 40, 96, 19);
			contentPanel.add(txtCuotaEsperada);
			txtCuotaEsperada.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(358, 39, 85, 21);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(358, 68, 85, 21);
			contentPanel.add(btnCancelar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.setVisible(false);
		this.dispose();
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {
		VentaMaletas.cuotaDiaria = Double.parseDouble(txtCuotaEsperada.getText());
		this.setVisible(false);
		this.dispose();
	}
}
