/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author koken
 */
import javax.xml.ws.Endpoint;

public class CalculatorServer {

	public static void main(String[] args) {
		Endpoint ep = Endpoint.create(new CalculatorImpl());
		ep.publish("http://0.0.0.0:8080/calculator");
	}

}
