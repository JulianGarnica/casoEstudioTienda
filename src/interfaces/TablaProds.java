package interfaces;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import clasesProductos.Inventario;
import clasesProductos.Producto;

public class TablaProds extends JPanel {

	/**
	 * Create the panel.
	 */
	private JTable table;
	private MainFrame principal;
	private Object[][] datosTabla;	
	private String[] columnas = {"pos","Código","Nombre producto", "tipoProd", "Valor inversión", "Valor venta", "Cantidad"};
	private DefaultTableModel modeloTable;
	private JScrollPane scrollPane;
	
	int campoSeleccionadoAct;
	
	public TablaProds(MainFrame principal) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create the panel.
	 */
	public TablaProds() {
		setBorder(new TitledBorder(null, "Tabla Consultas", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		modeloTable = new DefaultTableModel(datosTabla,columnas);
		
		table = new JTable(modeloTable);
		
		
		table.getColumnModel().getColumn(1).setPreferredWidth(98);
		table.getColumnModel().getColumn(2).setPreferredWidth(159);
		scrollPane = new JScrollPane(table);
		add(scrollPane);
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	        	campoSeleccionadoAct = 0;
	        	
	        	int idDato = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
	        	campoSeleccionadoAct = idDato;
	        	
	        	principal.ActualizarDatosFormularioSeleccionado();
	            // do some actions here, for example
	            // print first column value from selected row
	        }
	    });
	}
	
	public int getCampoSeleccionadoAct() {
		return campoSeleccionadoAct;
	}
	
	public void actualizarTabla(Producto[] productos) {
		try {
			if(modeloTable.getRowCount() > 0) {
				modeloTable.setRowCount(0);
			}
		}
		catch (Exception e){}
		
		if(productos.length > 0) {
			modeloTable.insertRow(table.getRowCount(), new Object[] {"","","",""});
			for(int i = 0; i<productos.length; i++) {
				if(productos[i] != null) {
					
					Producto prodAct = productos[i];
					String nombreProd = prodAct.getNombreProd();
					String tipoProd = prodAct.getTipoProd();
					int valorInversion = prodAct.getValorInversion();
					int valorVenta = prodAct.getValorVenta();
					int cantidad = prodAct.getCantidad();
					int codigoProd = prodAct.getCodProd();
					modeloTable.insertRow(table.getRowCount(), new Object[] {i,codigoProd,nombreProd,tipoProd,valorInversion,valorVenta,cantidad});
				}
			}
		}else {
			modeloTable.insertRow(table.getRowCount(), new Object[] {"","","",""});
		}		
	}


	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public JTable getTable() {
		return table;
	}
}
