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
    name = "ClientIPRoleRule",
    propOrder = {"clientExternalReference", "ipAccountRoleRules"}
)
public class ClientIPRoleRule implements Locatable {
    @XmlElement(
        name = "ClientExternalReference",
        required = true
    )
    protected String clientExternalReference;
    @XmlElement(
        name = "IPAccountRoleRules"
    )
    protected IPAccountRoleRules ipAccountRoleRules;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public ClientIPRoleRule() {
    }

    public String getClientExternalReference() {
        return this.clientExternalReference;
    }

    public void setClientExternalReference(String value) {
        this.clientExternalReference = value;
    }

    public IPAccountRoleRules getIPAccountRoleRules() {
        return this.ipAccountRoleRules;
    }

    public void setIPAccountRoleRules(IPAccountRoleRules value) {
        this.ipAccountRoleRules = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}