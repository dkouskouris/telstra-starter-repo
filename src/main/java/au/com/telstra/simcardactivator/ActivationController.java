package au.com.telstra.simcardactivator;

import org.springframework.web.bind.annotation.*;

@RestController
public class ActivationController {
    @PostMapping("/actuate")
    public String receiveData(@RequestBody SIMInformation simInformation){

        if (simInformation.getIccid() instanceof String && simInformation.getCustomerEmail() instanceof String) {
            return "success: " + true;
        }
        else {
            return "success: " + false;
        }
    }
}
