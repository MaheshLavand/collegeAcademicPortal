package com.collage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class StudentController {

//	@GetMapping("openloginPage")
//	public String openloginPage() {
////		System.out.println(userLogin);
//		return "Login";
//	}

	@GetMapping("checkLogin")
	public String checkLogin(@ModelAttribute UserLogin userLogin, Model model) {
		System.out.println(userLogin);
		if (userLogin.getPassword().equalsIgnoreCase("Mahi")) {
			System.out.println("Login Susscessfully!!!");
			model.addAttribute("msg", "Login Susscessfully!!!");
		} else {
			System.out.println("Wrong Password!!!");
			model.addAttribute("msg", "Wrong Password!!!");
		}
		return "Login";
	}
}
