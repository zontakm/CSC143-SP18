
/**
 * Write a description of class TestObserverPattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestObserverPattern
{
    public static final double INI_INT_RATE = 12.5;
    public static final double UPT_INT_RATE = 3.5;
    public static void main(String [] args){

        InternetMedia onlineMediaToRemove = new InternetMedia("www.0");
        Loan initialLoan = new Loan("Personal Loan", INI_INT_RATE);
        LoanUpdate personalLoan = new LoanUpdate(initialLoan);

        initialLoan.changeInterest(UPT_INT_RATE);


        //List interface works well even if we try to remove a non existing object, however the list should be instantiated
        personalLoan.registerObserver(onlineMediaToRemove);
        //Let's register some observers
        personalLoan.removeObserver(onlineMediaToRemove);
        for(int i = 1; i < 5; i++) {
            personalLoan.registerObserver(new InternetMedia("www." + i));
        }
        //Remove "www.0"
        personalLoan.removeObserver(onlineMediaToRemove);
        //Update Interest Rate
        personalLoan.updateLoan(initialLoan.changeInterest(UPT_INT_RATE));
    }
}
