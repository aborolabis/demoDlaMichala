package com.example.demo.guitar;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;

@org.springframework.stereotype.Controller
public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @RequestMapping(path = { "/guitar" }, method = RequestMethod.GET)
    public String getAGuitar(Model model){
        model.addAttribute("guitar", service.getOneGuitar());
        return "guitar";
    }

}
