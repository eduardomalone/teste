
package br.com.projeto.servico;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TesteSoap", targetNamespace = "http://servico.projeto.com.br/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TesteSoap {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://servico.projeto.com.br/TesteSoap/testeSoapRequest", output = "http://servico.projeto.com.br/TesteSoap/testeSoapResponse")
    public String testeSoap(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}