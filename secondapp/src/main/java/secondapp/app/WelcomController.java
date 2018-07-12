package secondapp.app;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("now", new Date());
		return "index";
	}

//	@RequestMapping("account/create")
//	public String form(Model model) {
//		model.addAttribute(new AccountCreateForm());
//		return "account/createForm";
//	}

}
