
/**
 * Write a description of interface Observer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface LoanObserver {
       /**
        * allows to update Loan observers with information from Loan
        * @param observable  - Loan
        */
       void update(Loan observable);
}
