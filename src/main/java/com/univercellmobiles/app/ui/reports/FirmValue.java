package com.univercellmobiles.app.ui.reports;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univercellmobiles.app.beans.FundStatus;
import com.univercellmobiles.app.service.FundStatusService;
import com.univercellmobiles.app.util.ConfigBuilder;

import java.awt.Font;
import java.awt.Color;
import java.util.List;
import java.awt.Window.Type;

public class FirmValue extends JFrame {

	private JPanel contentPane;
	private JTextField txtInvestment;
	private JTextField txtCash;
	private JTextField txtStock;
	private JTextField txtUniFunds;
	private JTextField txtBank;
	private JTextField txtAssets;
	private JTextField txtTotal;
	private JTextField txtROI;
	private JTextField txtGrowth;
	JLabel lblUpdatedDate;
	ConfigurableApplicationContext context = ConfigBuilder.getAppContext();
	FundStatusService fs = (FundStatusService) context.getBean("fundStatusService");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirmValue frame = new FirmValue();
					//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
					frame.setAlwaysOnTop(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirmValue() {
		setAlwaysOnTop(true);
		setType(Type.POPUP);
		setTitle("Firm Current Value");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 704, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(85, 33, 147, 24);
		panel.add(lblInvestmentAmount);
		
		txtInvestment = new JTextField();
		txtInvestment.setEditable(false);
		txtInvestment.setBounds(257, 35, 172, 20);
		panel.add(txtInvestment);
		txtInvestment.setColumns(10);
		
		JLabel lblCashAtStore = new JLabel("Cash At Store");
		lblCashAtStore.setBounds(85, 73, 147, 24);
		panel.add(lblCashAtStore);
		
		txtCash = new JTextField();
		txtCash.setEditable(false);
		txtCash.setBounds(257, 75, 172, 20);
		panel.add(txtCash);
		txtCash.setColumns(10);
		
		JLabel lblStockValue = new JLabel("Stock Value");
		lblStockValue.setBounds(85, 108, 147, 24);
		panel.add(lblStockValue);
		
		txtStock = new JTextField();
		txtStock.setEditable(false);
		txtStock.setBounds(257, 110, 172, 20);
		panel.add(txtStock);
		txtStock.setColumns(10);
		
		JLabel lblFundsWithUnivercell = new JLabel("Funds with Univercell");
		lblFundsWithUnivercell.setBounds(85, 143, 147, 24);
		panel.add(lblFundsWithUnivercell);
		
		txtUniFunds = new JTextField();
		txtUniFunds.setEditable(false);
		txtUniFunds.setBounds(257, 145, 172, 20);
		panel.add(txtUniFunds);
		txtUniFunds.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 67, 582, 7);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 244, 594, 2);
		panel.add(separator_1);
		
		JLabel lblBankDeposit = new JLabel("Bank Deposit");
		lblBankDeposit.setBounds(85, 176, 147, 20);
		panel.add(lblBankDeposit);
		
		txtBank = new JTextField();
		txtBank.setEditable(false);
		txtBank.setBounds(257, 176, 172, 20);
		panel.add(txtBank);
		txtBank.setColumns(10);
		
		JLabel lblTotal = new JLabel("Current Value");
		lblTotal.setBounds(85, 273, 109, 24);
		panel.add(lblTotal);
		
		JLabel lblFixedAssets = new JLabel("Fixed Assets");
		lblFixedAssets.setBounds(85, 209, 147, 24);
		panel.add(lblFixedAssets);
		
		txtAssets = new JTextField();
		txtAssets.setEditable(false);
		txtAssets.setBounds(257, 213, 172, 20);
		panel.add(txtAssets);
		txtAssets.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setForeground(Color.GREEN);
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTotal.setEditable(false);
		txtTotal.setBounds(257, 275, 172, 20);
		panel.add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblRoi = new JLabel("ROI");
		lblRoi.setBounds(85, 338, 69, 24);
		panel.add(lblRoi);
		
		txtROI = new JTextField();
		txtROI.setEditable(false);
		txtROI.setBounds(257, 340, 172, 20);
		panel.add(txtROI);
		txtROI.setColumns(10);
		
		JLabel lblInvestment = new JLabel("Growth");
		lblInvestment.setBounds(85, 308, 86, 20);
		panel.add(lblInvestment);
		
		txtGrowth = new JTextField();
		txtGrowth.setEditable(false);
		txtGrowth.setBounds(257, 306, 172, 20);
		panel.add(txtGrowth);
		txtGrowth.setColumns(10);
		
		lblUpdatedDate = new JLabel("");
		lblUpdatedDate.setForeground(new Color(255, 0, 255));
		lblUpdatedDate.setBounds(489, 101, 126, 20);
		panel.add(lblUpdatedDate);
		
		List<FundStatus> fundStatus = fs.getCurrentTxnDetails();
		FundStatus currFundStatus = fundStatus.get(0);
		System.out.println(currFundStatus.toString());
		float investment =currFundStatus.getInvestment();
		float cash =currFundStatus.getCash() ;
		float stock=currFundStatus.getStockValue();
		float unifunds=currFundStatus.getUnivercellfunds();
		float bank =currFundStatus.getDeposits();
		float assets =currFundStatus.getAssets();
		
		txtInvestment.setText(Float.toString(investment));
		txtCash.setText(Float.toString(cash));
		txtStock.setText(Float.toString(stock));
		txtUniFunds.setText(Float.toString(unifunds));
		txtBank.setText(Float.toString(bank));
		txtAssets.setText(Float.toString(assets));
		if(currFundStatus.getToday()!=null){
		lblUpdatedDate.setText(currFundStatus.getToday().toString());
		}
		
		
		float currValue=cash+stock+unifunds+bank+assets;
		txtTotal.setText(Float.toString(currValue));
		
		float growth = currValue-investment;
		
		txtGrowth.setText(Float.toString(growth));
		
		float ROI = (growth/investment)*100;
		
		txtROI.setText(Float.toString(ROI));
		
		JLabel lblDetailsUpdatedAs = new JLabel("Details Updated as on ");
		lblDetailsUpdatedAs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDetailsUpdatedAs.setBounds(489, 75, 126, 20);
		panel.add(lblDetailsUpdatedAs);
		
		
		
		
		
		
		
		
		
	}
}
