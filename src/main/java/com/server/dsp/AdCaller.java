package com.server.dsp;

import com.ectr.learner.EctrPredictor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdCaller {

    @RequestMapping("/")
    public String testPage() {
//        EctrPredictor ectrPredictor = new EctrPredictor;
//        ectrPredictor
        String[] arr = new String['e'];
        EctrPredictor ectrPredictor = new EctrPredictor();
        double value = ectrPredictor.predictEctrValue(arr);
        return Double.toString(value);
    }

    public double calculateEctrValue() {
        System.out.println("make String Array flied");
        //Call Ectr-Learner predict(String[] arr)
        double resultEctrValue = 0; //return predict method
        return resultEctrValue;
    }
}
