/**
 * CommercialDriver
 * This is an extension of the Driver class that adds an additional surcharge
 * to any insurance rate hike.
 */
public class CommercialDriver extends Driver {

    private String company; // Name of company
    // commercial surcharge percentage in insurance rate increases
    private double surcharge;

    /**
     * Constructor that does not include surcharge percent. Set to 1.05 by default.
     * @param name - Name of driver
     * @param age - Age of driver
     * @param insuranceRate - Base insurance rate
     * @param company - Name of company driver works for
     */
        public CommercialDriver(String name, int age, int insuranceRate, String company) {
        super(name, age, insuranceRate);
        this.company = company;
        this.surcharge = 1.05;
    }

    /* Consructor with parameter for surcharge percent */
    /**
     * Constructor including parameter for surcharge percent.
     * @param name - Name of driver
     * @param age  - Age of driver
     * @param insuranceRate - Base insurance rate
     * @param company - Name of company driver works for
     * @param surchargePercent - Percentage increase in insurance surcharges
     */
    public CommercialDriver(String name, int age, int insuranceRate, String company, double surchargePercent) {
        super(name, age, insuranceRate);
        this.company = company;
        this.surcharge = surchargePercent;
    }

    @Override
    public String toString() {
        return super.toString() + ", company=" + this.company;
    }

    @Override
    public void setInsuranceRate(int baseRate) {
        super.setInsuranceRate((int)(baseRate*this.surcharge));
    }
    
}
