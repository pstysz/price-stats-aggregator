/**
 * ItemInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.containers;

public class ItemInfoStruct  implements java.io.Serializable {
    private ItemInfo itemInfo;

    private ItemCatList[] itemCats;

    private ItemImageList[] itemImages;

    private AttribStruct[] itemAttribs;

    private PostageStruct[] itemPostageOptions;

    private ItemPaymentOptions itemPaymentOptions;

    private CompanyInfoStruct itemCompanyInfo;

    private ProductStruct itemProductInfo;

    public ItemInfoStruct() {
    }

    public ItemInfoStruct(
           ItemInfo itemInfo,
           ItemCatList[] itemCats,
           ItemImageList[] itemImages,
           AttribStruct[] itemAttribs,
           PostageStruct[] itemPostageOptions,
           ItemPaymentOptions itemPaymentOptions,
           CompanyInfoStruct itemCompanyInfo,
           ProductStruct itemProductInfo) {
           this.itemInfo = itemInfo;
           this.itemCats = itemCats;
           this.itemImages = itemImages;
           this.itemAttribs = itemAttribs;
           this.itemPostageOptions = itemPostageOptions;
           this.itemPaymentOptions = itemPaymentOptions;
           this.itemCompanyInfo = itemCompanyInfo;
           this.itemProductInfo = itemProductInfo;
    }


    /**
     * Gets the itemInfo value for this ItemInfoStruct.
     * 
     * @return itemInfo
     */
    public ItemInfo getItemInfo() {
        return itemInfo;
    }


    /**
     * Sets the itemInfo value for this ItemInfoStruct.
     * 
     * @param itemInfo
     */
    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }


    /**
     * Gets the itemCats value for this ItemInfoStruct.
     * 
     * @return itemCats
     */
    public ItemCatList[] getItemCats() {
        return itemCats;
    }


    /**
     * Sets the itemCats value for this ItemInfoStruct.
     * 
     * @param itemCats
     */
    public void setItemCats(ItemCatList[] itemCats) {
        this.itemCats = itemCats;
    }


    /**
     * Gets the itemImages value for this ItemInfoStruct.
     * 
     * @return itemImages
     */
    public ItemImageList[] getItemImages() {
        return itemImages;
    }


    /**
     * Sets the itemImages value for this ItemInfoStruct.
     * 
     * @param itemImages
     */
    public void setItemImages(ItemImageList[] itemImages) {
        this.itemImages = itemImages;
    }


    /**
     * Gets the itemAttribs value for this ItemInfoStruct.
     * 
     * @return itemAttribs
     */
    public AttribStruct[] getItemAttribs() {
        return itemAttribs;
    }


    /**
     * Sets the itemAttribs value for this ItemInfoStruct.
     * 
     * @param itemAttribs
     */
    public void setItemAttribs(AttribStruct[] itemAttribs) {
        this.itemAttribs = itemAttribs;
    }


    /**
     * Gets the itemPostageOptions value for this ItemInfoStruct.
     * 
     * @return itemPostageOptions
     */
    public PostageStruct[] getItemPostageOptions() {
        return itemPostageOptions;
    }


    /**
     * Sets the itemPostageOptions value for this ItemInfoStruct.
     * 
     * @param itemPostageOptions
     */
    public void setItemPostageOptions(PostageStruct[] itemPostageOptions) {
        this.itemPostageOptions = itemPostageOptions;
    }


    /**
     * Gets the itemPaymentOptions value for this ItemInfoStruct.
     * 
     * @return itemPaymentOptions
     */
    public ItemPaymentOptions getItemPaymentOptions() {
        return itemPaymentOptions;
    }


    /**
     * Sets the itemPaymentOptions value for this ItemInfoStruct.
     * 
     * @param itemPaymentOptions
     */
    public void setItemPaymentOptions(ItemPaymentOptions itemPaymentOptions) {
        this.itemPaymentOptions = itemPaymentOptions;
    }


    /**
     * Gets the itemCompanyInfo value for this ItemInfoStruct.
     * 
     * @return itemCompanyInfo
     */
    public CompanyInfoStruct getItemCompanyInfo() {
        return itemCompanyInfo;
    }


    /**
     * Sets the itemCompanyInfo value for this ItemInfoStruct.
     * 
     * @param itemCompanyInfo
     */
    public void setItemCompanyInfo(CompanyInfoStruct itemCompanyInfo) {
        this.itemCompanyInfo = itemCompanyInfo;
    }


    /**
     * Gets the itemProductInfo value for this ItemInfoStruct.
     * 
     * @return itemProductInfo
     */
    public ProductStruct getItemProductInfo() {
        return itemProductInfo;
    }


    /**
     * Sets the itemProductInfo value for this ItemInfoStruct.
     * 
     * @param itemProductInfo
     */
    public void setItemProductInfo(ProductStruct itemProductInfo) {
        this.itemProductInfo = itemProductInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemInfoStruct)) return false;
        ItemInfoStruct other = (ItemInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemInfo==null && other.getItemInfo()==null) || 
             (this.itemInfo!=null &&
              this.itemInfo.equals(other.getItemInfo()))) &&
            ((this.itemCats==null && other.getItemCats()==null) || 
             (this.itemCats!=null &&
              java.util.Arrays.equals(this.itemCats, other.getItemCats()))) &&
            ((this.itemImages==null && other.getItemImages()==null) || 
             (this.itemImages!=null &&
              java.util.Arrays.equals(this.itemImages, other.getItemImages()))) &&
            ((this.itemAttribs==null && other.getItemAttribs()==null) || 
             (this.itemAttribs!=null &&
              java.util.Arrays.equals(this.itemAttribs, other.getItemAttribs()))) &&
            ((this.itemPostageOptions==null && other.getItemPostageOptions()==null) || 
             (this.itemPostageOptions!=null &&
              java.util.Arrays.equals(this.itemPostageOptions, other.getItemPostageOptions()))) &&
            ((this.itemPaymentOptions==null && other.getItemPaymentOptions()==null) || 
             (this.itemPaymentOptions!=null &&
              this.itemPaymentOptions.equals(other.getItemPaymentOptions()))) &&
            ((this.itemCompanyInfo==null && other.getItemCompanyInfo()==null) || 
             (this.itemCompanyInfo!=null &&
              this.itemCompanyInfo.equals(other.getItemCompanyInfo()))) &&
            ((this.itemProductInfo==null && other.getItemProductInfo()==null) || 
             (this.itemProductInfo!=null &&
              this.itemProductInfo.equals(other.getItemProductInfo())));
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
        if (getItemInfo() != null) {
            _hashCode += getItemInfo().hashCode();
        }
        if (getItemCats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemCats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemCats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemAttribs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemAttribs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemAttribs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPostageOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPostageOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPostageOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPaymentOptions() != null) {
            _hashCode += getItemPaymentOptions().hashCode();
        }
        if (getItemCompanyInfo() != null) {
            _hashCode += getItemCompanyInfo().hashCode();
        }
        if (getItemProductInfo() != null) {
            _hashCode += getItemProductInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemImages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttribs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAttribs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPostageOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPostageOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPaymentOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPaymentOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPaymentOptions"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCompanyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCompanyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct"));
        elemField.setNillable(false);
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
