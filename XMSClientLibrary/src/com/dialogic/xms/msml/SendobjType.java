//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.09 at 04:34:21 PM EDT 
//


package com.dialogic.xms.msml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendobjType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendobjType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="objuri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="startpage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="pagecount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendobjType")
public class SendobjType {

    @XmlAttribute(name = "objuri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String objuri;
    @XmlAttribute(name = "startpage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger startpage;
    @XmlAttribute(name = "pagecount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pagecount;

    /**
     * Gets the value of the objuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjuri() {
        return objuri;
    }

    /**
     * Sets the value of the objuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjuri(String value) {
        this.objuri = value;
    }

    /**
     * Gets the value of the startpage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartpage() {
        return startpage;
    }

    /**
     * Sets the value of the startpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartpage(BigInteger value) {
        this.startpage = value;
    }

    /**
     * Gets the value of the pagecount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPagecount() {
        return pagecount;
    }

    /**
     * Sets the value of the pagecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPagecount(BigInteger value) {
        this.pagecount = value;
    }

}
