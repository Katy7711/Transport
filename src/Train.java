//public class Train extends Transport {
//
//    private double price;
//    private String travelTime;
//    private String departureStationName;
//    private String endingStation;
//    private int amountWagons;
//
//    public Train(String brand, String model, int productionYear, String productionCountry, String color,
//                 int maxSpeed, double price, String travelTime, String departureStationName, String endingStation, int amountWagons) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//       if (price <= 0)
//           price = 0;
//        this.price = price;
//        if (travelTime == null || travelTime.isEmpty() || travelTime.isBlank())
//            travelTime = "не указано";
//        this.travelTime = travelTime;
//        if (departureStationName == null || departureStationName.isEmpty() || departureStationName.isBlank())
//            departureStationName = "не указано";
//        this.departureStationName = departureStationName;
//        if (endingStation == null || endingStation.isEmpty() || endingStation.isBlank())
//            endingStation = "не указано";
//        this.endingStation = endingStation;
//        this.amountWagons = Math.max(amountWagons, 1);
//    }

//    @Override
//    public void refill() {
//        System.out.println("Поезда нужно заправлять дизелем");
//
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getTravelTime() {
//        return travelTime;
//    }
//
//    public void setTravelTime(String travelTime) {
//        this.travelTime = travelTime;
//    }
//
//    public String getDepartureStationName() {
//        return departureStationName;
//    }
//
//    public void setDepartureStationName(String departureStationName) {
//        this.departureStationName = departureStationName;
//    }
//
//    public String getEndingStation() {
//        return endingStation;
//    }
//
//    public void setEndingStation(String endingStation) {
//        this.endingStation = endingStation;
//    }
//
//    public int getAmountWagons() {
//        return amountWagons;
//    }
//
//    public void setAmountWagons(int amountWagons) {
//        this.amountWagons = amountWagons;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Train{" + "brand='" + getBrand() + '\'' +
//                ", model='" + getModel() + '\'' +
//                ", productionYear=" + getProductionYear() +
//                ", productionCountry='" + getProductionCountry() + '\'' +
//                ", color='" + getColor() + '\'' +
//                ", maxSpeed=" + getMaxSpeed() +
//                "price=" + price +
//                ", travelTime='" + travelTime + '\'' +
//                ", departureStationName='" + departureStationName + '\'' +
//                ", endingStation='" + endingStation + '\'' +
//                ", amountWagons=" + amountWagons +
//                '}';
//    }
//
//