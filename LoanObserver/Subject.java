
/**
 * Write a description of interface Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject
{
    /**
     * add observer to a list of observers
     * @param observer to add
     */
    void registerObserver(LoanObserver observer);

    /**
     * remove observe from a list of observers
     * @param observer to remove
     */
    void removeObserver(LoanObserver observer);

    /**
     * notify observer if a model was changed
     */
    void notifyObservers();

}
