package org.ies.airline.components;

import org.ies.airline.model.Airline;
import org.ies.airline.model.Flight;

import java.util.Scanner;

public class AirlineApp1 {
    private final Scanner scanner;
    private final FlightReader flightReader;
    private final AirlineReader airlineReader;

    public AirlineApp1(Scanner scanner, FlightReader flightReader, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.flightReader = flightReader;
        this.airlineReader = airlineReader;
    }

    public void run(){

        System.out.println("Datos de la aerolinea");
        Airline airline = airlineReader.read();

        System.out.println("Datos de el vuelo");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();
        Flight flight = flightReader.read();

        flightReader.read().getFlightNumber();
    }
}