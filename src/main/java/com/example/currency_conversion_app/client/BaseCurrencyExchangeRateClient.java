package com.example.currency_conversion_app.client;

import com.example.currency_conversion_app.models.CurrencyExchangeRateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.example.currency_conversion_app.constant.ApiConstant.ClientAPIKEY;
import static com.example.currency_conversion_app.constant.ApiConstant.ClientBASEURL;


@FeignClient(value="feign-exchange-rate",url = ClientBASEURL +"/"+ ClientAPIKEY)
public interface BaseCurrencyExchangeRateClient {
    @GetMapping("/latest/{baseCurrencyCode}")
    CurrencyExchangeRateResponse getBaseCurrencyExchangeRate(@PathVariable String baseCurrencyCode);

}