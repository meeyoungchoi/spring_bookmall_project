package com.bookkurly.bookmall.customer.jang.dao;

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

public interface JangDAO {

	void insertToJang(JangEntity entity);

	List<JangEntity> getCustomerJangList(JangInfo jangInfo);

	Integer updateOrder(JangUpdate jangUpdate);
	
	JangEntity selectJangByBookSeqOrderSerialNum(JangUpdate jangUpdate);

	Integer deleteJangItem(JangDeleteInfo jangDelete);

	Integer deleteJang(String myOrderSerialNum);

	List<JangEntity> selectAll(String myOrderSerialNum);

	Integer updateOrderStatement(String myOrderSerialNum);

	JangEntity selectOrderDetail(OrderDetail orderDetail);

	JangEntity findJangInfo(JangEntity jangEntity);

	List<JangEntity> selectJang(CheckJang check);

	Integer deleteOrders(String myOrderSerialNum);

	Integer refundOrder(OrderRefund orderRefund);

	List<OrderNumber> selectOrderSerialNums();

	Integer updateOrderDeliverStatement(ManagerOrderDelivery managerOrderDelivery);

	
	
}
