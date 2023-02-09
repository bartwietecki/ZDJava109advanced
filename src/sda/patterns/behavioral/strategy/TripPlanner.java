package sda.patterns.behavioral.strategy;

public class TripPlanner {

    private String startPoint;
    private String destination;
    private String finalRoute;

    public TripPlanner(String startPoint, String destination) {
        this.startPoint = startPoint;
        this.destination = destination;
    }

    public void setTravelPlan(TravelStrategy travelStrategy) {
       finalRoute = travelStrategy.setTravelPlan(startPoint, destination);
    }

    public void getTravelInfo() {
        System.out.println("==============================");
        System.out.println("Travel from: " + startPoint + " to: " + destination);
        System.out.println("========= DETAILS ============");
        System.out.println(finalRoute);
        System.out.println("==============================");
    }
}
