//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 01:44:49 PM CEST 
//


package net.sll_mdilab.t5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * HL7 v2 message as defined in IHE PCD profile
 * http://ihe.net/uploadedFiles/Documents/PCD/IHE_PCD_TF_Vol1.pdf
 * http://ihe.net/uploadedFiles/Documents/PCD/IHE_PCD_TF_Vol2.pdf
 * http://ihe.net/uploadedFiles/Documents/PCD/IHE_PCD_TF_Vol3.pdf
 * 
 * <p>Java class for PCD_01_Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCD_01_Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sending_Application">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="idLocal" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="idUniversal" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="idUniversalType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sending_Facility">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="idLocal" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="idUniversal" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="idUniversalType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://sll-mdilab.net/T5/}Patient_Result" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCD_01_Message", propOrder = {
    "sendingApplication",
    "sendingFacility",
    "patientResult"
})
public class PCD01Message {

    @XmlElement(name = "Sending_Application", required = true)
    protected PCD01Message.SendingApplication sendingApplication;
    @XmlElement(name = "Sending_Facility", required = true)
    protected PCD01Message.SendingFacility sendingFacility;
    @XmlElement(name = "Patient_Result", required = true)
    protected List<PatientResult> patientResult;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the sendingApplication property.
     * 
     * @return
     *     possible object is
     *     {@link PCD01Message.SendingApplication }
     *     
     */
    public PCD01Message.SendingApplication getSendingApplication() {
        return sendingApplication;
    }

    /**
     * Sets the value of the sendingApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCD01Message.SendingApplication }
     *     
     */
    public void setSendingApplication(PCD01Message.SendingApplication value) {
        this.sendingApplication = value;
    }

    /**
     * Gets the value of the sendingFacility property.
     * 
     * @return
     *     possible object is
     *     {@link PCD01Message.SendingFacility }
     *     
     */
    public PCD01Message.SendingFacility getSendingFacility() {
        return sendingFacility;
    }

    /**
     * Sets the value of the sendingFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCD01Message.SendingFacility }
     *     
     */
    public void setSendingFacility(PCD01Message.SendingFacility value) {
        this.sendingFacility = value;
    }

    /**
     * Gets the value of the patientResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientResult }
     * 
     * 
     */
    public List<PatientResult> getPatientResult() {
        if (patientResult == null) {
            patientResult = new ArrayList<PatientResult>();
        }
        return this.patientResult;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="idLocal" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="idUniversal" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="idUniversalType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SendingApplication {

        @XmlAttribute(name = "idLocal")
        @XmlSchemaType(name = "anySimpleType")
        protected String idLocal;
        @XmlAttribute(name = "idUniversal")
        @XmlSchemaType(name = "anySimpleType")
        protected String idUniversal;
        @XmlAttribute(name = "idUniversalType")
        @XmlSchemaType(name = "anySimpleType")
        protected String idUniversalType;

        /**
         * Gets the value of the idLocal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdLocal() {
            return idLocal;
        }

        /**
         * Sets the value of the idLocal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdLocal(String value) {
            this.idLocal = value;
        }

        /**
         * Gets the value of the idUniversal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdUniversal() {
            return idUniversal;
        }

        /**
         * Sets the value of the idUniversal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdUniversal(String value) {
            this.idUniversal = value;
        }

        /**
         * Gets the value of the idUniversalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdUniversalType() {
            return idUniversalType;
        }

        /**
         * Sets the value of the idUniversalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdUniversalType(String value) {
            this.idUniversalType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="idLocal" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="idUniversal" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="idUniversalType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SendingFacility {

        @XmlAttribute(name = "idLocal")
        @XmlSchemaType(name = "anySimpleType")
        protected String idLocal;
        @XmlAttribute(name = "idUniversal")
        @XmlSchemaType(name = "anySimpleType")
        protected String idUniversal;
        @XmlAttribute(name = "idUniversalType")
        @XmlSchemaType(name = "anySimpleType")
        protected String idUniversalType;

        /**
         * Gets the value of the idLocal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdLocal() {
            return idLocal;
        }

        /**
         * Sets the value of the idLocal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdLocal(String value) {
            this.idLocal = value;
        }

        /**
         * Gets the value of the idUniversal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdUniversal() {
            return idUniversal;
        }

        /**
         * Sets the value of the idUniversal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdUniversal(String value) {
            this.idUniversal = value;
        }

        /**
         * Gets the value of the idUniversalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdUniversalType() {
            return idUniversalType;
        }

        /**
         * Sets the value of the idUniversalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdUniversalType(String value) {
            this.idUniversalType = value;
        }

    }

}
