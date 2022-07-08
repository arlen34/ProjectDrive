
public class Main {

    public static void main(String[] args) {
        Track track1 = new Track("KG001 312AAB", "Renault Magnum");
        Track track2 = new Track("KG001 567SAB", "Volvo");
        Track track3 = new Track("KG003 111BAT", "DAF XT");
        Driver driver1 = new Driver(1, "Asan");
        Driver driver2 = new Driver(2, "Arslan");
        Driver driver3 = new Driver(3, "Bakyt");

        System.out.println();
        System.out.println("_______________________________________________________");
        System.out.println("# |             Track            |  Driver  |  State  |");
        System.out.println("_______________________________________________________");
        System.out.println("1 | " + track1 + " | " + driver1 + "     | On Base |");
        System.out.println("2 | " + track2 + "          | " + driver2 + "   | On Base |");
        System.out.println("3 | " + track3 + "         | " + driver3 + "    | On Base |");
    }
}
