/**
 * LoginVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package domain.xsd;

public class LoginVO  implements java.io.Serializable {
    private java.lang.String fecha_fin;

    private java.lang.String fecha_inicio;

    private java.lang.Integer id;

    private domain.xsd.AdministradorVO oAdministradorVO;

    private java.lang.String token;

    public LoginVO() {
    }

    public LoginVO(
           java.lang.String fecha_fin,
           java.lang.String fecha_inicio,
           java.lang.Integer id,
           domain.xsd.AdministradorVO oAdministradorVO,
           java.lang.String token) {
           this.fecha_fin = fecha_fin;
           this.fecha_inicio = fecha_inicio;
           this.id = id;
           this.oAdministradorVO = oAdministradorVO;
           this.token = token;
    }


    /**
     * Gets the fecha_fin value for this LoginVO.
     * 
     * @return fecha_fin
     */
    public java.lang.String getFecha_fin() {
        return fecha_fin;
    }


    /**
     * Sets the fecha_fin value for this LoginVO.
     * 
     * @param fecha_fin
     */
    public void setFecha_fin(java.lang.String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }


    /**
     * Gets the fecha_inicio value for this LoginVO.
     * 
     * @return fecha_inicio
     */
    public java.lang.String getFecha_inicio() {
        return fecha_inicio;
    }


    /**
     * Sets the fecha_inicio value for this LoginVO.
     * 
     * @param fecha_inicio
     */
    public void setFecha_inicio(java.lang.String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }


    /**
     * Gets the id value for this LoginVO.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this LoginVO.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the oAdministradorVO value for this LoginVO.
     * 
     * @return oAdministradorVO
     */
    public domain.xsd.AdministradorVO getOAdministradorVO() {
        return oAdministradorVO;
    }


    /**
     * Sets the oAdministradorVO value for this LoginVO.
     * 
     * @param oAdministradorVO
     */
    public void setOAdministradorVO(domain.xsd.AdministradorVO oAdministradorVO) {
        this.oAdministradorVO = oAdministradorVO;
    }


    /**
     * Gets the token value for this LoginVO.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this LoginVO.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginVO)) return false;
        LoginVO other = (LoginVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fecha_fin==null && other.getFecha_fin()==null) || 
             (this.fecha_fin!=null &&
              this.fecha_fin.equals(other.getFecha_fin()))) &&
            ((this.fecha_inicio==null && other.getFecha_inicio()==null) || 
             (this.fecha_inicio!=null &&
              this.fecha_inicio.equals(other.getFecha_inicio()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.oAdministradorVO==null && other.getOAdministradorVO()==null) || 
             (this.oAdministradorVO!=null &&
              this.oAdministradorVO.equals(other.getOAdministradorVO()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken())));
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
        if (getFecha_fin() != null) {
            _hashCode += getFecha_fin().hashCode();
        }
        if (getFecha_inicio() != null) {
            _hashCode += getFecha_inicio().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOAdministradorVO() != null) {
            _hashCode += getOAdministradorVO().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "LoginVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_fin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "fecha_fin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_inicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "fecha_inicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OAdministradorVO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "oAdministradorVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "AdministradorVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
