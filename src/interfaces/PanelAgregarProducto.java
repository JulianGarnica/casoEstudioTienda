package interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarProducto extends JDialog {
	private JTextField txtNombreprod;
	private JTextField txtValorinversion;
	private JTextField textValorVenta;
	private JTextField textCantidad;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private final JPanel contentPanel = new JPanel();
	
	private MainFrame principal;



	/**
	 * Create the dialog.
	 */
	public PanelAgregarProducto(final MainFrame principal) {
		this.principal = principal;
		setBounds(100, 100, 450, 300);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().setLayout(new GridLayout(8, 2, 0, 0));
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNombreProducto = new JLabel("Nombre Producto");
		getContentPane().add(lblNombreProducto);
		
		txtNombreprod = new JTextField();
		getContentPane().add(txtNombreprod);
		txtNombreprod.setColumns(10);
		
		JLabel lblValorInversin = new JLabel("Valor Inversión");
		getContentPane().add(lblValorInversin);
		
		txtValorinversion = new JTextField();
		txtValorinversion.setColumns(10);
		getContentPane().add(txtValorinversion);
		
		JLabel lblValorVenta = new JLabel("Valor Venta");
		getContentPane().add(lblValorVenta);
		
		textValorVenta = new JTextField();
		textValorVenta.setColumns(10);
		getContentPane().add(textValorVenta);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		getContentPane().add(lblCantidad);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		getContentPane().add(textCantidad);
		
		JLabel lblCategora = new JLabel("Categoría");
		getContentPane().add(lblCategora);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Electrodomésticos", "Tecnología", "Decoración"}));
		getContentPane().add(comboBox);
		
		JLabel lblTipoProducto = new JLabel("Tipo Producto");
		getContentPane().add(lblTipoProducto);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Estufa", "Nevera", "Lavadora", "Televisor", "Teléfono", "Celular", "Cuadro", "Mesa", "Reloj"}));
		getContentPane().add(comboBox_1);
		
		JLabel lblaplicaDescuento = new JLabel("");
		getContentPane().add(lblaplicaDescuento);
		
		getContentPane().add(contentPanel);
		
		JLabel label_1 = new JLabel("");
		contentPanel.add(label_1);
		
		JLabel label = new JLabel("");
		getContentPane().add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombreProd = txtNombreprod.getText();
						String categoria = comboBox.getSelectedItem().toString();
						String tipoProd = comboBox_1.getSelectedItem().toString();
						int valorInversion = Integer.parseInt(txtValorinversion.getText());
						int valorVenta = Integer.parseInt(textValorVenta.getText());
						int cantidad = Integer.parseInt(textCantidad.getText());

						principal.agregarNuevoProducto(nombreProd, categoria, tipoProd, valorInversion, valorVenta, cantidad);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancelar");
				buttonPane.add(cancelButton);
			}
		}
	}

}
