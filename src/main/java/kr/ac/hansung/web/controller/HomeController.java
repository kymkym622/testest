package kr.ac.hansung.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //@Componnet + ��Ʈ�ѷ� ����
public class HomeController {	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showhome() {
		return "home";   //view's logical name
	}
	
}
