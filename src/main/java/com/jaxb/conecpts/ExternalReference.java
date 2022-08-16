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
    name = "ExternalReference",
    propOrder = {"externalReferenceType", "externalReferenceValue"}
)
public class ExternalReference implements Locatable {
    @XmlElement(
        name = "ExternalReferenceType",
        required = true
    )
    protected String externalReferenceType;
    @XmlElement(
        name = "ExternalReferenceValue",
        required = true
    )
    protected String externalReferenceValue;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public ExternalReference() {
    }

    public String getExternalReferenceType() {
        return this.externalReferenceType;
    }

    public void setExternalReferenceType(String value) {
        this.externalReferenceType = value;
    }

    public String getExternalReferenceValue() {
        return this.externalReferenceValue;
    }

    public void setExternalReferenceValue(String value) {
        this.externalReferenceValue = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
