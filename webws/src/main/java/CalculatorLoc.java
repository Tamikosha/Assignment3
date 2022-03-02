
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author koken
 */

import kz.iitu.Calculator;
import kz.iitu.CalculatorService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorLoc {
    public static void main(String[] args) throws MalformedURLException {
//        cs.getCalculatorPort(ao);
        double a = Double.parseDouble("request");

//        // создаем ссылку на wsdl описание
        URL url = new URL("http://alex-strix-notebook:8080/JavaEE-WS-1.0-SNAPSHOT/CalculatorService");
//
//        // Параметры следующего конструктора смотрим в самом первом теге WSDL описания - definitions
//        // 1-ый аргумент смотрим в атрибуте targetNamespace
//        // 2-ой аргумент смотрим в атрибуте name
        QName qname = new QName("http://iitu.kz/", "CalculatorService");
//
//        // Теперь мы можем дотянуться до тега service в wsdl описании,
        Service service = Service.create(url, qname);
//        // а далее и до вложенного в него тега port, чтобы
//        // получить ссылку на удаленный от нас объект веб-сервиса
        CalculatorService calculatorService = new CalculatorService(url, qname);
        Calculator calculator = calculatorService.getCalculatorPort();
        System.out.println(calculator.additionOperator(1, 2));
        calculator.squareRoot(16);
    }

}

