package proyectofinal2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;

public class AcercaTienda extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTienda;
	private JSeparator separator;
	private JLabel lblAutores;
	private JLabel lblCarlosPorras;
	private JLabel lblRicadoPizarro;
	private JButton btnCerrar;
	private JSeparator separator_1;
	private JLabel lblOsVersion;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			AcercaTienda dialog = new AcercaTienda();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setLocationRelativeTo(null);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public AcercaTienda(Frame parent, boolean modal) {
		super(parent, modal);
		setBounds(100, 100, 450, 313);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTienda.setBounds(137, 26, 139, 31);
		contentPanel.add(lblTienda);

		separator = new JSeparator();
		separator.setBounds(10, 68, 416, 17);
		contentPanel.add(separator);

		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAutores.setBounds(162, 96, 79, 13);
		contentPanel.add(lblAutores);

		lblCarlosPorras = new JLabel("Carlos Porras");
		lblCarlosPorras.setBounds(162, 134, 79, 13);
		contentPanel.add(lblCarlosPorras);

		lblRicadoPizarro = new JLabel("Ricardo Pizarro");
		lblRicadoPizarro.setBounds(162, 157, 101, 13);
		contentPanel.add(lblRicadoPizarro);		

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(162, 238, 85, 21);
		contentPanel.add(btnCerrar);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 188, 416, 17);
		contentPanel.add(separator_1);
		
		lblOsVersion = new JLabel("");
		lblOsVersion.setBounds(162, 213, 101, 14);
		lblOsVersion.setText(System.getProperty("os.name") + " " + System.getProperty("os.version"));
		contentPanel.add(lblOsVersion);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar();
	}

	private void actionPerformedBtnCerrar() {
		this.setVisible(false);
		this.dispose();
	}
}
