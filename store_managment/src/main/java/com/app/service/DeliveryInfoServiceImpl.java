package com.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AddressRepository;
import com.app.dao.DeliveryInfoDao;
import com.app.dao.UserDao;
import com.app.pojos.DeliveryInfo;
import com.app.pojos.Status;


@Service
@Transactional
public class DeliveryInfoServiceImpl implements IDeliveryService {
	
	@Autowired
	private DeliveryInfoDao deliveryDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private AddressRepository addressDao;

	@Override
	public List<DeliveryInfo> getDeliveryInfo() {
		// TODO Auto-generated method stub
		return deliveryDao.findAll();
	}

	@Override
	public List<DeliveryInfo> getMyDeliverInfo(int userId) {
		// TODO Auto-generated method stub
		
		if(userDao.getUserbyAddressId(userId) == null)
		{
			return new ArrayList<DeliveryInfo>();
		}
		return deliveryDao.getDeliveryInfobyAid(userDao.getUserbyAddressId(userId).getAddresses().getId());
	}

	@Override
	public String changeDeliveryInfo(int dId,Status Status) {
		DeliveryInfo d=deliveryDao.findById(dId).get();
		d.setStatus(Status);
		return "status is changed";
	}

	@Override
	public String deleteDeliveryInfo(int D_id) {
		deliveryDao.deleteById(D_id);
		return "DeliverInfo is deleted";
	}
	
	@Override
	public DeliveryInfo getbyId(int id) {
		// TODO Auto-generated method stub
		return deliveryDao.findById(id).get();
	}

}
