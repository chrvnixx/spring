package com.loose.coupling;

public class LooseCoupling {
    static void main(String[] args) {
        UserDataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(dataProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());
    }
}
