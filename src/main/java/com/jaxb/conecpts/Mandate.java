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
    name = "Mandate",
    propOrder = {"mandateTypeCd", "mandateValue"}
)
public class Mandate implements Locatable {
    @XmlElement(
        name = "MandateTypeCd",
        required = true
    )
    protected String mandateTypeCd;
    @XmlElement(
        name = "MandateValue",
        required = true
    )
    protected String mandateValue;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public Mandate() {
    }

    public String getMandateTypeCd() {
        return this.mandateTypeCd;
    }

    public void setMandateTypeCd(String value) {
        this.mandateTypeCd = value;
    }

    public String getMandateValue() {
        return this.mandateValue;
    }

    public void setMandateValue(String value) {
        this.mandateValue = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
