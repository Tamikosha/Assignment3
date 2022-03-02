
package kz.iitu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.iitu package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjFact {

    
    
    private final static QName _AddOperation_QNAME = new QName("http://iitu.kz/", "additionOperator");
    private final static QName _AddOperationReturn_QNAME = new QName("http://iitu.kz/", "additionOperatorResponse");
    private final static QName _DivOperationReturn_QNAME = new QName("http://iitu.kz/", "divisionOperatorResponse");
    private final static QName _DivOperation_QNAME = new QName("http://iitu.kz/", "divisionOperator");
    
    
    public ObjFact() {
    }

   
    public DivOperation createDivOperator() {
        return new DivOperation();
    }

    public DivOperationReturn createDivOperationReturn() {
        return new DivOperationReturn();
    }

    public AddOperation createAddOperation() {
        return new AddOperation();
    }

    
    public AddOperationReturn createAddOperatorReturn() {
        return new AddOperationReturn();
    }

   
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "addOperation")
    public JAXBElement<AddOperation> createAddOperation(AddOperation value) {
        return new JAXBElement<AddOperation>(_AddOperation_QNAME, AddOperation.class, null, value);
    }

   
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "addOperationReturn")
    public JAXBElement<AddOperationReturn> createAddOperationReturn(AddOperationReturn value) {
        return new JAXBElement<AddOperationReturn>(_AddOperationReturn_QNAME, AddOperationReturn.class, null, value);
    }
    
     @XmlElementDecl(namespace = "http://iitu.kz/", name = "divOperation")
    public JAXBElement<DivOperation> createDivOperation(DivOperation value) {
        return new JAXBElement<DivOperation>(_DivOperation_QNAME, DivOperation.class, null, value);
    }

  
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "divOperationReturn")
    public JAXBElement<DivOperationReturn> createDivOperationReturn(DivOperationReturn value) {
        return new JAXBElement<DivOperationReturn>(_DivOperationReturn_QNAME, DivOperationReturn.class, null, value);
    }

}
