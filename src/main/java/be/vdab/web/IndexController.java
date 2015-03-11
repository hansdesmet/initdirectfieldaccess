package be.vdab.web;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		return new ModelAndView("/WEB-INF/JSP/index.jsp", "commandObject",
				new CommandObject());
	}

	@RequestMapping(method = RequestMethod.POST)
	public String post(CommandObject commandObject) {
		System.out.println(Arrays.toString(commandObject.getArray()));
		System.out.println(commandObject.getList());
		System.out.println(commandObject.getMap());
		return "redirect:";
	}

	@InitBinder("commandObject")
	void initBinder(WebDataBinder binder) {
		binder.initDirectFieldAccess();
	}
}
