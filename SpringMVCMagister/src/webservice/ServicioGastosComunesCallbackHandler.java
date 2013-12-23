
/**
 * ServicioGastosComunesCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package webservice;

    /**
     *  ServicioGastosComunesCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServicioGastosComunesCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServicioGastosComunesCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServicioGastosComunesCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for agregarCliente method
            * override this method for handling normal response from agregarCliente operation
            */
           public void receiveResultagregarCliente(
                    webservice.ServicioGastosComunesStub.AgregarClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from agregarCliente operation
           */
            public void receiveErroragregarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loggear method
            * override this method for handling normal response from loggear operation
            */
           public void receiveResultloggear(
                    webservice.ServicioGastosComunesStub.LoggearResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loggear operation
           */
            public void receiveErrorloggear(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deshabilitarCuentaACliente method
            * override this method for handling normal response from deshabilitarCuentaACliente operation
            */
           public void receiveResultdeshabilitarCuentaACliente(
                    webservice.ServicioGastosComunesStub.DeshabilitarCuentaAClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deshabilitarCuentaACliente operation
           */
            public void receiveErrordeshabilitarCuentaACliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for agregarAdministrador method
            * override this method for handling normal response from agregarAdministrador operation
            */
           public void receiveResultagregarAdministrador(
                    webservice.ServicioGastosComunesStub.AgregarAdministradorResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from agregarAdministrador operation
           */
            public void receiveErroragregarAdministrador(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for filtrarCuentasDelCliente method
            * override this method for handling normal response from filtrarCuentasDelCliente operation
            */
           public void receiveResultfiltrarCuentasDelCliente(
                    webservice.ServicioGastosComunesStub.FiltrarCuentasDelClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from filtrarCuentasDelCliente operation
           */
            public void receiveErrorfiltrarCuentasDelCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for filtrarCambioHistorico method
            * override this method for handling normal response from filtrarCambioHistorico operation
            */
           public void receiveResultfiltrarCambioHistorico(
                    webservice.ServicioGastosComunesStub.FiltrarCambioHistoricoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from filtrarCambioHistorico operation
           */
            public void receiveErrorfiltrarCambioHistorico(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registrarCuentaACliente method
            * override this method for handling normal response from registrarCuentaACliente operation
            */
           public void receiveResultregistrarCuentaACliente(
                    webservice.ServicioGastosComunesStub.RegistrarCuentaAClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registrarCuentaACliente operation
           */
            public void receiveErrorregistrarCuentaACliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for filtrarCliente method
            * override this method for handling normal response from filtrarCliente operation
            */
           public void receiveResultfiltrarCliente(
                    webservice.ServicioGastosComunesStub.FiltrarClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from filtrarCliente operation
           */
            public void receiveErrorfiltrarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificarCliente method
            * override this method for handling normal response from modificarCliente operation
            */
           public void receiveResultmodificarCliente(
                    webservice.ServicioGastosComunesStub.ModificarClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificarCliente operation
           */
            public void receiveErrormodificarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for mostrarServicio method
            * override this method for handling normal response from mostrarServicio operation
            */
           public void receiveResultmostrarServicio(
                    webservice.ServicioGastosComunesStub.MostrarServicioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from mostrarServicio operation
           */
            public void receiveErrormostrarServicio(java.lang.Exception e) {
            }
                


    }
    