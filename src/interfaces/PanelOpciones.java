package interfaces;

import javax.swing.JPanel;

import java.awt.Dialog.ModalityType;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PanelOpciones extends JPanel {
	
	private MainFrame principal;
	/**
	 * Create the panel.
	 */
	public PanelOpciones(final MainFrame principal) {
		this.principal = principal;
		setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton btnAgregarNuevoProducto = new JButton("Agregar nuevo producto");
		btnAgregarNuevoProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelAgregarProducto nuevaVentana = new PanelAgregarProducto(principal);
				nuevaVentana.setModalityType(ModalityType.APPLICATION_MODAL);
				nuevaVentana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				nuevaVentana.setVisible(true);
			}
		});
		add(btnAgregarNuevoProducto);
		
		JButton btnModificarProducto = new JButton("Modificar Producto");
		btnModificarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = principal.getCuadroEscogido();
				PanelModificarProducto nuevaVentana = new PanelModificarProducto(principal, id);
				nuevaVentana.setModalityType(ModalityType.APPLICATION_MODAL);
				nuevaVentana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				nuevaVentana.setVisible(true);
			}
		});
		add(btnModificarProducto);
		
		JButton btnAgregarProductoAl = new JButton("Agregar producto al pedido");
		btnAgregarProductoAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = principal.getCuadroEscogido();
				principal.agregarProductoCarrito(id);
				
			}
		});
		add(btnAgregarProductoAl);

	}

}
