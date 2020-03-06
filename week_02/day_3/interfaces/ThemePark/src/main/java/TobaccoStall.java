public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public int getRating() {
        return this.rating;

    }

    public String getName() {
        return this.name;

    }

    public boolean isAllowedToVisit(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true; }
        else {
            return false;
        }

    }


}
