import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoanUpdate implements Subject {

    private Loan loan;
    private List<LoanObserver> observers;

    public LoanUpdate(Loan loan){
        this.loan = loan;
        observers = new ArrayList<>();
    }

    /**
     * getter for loan
     * @return loan value
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * sets newInterestRate for a loan
     * @param newLoan
     */
    public void updateLoan(Loan newLoan) {
        this.loan = newLoan;
        notifyObservers();
    }


    @Override
    public void registerObserver(LoanObserver observer) {
        observers.add(observer);
        observer.update(loan);
    }


    @Override
    public void notifyObservers() {
        for (LoanObserver obs: observers) {
            obs.update(loan);
        }
    }

    @Override
    public void removeObserver(LoanObserver observer) {
        observers.remove(observer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanUpdate that = (LoanUpdate) o;
        return Objects.equals(loan, that.loan) &&
                Objects.equals(observers, that.observers);
    }

    @Override
    public int hashCode() {

        return Objects.hash(loan, observers);
    }


    @Override
    public String toString() {
        return "LoanUpdate{" +
                "loan=" + loan +
                ", observers=" + observers +
                '}';
    }
}
