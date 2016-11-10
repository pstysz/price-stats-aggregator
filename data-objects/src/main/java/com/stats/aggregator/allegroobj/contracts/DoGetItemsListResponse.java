/**
 * DoGetItemsListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.CategoriesListType;
import com.stats.aggregator.allegroobj.containers.FiltersListType;
import com.stats.aggregator.allegroobj.containers.ItemsListType;

public class DoGetItemsListResponse  implements java.io.Serializable {
    private int itemsCount;

    private java.lang.Integer itemsFeaturedCount;

    private ItemsListType[] itemsList;

    private CategoriesListType categoriesList;

    private FiltersListType[] filtersList;

    private java.lang.String[] filtersRejected;

    public DoGetItemsListResponse() {
    }

    public DoGetItemsListResponse(
           int itemsCount,
           java.lang.Integer itemsFeaturedCount,
           ItemsListType[] itemsList,
           CategoriesListType categoriesList,
           FiltersListType[] filtersList,
           java.lang.String[] filtersRejected) {
           this.itemsCount = itemsCount;
           this.itemsFeaturedCount = itemsFeaturedCount;
           this.itemsList = itemsList;
           this.categoriesList = categoriesList;
           this.filtersList = filtersList;
           this.filtersRejected = filtersRejected;
    }


    /**
     * Gets the itemsCount value for this DoGetItemsListResponse.
     * 
     * @return itemsCount
     */
    public int getItemsCount() {
        return itemsCount;
    }


    /**
     * Sets the itemsCount value for this DoGetItemsListResponse.
     * 
     * @param itemsCount
     */
    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }


    /**
     * Gets the itemsFeaturedCount value for this DoGetItemsListResponse.
     * 
     * @return itemsFeaturedCount
     */
    public java.lang.Integer getItemsFeaturedCount() {
        return itemsFeaturedCount;
    }


    /**
     * Sets the itemsFeaturedCount value for this DoGetItemsListResponse.
     * 
     * @param itemsFeaturedCount
     */
    public void setItemsFeaturedCount(java.lang.Integer itemsFeaturedCount) {
        this.itemsFeaturedCount = itemsFeaturedCount;
    }


    /**
     * Gets the itemsList value for this DoGetItemsListResponse.
     * 
     * @return itemsList
     */
    public ItemsListType[] getItemsList() {
        return itemsList;
    }


    /**
     * Sets the itemsList value for this DoGetItemsListResponse.
     * 
     * @param itemsList
     */
    public void setItemsList(ItemsListType[] itemsList) {
        this.itemsList = itemsList;
    }


    /**
     * Gets the categoriesList value for this DoGetItemsListResponse.
     * 
     * @return categoriesList
     */
    public CategoriesListType getCategoriesList() {
        return categoriesList;
    }


    /**
     * Sets the categoriesList value for this DoGetItemsListResponse.
     * 
     * @param categoriesList
     */
    public void setCategoriesList(CategoriesListType categoriesList) {
        this.categoriesList = categoriesList;
    }


    /**
     * Gets the filtersList value for this DoGetItemsListResponse.
     * 
     * @return filtersList
     */
    public FiltersListType[] getFiltersList() {
        return filtersList;
    }


    /**
     * Sets the filtersList value for this DoGetItemsListResponse.
     * 
     * @param filtersList
     */
    public void setFiltersList(FiltersListType[] filtersList) {
        this.filtersList = filtersList;
    }


    /**
     * Gets the filtersRejected value for this DoGetItemsListResponse.
     * 
     * @return filtersRejected
     */
    public java.lang.String[] getFiltersRejected() {
        return filtersRejected;
    }


    /**
     * Sets the filtersRejected value for this DoGetItemsListResponse.
     * 
     * @param filtersRejected
     */
    public void setFiltersRejected(java.lang.String[] filtersRejected) {
        this.filtersRejected = filtersRejected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemsListResponse)) return false;
        DoGetItemsListResponse other = (DoGetItemsListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemsCount == other.getItemsCount() &&
            ((this.itemsFeaturedCount==null && other.getItemsFeaturedCount()==null) || 
             (this.itemsFeaturedCount!=null &&
              this.itemsFeaturedCount.equals(other.getItemsFeaturedCount()))) &&
            ((this.itemsList==null && other.getItemsList()==null) || 
             (this.itemsList!=null &&
              java.util.Arrays.equals(this.itemsList, other.getItemsList()))) &&
            ((this.categoriesList==null && other.getCategoriesList()==null) || 
             (this.categoriesList!=null &&
              this.categoriesList.equals(other.getCategoriesList()))) &&
            ((this.filtersList==null && other.getFiltersList()==null) || 
             (this.filtersList!=null &&
              java.util.Arrays.equals(this.filtersList, other.getFiltersList()))) &&
            ((this.filtersRejected==null && other.getFiltersRejected()==null) || 
             (this.filtersRejected!=null &&
              java.util.Arrays.equals(this.filtersRejected, other.getFiltersRejected())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getItemsCount();
        if (getItemsFeaturedCount() != null) {
            _hashCode += getItemsFeaturedCount().hashCode();
        }
        if (getItemsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategoriesList() != null) {
            _hashCode += getCategoriesList().hashCode();
        }
        if (getFiltersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiltersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiltersList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFiltersRejected() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiltersRejected());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiltersRejected(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetItemsListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsFeaturedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsFeaturedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriesList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoriesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtersList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filtersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtersRejected");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filtersRejected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
