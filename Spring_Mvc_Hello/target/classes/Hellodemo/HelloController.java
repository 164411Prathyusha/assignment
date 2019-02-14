package Hellodemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


	@Controller
	public class HelloController {
		@RequestMapping(/helloworld)
		public String printHello(ModelAndView model) {
			ModelAndView model= new ModelAndView();
			model.addObject("message", "Hello Spring MVC Framework!");
			return "helloworld";// view name
		}
	}

