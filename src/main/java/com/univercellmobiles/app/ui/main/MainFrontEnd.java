package com.univercellmobiles.app.ui.main;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import com.univercellmobiles.app.ui.funds.BalanceSheet;
import com.univercellmobiles.app.ui.funds.ExpenseManagement;
import com.univercellmobiles.app.ui.funds.FixedAssetManagment;
import com.univercellmobiles.app.ui.funds.InvestmentManagement;
import com.univercellmobiles.app.ui.inventory.AddMobileAccessory;
import com.univercellmobiles.app.ui.inventory.AddStock;
import com.univercellmobiles.app.ui.inventory.BrandManager;
import com.univercellmobiles.app.ui.inventory.ModelManager;
import com.univercellmobiles.app.ui.inventory.StockSearch;
import com.univercellmobiles.app.ui.reports.FirmValue;
import com.univercellmobiles.app.ui.reports.PurchaseHistory;
import com.univercellmobiles.app.ui.reports.SalesHistory;
import com.univercellmobiles.app.ui.sales.AccessoryBilling;
import com.univercellmobiles.app.ui.sales.SalesBilling;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainFrontEnd {

	private JFrame frmUnivercellMobilesStore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrontEnd window = new MainFrontEnd();
					window.frmUnivercellMobilesStore.setExtendedState(JFrame.MAXIMIZED_BOTH);
					window.frmUnivercellMobilesStore.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrontEnd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnivercellMobilesStore = new JFrame();
		frmUnivercellMobilesStore.setTitle("Univercell Mobiles Store Management");
		frmUnivercellMobilesStore.setBounds(100, 100, 717, 462);
		frmUnivercellMobilesStore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnivercellMobilesStore.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel, BorderLayout.WEST);
		
		JButton btnAddPhoneStock = new JButton("Add Phone Stock");
		btnAddPhoneStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStock frame = new AddStock();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
			}
		});
		
		JButton btnAddAccessories = new JButton("Add Accessories");
		btnAddAccessories.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMobileAccessory frame = new AddMobileAccessory();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
			}
		});
		btnAddAccessories.setRolloverEnabled(false);
		
		JLabel lblInventory = new JLabel("Inventory Management");
		lblInventory.setBackground(SystemColor.textHighlight);
		lblInventory.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInventory.setForeground(Color.ORANGE);
		
		JButton btnManageBrands = new JButton("Manage Brands");
		btnManageBrands.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BrandManager frame = new BrandManager();
				frame.setVisible(true);
			}
		});
		
		JButton btnManageModels = new JButton("Manage Models");
		btnManageModels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelManager frame = new ModelManager();

				frame.setVisible(true);
			}
		});
		
		JLabel lblSales = new JLabel("Sales Billing Management");
		lblSales.setForeground(Color.ORANGE);
		lblSales.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSales.setBackground(SystemColor.textHighlight);
		
		JButton btnPhoneSales = new JButton("Phone Sales");
		btnPhoneSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalesBilling frame = new SalesBilling();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
			}
		});
		
		JButton btnAccessoriesSales = new JButton("Accessories Sales");
		btnAccessoriesSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccessoryBilling frame = new AccessoryBilling();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
			}
		});
		
		JButton btnSearchPhones = new JButton("Search Phones");
		btnSearchPhones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockSearch frame = new StockSearch();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
			}
		});
		
		JButton btnSearchAccessories = new JButton("Search Accessories");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(31)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnPhoneSales, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnAccessoriesSales, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
								.addComponent(lblInventory, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(51)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnAddPhoneStock, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAddAccessories, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnManageBrands, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnManageModels, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSearchPhones, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSearchAccessories, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(31))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(lblSales, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
					.addGap(15))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addComponent(lblInventory, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAddPhoneStock)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAddAccessories)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnManageBrands)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnManageModels)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSearchPhones)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSearchAccessories)
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addComponent(lblSales, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPhoneSales)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAccessoriesSales)
					.addGap(29))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel_2, BorderLayout.EAST);
		
		ImagePanel ip = new ImagePanel();
		frmUnivercellMobilesStore.getContentPane().add(ip,BorderLayout.CENTER);
		
		JLabel lblFundsManagement = new JLabel("Funds Management");
		lblFundsManagement.setForeground(Color.ORANGE);
		lblFundsManagement.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFundsManagement.setBackground(SystemColor.textHighlight);
		
		JButton btnInvestment = new JButton("Manage Investment");
		btnInvestment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InvestmentManagement frame = new InvestmentManagement();
				frame.setVisible(true);
			}
		});
		btnInvestment.setAutoscrolls(true);
		
		JButton btnExpense = new JButton("Manage Expenses");
		btnExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpenseManagement frame = new ExpenseManagement();
				frame.setVisible(true);
			}
		});
		btnExpense.setAutoscrolls(true);
		
		JButton btnAssets = new JButton("Manage Assets");
		btnAssets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FixedAssetManagment frame = new FixedAssetManagment();
				frame.setVisible(true);
			}
		});
		
		JButton btnManageEodCash = new JButton("Manage EOD Cash");
		btnManageEodCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BalanceSheet frame = new BalanceSheet();

				frame.setVisible(true);
				
			}
		});
		
		JLabel lblReports = new JLabel("Reports");
		lblReports.setForeground(Color.ORANGE);
		lblReports.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReports.setBackground(SystemColor.textHighlight);
		
		JButton btnPurchaseHistory = new JButton("Purchase History");
		btnPurchaseHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseHistory frame = new PurchaseHistory();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
			}
		});
		
		JButton btnSalesHistory = new JButton("Sales History");
		btnSalesHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalesHistory frame = new SalesHistory();
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
			}
		});
		
		JButton btnFirmValue = new JButton("Firm Value");
		btnFirmValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirmValue frame = new FirmValue();
				//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setVisible(true);
				frame.setAlwaysOnTop(true);
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnExpense, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnInvestment, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
								.addComponent(btnAssets, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnManageEodCash, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblReports, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPurchaseHistory, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
								.addComponent(btnSalesHistory, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnFirmValue, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(32)
							.addComponent(lblFundsManagement, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblFundsManagement, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnInvestment)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExpense)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAssets)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnManageEodCash)
					.addGap(49)
					.addComponent(lblReports, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPurchaseHistory)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSalesHistory)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnFirmValue)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		panel_3.add(btnNewButton);
		
		
	}
	
	class ImagePanel extends JPanel{

	    private BufferedImage image;

	    public ImagePanel() {
	       try {                
	    	   File f = new File("src\\main\\resources\\images\\univercellmobiles.gif");
	           image = ImageIO.read(f);
	    	  // image = ImageIO.read(new File("../../../../../../resources/univercellmobiles.gif"));
	       } catch (IOException ex) {
	            // handle exception...
	       }
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        //g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters          
	        g.drawImage(image, 150, 100, 600, 500, null);
	    }

	}

}


