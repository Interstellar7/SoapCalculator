package ru.anterait.soapcalc.services;

import javax.jws.WebService;

import static ru.anterait.soapcalc.endpoint.CalculatorPublisher.NUMBERS_AFTER_COMA;
import static ru.anterait.soapcalc.utils.Utils.*;

@WebService(endpointInterface = "ru.anterait.soapcalc.services.IService")
public class ServiceImpl implements IService {

    private double argA;
    private double argB;
    private String check = "";

    @Override
    public String Hello(String name) {
        return "Здравствуйте, " + name + "! Вас приветствует самый лучший в мире SOAP-калькулятор!";
    }

    @Override
    public String Addition(String a, String b) {
        check = checkArgumentA(a);
        if (check.equals("ok")) {
            argA = Double.parseDouble(a);
            check = checkArgumentB(b);
            if (check.equals("ok")) {
                argB = Double.parseDouble(b);
                double res = argA + argB;
                res = round(res, NUMBERS_AFTER_COMA);
                return truncate(String.valueOf(res));
            }
        }
        return check;
    }

    @Override
    public String Subtraction(String a, String b) {
        check = checkArgumentA(a);
        if (check.equals("ok")) {
            argA = Double.parseDouble(a);
            check = checkArgumentB(b);
            if (check.equals("ok")) {
                argB = Double.parseDouble(b);
                double res = argA - argB;
                res = round(res, NUMBERS_AFTER_COMA);
                return truncate(String.valueOf(res));
            }
        }
        return check;
    }

    @Override
    public String Multiplication(String a, String b) {
        check = checkArgumentA(a);
        if (check.equals("ok")) {
            argA = Double.parseDouble(a);
            check = checkArgumentB(b);
            if (check.equals("ok")) {
                argB = Double.parseDouble(b);
                double res = argA * argB;
                res = round(res, NUMBERS_AFTER_COMA);
                return truncate(String.valueOf(res));
            }
        }
        return check;
    }

    @Override
    public String Division(String a, String b) {
        check = checkArgumentA(a);
        if (check.equals("ok")) {
            argA = Double.parseDouble(a);
            check = checkArgumentB(b);
            if (check.equals("ok")) {
                argB = Double.parseDouble(b);
                if (argB == 0) {
                    return "Деление на ноль невозможно.";
                } else {
                    double res = argA / argB;
                    res = round(res, NUMBERS_AFTER_COMA);
                    return truncate(String.valueOf(res));
                }
            }
        }
        return check;
    }

}
