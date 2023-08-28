package com.example.bm_project.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
import java.util.Optional;

import static com.example.bm_project.constant.ApiConstant.ClientAPIKEY;
import static com.example.bm_project.constant.ApiConstant.ClientBASEURL;

@FeignClient(value="feign-currencies-conversion",url = ClientBASEURL +"/"+ ClientAPIKEY)
public interface BaseCurrenciesConversionClient {
    @GetMapping("/pair/{baseCurrency}/{targetCurrency}/{amount}")
    Optional<Map> currenciesConversion(@PathVariable String baseCurrency, @PathVariable String targetCurrency, @PathVariable String amount);
}