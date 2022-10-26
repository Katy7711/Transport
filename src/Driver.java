public abstract class Driver <T extends Transport> {
    private final String fullName;
    private final String category;
    private final int experience;
    private final T car;

    public Driver(String fullName, String category, int experience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.experience = experience;
        this.car = car;
    }

    public void go () {
        System.out.printf("Водитель %s завел автомобиль", this.getFullName());
        this.car.go();
    }
    public void stop () {
        System.out.printf("Водитель %s остановил автомобиль", this.getFullName());
        this.car.stop();
    }
    public void refill () {
        System.out.printf("Водитель %s заправил %s %s ", this.getFullName(), this.car.getBrand(), this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getExperience() {
        return experience;
    }


    @Override
    public String toString() {
       return String.format("водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
               getFullName(),
               this.car.getBrand(),
               this.car.getModel());

    }
}
