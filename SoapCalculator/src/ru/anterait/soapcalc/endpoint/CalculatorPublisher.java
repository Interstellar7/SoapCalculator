package ru.anterait.soapcalc.endpoint;

import ru.anterait.soapcalc.services.ServiceImpl;

import javax.xml.ws.Endpoint;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CalculatorPublisher {

    public static void main(String[] args) {
        String server;
        String port;
        String uri;
        // Загружаем настройки
        try (FileReader fileReader = new FileReader("res/soap-settings.properties")) {
            Properties properties = new Properties();
            properties.load(fileReader);
            server = properties.getProperty("server");
            port = properties.getProperty("port");
            uri = properties.getProperty("uri");
            System.out.println("Settings loaded successful");
        } catch(IOException e) {  // дефолтные значения
            server = "localhost";
            port = "8080";
            uri = "/soapcalc";
            System.out.println("Settings do not loaded! Using default.");
        }
        String address = "http://" + server + ":" + port + uri;

        // Запускаем сервис
        Endpoint.publish(address, new ServiceImpl());

        // Логгируем
        System.out.println("SOAP calculator has been started at " + address);
        System.out.println("Initial WSDL is " + address + "?wsdl");
    }
}
