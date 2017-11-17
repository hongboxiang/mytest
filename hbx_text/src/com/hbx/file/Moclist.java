package com.hbx.file;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/10/30
 */
/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mocinfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isarray" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="labelKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="neField" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="wsfComponent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="wsfFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isEdit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isVisible" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="wsfListener" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="explanationInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="maximum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="minimum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isDBAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="wsfStepsize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isNull" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isStatic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="valueMap" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="recommendValueGettor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="sequenceLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isReportMDEventAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="range" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isExport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isSetBySystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="deleteEventExtAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="arrayLength" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="structName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="businessDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="uniqueKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="rdn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="labelKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="i18nFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="neTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="maxCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="minCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="explanationInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="deleteConfirmTip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="isVisible" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="isPureVirtual" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="virtualParent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="virtualLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="needDeleteEventExtAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="isStruct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="reportResourceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="transNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MOProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="isExport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="maxAllCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="minAllCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="isRelated" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="isPagination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "mocinfo"
})
@XmlRootElement(name = "moclist")
public class Moclist {

    protected List<Mocinfo> mocinfo;
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the mocinfo property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mocinfo property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMocinfo().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Moclist.Mocinfo }
     */
    public List<Moclist.Mocinfo> getMocinfo() {
        if (mocinfo == null) {
            mocinfo = new ArrayList<Mocinfo>();
        }
        return this.mocinfo;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p/>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isarray" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="labelKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="neField" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="wsfComponent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="wsfFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isEdit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isVisible" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="wsfListener" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="explanationInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="maximum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="minimum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isDBAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="wsfStepsize" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isNull" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isStatic" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="valueMap" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="recommendValueGettor" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="sequenceLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isReportMDEventAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="range" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isExport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isSetBySystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="deleteEventExtAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="arrayLength" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="structName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="businessDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="uniqueKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isBase" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="rdn" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="labelKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="i18nFile" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="neTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="maxCount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="minCount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="explanationInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="deleteConfirmTip" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="isVisible" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="isPureVirtual" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="virtualParent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="virtualLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="needDeleteEventExtAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="isStruct" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="reportResourceType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="transNo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MOProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="isExport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="maxAllCount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="minAllCount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="isRelated" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="isPagination" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "field"
    })
    public static class Mocinfo {

        protected List<Moclist.Mocinfo.Field> field;

        @XmlAttribute
        protected String gMaxCount;
        @XmlAttribute
        protected String isPagination;
        @XmlAttribute
        protected String isRelated;
        @XmlAttribute
        protected String minAllCount;
        @XmlAttribute
        protected String maxAllCount;
        @XmlAttribute
        protected String isExport;
        @XmlAttribute(name = "MOProperty")
        protected String moProperty;
        @XmlAttribute
        protected String transNo;
        @XmlAttribute
        protected String reportResourceType;
        @XmlAttribute
        protected String isStruct;
        @XmlAttribute
        protected String needDeleteEventExtAttr;
        @XmlAttribute
        protected String virtualLevel;
        @XmlAttribute
        protected String virtualParent;


        @XmlAttribute
        protected String isPureVirtual;

        @XmlAttribute
        protected String isVisible;
        @XmlAttribute
        protected String deleteConfirmTip;
        @XmlAttribute
        protected String level;
        @XmlAttribute
        protected String explanationInfo;
        @XmlAttribute
        protected String minCount;
        @XmlAttribute
        protected String maxCount;
        @XmlAttribute
        protected String neTableName;
        @XmlAttribute(name = "i18nFile")
        protected String i18NFile;
        @XmlAttribute
        protected String labelKey;
        @XmlAttribute
        protected String tableName;
        @XmlAttribute
        protected String rdn;
        @XmlAttribute
        protected String parent;
        @XmlAttribute
        protected String name;

        /**
         * Gets the value of the field property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the field property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getField().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link Moclist.Mocinfo.Field }
         */
        public List<Moclist.Mocinfo.Field> getField() {
            if (field == null) {
                field = new ArrayList<Moclist.Mocinfo.Field>();
            }
            return this.field;
        }

        /**
         * Gets the value of the name property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the parent property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getParent() {
            return parent;
        }

        /**
         * Sets the value of the parent property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setParent(String value) {
            this.parent = value;
        }

        /**
         * Gets the value of the rdn property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getRdn() {
            return rdn;
        }

        /**
         * Sets the value of the rdn property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRdn(String value) {
            this.rdn = value;
        }

        /**
         * Gets the value of the tableName property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getTableName() {
            return tableName;
        }

        /**
         * Sets the value of the tableName property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTableName(String value) {
            this.tableName = value;
        }

        /**
         * Gets the value of the labelKey property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getLabelKey() {
            return labelKey;
        }

        /**
         * Sets the value of the labelKey property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLabelKey(String value) {
            this.labelKey = value;
        }

        /**
         * Gets the value of the i18NFile property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getI18NFile() {
            return i18NFile;
        }

        /**
         * Sets the value of the i18NFile property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setI18NFile(String value) {
            this.i18NFile = value;
        }

        /**
         * Gets the value of the neTableName property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNeTableName() {
            return neTableName;
        }

        /**
         * Sets the value of the neTableName property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNeTableName(String value) {
            this.neTableName = value;
        }

        /**
         * Gets the value of the maxCount property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getMaxCount() {
            return maxCount;
        }

        /**
         * Sets the value of the maxCount property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMaxCount(String value) {
            this.maxCount = value;
        }

        /**
         * Gets the value of the minCount property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getMinCount() {
            return minCount;
        }

        /**
         * Sets the value of the minCount property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMinCount(String value) {
            this.minCount = value;
        }

        /**
         * Gets the value of the explanationInfo property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getExplanationInfo() {
            return explanationInfo;
        }

        /**
         * Sets the value of the explanationInfo property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setExplanationInfo(String value) {
            this.explanationInfo = value;
        }

        /**
         * Gets the value of the level property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLevel(String value) {
            this.level = value;
        }

        /**
         * Gets the value of the deleteConfirmTip property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDeleteConfirmTip() {
            return deleteConfirmTip;
        }

        /**
         * Sets the value of the deleteConfirmTip property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDeleteConfirmTip(String value) {
            this.deleteConfirmTip = value;
        }

        /**
         * Gets the value of the isVisible property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIsVisible() {
            return isVisible;
        }

        /**
         * Sets the value of the isVisible property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIsVisible(String value) {
            this.isVisible = value;
        }

        /**
         * Gets the value of the isPureVirtual property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIsPureVirtual() {
            return isPureVirtual;
        }

        /**
         * Sets the value of the isPureVirtual property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIsPureVirtual(String value) {
            this.isPureVirtual = value;
        }

        /**
         * Gets the value of the virtualParent property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVirtualParent() {
            return virtualParent;
        }

        /**
         * Sets the value of the virtualParent property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVirtualParent(String value) {
            this.virtualParent = value;
        }

        /**
         * Gets the value of the virtualLevel property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVirtualLevel() {
            return virtualLevel;
        }

        /**
         * Sets the value of the virtualLevel property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVirtualLevel(String value) {
            this.virtualLevel = value;
        }

        /**
         * Gets the value of the needDeleteEventExtAttr property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNeedDeleteEventExtAttr() {
            return needDeleteEventExtAttr;
        }

        /**
         * Sets the value of the needDeleteEventExtAttr property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNeedDeleteEventExtAttr(String value) {
            this.needDeleteEventExtAttr = value;
        }

        /**
         * Gets the value of the isStruct property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIsStruct() {
            return isStruct;
        }

        /**
         * Sets the value of the isStruct property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIsStruct(String value) {
            this.isStruct = value;
        }

        /**
         * Gets the value of the reportResourceType property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getReportResourceType() {
            return reportResourceType;
        }

        /**
         * Sets the value of the reportResourceType property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setReportResourceType(String value) {
            this.reportResourceType = value;
        }

        /**
         * Gets the value of the transNo property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getTransNo() {
            return transNo;
        }

        /**
         * Sets the value of the transNo property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTransNo(String value) {
            this.transNo = value;
        }

        /**
         * Gets the value of the moProperty property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getMOProperty() {
            return moProperty;
        }

        /**
         * Sets the value of the moProperty property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMOProperty(String value) {
            this.moProperty = value;
        }

        /**
         * Gets the value of the isExport property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIsExport() {
            return isExport;
        }

        /**
         * Sets the value of the isExport property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIsExport(String value) {
            this.isExport = value;
        }

        /**
         * Gets the value of the maxAllCount property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getMaxAllCount() {
            return maxAllCount;
        }

        /**
         * Sets the value of the maxAllCount property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMaxAllCount(String value) {
            this.maxAllCount = value;
        }

        /**
         * Gets the value of the minAllCount property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getMinAllCount() {
            return minAllCount;
        }

        /**
         * Sets the value of the minAllCount property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMinAllCount(String value) {
            this.minAllCount = value;
        }

        /**
         * Gets the value of the isRelated property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIsRelated() {
            return isRelated;
        }

        /**
         * Sets the value of the isRelated property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIsRelated(String value) {
            this.isRelated = value;
        }

        /**
         * Gets the value of the isPagination property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIsPagination() {
            return isPagination;
        }

        /**
         * Sets the value of the isPagination property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIsPagination(String value) {
            this.isPagination = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * <p/>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isarray" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="labelKey" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="neField" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="wsfComponent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="wsfFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isEdit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isVisible" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="wsfListener" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="explanationInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="maximum" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="minimum" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isDBAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="wsfStepsize" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isNull" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isStatic" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="valueMap" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="recommendValueGettor" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="sequenceLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isReportMDEventAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="range" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isExport" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isSetBySystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="deleteEventExtAttr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="arrayLength" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="structName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="businessDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="uniqueKey" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isBase" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Field {

            @XmlAttribute
            protected String icmFlag;
            @XmlAttribute
            protected String fieldProperty;
            @XmlAttribute
            protected String isBase;
            @XmlAttribute
            protected String uniqueKey;
            @XmlAttribute
            protected String businessDesc;
            @XmlAttribute
            protected String structName;
            @XmlAttribute
            protected String arrayLength;
            @XmlAttribute
            protected String deleteEventExtAttr;
            @XmlAttribute
            protected String isSetBySystem;
            @XmlAttribute
            protected String isExport;
            @XmlAttribute
            protected String range;
            @XmlAttribute
            protected String isReportMDEventAttr;
            @XmlAttribute
            protected String sequenceLabel;
            @XmlAttribute
            protected String recommendValueGettor;
            @XmlAttribute
            protected String valueMap;
            @XmlAttribute
            protected String isStatic;
            @XmlAttribute
            protected String isNull;

            @XmlAttribute
            protected String wsfStepsize;


            @XmlAttribute
            protected String isDBAttr;
            @XmlAttribute
            protected String minimum;
            @XmlAttribute
            protected String maximum;
            @XmlAttribute
            protected String explanationInfo;
            @XmlAttribute
            protected String wsfListener;
            @XmlAttribute
            protected String defaultValue;
            @XmlAttribute
            protected String isVisible;
            @XmlAttribute
            protected String isEdit;
            @XmlAttribute
            protected String wsfFormat;
            @XmlAttribute
            protected String wsfComponent;
            @XmlAttribute
            protected String neField;
            @XmlAttribute
            protected String labelKey;
            @XmlAttribute
            protected String isarray;
            @XmlAttribute
            protected String type;
            @XmlAttribute
            protected String name;

            /**
             * Gets the value of the name property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the type property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the isarray property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsarray() {
                return isarray;
            }

            /**
             * Sets the value of the isarray property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsarray(String value) {
                this.isarray = value;
            }

            /**
             * Gets the value of the labelKey property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLabelKey() {
                return labelKey;
            }

            /**
             * Sets the value of the labelKey property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLabelKey(String value) {
                this.labelKey = value;
            }

            /**
             * Gets the value of the neField property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNeField() {
                return neField;
            }

            /**
             * Sets the value of the neField property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNeField(String value) {
                this.neField = value;
            }

            /**
             * Gets the value of the wsfComponent property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getWsfComponent() {
                return wsfComponent;
            }

            /**
             * Sets the value of the wsfComponent property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setWsfComponent(String value) {
                this.wsfComponent = value;
            }

            /**
             * Gets the value of the wsfFormat property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getWsfFormat() {
                return wsfFormat;
            }

            /**
             * Sets the value of the wsfFormat property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setWsfFormat(String value) {
                this.wsfFormat = value;
            }

            /**
             * Gets the value of the isEdit property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsEdit() {
                return isEdit;
            }

            /**
             * Sets the value of the isEdit property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsEdit(String value) {
                this.isEdit = value;
            }

            /**
             * Gets the value of the isVisible property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsVisible() {
                return isVisible;
            }

            /**
             * Sets the value of the isVisible property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsVisible(String value) {
                this.isVisible = value;
            }

            /**
             * Gets the value of the defaultValue property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDefaultValue() {
                return defaultValue;
            }

            /**
             * Sets the value of the defaultValue property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDefaultValue(String value) {
                this.defaultValue = value;
            }

            /**
             * Gets the value of the wsfListener property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getWsfListener() {
                return wsfListener;
            }

            /**
             * Sets the value of the wsfListener property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setWsfListener(String value) {
                this.wsfListener = value;
            }

            /**
             * Gets the value of the explanationInfo property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getExplanationInfo() {
                return explanationInfo;
            }

            /**
             * Sets the value of the explanationInfo property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExplanationInfo(String value) {
                this.explanationInfo = value;
            }

            /**
             * Gets the value of the maximum property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMaximum() {
                return maximum;
            }

            /**
             * Sets the value of the maximum property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMaximum(String value) {
                this.maximum = value;
            }

            /**
             * Gets the value of the minimum property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMinimum() {
                return minimum;
            }

            /**
             * Sets the value of the minimum property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMinimum(String value) {
                this.minimum = value;
            }

            /**
             * Gets the value of the isDBAttr property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsDBAttr() {
                return isDBAttr;
            }

            /**
             * Sets the value of the isDBAttr property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsDBAttr(String value) {
                this.isDBAttr = value;
            }

            /**
             * Gets the value of the wsfStepsize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getWsfStepsize() {
                return wsfStepsize;
            }

            /**
             * Sets the value of the wsfStepsize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setWsfStepsize(String value) {
                this.wsfStepsize = value;
            }

            /**
             * Gets the value of the isNull property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsNull() {
                return isNull;
            }

            /**
             * Sets the value of the isNull property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsNull(String value) {
                this.isNull = value;
            }

            /**
             * Gets the value of the isStatic property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsStatic() {
                return isStatic;
            }

            /**
             * Sets the value of the isStatic property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsStatic(String value) {
                this.isStatic = value;
            }

            /**
             * Gets the value of the valueMap property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValueMap() {
                return valueMap;
            }

            /**
             * Sets the value of the valueMap property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValueMap(String value) {
                this.valueMap = value;
            }

            /**
             * Gets the value of the recommendValueGettor property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRecommendValueGettor() {
                return recommendValueGettor;
            }

            /**
             * Sets the value of the recommendValueGettor property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRecommendValueGettor(String value) {
                this.recommendValueGettor = value;
            }

            /**
             * Gets the value of the sequenceLabel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSequenceLabel() {
                return sequenceLabel;
            }

            /**
             * Sets the value of the sequenceLabel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSequenceLabel(String value) {
                this.sequenceLabel = value;
            }

            /**
             * Gets the value of the isReportMDEventAttr property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsReportMDEventAttr() {
                return isReportMDEventAttr;
            }

            /**
             * Sets the value of the isReportMDEventAttr property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsReportMDEventAttr(String value) {
                this.isReportMDEventAttr = value;
            }

            /**
             * Gets the value of the range property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRange() {
                return range;
            }

            /**
             * Sets the value of the range property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRange(String value) {
                this.range = value;
            }

            /**
             * Gets the value of the isExport property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsExport() {
                return isExport;
            }

            /**
             * Sets the value of the isExport property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsExport(String value) {
                this.isExport = value;
            }

            /**
             * Gets the value of the isSetBySystem property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsSetBySystem() {
                return isSetBySystem;
            }

            /**
             * Sets the value of the isSetBySystem property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsSetBySystem(String value) {
                this.isSetBySystem = value;
            }

            /**
             * Gets the value of the deleteEventExtAttr property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDeleteEventExtAttr() {
                return deleteEventExtAttr;
            }

            /**
             * Sets the value of the deleteEventExtAttr property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDeleteEventExtAttr(String value) {
                this.deleteEventExtAttr = value;
            }

            /**
             * Gets the value of the arrayLength property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getArrayLength() {
                return arrayLength;
            }

            /**
             * Sets the value of the arrayLength property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setArrayLength(String value) {
                this.arrayLength = value;
            }

            /**
             * Gets the value of the structName property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getStructName() {
                return structName;
            }

            /**
             * Sets the value of the structName property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setStructName(String value) {
                this.structName = value;
            }

            /**
             * Gets the value of the businessDesc property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBusinessDesc() {
                return businessDesc;
            }

            /**
             * Sets the value of the businessDesc property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBusinessDesc(String value) {
                this.businessDesc = value;
            }

            /**
             * Gets the value of the uniqueKey property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getUniqueKey() {
                return uniqueKey;
            }

            /**
             * Sets the value of the uniqueKey property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setUniqueKey(String value) {
                this.uniqueKey = value;
            }

            /**
             * Gets the value of the isBase property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getIsBase() {
                return isBase;
            }

            /**
             * Sets the value of the isBase property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setIsBase(String value) {
                this.isBase = value;
            }

            public String getFieldProperty() {
                return fieldProperty;
            }


            public void setFieldProperty(String value) {
                this.fieldProperty = value;
            }

            public String getIcmFlag() {
                return icmFlag;
            }


            public void setIcmFlag(String value) {
                this.icmFlag = value;
            }


        }

    }

}
