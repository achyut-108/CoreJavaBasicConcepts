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
    name = "ClientIPRoleRules",
    propOrder = {"clientIPRoleRuleUpdateModeIndicator", "clientIPRoleRule"}
)
public class ClientIPRoleRules implements Locatable {
    @XmlElement(
        name = "ClientIPRoleRuleUpdateModeIndicator",
        required = true
    )
    protected String clientIPRoleRuleUpdateModeIndicator;
    @XmlElement(
        name = "ClientIPRoleRule",
        required = true
    )
    protected List<ClientIPRoleRule> clientIPRoleRule;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public ClientIPRoleRules() {
    }

    public String getClientIPRoleRuleUpdateModeIndicator() {
        return this.clientIPRoleRuleUpdateModeIndicator;
    }

    public void setClientIPRoleRuleUpdateModeIndicator(String value) {
        this.clientIPRoleRuleUpdateModeIndicator = value;
    }

    public List<ClientIPRoleRule> getClientIPRoleRule() {
        if (this.clientIPRoleRule == null) {
            this.clientIPRoleRule = new ArrayList();
        }

        return this.clientIPRoleRule;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}