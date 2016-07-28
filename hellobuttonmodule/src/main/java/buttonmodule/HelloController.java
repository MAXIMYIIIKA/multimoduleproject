package buttonmodule;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Max Nichipor on 04.07.2016.
 */

@Controller
@RequestMapping("/hello**")
public class HelloController {

    static Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    ButtonModule bm;

    @RequestMapping(method = RequestMethod.GET)
    public String startPage(Model model){
        logger.debug("HelloController.startPage() is working");
        return "hello";
    }

    @RequestMapping(params = {"button"}, method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String sayPhrase(Model ui, @RequestParam("button") String param){
        logger.debug("HelloController.sayPhrase() is working");
        ui.addAttribute("hello", bm.getButton(param).sayPhrase());
        return "hello";
    }

}
