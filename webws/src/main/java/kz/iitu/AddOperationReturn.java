/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kz.iitu;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author koken
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionOperatorResponse", propOrder = {
    "_return"
})
public class AddOperationReturn {

    @XmlElement(name = "return")
    protected double _return;

    /**
     * Gets the value of the return property.
     * 
     */
    public double getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     */
    public void setReturn(double value) {
        this._return = value;
    }

}
