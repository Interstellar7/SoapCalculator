package ru.anterait.soapcalc.services;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.anterait.soapcalc.services.IService")
public class ServiceImpl implements IService {

    @Override
    public String Hello(String name) {
        return "Здравствуйте, " + name + "! Вас приветствует самый лучший в мире SOAP-калькулятор!";
    }

    @Override
    public double Addition(double a, double b) {
        return a + b;
    }

    @Override
    public double Subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double Multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double Division(double a, double b) {
        return a / b;
    }
}
