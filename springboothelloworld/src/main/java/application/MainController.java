package application;

import application.interfaces.Module;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Max Nichipor on 10.07.2016.
 */

@Controller
@RequestMapping({"/","/index*"})
public class MainController {

    static Logger logger = Logger.getLogger(MainController.class);

    @Autowired
    ModulePlatform platform;

    @RequestMapping(method = RequestMethod.GET)
    public String startPage(Model model){
        logger.debug("MainController.startPage() is working");
        return "index";
    }

    @RequestMapping(params = {"modules"}, method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String showModules(Model ui){
        logger.debug("MainController.showModules() is working");
        ui.addAttribute("modules", platform);
        return "index";
    }
}
