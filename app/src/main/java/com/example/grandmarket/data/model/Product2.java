package com.example.grandmarket.data.model;

import android.media.Image;
import android.widget.ImageView;

public class Product2 {

     int idcast;
     String glavcast;
     String cenacast;
     String imcast;

    public Product2(int idcast, String glavcast, String cenacast, String imcast) {
        this.idcast = idcast;
        this.glavcast = glavcast;
        this.cenacast = cenacast;
        this.imcast = imcast;
    }

    public int getIdcast() {
        return idcast;
    }

    public void setIdcast(int idcast) {
        this.idcast = idcast;
    }

    public String getGlavcast() {
        return glavcast;
    }

    public void setGlavcast(String glavcast) {
        this.glavcast = glavcast;
    }


    public String getCenacast() {
        return cenacast;
    }

    public void setCenacast(String cenacast) {
        this.cenacast = cenacast;
    }

    public String getImcast() {
        return imcast;
    }

    public void setImcast(String imcast) {
        this.imcast = imcast;
    }
}
