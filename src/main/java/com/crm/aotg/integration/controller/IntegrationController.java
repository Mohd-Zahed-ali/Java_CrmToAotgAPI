package com.crm.aotg.integration.controller;

import com.crm.aotg.integration.account.service.CLAccountService;
import com.crm.aotg.integration.auth.service.CLAOTGAuthService;
import com.crm.aotg.integration.common.dto.CLBaseStatusDto;
import com.crm.aotg.integration.product.service.CLProductService;
import com.mashape.unirest.http.HttpMethod;
import org.json.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AOTG")
public class IntegrationController {

    @Autowired
    private CLAOTGAuthService claotgAuthService;

    @Autowired
    private CLAccountService clAccountService;

    @Autowired
    private CLProductService clProductService;

    @GetMapping(value = "/test")
    public String test(){
        return claotgAuthService.getNewAccessToken();
    }

    @RequestMapping(value="/Integrate/Account",method = { RequestMethod.GET, RequestMethod.POST })
    //@GetMapping(value="/Integrate/Account")
    public CLBaseStatusDto createOrUpdateAccount(@RequestParam String accessToken, @RequestParam String transId, @RequestParam String ccode, @RequestParam String userId){
       return clAccountService.createOrUpdateAccount(accessToken,transId,ccode,userId);
    }

    @RequestMapping(value="/Integrate/Product",method = { RequestMethod.GET, RequestMethod.POST })
    public CLBaseStatusDto createOrUpdateProduct(@RequestParam String accessToken, @RequestParam String transId, @RequestParam String ccode, @RequestParam String userId){
        return clProductService.createOrUpdateProduct(accessToken,transId,ccode,userId);
    }

    @PostMapping(value="/Integrate/Salesorder")
    public void createOrUpdateSalesorder(@RequestParam String accessToken, @RequestParam String transId, @RequestParam String ccode, @RequestParam String userId){

    }
}
