import java.util.Objects;

/**
 * Write a description of class Internet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InternetMedia implements LoanObserver {
    String webName;

    public InternetMedia(String webName){
        this.webName = webName;
    }

    @Override
    public void update(Loan loan) {
              System.out.println(this + " Updated Interest Rate of Loan  " + loan);
    }

    /**
     * getter for website Name
     * @return webName value
     */
    public String getWebName() {
        return webName;
    }


    @Override
    public String toString() {
        return "You are on " + webName + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InternetMedia that = (InternetMedia) o;
        return Objects.equals(webName, that.webName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(webName);
    }
}
