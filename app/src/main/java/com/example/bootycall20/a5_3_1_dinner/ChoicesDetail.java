package com.example.bootycall20.a5_3_1_dinner;

/**
 * Created by LucasVasquez on 5/15/17.
 */

public class ChoicesDetail {

    public String name;
    public String adress;

    public ChoicesDetail() {
    }

    public ChoicesDetail(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}