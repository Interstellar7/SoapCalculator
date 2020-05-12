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
    String Addition(String a, String b);

    @WebMethod
    String Subtraction(String a, String b);

    @WebMethod
    String Multiplication(String a, String b);

    @WebMethod
    String Division(String a, String b);
}
