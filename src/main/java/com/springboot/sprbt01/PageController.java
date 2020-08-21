package com.springboot.sprbt01;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

//返回视图页面（路径），只需要@Controller即可
@Controller
public class PageController {
    @RequestMapping("/index")
    public String index(Model md) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        md.addAttribute("list", list);
        md.addAttribute("name", "Luo Binbin");
        md.addAttribute("mobile", "18285130258");
        return "index";
    }
}
