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
    name = "Classifications",
    propOrder = {"classification"}
)
public class Classifications implements Locatable {
    @XmlElement(
        name = "Classification"
    )
    protected List<Classification> classification;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public Classifications() {
    }

    public List<Classification> getClassification() {
        if (this.classification == null) {
            this.classification = new ArrayList();
        }

        return this.classification;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
