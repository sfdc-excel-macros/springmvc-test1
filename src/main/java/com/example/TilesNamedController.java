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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// This class contains examples of Spring MVC controllers that explicitly specify a view name
// that map to file names using Tiles configuration.
//
// In this case, we should attempt to recover the view names from string literals directly.

@Controller
public class TilesNamedController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @ModelAttribute("tilesvala")
    public String randomSettera(HttpServletRequest request) {
        return request.getParameter("bad");
    }
    @ModelAttribute("tilesvalb")
    public String randomSetterb(HttpServletRequest request) {
        return "ok";
    }



    @RequestMapping(value="tilesA", method = RequestMethod.GET)
    public String tilesA(HttpSession session, HttpServletRequest request, Model model, String bad, @ModelAttribute("bbean") BasicBean bb) {
        session.setAttribute("tilesvalc", "session");
        session.setAttribute("tilesvald", bad);

        request.setAttribute("jspvalia", "request");
        request.setAttribute("jspvalib", bad);
        model.addAttribute("jspvalic", "model");
        model.addAttribute("jspvalid", bad);

        HashMap hm = new HashMap();
        hm.put("jspvalie", "hashmap");
        hm.put("jspvalif", bad);
        model.addAllAttributes(hm);

        Map<String,Object> modelmap = model.asMap();
        modelmap.put("jspvalig", "asmap");
        modelmap.put("jspvalih", bad);

        HashMap hm2 = new HashMap();
        hm2.put("jspvalii", "merge");
        hm2.put("jspvalij", bad);
        model.mergeAttributes(hm2);

        BasicBean bb1 = new BasicBean("ok", bad, "ok");
        model.addAttribute("jspvalik", bb1);
        BasicBean bb2 = new BasicBean(bad, "ok", "ok");
        request.setAttribute("jspvalil", bb2);

        bb.setVal1(bad);
        bb.setVal2("XXX val2");
        bb.setVal3("XXX val1");

        return "unrelatedAA-tile";
    }

    @RequestMapping(value="tilesB", method = RequestMethod.GET)
    public ModelAndView tilesB(HttpSession session, HttpServletRequest request, String bad, @ModelAttribute("bbean") BasicBean bb) {
        ModelAndView mav = new ModelAndView("unrelatedAB-tile");
        HashMap hm3 = new HashMap();
        hm3.put("jspvalja", "mav map");
        hm3.put("jspvaljb", bad);
        mav.addAllObjects(hm3);

        bb.setVal1("XXX val1");
        bb.setVal2(bad);
        bb.setVal3(bad);

        mav.addObject("jspvaljc", "mav addObject");
        mav.addObject("jspvaljd", bad);

        Map<String, Object> mod = mav.getModel();
        mod.put("jspvalje", "mav map addAttribute");
        mod.put("jspvaljf", bad);
        mod.putIfAbsent("jspvaljg", "putifabsent");
        mod.putIfAbsent("jspvaljh", bad);
        ModelMap mmap = mav.getModelMap();
        mmap.addAllAttributes(new HashMap<String, String>() {
            {
                put("jspvalji", "mav map addAtributes");
                put("jspvaljj", bad);
            }
        });
        mmap.addAttribute("jspvaljk", "modelmap addAttribute");
        mmap.addAttribute("jspvaljl", bad);
        mmap.mergeAttributes(new HashMap<String, String>() {
            {
                put("jspvaljm", "modelmap mergeAttributes");
                put("jspvaljn", bad);
            }
        });

        request.setAttribute("jspvaljo", "request.set");
        request.setAttribute("jspvaljp", bad);

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        mav.addObject("jspvaljq", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvaljr", bb2);
        return mav;
    }

    @RequestMapping(value="tilesC", method = RequestMethod.GET)
    public ModelAndView tilesC(HttpSession session, HttpServletRequest request, String bad, @ModelAttribute("bbean") BasicBean bb) {
        HashMap<String, Object> hm4 = new HashMap();
        hm4.put("jspvalks", "constructor map");
        hm4.put("jspvalkt", bad);

        ModelAndView mav = new ModelAndView("unrelatedAC-tile", hm4);
        HashMap hm3 = new HashMap();
        hm3.put("jspvalka", "mav map");
        hm3.put("jspvalkb", bad);
        mav.addAllObjects(hm3);

        bb.setVal1(bad);
        bb.setVal2(bad);
        bb.setVal3("XXX val3");

        mav.addObject("jspvalkc", "mav addObject");
        mav.addObject("jspvalkd", bad);

        Map<String, Object> mod = mav.getModel();
        mod.put("jspvalke", "mav map addAttribute");
        mod.put("jspvalkf", bad);
        mod.putIfAbsent("jspvalkg", "putifabsent");
        mod.putIfAbsent("jspvalkh", bad);
        ModelMap mmap = mav.getModelMap();
        mmap.addAllAttributes(new HashMap<String, String>() {
            {
                put("jspvalki", "mav map addAtributes");
                put("jspvalkj", bad);
            }
        });
        mmap.addAttribute("jspvalkk", "modelmap addAttribute");
        mmap.addAttribute("jspvalkl", bad);
        mmap.mergeAttributes(new HashMap<String, String>() {
            {
                put("jspvalkm", "modelmap mergeAttributes");
                put("jspvalkn", bad);
            }
        });

        request.setAttribute("jspvalko", "request.set");
        request.setAttribute("jspvalkp", bad);

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        mav.addObject("jspvalkq", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvalkr", bb2);
        return mav;
    }

    @RequestMapping(value="tilesD", method = RequestMethod.GET)
    public ModelAndView tilesD(HttpSession session, HttpServletRequest request, String bad, @ModelAttribute("bbean") BasicBean bb) {
        HashMap<String, Object> hm4 = new HashMap();
        ModelAndView mav = new ModelAndView("viewA", "jspvallt", bad);
        HashMap hm3 = new HashMap();
        hm3.put("jspvalla", "mav map");
        hm3.put("jspvallb", bad);
        mav.addAllObjects(hm3);

        bb.setVal1(bad);
        bb.setVal2("XXX val2");
        bb.setVal3("XXX val3");

        mav.addObject("jspvallc", "mav addObject");
        mav.addObject("jspvalld", bad);

        Map<String, Object> mod = mav.getModel();
        mod.put("jspvalle", "mav map addAttribute");
        mod.put("jspvallf", bad);
        mod.putIfAbsent("jspvallg", "putifabsent");
        mod.putIfAbsent("jspvallh", bad);
        ModelMap mmap = mav.getModelMap();
        mmap.addAllAttributes(new HashMap<String, String>() {
            {
                put("jspvalli", "mav map addAtributes");
                put("jspvallj", bad);
            }
        });
        mmap.addAttribute("jspvallk", "modelmap addAttribute");
        mmap.addAttribute("jspvalll", bad);
        mmap.mergeAttributes(new HashMap<String, String>() {
            {
                put("jspvallm", "modelmap mergeAttributes");
                put("jspvalln", bad);
            }
        });

        request.setAttribute("jspvallo", "request.set");
        request.setAttribute("jspvallp", bad);

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        mav.addObject("jspvallq", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvallr", bb2);
        return mav;
    }
}


