package secondapp.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("account")
public class AccountController {

	@RequestMapping(path = "create", params = "form")
	public String form(Model model) {
		model.addAttribute(new AccountCreateForm());
		return "account/createForm";
	}

	@RequestMapping(path = "create", method = RequestMethod.POST, params="confirm")
	public String confirm(Model model) {
		return "account/confirm";
	}

	@RequestMapping(path = "create", method = RequestMethod.POST, params="redo")
	public String redo(Model model) {
		return "account/createForm";
	}

	@RequestMapping(path = "create", method = RequestMethod.POST, params="create")
	public String create(Model model) {
		return "redirect:/account/create?complete";
	}

	@RequestMapping(path = "create", method = RequestMethod.GET, params="complete")
	public String complete() {
		return "account/complete";
	}



}
