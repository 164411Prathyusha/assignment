package demoMVC;
public class HelloController {
	@Controller
	
		@RequestMapping("/helloworld")
		public String printHello(ModelAndView model) {
			model.addObject("message", "Hello Spring MVC Framework!");
			return "helloworld";// view name
		}


}
