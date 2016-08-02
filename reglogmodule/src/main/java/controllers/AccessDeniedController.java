package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Max Nichipor on 02.08.2016.
 */

@Controller
@RequestMapping("/403**")
public class AccessDeniedController {

    @RequestMapping(method = RequestMethod.GET)
    public String startPage(Model model){
        return "403";
    }

}
