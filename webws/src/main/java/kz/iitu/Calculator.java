
package kz.iitu;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ObjectFactory;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;



@WebService(name = "Calculator", targetNamespace = "http://iitu.kz/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divisionOperator", targetNamespace = "http://iitu.kz/", className = "kz.iitu.DivisionOperator")
    @ResponseWrapper(localName = "divisionOperatorResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.DivisionOperatorResponse")
    @Action(input = "http://iitu.kz/Calculator/divisionOperatorRequest", output = "http://iitu.kz/Calculator/divisionOperatorResponse")
    public double divisionOperator(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "squareRoot", targetNamespace = "http://iitu.kz/", className = "kz.iitu.SquareRoot")
    @ResponseWrapper(localName = "squareRootResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.SquareRootResponse")
    @Action(input = "http://iitu.kz/Calculator/squareRootRequest", output = "http://iitu.kz/Calculator/squareRootResponse")
    public double squareRoot(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

 
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "additionOperator", targetNamespace = "http://iitu.kz/", className = "kz.iitu.AdditionOperator")
    @ResponseWrapper(localName = "additionOperatorResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.AdditionOperatorResponse")
    @Action(input = "http://iitu.kz/Calculator/additionOperatorRequest", output = "http://iitu.kz/Calculator/additionOperatorResponse")
    public double additionOperator(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

   
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplicationOperator", targetNamespace = "http://iitu.kz/", className = "kz.iitu.MultiplicationOperator")
    @ResponseWrapper(localName = "multiplicationOperatorResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.MultiplicationOperatorResponse")
    @Action(input = "http://iitu.kz/Calculator/multiplicationOperatorRequest", output = "http://iitu.kz/Calculator/multiplicationOperatorResponse")
    public double multiplicationOperator(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtractionOperator", targetNamespace = "http://iitu.kz/", className = "kz.iitu.SubtractionOperator")
    @ResponseWrapper(localName = "subtractionOperatorResponse", targetNamespace = "http://iitu.kz/", className = "kz.iitu.SubtractionOperatorResponse")
    @Action(input = "http://iitu.kz/Calculator/subtractionOperatorRequest", output = "http://iitu.kz/Calculator/subtractionOperatorResponse")
    public double subtractionOperator(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}
