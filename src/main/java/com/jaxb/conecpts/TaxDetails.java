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
    name = "TaxDetails",
    propOrder = {"taxResidencies", "mandates"}
)
public class TaxDetails implements Locatable {
    @XmlElement(
        name = "TaxResidencies",
        required = true
    )
    protected TaxResidencies taxResidencies;
    @XmlElement(
        name = "Mandates"
    )
    protected Mandates mandates;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public TaxDetails() {
    }

    public TaxResidencies getTaxResidencies() {
        return this.taxResidencies;
    }

    public void setTaxResidencies(TaxResidencies value) {
        this.taxResidencies = value;
    }

    public Mandates getMandates() {
        return this.mandates;
    }

    public void setMandates(Mandates value) {
        this.mandates = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
