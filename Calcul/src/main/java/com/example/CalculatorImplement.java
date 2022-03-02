/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author koken
 */
import javax.jws.WebService;

@WebService(
    endpointInterface = "com.example.Calculator",
    name = "Calculator",
    serviceName = "CalculatorService",
    portName = "CalculatorPort")
public class CalculatorImplement implements Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

}

