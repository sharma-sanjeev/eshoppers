
package com.eshoppers.service.impl.amazon.amazonwsdl;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="Collection" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CollectionSummary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LowestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *                             &lt;element name="HighestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *                             &lt;element name="LowestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *                             &lt;element name="HighestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CollectionParent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CollectionItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "collection"
})
@XmlRootElement(name = "Collections")
public class Collections {

    @XmlElement(name = "Collection")
    protected List<Collection> collection;

    /**
     * Gets the value of the collection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collection }
     * 
     * 
     */
    public List<Collection> getCollection() {
        if (collection == null) {
            collection = new ArrayList<Collection>();
        }
        return this.collection;
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
     *       &lt;sequence>
     *         &lt;element name="CollectionSummary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LowestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
     *                   &lt;element name="HighestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
     *                   &lt;element name="LowestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
     *                   &lt;element name="HighestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CollectionParent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CollectionItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "collectionSummary",
        "collectionParent",
        "collectionItem"
    })
    public static class Collection {

        @XmlElement(name = "CollectionSummary")
        protected CollectionSummary collectionSummary;
        @XmlElement(name = "CollectionParent")
        protected CollectionParent collectionParent;
        @XmlElement(name = "CollectionItem")
        protected List<CollectionItem> collectionItem;

        /**
         * Gets the value of the collectionSummary property.
         * 
         * @return
         *     possible object is
         *     {@link CollectionSummary }
         *     
         */
        public CollectionSummary getCollectionSummary() {
            return collectionSummary;
        }

        /**
         * Sets the value of the collectionSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link CollectionSummary }
         *     
         */
        public void setCollectionSummary(CollectionSummary value) {
            this.collectionSummary = value;
        }

        /**
         * Gets the value of the collectionParent property.
         * 
         * @return
         *     possible object is
         *     {@link CollectionParent }
         *     
         */
        public CollectionParent getCollectionParent() {
            return collectionParent;
        }

        /**
         * Sets the value of the collectionParent property.
         * 
         * @param value
         *     allowed object is
         *     {@link CollectionParent }
         *     
         */
        public void setCollectionParent(CollectionParent value) {
            this.collectionParent = value;
        }

        /**
         * Gets the value of the collectionItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the collectionItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCollectionItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CollectionItem }
         * 
         * 
         */
        public List<CollectionItem> getCollectionItem() {
            if (collectionItem == null) {
                collectionItem = new ArrayList<CollectionItem>();
            }
            return this.collectionItem;
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
         *       &lt;sequence>
         *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "asin",
            "title"
        })
        public static class CollectionItem {

            @XmlElement(name = "ASIN")
            protected String asin;
            @XmlElement(name = "Title")
            protected String title;

            /**
             * Gets the value of the asin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASIN() {
                return asin;
            }

            /**
             * Sets the value of the asin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASIN(String value) {
                this.asin = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
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
         *       &lt;sequence>
         *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "asin",
            "title"
        })
        public static class CollectionParent {

            @XmlElement(name = "ASIN")
            protected String asin;
            @XmlElement(name = "Title")
            protected String title;

            /**
             * Gets the value of the asin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getASIN() {
                return asin;
            }

            /**
             * Sets the value of the asin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setASIN(String value) {
                this.asin = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
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
         *       &lt;sequence>
         *         &lt;element name="LowestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
         *         &lt;element name="HighestListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
         *         &lt;element name="LowestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
         *         &lt;element name="HighestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lowestListPrice",
            "highestListPrice",
            "lowestSalePrice",
            "highestSalePrice"
        })
        public static class CollectionSummary {

            @XmlElement(name = "LowestListPrice")
            protected Price lowestListPrice;
            @XmlElement(name = "HighestListPrice")
            protected Price highestListPrice;
            @XmlElement(name = "LowestSalePrice")
            protected Price lowestSalePrice;
            @XmlElement(name = "HighestSalePrice")
            protected Price highestSalePrice;

            /**
             * Gets the value of the lowestListPrice property.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getLowestListPrice() {
                return lowestListPrice;
            }

            /**
             * Sets the value of the lowestListPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setLowestListPrice(Price value) {
                this.lowestListPrice = value;
            }

            /**
             * Gets the value of the highestListPrice property.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getHighestListPrice() {
                return highestListPrice;
            }

            /**
             * Sets the value of the highestListPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setHighestListPrice(Price value) {
                this.highestListPrice = value;
            }

            /**
             * Gets the value of the lowestSalePrice property.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getLowestSalePrice() {
                return lowestSalePrice;
            }

            /**
             * Sets the value of the lowestSalePrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setLowestSalePrice(Price value) {
                this.lowestSalePrice = value;
            }

            /**
             * Gets the value of the highestSalePrice property.
             * 
             * @return
             *     possible object is
             *     {@link Price }
             *     
             */
            public Price getHighestSalePrice() {
                return highestSalePrice;
            }

            /**
             * Sets the value of the highestSalePrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link Price }
             *     
             */
            public void setHighestSalePrice(Price value) {
                this.highestSalePrice = value;
            }

        }

    }

}
