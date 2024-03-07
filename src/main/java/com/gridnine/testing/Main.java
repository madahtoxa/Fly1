package com.gridnine.testing;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        FlightBuilder flightBuilder = new FlightBuilder();
        List<Flight> flightList = flightBuilder.createFlights();
        FilterSegment filterSegment = new FilterSegmentImpl();
        filterSegment.printFlight(flightList);
        System.out.println("\nTask1. Исключение вылетов до текущего момента времени:");
        filterSegment.getDepartureAfterCurrentTime(flightList);
        System.out.println("\nTask2. Исключение сегментов с датой прилета раньше даты вылета:");
        filterSegment.getArrivalDateEarlierDepartureDate(flightList);
        System.out.println("\nTask3. Исключение перелётов, где общее время, проведенное на земле, превышает два часа:");
        filterSegment.getTimeOnEarthIsMoreTwoHours(flightList);
    }
}