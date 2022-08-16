package com.jaxb.conecpts;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.xml.sax.Locator;

import com.sun.xml.internal.bind.Locatable;
import com.sun.xml.internal.bind.annotation.XmlLocation;

@XmlRootElement(name="InterestedPartyDetails")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "InterestedPartyDetails",
    propOrder = {"createIPFlag", "fiBic", "staticFlag", "externalFlag", "contactRole", "externalReferences", "titleCd", "firstName", "middleInitial", "lastName", "nameOfCompany", "jobDescription", "additionalContacts", "emailAddress", "address", "roleCd", "comments", "contactNumbers", "clientExternalReferences", "exportStatusCd", "clientIPRoleRules", "classifications", "taxDetails", "uploadError"}
)
public class InterestedPartyDetails implements com.sun.xml.internal.bind.Locatable {
    @XmlElement(
        name = "CreateIPFlag"
    )
    protected String createIPFlag;
    @XmlElement(
        name = "FIBic",
        required = true
    )
    protected String fiBic;
    @XmlElement(
        name = "StaticFlag",
        required = true
    )
    protected String staticFlag;
    @XmlElement(
        name = "ExternalFlag"
    )
    protected String externalFlag;
    @XmlElement(
        name = "ContactRole"
    )
    protected String contactRole;
    @XmlElement(
        name = "ExternalReferences",
        required = true
    )
    protected InterestedPartyDetails.ExternalReferences externalReferences;
    @XmlElement(
        name = "TitleCd"
    )
    protected String titleCd;
    @XmlElement(
        name = "FirstName",
        required = true
    )
    protected String firstName;
    @XmlElement(
        name = "MiddleInitial"
    )
    protected String middleInitial;
    @XmlElement(
        name = "LastName",
        required = true
    )
    protected String lastName;
    @XmlElement(
        name = "NameOfCompany"
    )
    protected String nameOfCompany;
    @XmlElement(
        name = "JobDescription"
    )
    protected String jobDescription;
    @XmlElement(
        name = "AdditionalContacts"
    )
    protected String additionalContacts;
    @XmlElement(
        name = "EmailAddress"
    )
    protected String emailAddress;
    @XmlElement(
        name = "Address"
    )
    protected AddressDetails address;
    @XmlElement(
        name = "RoleCd"
    )
    protected String roleCd;
    @XmlElement(
        name = "Comments"
    )
    protected String comments;
    @XmlElement(
        name = "ContactNumbers"
    )
    protected InterestedPartyDetails.ContactNumbers contactNumbers;
    @XmlElement(
        name = "ClientExternalReferences"
    )
    protected InterestedPartyDetails.ClientExternalReferences clientExternalReferences;
    @XmlElement(
        name = "ExportStatusCd"
    )
    protected String exportStatusCd;
    @XmlElement(
        name = "ClientIPRoleRules"
    )
    protected ClientIPRoleRules clientIPRoleRules;
    @XmlElement(
        name = "Classifications"
    )
    protected Classifications classifications;
    @XmlElement(
        name = "TaxDetails"
    )
    protected TaxDetails taxDetails;
    @XmlElement(
        name = "UploadError"
    )
    protected String uploadError;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public InterestedPartyDetails() {
    }

    public String getCreateIPFlag() {
        return this.createIPFlag;
    }

    public void setCreateIPFlag(String value) {
        this.createIPFlag = value;
    }

    public String getFIBic() {
        return this.fiBic;
    }

    public void setFIBic(String value) {
        this.fiBic = value;
    }

    public String getStaticFlag() {
        return this.staticFlag;
    }

    public void setStaticFlag(String value) {
        this.staticFlag = value;
    }

    public String getExternalFlag() {
        return this.externalFlag;
    }

    public void setExternalFlag(String value) {
        this.externalFlag = value;
    }

    public String getContactRole() {
        return this.contactRole;
    }

    public void setContactRole(String value) {
        this.contactRole = value;
    }

    public InterestedPartyDetails.ExternalReferences getExternalReferences() {
        return this.externalReferences;
    }

    public void setExternalReferences(InterestedPartyDetails.ExternalReferences value) {
        this.externalReferences = value;
    }

    public String getTitleCd() {
        return this.titleCd;
    }

    public void setTitleCd(String value) {
        this.titleCd = value;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getMiddleInitial() {
        return this.middleInitial;
    }

    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getNameOfCompany() {
        return this.nameOfCompany;
    }

    public void setNameOfCompany(String value) {
        this.nameOfCompany = value;
    }

    public String getJobDescription() {
        return this.jobDescription;
    }

    public void setJobDescription(String value) {
        this.jobDescription = value;
    }

    public String getAdditionalContacts() {
        return this.additionalContacts;
    }

    public void setAdditionalContacts(String value) {
        this.additionalContacts = value;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    public AddressDetails getAddress() {
        return this.address;
    }

    public void setAddress(AddressDetails value) {
        this.address = value;
    }

    public String getRoleCd() {
        return this.roleCd;
    }

    public void setRoleCd(String value) {
        this.roleCd = value;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public InterestedPartyDetails.ContactNumbers getContactNumbers() {
        return this.contactNumbers;
    }

    public void setContactNumbers(InterestedPartyDetails.ContactNumbers value) {
        this.contactNumbers = value;
    }

    public InterestedPartyDetails.ClientExternalReferences getClientExternalReferences() {
        return this.clientExternalReferences;
    }

    public void setClientExternalReferences(InterestedPartyDetails.ClientExternalReferences value) {
        this.clientExternalReferences = value;
    }

    public String getExportStatusCd() {
        return this.exportStatusCd;
    }

    public void setExportStatusCd(String value) {
        this.exportStatusCd = value;
    }

    public ClientIPRoleRules getClientIPRoleRules() {
        return this.clientIPRoleRules;
    }

    public void setClientIPRoleRules(ClientIPRoleRules value) {
        this.clientIPRoleRules = value;
    }

    public Classifications getClassifications() {
        return this.classifications;
    }

    public void setClassifications(Classifications value) {
        this.classifications = value;
    }

    public TaxDetails getTaxDetails() {
        return this.taxDetails;
    }

    public void setTaxDetails(TaxDetails value) {
        this.taxDetails = value;
    }

    public String getUploadError() {
        return this.uploadError;
    }

    public void setUploadError(String value) {
        this.uploadError = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {"externalReference"}
    )
    public static class ExternalReferences implements Locatable {
        @XmlElement(
            name = "ExternalReference",
            required = true
        )
        protected List<ExternalReference> externalReference;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        public ExternalReferences() {
        }

        public List<ExternalReference> getExternalReference() {
            if (this.externalReference == null) {
                this.externalReference = new ArrayList();
            }

            return this.externalReference;
        }

        public Locator sourceLocation() {
            return this.locator;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {"contactNumberDetails"}
    )
    public static class ContactNumbers implements Locatable {
        @XmlElement(
            name = "ContactNumberDetails",
            required = true
        )
        protected List<ContactNumberDetails> contactNumberDetails;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        public ContactNumbers() {
        }

        public List<ContactNumberDetails> getContactNumberDetails() {
            if (this.contactNumberDetails == null) {
                this.contactNumberDetails = new ArrayList();
            }

            return this.contactNumberDetails;
        }

        public Locator sourceLocation() {
            return this.locator;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {"clientUpdateModeIndicator", "clientExternalReference"}
    )
    public static class ClientExternalReferences implements Locatable {
        @XmlElement(
            name = "ClientUpdateModeIndicator"
        )
        protected String clientUpdateModeIndicator;
        @XmlElement(
            name = "ClientExternalReference"
        )
        protected List<String> clientExternalReference;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        public ClientExternalReferences() {
        }

        public String getClientUpdateModeIndicator() {
            return this.clientUpdateModeIndicator;
        }

        public void setClientUpdateModeIndicator(String value) {
            this.clientUpdateModeIndicator = value;
        }

        public List<String> getClientExternalReference() {
            if (this.clientExternalReference == null) {
                this.clientExternalReference = new ArrayList();
            }

            return this.clientExternalReference;
        }

        public Locator sourceLocation() {
            return this.locator;
        }
    }
}
