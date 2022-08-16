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
    name = "CustodyAccounts",
    propOrder = {"custodyAccount"}
)
public class CustodyAccounts implements Locatable {
    @XmlElement(
        name = "CustodyAccount",
        required = true
    )
    protected List<CustodyAccount> custodyAccount;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public CustodyAccounts() {
    }

    public List<CustodyAccount> getCustodyAccount() {
        if (this.custodyAccount == null) {
            this.custodyAccount = new ArrayList();
        }

        return this.custodyAccount;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
