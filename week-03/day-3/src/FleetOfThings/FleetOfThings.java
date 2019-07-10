package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Thing thing = new Thing("Get milk" );
        Thing thing2 = new Thing("Remove the obstackle");
        Thing thing3 = new Thing ("Stand up");
        thing3.complete();
        Thing thing4 = new Thing ("Eat lunch");
        thing4.complete();

        Fleet fleet = new Fleet();
        fleet.add(thing);
        fleet.add(thing2);
        fleet.add(thing3);
        fleet.add(thing4);
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch



        System.out.println(fleet);
    }
}
