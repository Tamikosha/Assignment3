
package kz.iitu;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;



@WebServiceClient(name = "CalculatorService", targetNamespace = "http://iitu.kz/", wsdlLocation = "http://alex-strix-notebook:8080/JavaEE-WS-1.0-SNAPSHOT/CalculatorService?wsdl")
public class CalculatorService
    extends Service
{

    private final static URL CALCULATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULATORSERVICE_EXCEPTION;
    private final static QName CALCULATORSERVICE_QNAME = new QName("http://iitu.kz/", "CalculatorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://alex-strix-notebook:8080/JavaEE-WS-1.0-SNAPSHOT/CalculatorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATORSERVICE_WSDL_LOCATION = url;
        CALCULATORSERVICE_EXCEPTION = e;
    }

    public CalculatorService() {
        super(__getWsdlLocation(), CALCULATORSERVICE_QNAME);
    }

    public CalculatorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATORSERVICE_QNAME, features);
    }

    public CalculatorService(URL wsdlLocation) {
        super(wsdlLocation, CALCULATORSERVICE_QNAME);
    }

    public CalculatorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATORSERVICE_QNAME, features);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort() {
        return super.getPort(new QName("http://iitu.kz/", "CalculatorPort"), Calculator.class);
    }

    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://iitu.kz/", "CalculatorPort"), Calculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATORSERVICE_EXCEPTION!= null) {
            throw CALCULATORSERVICE_EXCEPTION;
        }
        return CALCULATORSERVICE_WSDL_LOCATION;
    }

}
