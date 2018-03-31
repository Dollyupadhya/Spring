package spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Sp_main {
@RequestMapping(value="/hell",method=RequestMethod.GET)
public String print(ModelMap mod)
{mod.addAttribute("message","Spring file");
	return"showMessage";}
}
