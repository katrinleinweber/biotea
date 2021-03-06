//
// This file was pubmed.openAccess.jaxb.generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.04 at 07:58:30 PM BST 
//


package pubmed.openAccess.jaxb.generated;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import elsevier.jaxb.math.mathml.Math;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}sec-meta" minOccurs="0"/>
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}title" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}address"/>
 *           &lt;element ref="{}alternatives"/>
 *           &lt;element ref="{}array"/>
 *           &lt;element ref="{}boxed-text"/>
 *           &lt;element ref="{}chem-struct-wrap"/>
 *           &lt;element ref="{}fig"/>
 *           &lt;element ref="{}fig-group"/>
 *           &lt;element ref="{}graphic"/>
 *           &lt;element ref="{}media"/>
 *           &lt;element ref="{}preformat"/>
 *           &lt;element ref="{}supplementary-material"/>
 *           &lt;element ref="{}table-wrap"/>
 *           &lt;element ref="{}table-wrap-group"/>
 *           &lt;element ref="{}disp-formula"/>
 *           &lt;element ref="{}disp-formula-group"/>
 *           &lt;element ref="{}p"/>
 *           &lt;element ref="{}def-list"/>
 *           &lt;element ref="{}list"/>
 *           &lt;element ref="{}tex-math"/>
 *           &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *           &lt;element ref="{}related-article"/>
 *           &lt;element ref="{}related-object"/>
 *           &lt;element ref="{}ack"/>
 *           &lt;element ref="{}disp-quote"/>
 *           &lt;element ref="{}speech"/>
 *           &lt;element ref="{}statement"/>
 *           &lt;element ref="{}verse-group"/>
 *           &lt;element ref="{}x"/>
 *         &lt;/choice>
 *         &lt;element ref="{}sec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}notes"/>
 *           &lt;element ref="{}fn-group"/>
 *           &lt;element ref="{}glossary"/>
 *           &lt;element ref="{}ref-list"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="rid" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}role"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}title"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}show"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secMeta",
    "label",
    "title",
    "addressesAndAlternativesAndArraies",
    "secs",
    "notesAndFnGroupsAndGlossaries"
})
@XmlRootElement(name = "bio")
public class Bio {

    @XmlElement(name = "sec-meta")
    protected SecMeta secMeta;
    protected Label label;
    protected Title title;
    @XmlElements({
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "table-wrap-group", type = TableWrapGroup.class),
        @XmlElement(name = "chem-struct-wrap", type = ChemStructWrap.class),
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "disp-formula-group", type = DispFormulaGroup.class),
        @XmlElement(name = "table-wrap", type = TableWrap.class),
        @XmlElement(name = "related-article", type = RelatedArticle.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "fig", type = Fig.class),
        @XmlElement(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = Math.class),
        @XmlElement(name = "def-list", type = DefList.class),
        @XmlElement(name = "related-object", type = RelatedObject.class),
        @XmlElement(name = "speech", type = Speech.class),
        @XmlElement(name = "ack", type = Ack.class),
        @XmlElement(name = "list", type = pubmed.openAccess.jaxb.generated.List.class),
        @XmlElement(name = "verse-group", type = VerseGroup.class),
        @XmlElement(name = "tex-math", type = TexMath.class),
        @XmlElement(name = "supplementary-material", type = SupplementaryMaterial.class),
        @XmlElement(name = "preformat", type = Preformat.class),
        @XmlElement(name = "statement", type = Statement.class),
        @XmlElement(name = "boxed-text", type = BoxedText.class),
        @XmlElement(name = "alternatives", type = Alternatives.class),
        @XmlElement(name = "disp-quote", type = DispQuote.class),
        @XmlElement(name = "x", type = X.class),
        @XmlElement(name = "fig-group", type = FigGroup.class),
        @XmlElement(name = "disp-formula", type = DispFormula.class)
    })
    protected java.util.List<Object> addressesAndAlternativesAndArraies;
    @XmlElement(name = "sec")
    protected java.util.List<Sec> secs;
    @XmlElements({
        @XmlElement(name = "glossary", type = Glossary.class),
        @XmlElement(name = "fn-group", type = FnGroup.class),
        @XmlElement(name = "notes", type = Notes.class),
        @XmlElement(name = "ref-list", type = RefList.class)
    })
    protected java.util.List<Object> notesAndFnGroupsAndGlossaries;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "rid")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected java.util.List<Object> rids;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String bioXLinkTitle;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;

    /**
     * Gets the value of the secMeta property.
     * 
     * @return
     *     possible object is
     *     {@link SecMeta }
     *     
     */
    public SecMeta getSecMeta() {
        return secMeta;
    }

    /**
     * Sets the value of the secMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecMeta }
     *     
     */
    public void setSecMeta(SecMeta value) {
        this.secMeta = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressesAndAlternativesAndArraies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Array }
     * {@link TableWrapGroup }
     * {@link ChemStructWrap }
     * {@link P }
     * {@link DispFormulaGroup }
     * {@link TableWrap }
     * {@link RelatedArticle }
     * {@link Address }
     * {@link Media }
     * {@link Graphic }
     * {@link Fig }
     * {@link Math }
     * {@link DefList }
     * {@link RelatedObject }
     * {@link Speech }
     * {@link Ack }
     * {@link pubmed.openAccess.jaxb.generated.List }
     * {@link VerseGroup }
     * {@link TexMath }
     * {@link SupplementaryMaterial }
     * {@link Preformat }
     * {@link Statement }
     * {@link BoxedText }
     * {@link Alternatives }
     * {@link DispQuote }
     * {@link X }
     * {@link FigGroup }
     * {@link DispFormula }
     * 
     * 
     */
    public java.util.List<Object> getAddressesAndAlternativesAndArraies() {
        if (addressesAndAlternativesAndArraies == null) {
            addressesAndAlternativesAndArraies = new ArrayList<Object>();
        }
        return this.addressesAndAlternativesAndArraies;
    }

    /**
     * Gets the value of the secs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sec }
     * 
     * 
     */
    public java.util.List<Sec> getSecs() {
        if (secs == null) {
            secs = new ArrayList<Sec>();
        }
        return this.secs;
    }

    /**
     * Gets the value of the notesAndFnGroupsAndGlossaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesAndFnGroupsAndGlossaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesAndFnGroupsAndGlossaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Glossary }
     * {@link FnGroup }
     * {@link Notes }
     * {@link RefList }
     * 
     * 
     */
    public java.util.List<Object> getNotesAndFnGroupsAndGlossaries() {
        if (notesAndFnGroupsAndGlossaries == null) {
            notesAndFnGroupsAndGlossaries = new ArrayList<Object>();
        }
        return this.notesAndFnGroupsAndGlossaries;
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
     * Gets the value of the rids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public java.util.List<Object> getRids() {
        if (rids == null) {
            rids = new ArrayList<Object>();
        }
        return this.rids;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the bioXLinkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBioXLinkTitle() {
        return bioXLinkTitle;
    }

    /**
     * Sets the value of the bioXLinkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBioXLinkTitle(String value) {
        this.bioXLinkTitle = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
