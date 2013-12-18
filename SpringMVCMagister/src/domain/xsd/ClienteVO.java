/**
 * ClienteVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package domain.xsd;

public class ClienteVO  implements java.io.Serializable {
    private java.lang.String apellido_materno;

    private java.lang.String apellido_paterno;

    private java.lang.String celular;

    private java.lang.String correo;

    private java.lang.String direccion;

    private java.lang.Integer id;

    private java.lang.String nombre;

    private domain.xsd.LoginVO oLoginVO;

    private java.lang.String rut;

    public ClienteVO() {
    }

    public ClienteVO(
           java.lang.String apellido_materno,
           java.lang.String apellido_paterno,
           java.lang.String celular,
           java.lang.String correo,
           java.lang.String direccion,
           java.lang.Integer id,
           java.lang.String nombre,
           domain.xsd.LoginVO oLoginVO,
           java.lang.String rut) {
           this.apellido_materno = apellido_materno;
           this.apellido_paterno = apellido_paterno;
           this.celular = celular;
           this.correo = correo;
           this.direccion = direccion;
           this.id = id;
           this.nombre = nombre;
           this.oLoginVO = oLoginVO;
           this.rut = rut;
    }


    /**
     * Gets the apellido_materno value for this ClienteVO.
     * 
     * @return apellido_materno
     */
    public java.lang.String getApellido_materno() {
        return apellido_materno;
    }


    /**
     * Sets the apellido_materno value for this ClienteVO.
     * 
     * @param apellido_materno
     */
    public void setApellido_materno(java.lang.String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }


    /**
     * Gets the apellido_paterno value for this ClienteVO.
     * 
     * @return apellido_paterno
     */
    public java.lang.String getApellido_paterno() {
        return apellido_paterno;
    }


    /**
     * Sets the apellido_paterno value for this ClienteVO.
     * 
     * @param apellido_paterno
     */
    public void setApellido_paterno(java.lang.String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }


    /**
     * Gets the celular value for this ClienteVO.
     * 
     * @return celular
     */
    public java.lang.String getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this ClienteVO.
     * 
     * @param celular
     */
    public void setCelular(java.lang.String celular) {
        this.celular = celular;
    }


    /**
     * Gets the correo value for this ClienteVO.
     * 
     * @return correo
     */
    public java.lang.String getCorreo() {
        return correo;
    }


    /**
     * Sets the correo value for this ClienteVO.
     * 
     * @param correo
     */
    public void setCorreo(java.lang.String correo) {
        this.correo = correo;
    }


    /**
     * Gets the direccion value for this ClienteVO.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this ClienteVO.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the id value for this ClienteVO.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this ClienteVO.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the nombre value for this ClienteVO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ClienteVO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the oLoginVO value for this ClienteVO.
     * 
     * @return oLoginVO
     */
    public domain.xsd.LoginVO getOLoginVO() {
        return oLoginVO;
    }


    /**
     * Sets the oLoginVO value for this ClienteVO.
     * 
     * @param oLoginVO
     */
    public void setOLoginVO(domain.xsd.LoginVO oLoginVO) {
        this.oLoginVO = oLoginVO;
    }


    /**
     * Gets the rut value for this ClienteVO.
     * 
     * @return rut
     */
    public java.lang.String getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this ClienteVO.
     * 
     * @param rut
     */
    public void setRut(java.lang.String rut) {
        this.rut = rut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClienteVO)) return false;
        ClienteVO other = (ClienteVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellido_materno==null && other.getApellido_materno()==null) || 
             (this.apellido_materno!=null &&
              this.apellido_materno.equals(other.getApellido_materno()))) &&
            ((this.apellido_paterno==null && other.getApellido_paterno()==null) || 
             (this.apellido_paterno!=null &&
              this.apellido_paterno.equals(other.getApellido_paterno()))) &&
            ((this.celular==null && other.getCelular()==null) || 
             (this.celular!=null &&
              this.celular.equals(other.getCelular()))) &&
            ((this.correo==null && other.getCorreo()==null) || 
             (this.correo!=null &&
              this.correo.equals(other.getCorreo()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.oLoginVO==null && other.getOLoginVO()==null) || 
             (this.oLoginVO!=null &&
              this.oLoginVO.equals(other.getOLoginVO()))) &&
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut())));
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
        if (getApellido_materno() != null) {
            _hashCode += getApellido_materno().hashCode();
        }
        if (getApellido_paterno() != null) {
            _hashCode += getApellido_paterno().hashCode();
        }
        if (getCelular() != null) {
            _hashCode += getCelular().hashCode();
        }
        if (getCorreo() != null) {
            _hashCode += getCorreo().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getOLoginVO() != null) {
            _hashCode += getOLoginVO().hashCode();
        }
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClienteVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "ClienteVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido_materno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "apellido_materno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido_paterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "apellido_paterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "celular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "correo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "direccion"));
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
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OLoginVO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "oLoginVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "LoginVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "rut"));
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
