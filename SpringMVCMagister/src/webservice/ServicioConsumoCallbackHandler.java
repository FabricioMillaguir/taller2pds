
/**
 * ServicioConsumoCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package webservice;

    /**
     *  ServicioConsumoCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServicioConsumoCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServicioConsumoCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServicioConsumoCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for registrarPagoConsumo method
            * override this method for handling normal response from registrarPagoConsumo operation
            */
           public void receiveResultregistrarPagoConsumo(
                    webservice.ServicioConsumoStub.RegistrarPagoConsumoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registrarPagoConsumo operation
           */
            public void receiveErrorregistrarPagoConsumo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registrarConsumoDeCuenta method
            * override this method for handling normal response from registrarConsumoDeCuenta operation
            */
           public void receiveResultregistrarConsumoDeCuenta(
                    webservice.ServicioConsumoStub.RegistrarConsumoDeCuentaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registrarConsumoDeCuenta operation
           */
            public void receiveErrorregistrarConsumoDeCuenta(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificarConsumo method
            * override this method for handling normal response from modificarConsumo operation
            */
           public void receiveResultmodificarConsumo(
                    webservice.ServicioConsumoStub.ModificarConsumoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificarConsumo operation
           */
            public void receiveErrormodificarConsumo(java.lang.Exception e) {
            }
                


    }
    