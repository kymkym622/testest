package kr.ac.hansung.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.web.dao.OfferDAO;
import kr.ac.hansung.web.model.Offer;

@Service
public class OffersService {
	private OfferDAO offerDAO;
	
	@Autowired
	public void setOfferDAO(OfferDAO offerDAO) {
		this.offerDAO = offerDAO;
	} 
	public int getsemesterGrades(int x,int y){		
		return offerDAO.getsemesterGrade(x,y);		
	}
	public int gettypeGrades(String type){		
		return offerDAO.gettypeGrade(type);		
	}
	public int getGrades(int x,int y){		
		return offerDAO.getGrade(x,y);		
	}
	public List<Offer> getcurrent(){		
		return offerDAO.getOffers();		
	}
	/*public void insert(Offer offer){
		offerDAO.insert(offer);
	}*/
}
