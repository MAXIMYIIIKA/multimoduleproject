package module2;

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
@RequestMapping("/module2")
public class Module2Controller {

    static Logger logger = Logger.getLogger(Module2Controller.class);

    @Autowired
    Module2 module2;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String mainPage(Model mav){
        logger.debug("Module2Controller.mainPage() is working");
        mav.addAttribute("hello", module2.doAction());
        return "hello";
    }
}
