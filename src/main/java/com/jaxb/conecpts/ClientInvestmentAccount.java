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
    name = "ClientInvestmentAccount",
    propOrder = {"accountExternalReference"}
)
public class ClientInvestmentAccount implements Locatable {
    @XmlElement(
        name = "AccountExternalReference",
        required = true
    )
    protected String accountExternalReference;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public ClientInvestmentAccount() {
    }

    public String getAccountExternalReference() {
        return this.accountExternalReference;
    }

    public void setAccountExternalReference(String value) {
        this.accountExternalReference = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
