package netgloo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "Proudly handcrafted by " +
        "<a href='http://netgloo.com/en'>netgloo</a> :)";
  }

}
