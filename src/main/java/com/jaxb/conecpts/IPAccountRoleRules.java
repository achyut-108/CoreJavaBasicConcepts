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
    name = "IPAccountRoleRules",
    propOrder = {"ipAccountRoleRule"}
)
public class IPAccountRoleRules implements Locatable {
    @XmlElement(
        name = "IPAccountRoleRule",
        required = true
    )
    protected List<IPAccountRoleRule> ipAccountRoleRule;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public IPAccountRoleRules() {
    }

    public List<IPAccountRoleRule> getIPAccountRoleRule() {
        if (this.ipAccountRoleRule == null) {
            this.ipAccountRoleRule = new ArrayList();
        }

        return this.ipAccountRoleRule;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
