package com.jaxb.conecpts;
import java.util.ArrayList;
import java.util.List;

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
    name = "TaxResidencies",
    propOrder = {"taxResidency"}
)
public class TaxResidencies implements Locatable {
    @XmlElement(
        name = "TaxResidency",
        required = true
    )
    protected List<TaxResidency> taxResidency;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public TaxResidencies() {
    }

    public List<TaxResidency> getTaxResidency() {
        if (this.taxResidency == null) {
            this.taxResidency = new ArrayList();
        }

        return this.taxResidency;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
