/**
 * DoSellSomeAgainResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class DoSellSomeAgainResponse  implements java.io.Serializable {
    private StructSellAgain[] itemsSellAgain;

    private StructSellFailed[] itemsSellFailed;

    private long[] itemsSellNotFound;

    public DoSellSomeAgainResponse() {
    }

    public DoSellSomeAgainResponse(
           StructSellAgain[] itemsSellAgain,
           StructSellFailed[] itemsSellFailed,
           long[] itemsSellNotFound) {
           this.itemsSellAgain = itemsSellAgain;
           this.itemsSellFailed = itemsSellFailed;
           this.itemsSellNotFound = itemsSellNotFound;
    }


    /**
     * Gets the itemsSellAgain value for this DoSellSomeAgainResponse.
     * 
     * @return itemsSellAgain
     */
    public StructSellAgain[] getItemsSellAgain() {
        return itemsSellAgain;
    }


    /**
     * Sets the itemsSellAgain value for this DoSellSomeAgainResponse.
     * 
     * @param itemsSellAgain
     */
    public void setItemsSellAgain(StructSellAgain[] itemsSellAgain) {
        this.itemsSellAgain = itemsSellAgain;
    }


    /**
     * Gets the itemsSellFailed value for this DoSellSomeAgainResponse.
     * 
     * @return itemsSellFailed
     */
    public StructSellFailed[] getItemsSellFailed() {
        return itemsSellFailed;
    }


    /**
     * Sets the itemsSellFailed value for this DoSellSomeAgainResponse.
     * 
     * @param itemsSellFailed
     */
    public void setItemsSellFailed(StructSellFailed[] itemsSellFailed) {
        this.itemsSellFailed = itemsSellFailed;
    }


    /**
     * Gets the itemsSellNotFound value for this DoSellSomeAgainResponse.
     * 
     * @return itemsSellNotFound
     */
    public long[] getItemsSellNotFound() {
        return itemsSellNotFound;
    }


    /**
     * Sets the itemsSellNotFound value for this DoSellSomeAgainResponse.
     * 
     * @param itemsSellNotFound
     */
    public void setItemsSellNotFound(long[] itemsSellNotFound) {
        this.itemsSellNotFound = itemsSellNotFound;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSellSomeAgainResponse)) return false;
        DoSellSomeAgainResponse other = (DoSellSomeAgainResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemsSellAgain==null && other.getItemsSellAgain()==null) || 
             (this.itemsSellAgain!=null &&
              java.util.Arrays.equals(this.itemsSellAgain, other.getItemsSellAgain()))) &&
            ((this.itemsSellFailed==null && other.getItemsSellFailed()==null) || 
             (this.itemsSellFailed!=null &&
              java.util.Arrays.equals(this.itemsSellFailed, other.getItemsSellFailed()))) &&
            ((this.itemsSellNotFound==null && other.getItemsSellNotFound()==null) || 
             (this.itemsSellNotFound!=null &&
              java.util.Arrays.equals(this.itemsSellNotFound, other.getItemsSellNotFound())));
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
        if (getItemsSellAgain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsSellAgain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsSellAgain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemsSellFailed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsSellFailed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsSellFailed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemsSellNotFound() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsSellNotFound());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsSellNotFound(), i);
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
        new org.apache.axis.description.TypeDesc(DoSellSomeAgainResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsSellAgain");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsSellAgain"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsSellFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsSellFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsSellNotFound");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsSellNotFound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
