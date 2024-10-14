package com.springproject.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="magazine_tbl")
public class Magazine {
    @Id
    @Column
    private int magId;
    @Column
    private String magName;
    @Column
    private String brandName;
    @Column
    private int magPages;

    // default constructor
    public Magazine() {
    }
    
    // parameterized constructor
    public Magazine(int magId, String magName, String brandName, int magPages) {
        this.magId = magId;
        this.magName = magName;
        this.brandName = brandName;
        this.magPages = magPages;
    }

    // toString
    @Override
    public String toString() {
        return "Magazine [magId=" + magId + ", magName=" + magName + ", brandName=" + brandName + ", magPages="
                + magPages + "]";
    }

    // getters and setters
    public int getMagId() {
        return magId;
    }
    public void setMagId(int magId) {
        this.magId = magId;
    }
    public String getMagName() {
        return magName;
    }
    public void setMagName(String magName) {
        this.magName = magName;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public int getMagPages() {
        return magPages;
    }
    public void setMagPages(int magPages) {
        this.magPages = magPages;
    }

    
}
