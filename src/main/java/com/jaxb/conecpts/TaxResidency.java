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
    name = "TaxResidency",
    propOrder = {"taxResidencyCd", "taxResidencyEffectiveDate", "taxYearEnd"}
)
public class TaxResidency implements Locatable {
    @XmlElement(
        name = "TaxResidencyCd",
        required = true
    )
    protected String taxResidencyCd;
    @XmlElement(
        name = "TaxResidencyEffectiveDate",
        required = true
    )
    protected String taxResidencyEffectiveDate;
    @XmlElement(
        name = "TaxYearEnd",
        required = true
    )
    protected String taxYearEnd;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    public TaxResidency() {
    }

    public String getTaxResidencyCd() {
        return this.taxResidencyCd;
    }

    public void setTaxResidencyCd(String value) {
        this.taxResidencyCd = value;
    }

    public String getTaxResidencyEffectiveDate() {
        return this.taxResidencyEffectiveDate;
    }

    public void setTaxResidencyEffectiveDate(String value) {
        this.taxResidencyEffectiveDate = value;
    }

    public String getTaxYearEnd() {
        return this.taxYearEnd;
    }

    public void setTaxYearEnd(String value) {
        this.taxYearEnd = value;
    }

    public Locator sourceLocation() {
        return this.locator;
    }
}
