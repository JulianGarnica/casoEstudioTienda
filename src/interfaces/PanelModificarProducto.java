package interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import clasesProductos.Producto;

public class PanelModificarProducto extends JDialog {

	private JTextField txtNombreprod;
	private JTextField txtValorinversion;
	private JTextField textValorVenta;
	private JTextField textCantidad;
	private final JPanel contentPanel = new JPanel();
	
	private MainFrame principal;

	/**
	 * Create the dialog.
	 */
	public PanelModificarProducto(final MainFrame principal, final int id) {
		Producto infoProducto = principal.obtenerInfoProducto(id);
		this.principal = principal;
		setBounds(100, 100, 450, 300);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().setLayout(new GridLayout(8, 2, 0, 0));
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNombreProducto = new JLabel("Nombre Producto");
		getContentPane().add(lblNombreProducto);
		
		txtNombreprod = new JTextField();
		txtNombreprod.setText(infoProducto.getNombreProd());
		getContentPane().add(txtNombreprod);
		txtNombreprod.setColumns(10);
		
		JLabel lblValorInversin = new JLabel("Valor Inversión");
		getContentPane().add(lblValorInversin);
		
		txtValorinversion = new JTextField();
		txtValorinversion.setText(Integer.toString(infoProducto.getValorInversion()));
		txtValorinversion.setColumns(10);
		
		getContentPane().add(txtValorinversion);
		
		JLabel lblValorVenta = new JLabel("Valor Venta");
		getContentPane().add(lblValorVenta);
		
		textValorVenta = new JTextField();
		textValorVenta.setColumns(10);
		textValorVenta.setText(Integer.toString(infoProducto.getValorVenta()));
		getContentPane().add(textValorVenta);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		getContentPane().add(lblCantidad);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setText(Integer.toString(infoProducto.getCantidad()));
		getContentPane().add(textCantidad);
		
		
		JLabel lblaplicaDescuento = new JLabel("");
		getContentPane().add(lblaplicaDescuento);
		
		JLabel label = new JLabel("");
		getContentPane().add(label);
		
		getContentPane().add(contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombreProd = txtNombreprod.getText();
						int valorInversion = Integer.parseInt(txtValorinversion.getText());
						int valorVenta = Integer.parseInt(textValorVenta.getText());
						int cantidad = Integer.parseInt(textCantidad.getText());
						principal.actualizarProducto(id, nombreProd, valorInversion, valorVenta, cantidad);
						//principal.agregarNuevoProducto(nombreProd, categoria, tipoProd, valorInversion, valorVenta, cantidad);
						
						dispose();
					}
				});
				
				JLabel label_1 = new JLabel("");
				buttonPane.add(label_1);
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
