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
    name = "IPAccountRoleRule",
    propOrder = {"ipAccountRoleCd", "authorityCd", "startDate", "endDate", "notes", "suppressIPMessageFlag", "allAccountsFlag", "clientInvestmentAccounts", "custodyAccounts"}
)
public class IPAccountRoleRule implements Locatable {
    @XmlElement(
        name = "IPAccountRoleCd",
        required = true
    )
    protected String ipAccountRoleCd;
    @XmlElement(
        name = "AuthorityCd"
    )
    protected String authorityCd;
    @XmlElement(
        name = "StartDate"
    )
    protected String startDate;
    @XmlElement(
        name = "EndDate"
    )
    protected String endDate;
    @XmlElement(
        name = "Notes"
    )
    protected String notes;
    @XmlElement(
        name = "SuppressIPMessageFlag"
    )
    protected String suppressIPMessageFlag;
    @XmlElement(
        name = "AllAccountsFlag",
        required = true
    )
    protected String allAccountsFlag;
    @XmlElement(
        name = "ClientInvestmentAccounts"
    )
    protected ClientInvestmentAccounts clientInvestmentAccounts;
    @XmlElement(
        name = "CustodyAccounts"
    )
    protected CustodyAccounts custodyAccounts;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public IPAccountRoleRule() {
    }

    public String getIPAccountRoleCd() {
        return this.ipAccountRoleCd;
    }

    public void setIPAccountRoleCd(String value) {
        this.ipAccountRoleCd = value;
    }

    public String getAuthorityCd() {
        return this.authorityCd;
    }

    public void setAuthorityCd(String value) {
        this.authorityCd = value;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String value) {
        this.notes = value;
    }

    public String getSuppressIPMessageFlag() {
        return this.suppressIPMessageFlag;
    }

    public void setSuppressIPMessageFlag(String value) {
        this.suppressIPMessageFlag = value;
    }

    public String getAllAccountsFlag() {
        return this.allAccountsFlag;
    }

    public void setAllAccountsFlag(String value) {
        this.allAccountsFlag = value;
    }

    public ClientInvestmentAccounts getClientInvestmentAccounts() {
        return this.clientInvestmentAccounts;
    }

    public void setClientInvestmentAccounts(ClientInvestmentAccounts value) {
        this.clientInvestmentAccounts = value;
    }

    public CustodyAccounts getCustodyAccounts() {
        return this.custodyAccounts;
    }

    public void setCustodyAccounts(CustodyAccounts value) {
        this.custodyAccounts = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}