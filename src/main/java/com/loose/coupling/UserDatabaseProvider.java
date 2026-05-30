package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    public String getUserDetails(){
        return "fetching data from user database";
    }

}
