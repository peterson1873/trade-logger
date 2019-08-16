package com.tradelogger.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController
{
    @GetMapping(value = "/")
    @ResponseBody
    public String getIndex(Model model)
    {
        return "";
    }
}