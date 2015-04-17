package com.univercellmobiles.app.ui.inventory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

import net.sourceforge.jdatepicker.JDatePicker;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.univercellmobiles.app.beans.AccessoryStock;
import com.univercellmobiles.app.beans.Brand;
import com.univercellmobiles.app.beans.PhoneStock;
import com.univercellmobiles.app.service.AccessoryStockService;
import com.univercellmobiles.app.service.BrandService;
import com.univercellmobiles.app.service.PhoneModelService;
import com.univercellmobiles.app.service.PhoneStockService;
import com.univercellmobiles.app.ui.common.custom.AutocompleteJComboBox;
import com.univercellmobiles.app.ui.common.custom.StringSearchable;
import com.univercellmobiles.app.util.ConfigBuilder;

import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.Window.Type;



public class BrandManager extends JFrame {
	private JTable table;
	private boolean DEBUG = false;
	BrandModel bm;
	private Float totalCost = (float) 0.0;
	private NumberFormat moneyFormat;
	private NumberFormat percentFormat;
	JTextArea textAreaDesc;
	ConfigurableApplicationContext context ;

	BrandService bs;
	private JTextField txtBrandName;
	private JTextField txtRating;
	JComboBox comboBoxType;
	
	Brand currentSelection = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrandManager frame = new BrandManager();

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
	public BrandManager() {
		setTitle("Brand Manager");
		setAlwaysOnTop(true);
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 771, 825);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		context = ConfigBuilder.getAppContext();
		 bs = (BrandService) context
					.getBean("brandService");

		JPanel panel = new JPanel();
		panel.setMaximumSize(new Dimension(50000, 50000));
		getContentPane().add(panel);
		panel.setLayout(null);

		List<Brand> brandsList = new ArrayList<Brand>();
		brandsList = bs.getAllDetails();


		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(65, 70, 153, 22);
		panel.add(lblDescription);
		bm = new BrandModel();
		table = new JTable();
		table.setModel(bm);
		table.setBounds(67, 461, 627, -116);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(67, 287, 625, 185);
		panel.add(scrollPane);

		JButton btnBrand = new JButton("Add/Update Brand");
		btnBrand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Brand brand = new Brand();
				brand.setBrandName(txtBrandName.getText());
				brand.setDetails(textAreaDesc.getText());
				brand.setType(comboBoxType.getSelectedItem().toString());
				brand.setRating(txtRating.getText());
				/*brand.setImeiNo(txtIMEI.getText());
				brand.setPhModel(comboModelSearch.getSelectedItem().toString());
				float marginper = Float.parseFloat(ftfMargin.getText().replace(",", ""));
				float dp =Float.parseFloat(ftfDP.getText().replace(",", "")) ;
				brand.setMargin(marginper);
				stock.setSp(Float.parseFloat(ftfSP.getText().replace(",", "")));
				stock.setDp(dp);
				Date arvDate = (Date) datePicker.getModel().getValue();
				stock.setArrivalDate(arvDate);
				stock.setAvailable(1);
				stock.setInvoiceNo(txtInvoice.getText());
				stock.setDistributor(null);
				stock.setDescription(textAreaDesc.getText());
				stock.setOffer(textAreaOffer.getText());
				stock.setPlace(txtPlace.getText());
				stock.setBp(Float.parseFloat(ftfSP.getText().replace(",", "")));
				float margin = marginper*dp/100;
				stock.setMargin(margin);
				totalCost += stock.getSp();*/
				bs.add(brand);
				bm.addRow(brand);
				bm.refreshTableData();
				bm.fireTableDataChanged();

			}
		});
		btnBrand.setBounds(505, 185, 187, 23);
		panel.add(btnBrand);

		textAreaDesc = new JTextArea();
		textAreaDesc.setBounds(279, 57, 413, 51);
		panel.add(textAreaDesc);
		
		JLabel lblBrandName = new JLabel("Brand Name");
		lblBrandName.setBounds(67, 24, 153, 22);
		panel.add(lblBrandName);
		
		txtBrandName = new JTextField();
		txtBrandName.setBounds(279, 25, 413, 21);
		panel.add(txtBrandName);
		txtBrandName.setColumns(10);
		
		JLabel lblRating = new JLabel("Rating");
		lblRating.setBounds(67, 158, 153, 22);
		panel.add(lblRating);
		
		txtRating = new JTextField();
		txtRating.setBounds(279, 159, 187, 20);
		panel.add(txtRating);
		txtRating.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(67, 121, 153, 22);
		panel.add(lblType);
		List<String> type = new ArrayList<String>();
		type.add("Phone");
		type.add("Accessories");
		
		comboBoxType = new JComboBox();
		comboBoxType.setBounds(279, 122, 187, 22);
		for(String i:type){
			comboBoxType.addItem(i);
		}
		
		panel.add(comboBoxType);
		
		JButton btnDeleteBrand = new JButton("Delete Brand");
		btnDeleteBrand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(currentSelection!=null){
					bs.delete(currentSelection.getBrandId());
					bm.refreshTableData();
					bm.fireTableDataChanged();
					
				}
			}
		});
		btnDeleteBrand.setBounds(549, 496, 140, 23);
		panel.add(btnDeleteBrand);
		
			//model.setDate(today.getYear(),today.getDate(),today.getDate());
		
		 table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        
	        //When selection changes, provide user with row numbers for
	        //both view and model.
	        table.getSelectionModel().addListSelectionListener(
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent event) {
	                        int viewRow = table.getSelectedRow();
	                        if (viewRow < 0) {
	                            //Selection got filtered away.
	                            //statusText.setText("");
	                        } else {
	                            int modelRow = 
	                            		table.convertRowIndexToModel(viewRow);
	                            currentSelection = bm.getRow(modelRow);
	                            txtBrandName.setText(currentSelection.getBrandName());
	                            textAreaDesc.setText(currentSelection.getDetails());
	                            txtRating.setText(currentSelection.getRating());
	                            comboBoxType.setSelectedItem(currentSelection.getType());
	                           /* statusText.setText(
	                                String.format("Selected Row in view: %d. " +
	                                    "Selected Row in model: %d.", 
	                                    viewRow, modelRow));*/
	                        }
	                    }
	                }
	        );

		   
			    

	}

		


	class BrandModel extends AbstractTableModel {
		private String[] columnNames = { "Brand Id", "Brand Name", "Details", "Type",
				"Rating" };

		Brand brand = new Brand();

		private List<Brand> data = new ArrayList<Brand>();

		BrandModel() {
			 data = bs.getAllDetails();
		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return data.size();
		}

		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			Brand brand = data.get(row);
			/*
			 * private String accStockId; // private Timestamp arrivalDate;
			 * private String accModel; private String phmodelName; //private
			 * Timestamp soldDate; private String desription; private String
			 * margin; private Float dp; private Float sp;
			 */
			switch (col) {
			case 0:
				return brand.getBrandId();
			case 1:
				return brand.getBrandName();
			case 2:
				return brand.getDetails();
			case 3:
				return brand.getType();
			case 4:
				return brand.getRating();
			default:
				throw new IndexOutOfBoundsException();
			}

		}

		/*
		 * JTable uses this method to determine the default renderer/ editor for
		 * each cell. If we didn't implement this method, then the last column
		 * would contain text ("true"/"false"), rather than a check box.
		 */
		/*
		 * public Class getColumnClass(int c) { return getValueAt(0,
		 * c).getClass(); }
		 */

		/*
		 * Don't need to implement this method unless your table's editable.
		 */
		public boolean isCellEditable(int row, int col) {
			// Note that the data/cell address is constant,
			// no matter where the cell appears onscreen.
			if (col < 2) {
				return false;
			} else {
				return true;
			}
		}

		/*
		 * Don't need to implement this method unless your table's data can
		 * change.
		 */
		public void setValueAt(Object value, int row, int col) {
			if (DEBUG) {
				System.out.println("Setting value at " + row + "," + col
						+ " to " + value + " (an instance of "
						+ value.getClass() + ")");
			}

			// data[row][col] = value;
			fireTableCellUpdated(row, col);

			if (DEBUG) {
				System.out.println("New value of data:");
				printDebugData();
			}
		}

		public void refreshTableData() {
			 data = bs.getAllDetails();
		}

		public void addRow(Object record) {
			Brand b = (Brand) record;
			data.add(b);
		}

		  public Brand getRow(int row){
	        	return data.get(row);
	        }
		private void printDebugData() {
			int numRows = getRowCount();
			int numCols = getColumnCount();

			for (int i = 0; i < numRows; i++) {
				System.out.print("    row " + i + ":");
				for (int j = 0; j < numCols; j++) {
					// System.out.print("  " + data[i][j]);
				}
				System.out.println();
			}
			System.out.println("--------------------------");
		}
	}
}
