package com.example.bankbackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="STAJBANK")
public class StajBankUsers {

    @Id
    @Column(name="MUSTERIHESAPNO")
    private String musteriHesapno;

    @Column(name="MUSTERINAME")
    private String musteriName;

    @Column(name="MUSTERISURNAME")
    private String musteriSurname;

    @Column(name="MUSTERIBAKIYE")
    private int musteriBakiye;

    @Column(name="MUSTERIAGE")
    private int musteriAge;

    @Column(name="MUSTERITCNO")
    private long musteriTCNo;

    public StajBankUsers() {}

    public StajBankUsers(String musteriHesapno, String musteriName,String musteriSurname,int musteriBakiye,int musteriAge,long musteriTCNo) {}


    public String getMusteriHesapno() {
        return musteriHesapno;
    }

    public void setMusteriHesapno(String musteriHesapno) {
        this.musteriHesapno = musteriHesapno;
    }

    public String getMusteriName() {
        return musteriName;
    }

    public void setMusteriName(String musteriName) {
        this.musteriName = musteriName;
    }

    public String getMusteriSurname() {
        return musteriSurname;
    }

    public void setMusteriSurname(String musteriSurname) {
        this.musteriSurname = musteriSurname;
    }

    public int getMusteriBakiye() {
        return musteriBakiye;
    }

    public void setMusteriBakiye(int musteriBakiye) {
        this.musteriBakiye = musteriBakiye;
    }

    public int getMusteriAge() {
        return musteriAge;
    }

    public void setMusteriAge(int musteriAge) {
        this.musteriAge = musteriAge;
    }

    public long getMusteriTCNo() {
        return musteriTCNo;
    }

    public void setMusteriTCNo(long musteriTCNo) {
        this.musteriTCNo = musteriTCNo;
    }
}
