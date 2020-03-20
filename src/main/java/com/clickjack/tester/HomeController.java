package com.clickjack.tester;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * controller.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public void landingPage(HttpServletResponse response) throws IOException {
       // ModelAndView modelAndView = new ModelAndView();
        //modelAndView.setViewName("main");

        response.sendRedirect("landing.html");

    }
}
