package application;

/**
 * Created by Max Nichipor on 28.07.2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest*")
public class SecondaryController {
    @Autowired
    ModulePlatform platform;

    @RequestMapping(method = RequestMethod.GET)
    public ModulePlatform startPage(Model model){
        return platform;
    }
}
