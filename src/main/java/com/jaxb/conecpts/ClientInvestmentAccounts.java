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
    name = "ClientInvestmentAccounts",
    propOrder = {"clientInvestmentAccount"}
)
public class ClientInvestmentAccounts implements Locatable {
    @XmlElement(
        name = "ClientInvestmentAccount",
        required = true
    )
    protected List<ClientInvestmentAccount> clientInvestmentAccount;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public ClientInvestmentAccounts() {
    }

    public List<ClientInvestmentAccount> getClientInvestmentAccount() {
        if (this.clientInvestmentAccount == null) {
            this.clientInvestmentAccount = new ArrayList();
        }

        return this.clientInvestmentAccount;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
