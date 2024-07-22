package com.example.bankbackend.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="STAJBANK")
public class StajBankUsers {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="MUSTERİNAME")
    private String musteriName;

    @Column(name="MUSTERIUSERNAME")
    private String musteriUsername;

    @Column(name="MUSTERIBAKIYE")
    private int musteriBakiye;

    @Column(name="MUSTERIAGE")
    private int musteriAge;

    @Column(name="MUSTERITCNO")
    private int musteriTCNo;

    @Column(name="MUSTERIHESAPNO")
    private String musteriHesapno;

    public String getMusteriName() {return musteriName;}

    public void setMusteriName(String musteriName) {this.musteriName = musteriName;}

    public String getMusteriUsername() {return musteriUsername;}

    public void setMusteriUsername(String musteriUsername) {this.musteriUsername = musteriUsername;}

    public int getMusteriBakiye() {return musteriBakiye;}

    public void setMusteriBakiye(int musteriBakiye) {this.musteriBakiye = musteriBakiye;}

    public int getMusteriAge() {return musteriAge;}

    public void setMusteriAge(int musteriAge) {this.musteriAge = musteriAge;}

    public int getMusteriTCNo() {return musteriTCNo;}

    public void setMusteriTCNo(int musteriTCNo) {this.musteriTCNo = musteriTCNo;}

    public String getMusteriHesapno() {return musteriHesapno;}

    public void setMusteriHesapno(String musteriHesapno) {this.musteriHesapno = musteriHesapno;}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
