package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.DeliveryInfo;

public interface DeliveryInfoDao extends JpaRepository<DeliveryInfo, Integer>{

	@Query("select d from DeliveryInfo d join fetch d.userAddress where d.userAddress.Id=:aId")
	List<DeliveryInfo> getDeliveryInfobyAid(@Param("aId") int aId);
	
	@Query("select d from DeliveryInfo d join fetch d.userAddress where d.orderId=:oId")
	List<DeliveryInfo> getDeliveryInfobyOrderId(@Param("oId") int oId);
	
}
