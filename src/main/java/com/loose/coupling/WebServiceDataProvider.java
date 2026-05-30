package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider{
    public String getUserDetails(){
        return "fetching data from Web service";
    }
}
