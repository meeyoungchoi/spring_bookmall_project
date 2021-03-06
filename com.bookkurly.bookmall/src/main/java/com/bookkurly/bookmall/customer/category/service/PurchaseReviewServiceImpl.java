package com.bookkurly.bookmall.customer.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookkurly.bookmall.customer.category.dao.PurchaseReviewDAO;
import com.bookkurly.bookmall.customer.category.entity.PurchaseReview;

@Service
public class PurchaseReviewServiceImpl implements PurchaseReviewService {

	@Autowired
	private PurchaseReviewDAO purchaseReviewDAO;
	
	
	@Override
	public Integer insertPurchaseReview(PurchaseReview purchaseReview) {
		return purchaseReviewDAO.insertPurchaseReview(purchaseReview);
	}


	@Override
	public PurchaseReview find(Integer purchaseReviewSeq) {
		return purchaseReviewDAO.find(purchaseReviewSeq);
	}


	@Override
	public Integer update(PurchaseReview before) {
		return purchaseReviewDAO.update(before);
	}


	@Override
	public Integer delete(Integer purchaseReviewSeq) {
		return purchaseReviewDAO.delete(purchaseReviewSeq);
	}


	@Override
	public List<PurchaseReview> findPurchaseReview(String myOrderSerialNum) {
		return purchaseReviewDAO.findPurchaseReview(myOrderSerialNum);
	}


	@Override
	public Integer deleteReviews(String myOrderSerialNum) {
		return purchaseReviewDAO.deleteReviews(myOrderSerialNum);
	}


	@Override
	public List<PurchaseReview> findAllPurchaseReviews(Integer customSeq) {
		return purchaseReviewDAO.findAllPurchaseReviews(customSeq);
	}







	

}
