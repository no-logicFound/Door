public class TestDoor_CB {
    /*
    Author: Bradley Chaurand
    Description: ...
     */
    public static void main(String[] args) {
        // Open and Unlocked
        Door d1 = new Door("Enter");
        d1.unlock();
        d1.open();

        // Closed and Locked
        Door d2 = new Door("Exit");

        // Open and Locked
        Door d3 = new Door("Treasure");
        d3.unlock();
        d3.open();
        d3.lock();

        // Closed and Unlocked
        Door d4 = new Door("Trap");
        d4.unlock();
    }
}
