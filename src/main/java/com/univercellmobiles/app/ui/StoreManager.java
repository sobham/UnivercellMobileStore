package com.univercellmobiles.app.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StoreManager {

	private JFrame frmUnivercellMobiles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreManager window = new StoreManager();
					window.frmUnivercellMobiles.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StoreManager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnivercellMobiles = new JFrame();
		frmUnivercellMobiles.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmUnivercellMobiles.setTitle("UniverCell Mobiles");
		frmUnivercellMobiles.setBounds(100, 100, 450, 300);
		frmUnivercellMobiles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		frmUnivercellMobiles.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frmUnivercellMobiles.setJMenuBar(menuBar);
		
		JMenu mnInventory = new JMenu("Inventory");
		mnInventory.setPreferredSize(new Dimension(150, 22));
		menuBar.add(mnInventory);
		
		JMenuItem mntmAddStock = new JMenuItem("Stock Management");
		mntmAddStock.setPreferredSize(new Dimension(150, 22));
		mnInventory.add(mntmAddStock);
		
		JMenu mnBilling = new JMenu("Billing");
		mnBilling.setPreferredSize(new Dimension(150, 22));
		menuBar.add(mnBilling);
		
		JMenuItem mntmSale = new JMenuItem("Sale");
		mntmSale.setPreferredSize(new Dimension(150, 22));
		mnBilling.add(mntmSale);
		
		JMenu mnReports = new JMenu("Reports");
		mnReports.setPreferredSize(new Dimension(150, 22));
		menuBar.add(mnReports);
		
		JMenuItem mntmDailySales = new JMenuItem("Daily Sales Report");
		mntmDailySales.setPreferredSize(new Dimension(150, 22));
		mnReports.add(mntmDailySales);
		
		JMenuItem mntmCustomReport = new JMenuItem("Custom Report");
		mntmCustomReport.setPreferredSize(new Dimension(150, 22));
		mnReports.add(mntmCustomReport);
		
		JMenu mnFirmRevenue = new JMenu("Firm Revenue");
		menuBar.add(mnFirmRevenue);
	}
}
