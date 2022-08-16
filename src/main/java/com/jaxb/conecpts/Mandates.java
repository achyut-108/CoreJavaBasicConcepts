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
    name = "Mandates",
    propOrder = {"mandate"}
)
public class Mandates implements Locatable {
    @XmlElement(
        name = "Mandate"
    )
    protected List<Mandate> mandate;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public Mandates() {
    }

    public List<Mandate> getMandate() {
        if (this.mandate == null) {
            this.mandate = new ArrayList();
        }

        return this.mandate;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
