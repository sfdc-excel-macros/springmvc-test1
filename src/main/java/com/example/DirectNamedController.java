package com.example;

import javax.servlet.http.HttpSession;
import java.util.*;
import org.slf4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// This class contains examples of Spring MVC controllers that explicitly specify a view name
// that map to file names using the InternalResourceViewResolver.
//
// In this case, we should attempt to recover the view names from string literals directly.

@Controller
public class DirectNamedController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @ModelAttribute("internalvala")
    public String randomSettera(HttpServletRequest request) {
        return request.getParameter("bad");
    }
    @ModelAttribute("internalvalb")
    public String randomSetterb(HttpServletRequest request) {
        return "ok";
    }


    @RequestMapping(value="internalA", name="XYZZY", method = RequestMethod.GET)
    public String internalA(HttpSession session, HttpServletRequest request, Model model, String bad, @ModelAttribute("bbean") BasicBean bb) {
        session.setAttribute("internalvalc", "session");
        session.setAttribute("internalvald", bad);

        request.setAttribute("jspvalea", "request");
        request.setAttribute("jspvaleb", bad);
        model.addAttribute("jspvalec", "model");
        model.addAttribute("jspvaled", bad);

        HashMap hm = new HashMap();
        hm.put("jspvalee", "hashmap");
        hm.put("jspvalef", bad);
        model.addAllAttributes(hm);

        Map<String,Object> modelmap = model.asMap();
        modelmap.put("jspvaleg", "asmap");
        modelmap.put("jspvaleh", bad);

        HashMap hm2 = new HashMap();
        hm2.put("jspvalei", "merge");
        hm2.put("jspvalej", bad);
        model.mergeAttributes(hm2);

        BasicBean bb1 = new BasicBean("ok", bad, "ok");
        model.addAttribute("jspvalek", bb1);
        BasicBean bb2 = new BasicBean(bad, "ok", "ok");
        request.setAttribute("jspvalel", bb2);

        bb.setVal1("XXX val1");
        bb.setVal2("XXX val2");
        bb.setVal3(bad);

        if(bad.contains("RANDOM")) {
            return "internaljspAPRIME";
        } else {
            return "internaljspA";
        }
    }

    @GetMapping(value="internalB")
    public ModelAndView internalB(HttpSession session, HttpServletRequest request, String bad, @ModelAttribute("bbean") BasicBean bb) {
        ModelAndView mav = new ModelAndView("internaljspB");
        HashMap hm3 = new HashMap();
        hm3.put("jspvalfa", "mav map");
        hm3.put("jspvalfb", bad);
        mav.addAllObjects(hm3);

        bb.setVal1("XXX val1");
        bb.setVal2(bad);
        bb.setVal3(bad);

        mav.addObject("jspvalfc", "mav addObject");
        mav.addObject("jspvalfd", bad);

        Map<String, Object> mod = mav.getModel();
        mod.put("jspvalfe", "mav map addAttribute");
        mod.put("jspvalff", bad);
        mod.putIfAbsent("jspvalfg", "putifabsent");
        mod.putIfAbsent("jspvalfh", bad);
        ModelMap mmap = mav.getModelMap();
        mmap.addAllAttributes(new HashMap<String, String>() {
            {
                put("jspvalfi", "mav map addAtributes");
                put("jspvalfj", bad);
            }
        });
        mmap.addAttribute("jspvalfk", "modelmap addAttribute");
        mmap.addAttribute("jspvalfl", bad);
        mmap.mergeAttributes(new HashMap<String, String>() {
            {
                put("jspvalfm", "modelmap mergeAttributes");
                put("jspvalfn", bad);
            }
        });

        request.setAttribute("jspvalfo", "request.set");
        request.setAttribute("jspvalfp", bad);

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        mav.addObject("jspvalfq", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvalfr", bb2);
        return mav;
    }

    @GetMapping(value="internalC")
    public ModelAndView internalC(HttpSession session, HttpServletRequest request, String bad, @ModelAttribute("bbean") BasicBean bb) {
        HashMap<String, Object> hm4 = new HashMap();
        hm4.put("jspvalgs", "constructor map");
        hm4.put("jspvalgt", bad);

        ModelAndView mav = new ModelAndView("internaljspC", hm4);
        HashMap hm3 = new HashMap();
        hm3.put("jspvalga", "mav map");
        hm3.put("jspvalgb", bad);
        mav.addAllObjects(hm3);

        bb.setVal1(bad);
        bb.setVal2(bad);
        bb.setVal3("XXX val3");

        mav.addObject("jspvalgc", "mav addObject");
        mav.addObject("jspvalgd", bad);

        Map<String, Object> mod = mav.getModel();
        mod.put("jspvalge", "mav map addAttribute");
        mod.put("jspvalgf", bad);
        mod.putIfAbsent("jspvalgg", "putifabsent");
        mod.putIfAbsent("jspvalgh", bad);
        ModelMap mmap = mav.getModelMap();
        mmap.addAllAttributes(new HashMap<String, String>() {
            {
                put("jspvalgi", "mav map addAtributes");
                put("jspvalgj", bad);
            }
        });
        mmap.addAttribute("jspvalgk", "modelmap addAttribute");
        mmap.addAttribute("jspvalgl", bad);
        mmap.mergeAttributes(new HashMap<String, String>() {
            {
                put("jspvalgm", "modelmap mergeAttributes");
                put("jspvalgn", bad);
            }
        });

        request.setAttribute("jspvalgo", "request.set");
        request.setAttribute("jspvalgp", bad);

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        mav.addObject("jspvalgq", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvalgr", bb2);
        return mav;
    }
    @RequestMapping(value="internalD", method = RequestMethod.GET)
    public ModelAndView internalD(HttpSession session, HttpServletRequest request, String bad, @ModelAttribute("bbean") BasicBean bb) {
        HashMap<String, Object> hm4 = new HashMap();
        ModelAndView mav = new ModelAndView("internaljspD", "jspvalht", bad);
        HashMap hm3 = new HashMap();
        hm3.put("jspvalha", "mav map");
        hm3.put("jspvalhb", bad);
        mav.addAllObjects(hm3);

        bb.setVal1(bad);
        bb.setVal2("XXX val2");
        bb.setVal3("XXX val3");

        mav.addObject("jspvalhc", "mav addObject");
        mav.addObject("jspvalhd", bad);

        Map<String, Object> mod = mav.getModel();
        mod.put("jspvalhe", "mav map addAttribute");
        mod.put("jspvalhf", bad);
        mod.putIfAbsent("jspvalhg", "putifabsent");
        mod.putIfAbsent("jspvalhh", bad);
        ModelMap mmap = mav.getModelMap();
        mmap.addAllAttributes(new HashMap<String, String>() {
            {
                put("jspvalhi", "mav map addAtributes");
                put("jspvalhj", bad);
            }
        });
        mmap.addAttribute("jspvalhk", "modelmap addAttribute");
        mmap.addAttribute("jspvalhl", bad);
        mmap.mergeAttributes(new HashMap<String, String>() {
            {
                put("jspvalhm", "modelmap mergeAttributes");
                put("jspvalhn", bad);
            }
        });

        request.setAttribute("jspvalho", "request.set");
        request.setAttribute("jspvalhp", bad);

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        mav.addObject("jspvalhq", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvalhr", bb2);
        return mav;
    }

}


