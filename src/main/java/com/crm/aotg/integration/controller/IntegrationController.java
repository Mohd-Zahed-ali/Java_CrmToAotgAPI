package com.crm.aotg.integration.controller;

import com.crm.aotg.integration.account.service.CLAccountService;
import com.crm.aotg.integration.auth.service.CLAOTGAuthService;
import com.crm.aotg.integration.common.dto.CLBaseStatusDto;
import com.crm.aotg.integration.product.service.CLProductService;
import com.crm.aotg.integration.salesorder.service.CLSalesOrderService;
import com.crm.aotg.integration.utils.Log;
import com.mashape.unirest.http.HttpMethod;
import org.json.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/AOTG")
public class IntegrationController {

    @Autowired
    private CLAOTGAuthService claotgAuthService;

    @Autowired
    private CLAccountService clAccountService;

    @Autowired
    private CLProductService clProductService;

    @Autowired
    private CLSalesOrderService clSalesOrderService;

    @GetMapping(value = "/test")
    public String test() {
        return claotgAuthService.getNewAccessToken();
    }

    @RequestMapping(value = "/Integrate/Account", method = {RequestMethod.GET, RequestMethod.POST})
    //@GetMapping(value="/Integrate/Account")
    public CLBaseStatusDto createOrUpdateAccount(@RequestParam String accessToken, @RequestParam String transId, @RequestParam String ccode, @RequestParam String userId) {
        return clAccountService.createOrUpdateAccount(accessToken, transId, ccode, userId);
    }

    @RequestMapping(value = "/Integrate/Product", method = {RequestMethod.GET, RequestMethod.POST})
    public CLBaseStatusDto createOrUpdateProduct(@RequestParam String accessToken, @RequestParam String transId, @RequestParam String ccode, @RequestParam String userId) {
        return clProductService.createOrUpdateProduct(accessToken, transId, ccode, userId);
    }

    @RequestMapping(value = "/Integrate/Salesorder", method = {RequestMethod.GET, RequestMethod.POST})
    public CLBaseStatusDto createOrUpdateSalesorder(@RequestParam String accessToken, @RequestParam String transId, @RequestParam String ccode, @RequestParam String userId) {
        return clSalesOrderService.createOrUpdateSalesOrder(accessToken, transId, ccode, userId);
    }

    @RequestMapping(value = "/log", method = RequestMethod.GET,produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public @ResponseBody byte[] getFile() throws IOException {
        return Files.readAllBytes(Paths.get(Log.getLog_file_name()));
    }
}
