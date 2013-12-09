
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
            * auto generated Axis2 call back method for agregarCuenta method
            * override this method for handling normal response from agregarCuenta operation
            */
           public void receiveResultagregarCuenta(
                    webservice.ServicioCuentaStub.AgregarCuentaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from agregarCuenta operation
           */
            public void receiveErroragregarCuenta(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for registrarConsumo method
            * override this method for handling normal response from registrarConsumo operation
            */
           public void receiveResultregistrarConsumo(
                    webservice.ServicioCuentaStub.RegistrarConsumoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registrarConsumo operation
           */
            public void receiveErrorregistrarConsumo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for desactivarCuenta method
            * override this method for handling normal response from desactivarCuenta operation
            */
           public void receiveResultdesactivarCuenta(
                    webservice.ServicioCuentaStub.DesactivarCuentaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from desactivarCuenta operation
           */
            public void receiveErrordesactivarCuenta(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificarConsumo method
            * override this method for handling normal response from modificarConsumo operation
            */
           public void receiveResultmodificarConsumo(
                    webservice.ServicioCuentaStub.ModificarConsumoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificarConsumo operation
           */
            public void receiveErrormodificarConsumo(java.lang.Exception e) {
            }
                


    }
    