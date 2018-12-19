package com.server.dsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdCaller {

    @RequestMapping("/")
    public String testPage() {
        return "";
    }

    public double calculateEctrValue() {
        System.out.println("make String Array flied");
        //Call Ectr-Learner predict(String[] arr)
        double resultEctrValue = 0; //return predict method
        return resultEctrValue;
    }
}
