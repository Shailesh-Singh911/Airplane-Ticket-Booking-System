import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Manager {

    public Flight getFlight(String flightCode) {
        int size = Flight.al.size();
        for (Flight flight : Flight.al) {
            if (Objects.equals(flight.getFlightCode(), flightCode)) {
                return flight;
            }
        }
        return null;
    }



    public void displayAvailableFlights(String origin, String destination) {
        int size, SeatsLeft;
        boolean boolCount = true;
        String originOfFLight, destinationOfFlight;
        size = Flight.al.size();
        for (int i = 0; i < size; i++) {
            originOfFLight = Flight.al.get(i).getOrigin();
            destinationOfFlight = Flight.al.get(i).getDestination();
            SeatsLeft = Flight.al.get(i).getNumberOfSeatsLeft();
            if ((originOfFLight.equals(origin)) && (destinationOfFlight.equals(destination))  && SeatsLeft>0) {
                if (boolCount) {
                    System.out.println("The List of Flights are ->>");
                    boolCount = false;
                }
                System.out.println(Flight.al.get(i));
            }
        }
        if (boolCount) {
            System.out.println("SORRY! ----> NO SUCH FLIGHT EXISTS");
        }
    }


    public static void main(String[] args) {
        Flight f1=new Flight("AI 1","Delhi","Mumbai",1100,250,"AirIndia");
        Flight f2=new Flight("AI 2","Delhi","Kolkata",1100,250,"AirIndia");
        Flight f3=new Flight("AI 3","Kolkata","Mumbai",1100,250,"AirIndia");
        Flight f4=new Flight("AI 4","Chennai","Srinagar",1100,250,"AirIndia");
        Flight f5=new Flight("AI 5","Bengaluru","Mumbai",1100,250,"AirIndia");

        Flight f6=new Flight("AA 1","Lucknow","Kolkata",1200,260,"AirAsia");
        Flight f7=new Flight("AA 2","Pune","Kolkata",1200,260,"AirAsia");
        Flight f8=new Flight("AA 3","Mumbai","Ahmedabad",1200,260,"AirAsia");
        Flight f9=new Flight("AA 4","Mumbai","Surat",1200,260,"AirAsia");
        Flight f10=new Flight("AA 5","Kanpur","Kolkata",1200,260,"AirAsia");

        Flight f11=new Flight("I 1","Varanasi","Indore",1400,270,"Indigo");
        Flight f12=new Flight("I 2","Bhopal","Kolkata",1400,270,"Indigo");
        Flight f13=new Flight("I 3","Mumbai","Nagpur",1400,270,"Indigo");
        Flight f14=new Flight("I 4","Mumbai","Patna",1400,270,"Indigo");
        Flight f15=new Flight("I 5","Agra","Jodhpur",1400,270,"Indigo");

        Flight f16=new Flight("SJ 1","Agra","Jodhpur",1800,280,"SpiceJet");
        Flight f17=new Flight("SJ 2","Mumbai","Kolkata",1800,280,"SpiceJet");
        Flight f18=new Flight("SJ 3","Varanasi","Indore",1800,280,"SpiceJet");
        Flight f19=new Flight("SJ 4","Kanpur","Kolkata",1800,280,"SpiceJet");
        Flight f20=new Flight("SJ 5","Chennai","Srinagar",1800,280,"SpiceJet");

        Flight f21=new Flight("GF 1","Bengaluru","Mumbai",2400,320,"GoFirst");
        Flight f22=new Flight("GF 2","Delhi","Amritsar",2400,320,"GoFirst");
        Flight f23=new Flight("GF 3","Delhi","Mumbai",2400,320,"GoFirst");
        Flight f24=new Flight("GF 4","Lucknow","Kolkata",2400,320,"GoFirst");
        Flight f25=new Flight("GF 5","Bhopal","Kolkata",2400,320,"GoFirst");

        Flight.al.add(f1);
        Flight.al.add(f2);
        Flight.al.add(f3);
        Flight.al.add(f4);
        Flight.al.add(f5);
        Flight.al.add(f6);
        Flight.al.add(f7);
        Flight.al.add(f8);
        Flight.al.add(f9);
        Flight.al.add(f10);
        Flight.al.add(f11);
        Flight.al.add(f12);
        Flight.al.add(f13);
        Flight.al.add(f14);
        Flight.al.add(f15);
        Flight.al.add(f16);
        Flight.al.add(f17);
        Flight.al.add(f18);
        Flight.al.add(f19);
        Flight.al.add(f20);
        Flight.al.add(f21);
        Flight.al.add(f22);
        Flight.al.add(f23);
        Flight.al.add(f24);
        Flight.al.add(f25);


        Manager M =new Manager();
        Scanner scan =new Scanner(System.in);
        System.out.println("WELCOME TO AIRPORT TICKET BOOKING SYSTEM!\nPLEASE LOG IN!");
        String age,name,gender,aadharNumber,phoneNumber,baggageWeight;
        System.out.println("Enter passengers name");
        name = scan.nextLine();
        System.out.println("Enter passengers age");
        age = scan.nextLine();
        System.out.println("Enter your gender");
        gender=scan.nextLine();
        System.out.println("Enter your aadhar Number");
        aadharNumber=scan.nextLine();
        System.out.println("Enter your Phone Number");
        phoneNumber=scan.nextLine();
        System.out.println("Enter your Baggage Weight");
        baggageWeight=scan.nextLine();

        Customer cc=new Customer(name,age,gender,aadharNumber,phoneNumber,baggageWeight);

        boolean flag=false;
        String origin,destination;
        Flight F = null;
        String FN;
        Customer C=cc;


        while (flag != true) {
            System.out.println("Press d if you would like to display all the available flights ");
            System.out.println("Press g if you would like to get information about a flight ");
            System.out.println("Press b if you would like to book a seat ");
            System.out.println("Press t if you would like to terminate the system");

            String input;
            input = scan.nextLine();
            switch (input) {

                case "d":
                    System.out.println("Enter flight origin");
                    origin = scan.nextLine();
                    System.out.println("Enter flight destination");
                    destination = scan.nextLine();
                    M.displayAvailableFlights(origin, destination);
                    break;
                case "g":
                    System.out.println("Enter Flight Code");
                    FN = scan.nextLine();
                    F = M.getFlight(FN);
                    if (F == null) {
                        System.out.println("Flight " + FN + " does not exist");
                    } else {
                        System.out.println("Info for Flight " + FN + ":");
                        System.out.println(F);
                    }

                    break;
                case "b":
                    System.out.println("enter origin");
                    System.out.println("The origin can be a city from [Delhi,Kolkata,Chennai,Bengaluru,Lucknow," +
                           "Pune,Mumbai,Kanpur,Varanasi,Bhopal,Agra]");
                    String or=scan.nextLine();
                    System.out.println("enter destination");
                    System.out.println("The destination can be a city from [Mumbai,Kolkata,Srinagar,Ahmedabad," +
                                   "Surat,Indore,Nagpur,Patna,Jodhpur,Amritsar]");
                    String ds=scan.nextLine();
                    M.displayAvailableFlights(or, ds);
                    System.out.println("Enter Flight Code");
                    FN = scan.nextLine();
                    F = M.getFlight(FN);
                    if (F == null) {
                        System.out.println("Flight " + FN + " does not exist");

                    } else {
                        System.out.println("Your ticket for flight " + FN + " has been booked.");
                        System.out.println("Would you like to view boarding pass");
                        System.out.println("Yes/No :");
                        String YN = scan.nextLine();
                        if (Objects.equals(YN, "Yes")){
                            BoardingPass bp=new BoardingPass(F,C);
                            System.out.println(bp);
                        }
                        flag = true;
                        System.out.println("Program is Terminated");
                    }
                    break;

                case "t":
                    flag = true;
                    System.out.println("The Program is Terminated");
                    break;
                default:
                    System.out.println("The option you entered is invalid");
                    break;

            }
        }
    }

}