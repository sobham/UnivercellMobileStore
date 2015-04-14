package com.univercellmobiles.app.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FUNDS")
public class FundStatus {
	
	@Id
	@GeneratedValue
	private int statusId;
	private float investment;
	private float expense;
	private float stockValue;
	private float profit;
	private float assets;
	private float cash;
	private float univercellfunds;
	private float returns;
	private float fundsout;
	private float deposits;
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public float getInvestment() {
		return investment;
	}
	public void setInvestment(float investment) {
		this.investment = investment;
	}
	public float getExpense() {
		return expense;
	}
	public void setExpense(float expense) {
		this.expense = expense;
	}
	public float getStockValue() {
		return stockValue;
	}
	public void setStockValue(float stockValue) {
		this.stockValue = stockValue;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	public float getAssets() {
		return assets;
	}
	public void setAssets(float assets) {
		this.assets = assets;
	}
	public float getCash() {
		return cash;
	}
	public void setCash(float cash) {
		this.cash = cash;
	}
	public float getUnivercellfunds() {
		return univercellfunds;
	}
	public void setUnivercellfunds(float univercellfunds) {
		this.univercellfunds = univercellfunds;
	}
	public float getReturns() {
		return returns;
	}
	public void setReturns(float returns) {
		this.returns = returns;
	}
	public float getFundsout() {
		return fundsout;
	}
	public void setFundsout(float fundsout) {
		this.fundsout = fundsout;
	}
	public float getDeposits() {
		return deposits;
	}
	public void setDeposits(float deposits) {
		this.deposits = deposits;
	}
	
	
	
	
	

}
