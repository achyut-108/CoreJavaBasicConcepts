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
    name = "Classification",
    propOrder = {"classificationGroupIdentifier", "classificationCodeIdentifier"}
)
public class Classification implements Locatable {
    @XmlElement(
        name = "ClassificationGroupIdentifier",
        required = true
    )
    protected String classificationGroupIdentifier;
    @XmlElement(
        name = "ClassificationCodeIdentifier",
        required = true
    )
    protected String classificationCodeIdentifier;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public Classification() {
    }

    public String getClassificationGroupIdentifier() {
        return this.classificationGroupIdentifier;
    }

    public void setClassificationGroupIdentifier(String value) {
        this.classificationGroupIdentifier = value;
    }

    public String getClassificationCodeIdentifier() {
        return this.classificationCodeIdentifier;
    }

    public void setClassificationCodeIdentifier(String value) {
        this.classificationCodeIdentifier = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
