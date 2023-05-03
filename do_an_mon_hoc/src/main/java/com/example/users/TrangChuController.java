package com.example.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrangChuController {
@GetMapping("/trangchu")
public String getTrangchu() {
	return"users/pages/home";
}
}
