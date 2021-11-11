package interfaces;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Totales extends JPanel {
	private JTextField textField;
	private JTextField txtTotalDeArticulos;
	private JTextField txtValorAPagar;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Totales() {
		setBorder(new TitledBorder(null, "Total", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(3, 5, 1, 1));
		
		txtTotalDeArticulos = new JTextField();
		txtTotalDeArticulos.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalDeArticulos.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtTotalDeArticulos.setEditable(false);
		txtTotalDeArticulos.setText("Total De articulos");
		add(txtTotalDeArticulos);
		txtTotalDeArticulos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Gracias");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setEnabled(false);
		add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Por");
		lblNewLabel_3.setEnabled(false);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		add(textField_1);
		textField_1.setColumns(10);
		
		txtValorAPagar = new JTextField();
		txtValorAPagar.setEditable(false);
		txtValorAPagar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtValorAPagar.setText("Valor a pagar");
		txtValorAPagar.setHorizontalAlignment(SwingConstants.CENTER);
		add(txtValorAPagar);
		txtValorAPagar.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sus");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Compras Bsos");
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("");
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setEnabled(false);
		add(lblNewLabel_4);
		
		JCheckBox chckDescuento = new JCheckBox("Descuento");
		chckDescuento.setFont(new Font("Arial Black", Font.PLAIN, 11));
		add(chckDescuento);
		
		JButton btnFinal = new JButton("Final");
		btnFinal.setBackground(Color.ORANGE);
		btnFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFinal.setForeground(Color.BLACK);
		btnFinal.setFont(new Font("Arial Black", Font.PLAIN, 11));
		add(btnFinal);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setEnabled(false);
		add(lblNewLabel_5);

	}

}
