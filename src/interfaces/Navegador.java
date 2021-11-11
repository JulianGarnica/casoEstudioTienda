package interfaces;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class Navegador extends JPanel {
	private JTextField txtClase;
	private JTextField TxtClase;
	private JTextField TxtProducto;
	private JTextField txtProducto;

	/**
	 * Create the panel.
	 */
	public Navegador() {
		setBorder(new TitledBorder(null, "Escoja su producto", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(3, 5, 0, 0));
		
		txtClase = new JTextField();
		txtClase.setEditable(false);
		txtClase.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtClase.setHorizontalAlignment(SwingConstants.CENTER);
		txtClase.setText("Clase");
		add(txtClase);
		txtClase.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mas ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setEnabled(false);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Por");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		TxtClase = new JTextField();
		add(TxtClase);
		TxtClase.setColumns(10);
		
		txtProducto = new JTextField();
		txtProducto.setHorizontalAlignment(SwingConstants.CENTER);
		txtProducto.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtProducto.setEditable(false);
		txtProducto.setText("Producto");
		add(txtProducto);
		txtProducto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Menos");
		lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Precio UwU");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setEnabled(false);
		add(lblNewLabel_2);
		
		TxtProducto = new JTextField();
		add(TxtProducto);
		TxtProducto.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setEnabled(false);
		add(lblNewLabel_3);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.YELLOW);
		btnAgregar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(Color.RED);
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		add(btnEliminar);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setEnabled(false);
		add(lblNewLabel_5);

	}

}
