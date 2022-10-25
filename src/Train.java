public class Train extends Transport {

    private double price;
    private String travelTime;
    private String departureStationName;
    private String endingStation;
    private int amountWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color,
                 int maxSpeed, double price, String travelTime, String departureStationName, String endingStation, int amountWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
       if (price <= 0)
           price = 0;
        this.price = price;
        if (travelTime == null || travelTime.isEmpty() || travelTime.isBlank())
            travelTime = "не указано";
        this.travelTime = travelTime;
        if (departureStationName == null || departureStationName.isEmpty() || departureStationName.isBlank())
            departureStationName = "не указано";
        this.departureStationName = departureStationName;
        if (endingStation == null || endingStation.isEmpty() || endingStation.isBlank())
            endingStation = "не указано";
        this.endingStation = endingStation;
        this.amountWagons = Math.max(amountWagons, 1);
    }

    @Override
    public void refill() {
        System.out.println("Поезда нужно заправлять дизелем");

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = amountWagons;
    }


    @Override
    public String toString() {
        return "Train{" + "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                "price=" + price +
                ", travelTime='" + travelTime + '\'' +
                ", departureStationName='" + departureStationName + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", amountWagons=" + amountWagons +
                '}';
    }

    public static class Main {

        public static void main(String[] args) {

            Car lada = new Car("Lada",
                    "Granta",
                    2015,
                    "Россия",
                    "желтый",
                    150,
                    1.5,
                    "МКПП",
                    "седан",
                    "Р090ПР196", 4);

            System.out.println(lada);


            Train lastochka = new Train("",
                    "B-901",
                    2011,
                    "Россия",
                    "",
                    301,
                    3500,
                    "каждое четное число",
                    "Белорусский вокзал",
                    "Минск-Пассажирский",
                    11);


            Train leningrad = new Train("",
                    "D-125",
                    2019,
                    "Россия",
                    "",
                    270,
                    1700,
                    "каждое нечетное число",
                    "Ленинградский вокзал",
                    "Ленинград-Пассажирский",
                    8);


            System.out.println(lastochka);
            System.out.println(leningrad);


            Bus bus1 = new Bus("Mersedes-Benz", "Conecto", 2020, "Германия", "белый", 289);
            Bus bus2 = new Bus("HYUNDAI", "Bogdan A 201", 2019, "Южная Корея", ";желтый", 150);
            Bus bus3 = new Bus("ГАЗ", "Газель Next A63R42", 2020, "Росия", "белый", 110);


            System.out.println(bus1);
            System.out.println(bus2);
            System.out.println(bus3);


            lastochka.refill();
            bus1.refill();


        }


        }
}
