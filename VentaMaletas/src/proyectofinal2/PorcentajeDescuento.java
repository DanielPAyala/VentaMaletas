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

public class PorcentajeDescuento extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JLabel lblPorcentaje;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JLabel lbl1A5uni;
	private JLabel lbl1A10uni;
	private JLabel lbl11A15uni;
	private JLabel lblMas15;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			PorcentajeDescuento dialog = new PorcentajeDescuento();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public PorcentajeDescuento(Frame parent, boolean modal) {
		super(parent, modal);
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 175);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lbl1A5uni = new JLabel("1 a 5 unidades");
		lbl1A5uni.setBounds(10, 33, 103, 13);
		contentPanel.add(lbl1A5uni);

		lbl1A10uni = new JLabel("6 a 10 unidades");
		lbl1A10uni.setBounds(10, 56, 103, 13);
		contentPanel.add(lbl1A10uni);

		lbl11A15uni = new JLabel("11 a 15 unidades");
		lbl11A15uni.setBounds(10, 79, 103, 13);
		contentPanel.add(lbl11A15uni);

		lblMas15 = new JLabel("M\u00E1s de 15 unidades");
		lblMas15.setBounds(10, 102, 133, 13);
		contentPanel.add(lblMas15);

		txtPorcentaje1 = new JTextField();
		txtPorcentaje1.setText(Double.toString(VentaMaletas.porcentaje1));
		txtPorcentaje1.setBounds(123, 30, 96, 19);
		contentPanel.add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);

		txtPorcentaje2 = new JTextField();
		txtPorcentaje2.setText(Double.toString(VentaMaletas.porcentaje2));
		txtPorcentaje2.setBounds(123, 53, 96, 19);
		contentPanel.add(txtPorcentaje2);
		txtPorcentaje2.setColumns(10);

		txtPorcentaje3 = new JTextField();
		txtPorcentaje3.setText(Double.toString(VentaMaletas.porcentaje3));
		txtPorcentaje3.setBounds(123, 76, 96, 19);
		contentPanel.add(txtPorcentaje3);
		txtPorcentaje3.setColumns(10);

		txtPorcentaje4 = new JTextField();
		txtPorcentaje4.setText(Double.toString(VentaMaletas.porcentaje4));
		txtPorcentaje4.setBounds(123, 99, 96, 19);
		contentPanel.add(txtPorcentaje4);
		txtPorcentaje4.setColumns(10);

		lblPorcentaje4 = new JLabel("%");
		lblPorcentaje4.setBounds(229, 33, 45, 13);
		contentPanel.add(lblPorcentaje4);

		lblPorcentaje3 = new JLabel("%");
		lblPorcentaje3.setBounds(229, 56, 45, 13);
		contentPanel.add(lblPorcentaje3);

		lblPorcentaje2 = new JLabel("%");
		lblPorcentaje2.setBounds(229, 79, 45, 13);
		contentPanel.add(lblPorcentaje2);

		lblPorcentaje = new JLabel("%");
		lblPorcentaje.setBounds(229, 102, 45, 13);
		contentPanel.add(lblPorcentaje);

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
		VentaMaletas.porcentaje1 = Double.parseDouble(txtPorcentaje1.getText());
		VentaMaletas.porcentaje2 = Double.parseDouble(txtPorcentaje2.getText());
		VentaMaletas.porcentaje3 = Double.parseDouble(txtPorcentaje3.getText());
		VentaMaletas.porcentaje4 = Double.parseDouble(txtPorcentaje4.getText());
		this.setVisible(false);
		this.dispose();
	}
	
	
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		this.setVisible(false);
		this.dispose();
	}
}
