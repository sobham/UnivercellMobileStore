package com.univercellmobiles.app.ui.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

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
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel_2, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_3.add(btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		frmUnivercellMobilesStore.getContentPane().add(panel_4, BorderLayout.CENTER);
	}

}
