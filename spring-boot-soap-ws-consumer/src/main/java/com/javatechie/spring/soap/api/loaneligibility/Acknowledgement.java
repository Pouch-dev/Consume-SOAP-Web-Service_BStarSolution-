//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.23 at 08:27:00 PM IST 
//


package com.javatechie.spring.soap.api.loaneligibility;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isEligible",
    "approvedAmount",
    "criteriaMismatch"
})
@XmlRootElement(name = "Acknowledgement")
public class Acknowledgement {

    protected boolean isEligible;
    protected long approvedAmount;
    @XmlElement(name = "CriteriaMismatch", required = true)
    protected List<String> criteriaMismatch;

    public boolean isIsEligible() {
        return isEligible;
    }

    public void setIsEligible(boolean value) {
        this.isEligible = value;
    }

    public long getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(long value) {
        this.approvedAmount = value;
    }

    public List<String> getCriteriaMismatch() {
        if (criteriaMismatch == null) {
            criteriaMismatch = new ArrayList<String>();
        }
        return this.criteriaMismatch;
    }

}
