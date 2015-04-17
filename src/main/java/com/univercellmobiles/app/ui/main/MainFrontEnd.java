package com.univercellmobiles.app.ui.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

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
		
		JButton btnAddAccessories = new JButton("Add Accessories");
		btnAddAccessories.setRolloverEnabled(false);
		
		JLabel lblInventory = new JLabel("Inventory Management");
		lblInventory.setBackground(SystemColor.textHighlight);
		lblInventory.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInventory.setForeground(Color.ORANGE);
		
		JButton btnManageBrands = new JButton("Manage Brands");
		
		JButton btnManageModels = new JButton("Manage Models");
		
		JLabel lblSales = new JLabel("Sales Billing Management");
		lblSales.setForeground(Color.ORANGE);
		lblSales.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSales.setBackground(SystemColor.textHighlight);
		
		JButton btnPhoneSales = new JButton("Phone Sales");
		
		JButton btnAccessoriesSales = new JButton("Accessories Sales");
		
		JButton btnSearchPhones = new JButton("Search Phones");
		
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
		
		JLabel lblFundsManagement = new JLabel("Funds Management");
		lblFundsManagement.setForeground(Color.ORANGE);
		lblFundsManagement.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFundsManagement.setBackground(SystemColor.textHighlight);
		
		JButton btnInvestment = new JButton("Manage Investment");
		btnInvestment.setAutoscrolls(true);
		
		JButton btnExpense = new JButton("Manage Expenses");
		btnExpense.setAutoscrolls(true);
		
		JButton btnAssets = new JButton("Manage Assets");
		
		JButton btnManageEodCash = new JButton("Manage EOD Cash");
		
		JLabel lblReports = new JLabel("Reports");
		lblReports.setForeground(Color.ORANGE);
		lblReports.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReports.setBackground(SystemColor.textHighlight);
		
		JButton btnPurchaseHistory = new JButton("Purchase History");
		
		JButton btnSalesHistory = new JButton("Sales History");
		
		JButton btnFirmValue = new JButton("Firm Value");
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
		
		JPanel panel_4 = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel_4, BorderLayout.CENTER);
	}

}
