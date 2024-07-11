package com.varmaservices.fraud;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudCheckHistoryController {

    private final FraudCheckHistoryService service;

    public FraudCheckHistoryController(FraudCheckHistoryService service) {
        this.service = service;
    }
    @GetMapping("{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
        boolean fraudulentCustomer = service.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(fraudulentCustomer);
    }


}
