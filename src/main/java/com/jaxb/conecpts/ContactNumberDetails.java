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
    name = "ContactNumberDetails",
    propOrder = {"defaultFlag", "numberTypeCd", "intDialCode", "areaCd", "numberValue"}
)
public class ContactNumberDetails implements Locatable {
    @XmlElement(
        name = "DefaultFlag",
        required = true
    )
    protected String defaultFlag;
    @XmlElement(
        name = "NumberTypeCd",
        required = true
    )
    protected String numberTypeCd;
    @XmlElement(
        name = "IntDialCode",
        required = true
    )
    protected String intDialCode;
    @XmlElement(
        name = "AreaCd",
        required = true
    )
    protected String areaCd;
    @XmlElement(
        name = "NumberValue",
        required = true
    )
    protected String numberValue;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public ContactNumberDetails() {
    }

    public String getDefaultFlag() {
        return this.defaultFlag;
    }

    public void setDefaultFlag(String value) {
        this.defaultFlag = value;
    }

    public String getNumberTypeCd() {
        return this.numberTypeCd;
    }

    public void setNumberTypeCd(String value) {
        this.numberTypeCd = value;
    }

    public String getIntDialCode() {
        return this.intDialCode;
    }

    public void setIntDialCode(String value) {
        this.intDialCode = value;
    }

    public String getAreaCd() {
        return this.areaCd;
    }

    public void setAreaCd(String value) {
        this.areaCd = value;
    }

    public String getNumberValue() {
        return this.numberValue;
    }

    public void setNumberValue(String value) {
        this.numberValue = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
