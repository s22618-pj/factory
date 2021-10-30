package com.example.factory;

public class Car {
    private String marka;
    private String model;
    private int pojemnośćSilnika;
    private String skrzynia;
    private String typ;
    private String kolor;
    private String felgi;
    private String tapiceka;
    private String wyposażenie;
    private int wheels;

    public Car(String model, int pojemnośćSilnika,String marka, String skrzynia, String typ, String kolor, String felgi, String tapiceka, String wyposażenie, int wheels) {
        this.model = model;
        this.pojemnośćSilnika = pojemnośćSilnika;
        this.skrzynia = skrzynia;
        this.typ = typ;
        this.kolor = kolor;
        this.felgi = felgi;
        this.tapiceka = tapiceka;
        this.wyposażenie = wyposażenie;
        this.wheels = wheels;
        this.marka =marka;
    }

    public Car() {

    }

    public int getWheels() {
        return wheels;
    }
    public String getModel(){
        return model;
    }
    public int getPojemnośćSilnika(){
        return pojemnośćSilnika;
    }
    public String getSkrzynia(){
        return skrzynia;
    }
    public String getTyp(){
        return typ;
    }
    public String getKolor(){
        return kolor;
    }
    public String getFelgi(){
        return felgi;
    }
    public String getTapiceka(){
        return tapiceka;
    }
    public String getWyposażenie(){return wyposażenie;}
    public String getMarka() {return marka;}



    public void setModel(String model) {
        this.model = model;
    }

    public void setPojemnośćSilnika(int pojemnośćSilnika) {
        this.pojemnośćSilnika = pojemnośćSilnika;
    }

    public void setSkrzynia(String skrzynia) {
        this.skrzynia = skrzynia;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setFelgi(String felgi) {
        this.felgi = felgi;
    }

    public void setTapiceka(String tapiceka) {
        this.tapiceka = tapiceka;
    }

    public void setWyposażenie(String wyposażenie) {
        this.wyposażenie = wyposażenie;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setMarka(String marka) {this.marka = marka;}


}
