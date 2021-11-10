package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesProductos.Inventario;

public class FrameMain extends JFrame {

	private JPanel contentPane;
	private Inventario inventarioProductos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMain frame = new FrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameMain() {
		int[][] productosPredefinidos = {
			{Inventario.ELECTRODOMESTICO,Inventario.obtenerProductosElectrodomesticos().get("ESTUFA"),500000,650000,10},
			{Inventario.ELECTRODOMESTICO,Inventario.obtenerProductosElectrodomesticos().get("NEVERA"),800000,1200000,10},
			{Inventario.DECORACION,Inventario.obtenerProductosDecoracion().get("MESAS"),100000,120000,10}
		};
		
		inventarioProductos = new Inventario();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
