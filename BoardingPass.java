public class BoardingPass {
    private Flight flight;
    private Customer customer;
    private double price;
    private int number;
    private static int count = 0;
    public BoardingPass(Flight f, Customer pa) {
        count++;
        flight = f;
        customer = pa;
        number = count;
    }

    public String toString() {
        String a1 = customer.getName() + ", Flight " + flight.getFlightCode();
        String a2 = ", " + flight.getOrigin() + " to " + flight.getDestination();
        String a3 = ", ticket price--> " ;
        String a4=flight.getFare() +"Rs";
        return a1 + a2 + a3 + a4;
    }


}