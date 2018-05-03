import java.util.Objects;

/**
 * represents an immutable loan
 */
public class Loan {
    private String type;
    private double interest;

    /**
     * constructor
     * @param type of the loan
     * @param interest rate
     */
    public Loan(String type, double interest) {
        this.type = type;
        this.interest = interest;
    }

    /**
     * getter for interest
     * @return interest rate value
     */
    public double getInterest() {
        return interest;
    }

    /**
     * creates a new loan of the same type with new interest rate
     * @param newInterest
     * @return new loan with changed interest rate
     */
    public Loan changeInterest(double newInterest){
        return new Loan(type,newInterest);
    }

    @Override
    public String toString() {
        return type + ":" + interest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return Double.compare(loan.interest, interest) == 0 &&
                Objects.equals(type, loan.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, interest);
    }
}
