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
import com.univercellmobiles.app.beans.PhoneModel;
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



public class AccModelManager extends JFrame {
	private JTable table;
	private boolean DEBUG = false;
	PhModelModel pmm;
	private Float totalCost = (float) 0.0;
	private NumberFormat moneyFormat;
	private NumberFormat percentFormat;
	ConfigurableApplicationContext context ;

	PhoneModelService pms;
	BrandService bs;
	
	PhoneModel currentSelection = null;
	private JTextField txtModel;
	private JTextField txtPlatform;
	JTextArea textAreaFeatures;
	private JTextField txtPrdCode;
	JComboBox comboBoxBrand;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccModelManager frame = new AccModelManager();

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
	public AccModelManager() {
		setAlwaysOnTop(true);
		setTitle("Phone Model Manager");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 771, 825);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		context = ConfigBuilder.getAppContext();
		pms = (PhoneModelService) context
				.getBean("phoneModelService");
		 bs = (BrandService) context
					.getBean("brandService");
		JPanel panel = new JPanel();
		panel.setMaximumSize(new Dimension(50000, 50000));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		List<PhoneModel> pmodelList = new ArrayList<PhoneModel>();
		pmodelList = pms.getAllDetails();

		List<String> brandList = new ArrayList<String>();
		

		brandList = bs.getAllBrandNames();
		
		 comboBoxBrand = new JComboBox();
		 comboBoxBrand.setBounds(289, 30, 403, 20);
		 panel.add(comboBoxBrand);
		 for(String brand : brandList){
			 comboBoxBrand.addItem(brand);
		 }



		pmm = new PhModelModel();
		table = new JTable();
		table.setModel(pmm);
		table.setBounds(67, 461, 627, -116);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(67, 346, 625, 258);
		panel.add(scrollPane);

		JButton btnAddModel = new JButton("Add/Update Model");
		btnAddModel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PhoneModel model = new PhoneModel();
				model.setBrandName(comboBoxBrand.getSelectedItem().toString());
				model.setModelName(txtModel.getText());
				model.setFeatures(textAreaFeatures.getText());
				model.setPrdCode(Integer.parseInt(txtPrdCode.getText()));
				model.setPlatform(txtPlatform.getText());
				
				/*brand.setBrandName(txtBrandName.getText());
				brand.setDetails(textAreaDesc.getText());
				brand.setType(comboBoxType.getSelectedItem().toString());
				brand.setRating(txtRating.getText());*/
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
				pms.add(model);
				pmm.addRow(model);
				pmm.refreshTableData();
				pmm.fireTableDataChanged();

			}
		});
		btnAddModel.setBounds(505, 303, 187, 23);
		panel.add(btnAddModel);
		
		
		JButton btnDeleteBrand = new JButton("Delete Brand");
		btnDeleteBrand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(currentSelection!=null){
					pms.delete(currentSelection.getId());
					pmm.refreshTableData();
					pmm.fireTableDataChanged();
					
				}
			}
		});
		btnDeleteBrand.setBounds(552, 623, 140, 23);
		panel.add(btnDeleteBrand);
		
			//model.setDate(today.getYear(),today.getDate(),today.getDate());
		
		 table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 
		 JLabel lblModelName = new JLabel("Model Name");
		 lblModelName.setBounds(67, 68, 187, 23);
		 panel.add(lblModelName);
		 
		 txtModel = new JTextField();
		 txtModel.setBounds(291, 69, 401, 20);
		 panel.add(txtModel);
		 txtModel.setColumns(10);
		 
		 JLabel lblBrand = new JLabel("Brand");
		 lblBrand.setBounds(67, 29, 187, 23);
		 panel.add(lblBrand);
		 
		 JLabel lblPlatform = new JLabel("Platform");
		 lblPlatform.setBounds(67, 136, 187, 23);
		 panel.add(lblPlatform);
		 
		 txtPlatform = new JTextField();
		 txtPlatform.setBounds(291, 134, 180, 20);
		 panel.add(txtPlatform);
		 txtPlatform.setColumns(10);
		 
		 JLabel lblFeatures = new JLabel("Features");
		 lblFeatures.setBounds(67, 170, 187, 23);
		 panel.add(lblFeatures);
		 
		 textAreaFeatures = new JTextArea();
		 textAreaFeatures.setBounds(291, 169, 401, 83);
		 panel.add(textAreaFeatures);
		 
		 JLabel lblProductCode = new JLabel("Product Code");
		 lblProductCode.setBounds(67, 102, 180, 23);
		 panel.add(lblProductCode);
		 
		 txtPrdCode = new JTextField();
		 txtPrdCode.setBounds(291, 103, 180, 20);
		 panel.add(txtPrdCode);
		 txtPrdCode.setColumns(10);
		 

	        
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
	                            currentSelection = pmm.getRow(modelRow);
	                            txtModel.setText(currentSelection.getModelName());
	                            txtPlatform.setText(currentSelection.getPlatform());
	                            textAreaFeatures.setText(currentSelection.getFeatures());
	                            txtPrdCode.setText(Integer.toString(currentSelection.getPrdCode()));
	                         
	                        }
	                    }
	                }
	        );

		   
			    

	}

		


	class PhModelModel extends AbstractTableModel {
		private String[] columnNames = { "Model Id", "Model Name", "Brand", "Platform",
				"Product Code" };

		PhoneModel model = new PhoneModel();

		private List<PhoneModel> data = new ArrayList<PhoneModel>();

		PhModelModel() {
			 data = pms.getAllDetails();
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
			PhoneModel model = data.get(row);
			/*
			 * private String accStockId; // private Timestamp arrivalDate;
			 * private String accModel; private String phmodelName; //private
			 * Timestamp soldDate; private String desription; private String
			 * margin; private Float dp; private Float sp;
			 */
			switch (col) {
			case 0:
				return model.getId();
			case 1:
				return model.getModelName();
			case 2:
				return model.getBrandName();
			case 3:
				return model.getPlatform();
			case 4:
				return model.getPrdCode();
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
			 data = pms.getAllDetails();
		}

		public void addRow(Object record) {
			PhoneModel pm = (PhoneModel) record;
			data.add(pm);
		}

		  public PhoneModel getRow(int row){
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
