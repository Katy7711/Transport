public class Main {

    public static void main(String[] args) {

        Car lada = new Car("Lada",
                "Granta",
                2.5, BodyTape.SEDAN);
        System.out.println(lada);
        lada.go();
        System.out.println();
        lada.stop();
        System.out.println();
        lada.printType();
        System.out.println();
        DriverB driverB = new DriverB("Иванов Иван Иванович", 5, lada);
        System.out.println(driverB);
        Car mersedes = new Car("Mersedes-Benz",
                "AMG E 53 4MATIC",
                2.5, BodyTape.SEDAN);
        System.out.println(mersedes);
        mersedes.go();
        System.out.println();
        mersedes.stop();
        System.out.println();
        Car bmv = new Car("BMV",
                "M6",
                5, BodyTape.HATCHBACK);
        System.out.println(bmv);
        bmv.go();
        System.out.println();
        bmv.stop();
        System.out.println();


        Bus bus1 = new Bus("Mercedes-benz",
                "Conecto",
                3.0, Bus.CapacityType.LARGE);
        Bus bus2 = new Bus("ГАЗ",
                "Газель Next A64R42",
                3.0, Bus.CapacityType.SMALL);
        Bus bus3 = new Bus("Hyundai",
                "Bogdan A 201",
                3.0, Bus.CapacityType.MEDIUM);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);


        Truck gaz = new Truck("ГАЗ", "3307", 2, Truck.LoadCapacity.N3);
        Truck howo = new Truck("HOWO", "ZZ4257S3241V", 2, Truck.LoadCapacity.N1);
        Truck kamaz = new Truck("КАМАЗ", "65206", 2, Truck.LoadCapacity.N3);
        System.out.println(gaz);
        System.out.println(howo);
        System.out.println(kamaz);
    }
}
