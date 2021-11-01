package com.example.validatingforminput;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

/**
 * @ClassName WebController
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-11-01 09:58
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
@Controller
public class WebController implements WebMvcConfigurer {
    public static final String RESULTS = "results";

    public static final String FORM = "form";

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName(RESULTS);
    }

    /**
     * @Description: The showForm method returns the form template
     * @Param: [personForm]
     * @return: java.lang.String
     * @Author: XiaoShuMu
     * @Date: 2021/11/1
     */
    @GetMapping("/")
    public String showForm(PersonForm personForm) {
        return FORM;
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return FORM;
        }

        return "redirect:/results";
    }


}
