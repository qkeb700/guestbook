package kr.or.connect.guestbook.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuessNumberController {

	@GetMapping("/guess")
	public String guess(@RequestParam(name="number", required=false)Integer number, HttpSession session, ModelMap model) {
		String message = null;

		if(number == null ) {
			session.setAttribute("count", 0);
			session.setAttribute("randomNumber", (int)(Math.random()*100+1));
			message = "내가 생각하는 숫자를 맞춰보세요.";
		} else {
			int count = (int) session.getAttribute("count");
			int randomNumber = (int) session.getAttribute("randomNumber");
			
			if(number < randomNumber) {
				message = "입력한 값이 너무 작습니다.";
				session.setAttribute("count", ++count);
			} else if(number > randomNumber) {
				message = "입력한 값이 너무 큽니다.";
				session.setAttribute("count", ++count);
			} else {
				message = number + " 가 정답입니다." + ++count + "번 만에 맞추심.";
				session.removeAttribute("count");
				session.removeAttribute("randomNumber");
			}
		}
		model.addAttribute("message", message);
		return "guess";
	}
}
