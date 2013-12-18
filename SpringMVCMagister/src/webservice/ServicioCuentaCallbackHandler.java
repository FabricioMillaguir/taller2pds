
/**
 * ServicioCuentaCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package webservice;

    /**
     *  ServicioCuentaCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServicioCuentaCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServicioCuentaCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServicioCuentaCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for deshabilitarCuentaACliente method
            * override this method for handling normal response from deshabilitarCuentaACliente operation
            */
           public void receiveResultdeshabilitarCuentaACliente(
                    webservice.ServicioCuentaStub.DeshabilitarCuentaAClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deshabilitarCuentaACliente operation
           */
            public void receiveErrordeshabilitarCuentaACliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registrarCuentaACliente method
            * override this method for handling normal response from registrarCuentaACliente operation
            */
           public void receiveResultregistrarCuentaACliente(
                    webservice.ServicioCuentaStub.RegistrarCuentaAClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registrarCuentaACliente operation
           */
            public void receiveErrorregistrarCuentaACliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for mostrarServicio method
            * override this method for handling normal response from mostrarServicio operation
            */
           public void receiveResultmostrarServicio(
                    webservice.ServicioCuentaStub.MostrarServicioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from mostrarServicio operation
           */
            public void receiveErrormostrarServicio(java.lang.Exception e) {
            }
                


    }
    