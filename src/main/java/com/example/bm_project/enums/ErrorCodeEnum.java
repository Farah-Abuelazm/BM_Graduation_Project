package com.example.bm_project.enums;


import static com.example.bm_project.constant.StringConstants.*;

public enum ErrorCodeEnum {
    InValidAmount("amount#2$$", InvalidAmountValueException),
    CurrencyNotFound("currency00#%**", CurrencyNotFountExceptionMessage),
    GlobalExceptionError("invalid&%44**", SomeThingInvalid);


    private final String key;
    private final String value;

    ErrorCodeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
