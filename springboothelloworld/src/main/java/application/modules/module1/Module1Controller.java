package application.modules.module1;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Max Nichipor on 08.07.2016.
 */

@Controller
@RequestMapping("/module1")
public class Module1Controller {

    static Logger logger = Logger.getLogger(Module1Controller.class);

    @Autowired
    Module1 module1;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String mainPage(Model mav){
        logger.debug("Module1Controller.mainPage() is working");
        mav.addAttribute("hello", module1.doAction());
        return "hello";
    }
}
