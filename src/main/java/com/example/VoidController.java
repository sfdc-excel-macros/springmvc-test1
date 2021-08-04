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

// This class contains examples of Spring MVC controllers not explicitly specifying a view name
// (e.g. by returning void, or a Model, or a ModelAndView without specifying a view name)
//
// In this case, we should attempt to recover the view names based on the @RequestMapping arguments.

@Controller
public class VoidController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @ModelAttribute("voidvala")
    public String randomSettera(HttpServletRequest request) {
        return request.getParameter("bad");
    }
    @ModelAttribute("voidvalb")
    public String randomSetterb(HttpServletRequest request) {
        return "ok";
    }

    @RequestMapping(value="voidA", name="XYZZY", method = RequestMethod.GET)
    public void voidA(HttpSession session, HttpServletRequest request, Model model, String bad, @ModelAttribute("bbean") BasicBean bb) {
        LOG.info("voidA");
        session.setAttribute("jspvalaa", "session");
        request.setAttribute("jspvalab", "request");
        session.setAttribute("jspvalac", bad);
        request.setAttribute("jspvalad", bad);
        model.addAttribute("jspvalae", "model");
        model.addAttribute("jspvalaf", bad);

        HashMap hm = new HashMap();
        hm.put("jspvalag", "hashmap");
        hm.put("jspvalah", bad);
        model.addAllAttributes(hm);

        Map<String,Object> modelmap = model.asMap();
        modelmap.put("jspvalai", "asmap");
        modelmap.put("jspvalaj", bad);

        HashMap hm2 = new HashMap();
        hm2.put("jspvalak", "merge");
        hm2.put("jspvalal", bad);
        model.mergeAttributes(hm2);

        BasicBean bb1 = new BasicBean("ok", bad, "ok");
        model.addAttribute("jspvalam", bb1);
        BasicBean bb2 = new BasicBean(bad, "ok", "ok");
        request.setAttribute("jspvalan", bb2);

        bb.setVal1("XXX val1");
        bb.setVal2(bad);
        bb.setVal3("XXX val3");
    }

    @RequestMapping(value="voidB", name="XYZZY", method = RequestMethod.GET)
    public ModelAndView voidB(HttpSession session, HttpServletRequest request, String bad, @ModelAttribute("bbean") BasicBean bb) {
        ModelAndView mav = new ModelAndView();
        HashMap hm3 = new HashMap();
        hm3.put("jspvalba", "mav map");
        hm3.put("jspvalbb", bad);
        mav.addAllObjects(hm3);

        bb.setVal1("XXX val1");
        bb.setVal2("XXX val2");
        bb.setVal3(bad);

        mav.addObject("jspvalbc", "mav addObject");
        mav.addObject("jspvalbd", bad);

        Map<String, Object> mod = mav.getModel();
        mod.put("jspvalbe", "mav map addAttribute");
        mod.put("jspvalbf", bad);
        mod.putIfAbsent("jspvalbg", "putifabsent");
        mod.putIfAbsent("jspvalbh", bad);
        ModelMap mmap = mav.getModelMap();
        mmap.addAllAttributes(new HashMap<String, String>() {
            {
                put("jspvalbi", "mav map addAtributes");
                put("jspvalbj", bad);
            }
        });
        mmap.addAttribute("jspvalbk", "modelmap addAttribute");
        mmap.addAttribute("jspvalbl", bad);
        mmap.mergeAttributes(new HashMap<String, String>() {
            {
                put("jspvalbm", "modelmap mergeAttributes");
                put("jspvalbn", bad);
            }
        });

        request.setAttribute("jspvalbo", "request.set");
        request.setAttribute("jspvalbp", bad);

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        mav.addObject("jspvalbq", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvalbr", bb2);
        return mav;
    }

    @RequestMapping(value="newpath/voidBPRIME", name="XYZZY", method = RequestMethod.GET)
    public ModelAndView voidBPRIME(HttpSession session, HttpServletRequest request, String bad, @ModelAttribute("bbean") BasicBean bb) {
        ModelAndView mav = new ModelAndView();
        HashMap hm3 = new HashMap();
        hm3.put("jspvalba", "mav map");
        hm3.put("jspvalbb", bad);
        mav.addAllObjects(hm3);

        bb.setVal1("XXX val1");
        bb.setVal2("XXX val2");
        bb.setVal3(bad);

        mav.addObject("jspvalbc", "mav addObject");
        mav.addObject("jspvalbd", bad);

        Map<String, Object> mod = mav.getModel();
        mod.put("jspvalbe", "mav map addAttribute");
        mod.put("jspvalbf", bad);
        mod.putIfAbsent("jspvalbg", "putifabsent");
        mod.putIfAbsent("jspvalbh", bad);
        ModelMap mmap = mav.getModelMap();
        mmap.addAllAttributes(new HashMap<String, String>() {
            {
                put("jspvalbi", "mav map addAtributes");
                put("jspvalbj", bad);
            }
        });
        mmap.addAttribute("jspvalbk", "modelmap addAttribute");
        mmap.addAttribute("jspvalbl", bad);
        mmap.mergeAttributes(new HashMap<String, String>() {
            {
                put("jspvalbm", "modelmap mergeAttributes");
                put("jspvalbn", bad);
            }
        });

        request.setAttribute("jspvalbo", "request.set");
        request.setAttribute("jspvalbp", bad);

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        mav.addObject("jspvalbq", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvalbr", bb2);
        return mav;
    }

    @RequestMapping(value="voidC", name="XYZZY", method = RequestMethod.GET)
    public Model voidC(HttpServletRequest request, String bad, Model model, @ModelAttribute("bbean") BasicBean bb) {
        request.setAttribute("jspvalca", bad);
        model.addAttribute("jspvalcb", "model");
        model.addAttribute("jspvalcc", bad);

        HashMap hm = new HashMap();
        hm.put("jspvalcd", "hashmap");
        hm.put("jspvalce", bad);
        model.addAllAttributes(hm);

        Map<String,Object> modelmap = model.asMap();
        modelmap.put("jspvalcf", "asmap");
        modelmap.put("jspvalcg", bad);

        HashMap hm2 = new HashMap();
        hm2.put("jspvalch", "merge");
        hm2.put("jspvalci", bad);
        model.mergeAttributes(hm2);


        bb.setVal1(bad);
        bb.setVal2("XXX val2");
        bb.setVal3("XXX val3");

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        model.addAttribute("jspvalcj", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvalck", bb2);
        return model;
    }

    @RequestMapping(value="/newpath/voidCPRIME.html", name="XYZZY", method = RequestMethod.GET)
    public Model voidCPRIME(HttpServletRequest request, String bad, Model model, @ModelAttribute("bbean") BasicBean bb) {
        request.setAttribute("jspvalca", bad);
        model.addAttribute("jspvalcb", "model");
        model.addAttribute("jspvalcc", bad);

        HashMap hm = new HashMap();
        hm.put("jspvalcd", "hashmap");
        hm.put("jspvalce", bad);
        model.addAllAttributes(hm);

        Map<String,Object> modelmap = model.asMap();
        modelmap.put("jspvalcf", "asmap");
        modelmap.put("jspvalcg", bad);

        HashMap hm2 = new HashMap();
        hm2.put("jspvalch", "merge");
        hm2.put("jspvalci", bad);
        model.mergeAttributes(hm2);


        bb.setVal1(bad);
        bb.setVal2("XXX val2");
        bb.setVal3("XXX val3");

        BasicBean bb1 = new BasicBean("ok", "ok", bad);
        model.addAttribute("jspvalcj", bb1);
        BasicBean bb2 = new BasicBean("ok", bad, "ok");
        request.setAttribute("jspvalck", bb2);
        return model;
    }

    @RequestMapping(value="voidD", method = RequestMethod.GET)
    public Map voidD(HttpServletRequest request, String bad, Model model, @ModelAttribute("bbean") BasicBean bb) {
        HashMap map = new HashMap();
        request.setAttribute("jspvalda", "okay");
        request.setAttribute("jspvaldb", bad);

        map.put("jspvaldc", "nothing");
        map.put("jspvaldd", bad);

        bb.setVal1("XXX val1");
        bb.setVal2("XXX val2");
        bb.setVal3(bad);

        BasicBean bb1 = new BasicBean(bad, "ok", bad);
        model.addAttribute("jspvalde", bb1);
        BasicBean bb2 = new BasicBean(bad, "ok", "ok");
        request.setAttribute("jspvaldf", bb2);
        return map;
    }
}
