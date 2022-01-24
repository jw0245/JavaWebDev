package Test;

import staticex.Company;

public class CardCompany {

    private static CardCompany instance = new CardCompany();

    private  Company() {}

    public static Company getInstance(){

        if(instance == null){
            instance = new Company();
        }

        return instance;
    };


}
