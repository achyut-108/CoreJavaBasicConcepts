package com.jaxb.conecpts;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.xml.sax.Locator;

import com.sun.xml.internal.bind.Locatable;
import com.sun.xml.internal.bind.annotation.XmlLocation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "AddressDetails",
    propOrder = {"address1", "address2", "address3", "cityTown", "countyState", "postalCode", "countryCd"}
)
public class AddressDetails implements Locatable {
    @XmlElement(
        name = "Address1",
        required = true
    )
    protected String address1;
    @XmlElement(
        name = "Address2"
    )
    protected String address2;
    @XmlElement(
        name = "Address3"
    )
    protected String address3;
    @XmlElement(
        name = "CityTown"
    )
    protected String cityTown;
    @XmlElement(
        name = "CountyState"
    )
    protected String countyState;
    @XmlElement(
        name = "PostalCode"
    )
    protected String postalCode;
    @XmlElement(
        name = "CountryCd",
        required = true
    )
    protected String countryCd;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public AddressDetails() {
    }

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String value) {
        this.address1 = value;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String value) {
        this.address2 = value;
    }

    public String getAddress3() {
        return this.address3;
    }

    public void setAddress3(String value) {
        this.address3 = value;
    }

    public String getCityTown() {
        return this.cityTown;
    }

    public void setCityTown(String value) {
        this.cityTown = value;
    }

    public String getCountyState() {
        return this.countyState;
    }

    public void setCountyState(String value) {
        this.countyState = value;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public String getCountryCd() {
        return this.countryCd;
    }

    public void setCountryCd(String value) {
        this.countryCd = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}