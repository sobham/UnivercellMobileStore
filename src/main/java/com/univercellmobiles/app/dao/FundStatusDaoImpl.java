package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univercellmobiles.app.beans.FundStatus;
import com.univercellmobiles.app.beans.Sales;
import com.univercellmobiles.app.beans.Transactions;

@Repository("fundStatusDao")
public class FundStatusDaoImpl implements FundStatusDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(FundStatus fund) {
		// TODO Auto-generated method stub
		getCurrentSession().save(fund);

	}

	public void update(FundStatus fund) {
		// TODO Auto-generated method stub

		getCurrentSession().update(fund);
	}

	public FundStatus getFundsById(int fundStatusId) {
		// TODO Auto-generated method stub
		FundStatus fund = (FundStatus) getCurrentSession().get(FundStatus.class, fundStatusId);
		return fund;
	}

	public void delete(int fundStatusId) {
		// TODO Auto-generated method stub
		FundStatus fund = getFundsById(fundStatusId);
		if (fund != null)
			getCurrentSession().delete(fund);

	}

	@SuppressWarnings("unchecked")
	public List<FundStatus> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from FundStatus").list();
	}

	public List<FundStatus> getCurrentTxnDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from FundStatus order by statusId desc").list();
	}


}
