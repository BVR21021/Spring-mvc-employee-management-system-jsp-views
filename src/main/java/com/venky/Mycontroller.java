package com.venky;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/login")
	public String Login() {
		return "login";
	}

	@RequestMapping("/req1")
	public String PrintLogin(@RequestParam String name, @RequestParam String psw, ModelMap m) {
		m.put("key1", name);
		m.put("key2", psw);
		return "result1";
	}
	@RequestMapping("/contact")
	public String Contact() {
		return "contact";
	}
	@RequestMapping("/req2")
	public String PrintContact(@RequestParam String mobile, @RequestParam String wname, @RequestParam String mail,
			ModelMap m) {
		m.put("key1", mobile);
		m.put("key2", wname);
		m.put("key3", mail);
		return "result2";
	}
	@RequestMapping("/reg")
	public String Register() {
		return "reg";
	}
	@RequestMapping("/req3")
	public String PrintRegister(@RequestParam String name, @RequestParam String psw, @RequestParam String mail,@RequestParam String gender,@RequestParam String mno,@RequestParam String addr,
			ModelMap m) {
		m.put("key1", name);
		m.put("key2", psw);
		m.put("key3", mail);
		m.put("key4", gender);
		m.put("key5", mno);
		m.put("key6", addr);
		return "result3";
	}
	

}