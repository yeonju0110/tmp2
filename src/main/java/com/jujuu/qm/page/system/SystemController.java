package com.jujuu.qm.page.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SystemController {
    @RequestMapping(value = "/page/system/menuauthority/home", method = RequestMethod.GET)
    public ModelAndView menuauthority_home(ModelAndView view) {
        return view;
    }
}
