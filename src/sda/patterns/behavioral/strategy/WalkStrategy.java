package sda.patterns.behavioral.strategy;

public class WalkStrategy implements TravelStrategy {


    private boolean includeTouristPaths;

    public WalkStrategy(boolean includeTouristPaths) {
        this.includeTouristPaths = includeTouristPaths;
    }

    @Override
    public String setTravelPlan(String from, String to) {
        return new StringBuilder("Travel by foot from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includeTouristPaths ? " including tourist paths." : ".")
                .toString();
    }
}
