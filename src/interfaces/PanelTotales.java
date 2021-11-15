package interfaces;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelTotales extends JPanel {
	private JTextField txtTotalventas;
	private JTextField txtTotaldineroventas;
	private JTextField txtTotalinversion;

	/**
	 * Create the panel.
	 */
	public PanelTotales() {
		setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblTotalVentas = new JLabel("Total Ventas");
		add(lblTotalVentas);
		
		txtTotalventas = new JTextField();
		txtTotalventas.setEditable(false);
		add(txtTotalventas);
		txtTotalventas.setColumns(10);
		
		JLabel lblTotalDineroVentas = new JLabel("Total Dinero Ventas");
		add(lblTotalDineroVentas);
		
		txtTotaldineroventas = new JTextField();
		txtTotaldineroventas.setEditable(false);
		txtTotaldineroventas.setColumns(10);
		add(txtTotaldineroventas);
		
		JLabel lblTotalInversin = new JLabel("Total Inversión");
		add(lblTotalInversin);
		
		txtTotalinversion = new JTextField();
		txtTotalinversion.setEditable(false);
		txtTotalinversion.setColumns(10);
		add(txtTotalinversion);

	}

	public void actualizarPanelCarritos(int[] datos) {
		txtTotalventas.setText(Integer.toString(datos[0]));
		txtTotaldineroventas.setText(Integer.toString(datos[1]));
		txtTotalinversion.setText(Integer.toString(datos[2]));
	}
}
