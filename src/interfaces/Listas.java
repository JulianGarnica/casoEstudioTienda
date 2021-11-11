package interfaces;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listas extends JPanel {
	private JTextField txtCantidad;
	private JTextField txtValor;
	private JTextField txtTotal;
	private JTextField txtProducto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;

	/**
	 * Create the panel.
	 */
	public Listas() {
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setVgap(4);
		flowLayout.setHgap(4);
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tiendas GarnAbril", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		
		txtProducto = new JTextField();
		txtProducto.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtProducto.setEditable(false);
		txtProducto.setText("Producto");
		txtProducto.setHorizontalAlignment(SwingConstants.CENTER);
		add(txtProducto);
		txtProducto.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtValor.setEditable(false);
		txtValor.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor.setText("Valor");
		add(txtValor);
		txtValor.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtCantidad.setEditable(false);
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setText("Cantidad");
		add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setText("Total");
		add(txtTotal);
		txtTotal.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_1.setColumns(10);
		add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_3.setColumns(10);
		add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_2.setColumns(10);
		add(textField_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Arial Black", Font.PLAIN, 11));
		add(textField);
		textField.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_7.setColumns(10);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_8.setColumns(10);
		add(textField_8);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_6.setColumns(10);
		add(textField_6);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_4.setColumns(10);
		add(textField_4);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_11.setColumns(10);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_12.setColumns(10);
		add(textField_12);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_10.setColumns(10);
		add(textField_10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_9.setColumns(10);
		add(textField_9);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_15.setColumns(10);
		add(textField_15);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_14.setColumns(10);
		add(textField_14);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_13.setColumns(10);
		add(textField_13);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_5.setColumns(10);
		add(textField_5);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.GREEN);
		btnAgregar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		add(textField_20);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		add(textField_19);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		add(textField_18);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		add(textField_17);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		add(textField_23);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		add(textField_22);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		add(textField_21);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		add(textField_16);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		add(textField_27);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		add(textField_26);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		add(textField_25);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		add(textField_24);
		add(btnAgregar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setEnabled(false);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		add(btnNewButton);
		
		JList list = new JList();
		add(list);

	}

}
