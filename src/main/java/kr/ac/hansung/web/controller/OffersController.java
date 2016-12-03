package kr.ac.hansung.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.web.model.Offer;
import kr.ac.hansung.web.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService offersService;
	
	@Autowired
	public void setOffersServie(OffersService offersService){
		this.offersService = offersService;
	}
	 
	@RequestMapping("/offers")
	public String showOffers(Model model){
		List<Offer> offers = offersService.getcurrent() ;
		model.addAttribute("grades1",offersService.getsemesterGrades(2011,1));
		model.addAttribute("grades2",1234);
		return "offers";
	}
	@RequestMapping("/type")
	public String Gradesoftype(Model model){
		List<Offer> offers = offersService.getcurrent() ;
		model.addAttribute("type1",offersService.gettypeGrades("Àü±â"));
		return "type";
	}
	
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model){
		model.addAttribute(new Offer());
		return "home";
	}
	@RequestMapping("/docreate")
	public String doCreate(Model model,@Valid Offer offer,BindingResult result){
		if(result.hasErrors()){
			System.out.println("Form data does not validate");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors){
				System.out.println(error.getDefaultMessage());
			}
			return "createoffer";
		}
		//offersService.insert(offer);
		return "offercreated";
	}
}
