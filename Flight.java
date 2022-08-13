import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    static ArrayList<Flight> al =new ArrayList<>();
    private String flightCode;
    private String origin;
    private String destination;
    public String toString() {
        String c1 = "Flight " + flightCode;
        String c2 = "," + origin + " to " + destination;;
        String c3 = ", original price: " + fare + "Rs";
        return c1+c2+c3;
    }
    private String airline;
    public boolean bookASeat() {

        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
            return true;
        }
        return false;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    private int fare;
    private int flightSize;
    private int numberOfSeatsLeft;


    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getFlightSize() {
        return flightSize;
    }

    public void setFlightSize(int flightSize) {
        this.flightSize = flightSize;
    }


    public Flight(String flightCode, String origin, String destination, int fare, int flightSize,String airline) {
        this.flightCode = flightCode;
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
        this.flightSize = flightSize;
        this.numberOfSeatsLeft=flightSize;
        this.airline=airline;
    }



}