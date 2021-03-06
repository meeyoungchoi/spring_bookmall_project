package com.bookkurly.bookmall.customer.jang.service;

import java.util.List;

import com.bookkurly.bookmall.customer.category.entity.CheckJang;
import com.bookkurly.bookmall.customer.jang.dto.JangDeleteInfo;
import com.bookkurly.bookmall.customer.jang.dto.JangInfo;
import com.bookkurly.bookmall.customer.jang.dto.JangUpdate;
import com.bookkurly.bookmall.customer.jang.dto.ManagerOrderDelivery;
import com.bookkurly.bookmall.customer.jang.dto.OrderDetail;
import com.bookkurly.bookmall.customer.jang.dto.OrderRefund;
import com.bookkurly.bookmall.customer.jang.entity.JangEntity;
import com.bookkurly.bookmall.customer.jang.entity.OrderNumber;

public interface JangService {
	
	String createJangSerialNum();
	
	public void insertToJang(JangEntity entity);
	
	public List<JangEntity> getCustomerJangList(JangInfo jangInfo);
	
	public Integer updateOrder(JangUpdate jangUpdate);
	

	public JangEntity selectJangByBookSeqOrderSerialNum(JangUpdate jangUpdate);
	
	public Integer deleteJangItem(JangDeleteInfo jangDelete);
	
	public Integer deleteJang(String myOrderSerialNum);
	
	public List<JangEntity> selectAll(String myOrderSerialNum);
	
	public Integer updateOrderStatement(String myOrderSerialNum);

	public JangEntity selectOrderDetail(OrderDetail orderDetail);
	
	public JangEntity findJangInfo(JangEntity jangEntity);

	public List<JangEntity> selectJang(CheckJang check);
	
	public Integer deleteOrders(String myOrderSerialNum);
	
	public Integer refundOrder(OrderRefund orderRefund);
	
	public List<OrderNumber> selectOrderSerialNums();
	
	public Integer updateOrderDeliveryStatement(ManagerOrderDelivery managerOrderDelivery);
}
