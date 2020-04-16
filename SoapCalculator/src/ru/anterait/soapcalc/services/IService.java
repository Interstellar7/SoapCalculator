package ru.anterait.soapcalc.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IService {

    @WebMethod
    String Hello(String name);

    @WebMethod
    double Addition(double a, double b);

    @WebMethod
    double Subtraction(double a, double b);

    @WebMethod
    double Multiplication(double a, double b);

    @WebMethod
    double Division(double a, double b);
}
