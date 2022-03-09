package com.hcl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminController {
@RequestMapping("/hello2")
	public String display()
	{
		return "viewpage2";
	}	
}
