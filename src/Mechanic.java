import com.sun.jdi.connect.Transport;

public class Mechanic {

    private final String fullName;
    private final String company;
    private final boolean fixesBus;
    private final boolean fixesCar;
    private final boolean fixesTruck;
    private final boolean fixesAll;

    public Mechanic(String fullName, String company, boolean fixesBus, boolean fixesCar, boolean fixesTruck, boolean fixesAll) {
        this.fullName = fullName;
        this.company = company;
        this.fixesBus = fixesBus;
        this.fixesCar = fixesCar;
        this.fixesTruck = fixesTruck;
        this.fixesAll = fixesAll;
    }

    public void service (Transport transport) {

    }

    public void fixTransport (Transport transport) {

    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean isFixesBus() {
        return fixesBus;
    }

    public boolean isFixesCar() {
        return fixesCar;
    }

    public boolean isFixesTruck() {
        return fixesTruck;
    }

    public boolean isFixesAll() {
        return fixesAll;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\'' +
                ", fixesBus=" + fixesBus +
                ", fixesCar=" + fixesCar +
                ", fixesTruck=" + fixesTruck +
                ", fixesAll=" + fixesAll +
                '}';
    }
}
