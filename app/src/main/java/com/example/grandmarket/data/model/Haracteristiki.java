package com.example.grandmarket.data.model;

public class Haracteristiki {

    int id;
    String cvet;
    String diagonal;
    String material;
    String opersys;
    String oboper;
    String obvstr;
    String kolosnk;
    String kolmeg;
    String format;
    String blootus;
    String interfase;
    String emkost;
    String naushniki;


    public Haracteristiki(int id, String cvet, String diagonal, String material, String opersys, String oboper, String obvstr, String kolosnk, String kolmeg, String format, String blootus, String interfase, String emkost, String naushniki) {
        this.id = id;
        this.cvet = cvet;
        this.diagonal = diagonal;
        this.material = material;
        this.opersys = opersys;
        this.oboper = oboper;
        this.obvstr = obvstr;
        this.kolosnk = kolosnk;
        this.kolmeg = kolmeg;
        this.format = format;
        this.blootus = blootus;
        this.interfase = interfase;
        this.emkost = emkost;
        this.naushniki = naushniki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCvet() {
        return cvet;
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOpersys() {
        return opersys;
    }

    public void setOpersys(String opersys) {
        this.opersys = opersys;
    }

    public String getOboper() {
        return oboper;
    }

    public void setOboper(String oboper) {
        this.oboper = oboper;
    }

    public String getObvstr() {
        return obvstr;
    }

    public void setObvstr(String obvstr) {
        this.obvstr = obvstr;
    }

    public String getKolosnk() {
        return kolosnk;
    }

    public void setKolosnk(String kolosnk) {
        this.kolosnk = kolosnk;
    }

    public String getKolmeg() {
        return kolmeg;
    }

    public void setKolmeg(String kolmeg) {
        this.kolmeg = kolmeg;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getBlootus() {
        return blootus;
    }

    public void setBlootus(String blootus) {
        this.blootus = blootus;
    }

    public String getInterfase() {
        return interfase;
    }

    public void setInterfase(String interfase) {
        this.interfase = interfase;
    }

    public String getEmkost() {
        return emkost;
    }

    public void setEmkost(String emkost) {
        this.emkost = emkost;
    }

    public String getNaushniki() {
        return naushniki;
    }

    public void setNaushniki(String naushniki) {
        this.naushniki = naushniki;
    }
}
