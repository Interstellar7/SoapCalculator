package ru.anterait.soapcalc.utils;

public class Utils {

    // проверяем аргументы на их наличие и на соответствие дробному или целому числу
    public static String checkArgumentA(String aa) {
        try {
            double a = Double.parseDouble(aa);
        } catch (IllegalArgumentException e) {
            return "Неверный аргумент A. Требуется целое или дробное число.";
        } catch (NullPointerException e) {
            return "Не определён аргумент A.";
        }
        return "ok";
    }

    public static String checkArgumentB(String bb) {
        try {
            double b = Double.parseDouble(bb);
        } catch (IllegalArgumentException e) {
            return "Неверный аргумент B. Требуется целое или дробное число.";
        } catch (NullPointerException e) {
            return "Не определён аргумент B.";
        }
        return "ok";
    }

    // Удаляем ноль после запятой, если результат - целое число
    public static String truncate(String res) {
        if (res.length() > 2)
            if (res.substring(res.length()-2, res.length()).equals(".0")) {
                res = res.substring(0, res.length() - 2);
            }
        return res;
    }

    // Функция округления до нужного количества знаков
    public static double round(double d, int nums) {
        double exponentiation = Math.pow(10, nums);
        return Math.round(d * exponentiation) / exponentiation;
    }
}
