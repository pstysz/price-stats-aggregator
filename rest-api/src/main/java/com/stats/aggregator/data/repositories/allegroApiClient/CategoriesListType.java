/**
 * CategoriesListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class CategoriesListType  implements java.io.Serializable {
    private CategoryTreeType[] categoriesTree;

    private CategoryPathType[] categoriesPath;

    public CategoriesListType() {
    }

    public CategoriesListType(
           CategoryTreeType[] categoriesTree,
           CategoryPathType[] categoriesPath) {
           this.categoriesTree = categoriesTree;
           this.categoriesPath = categoriesPath;
    }


    /**
     * Gets the categoriesTree value for this CategoriesListType.
     * 
     * @return categoriesTree
     */
    public CategoryTreeType[] getCategoriesTree() {
        return categoriesTree;
    }


    /**
     * Sets the categoriesTree value for this CategoriesListType.
     * 
     * @param categoriesTree
     */
    public void setCategoriesTree(CategoryTreeType[] categoriesTree) {
        this.categoriesTree = categoriesTree;
    }


    /**
     * Gets the categoriesPath value for this CategoriesListType.
     * 
     * @return categoriesPath
     */
    public CategoryPathType[] getCategoriesPath() {
        return categoriesPath;
    }


    /**
     * Sets the categoriesPath value for this CategoriesListType.
     * 
     * @param categoriesPath
     */
    public void setCategoriesPath(CategoryPathType[] categoriesPath) {
        this.categoriesPath = categoriesPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoriesListType)) return false;
        CategoriesListType other = (CategoriesListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoriesTree==null && other.getCategoriesTree()==null) || 
             (this.categoriesTree!=null &&
              java.util.Arrays.equals(this.categoriesTree, other.getCategoriesTree()))) &&
            ((this.categoriesPath==null && other.getCategoriesPath()==null) || 
             (this.categoriesPath!=null &&
              java.util.Arrays.equals(this.categoriesPath, other.getCategoriesPath())));
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
        if (getCategoriesTree() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoriesTree());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoriesTree(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategoriesPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoriesPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoriesPath(), i);
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
        new org.apache.axis.description.TypeDesc(CategoriesListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriesTree");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoriesTree"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriesPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "categoriesPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType"));
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
