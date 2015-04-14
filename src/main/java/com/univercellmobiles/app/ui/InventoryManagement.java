package com.univercellmobiles.app.ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JToolBar;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;

import java.awt.Component;

import javax.swing.JSplitPane;

import java.awt.ComponentOrientation;
import java.beans.PropertyVetoException;

import javax.swing.JSeparator;

public class InventoryManagement extends JInternalFrame {
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryManagement frame = new InventoryManagement();
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
	public InventoryManagement() {
		try {
			setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100, 100, 450, 300);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		getContentPane().add(toolBar, BorderLayout.WEST);
		
		JButton btnAddMobiles = new JButton("Mobiles");
		toolBar.add(btnAddMobiles);
		
		JButton btnNewButton = new JButton("Accessories");
		toolBar.add(btnNewButton);
		
		JButton btnModels = new JButton("Models");
		toolBar.add(btnModels);
		
		JButton btnBrands = new JButton("Brands");
		toolBar.add(btnBrands);
		
		JButton btnDistributors = new JButton("Distributors");
		toolBar.add(btnDistributors);
		
		JTabbedPane TabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(TabbedPane, BorderLayout.CENTER);
		
		JPanel mobilePanel = new JPanel();
		TabbedPane.addTab("Mobiles", null, mobilePanel, null);
		TabbedPane.setEnabledAt(0, true);
		mobilePanel.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar_2 = new JToolBar();
		mobilePanel.add(toolBar_2, BorderLayout.NORTH);
		
		JButton btnAddNew_1 = new JButton("Add New");
		toolBar_2.add(btnAddNew_1);
		
		table_1 = new JTable();
		mobilePanel.add(table_1, BorderLayout.CENTER);
		
		JPanel accPanel = new JPanel();
		TabbedPane.addTab("Accessories", null, accPanel, null);
		TabbedPane.setEnabledAt(1, true);
		accPanel.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar_1 = new JToolBar();
		accPanel.add(toolBar_1, BorderLayout.NORTH);
		
		JButton btnAddNew = new JButton("Add New");
		toolBar_1.add(btnAddNew);
		
		table = new JTable();
		accPanel.add(table, BorderLayout.CENTER);

	}

}
