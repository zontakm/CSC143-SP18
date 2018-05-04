/**
 * Models Dividend Stock in a Portfolio
 */
public class DividendStock extends AbstractStock {
    private double dividend; //amount of dividend paid per share out of share price
    /**
     * constructs DividendStock
     * @param symbol - stock symbol
     * @param numOfShares  - number of shares
     * @param purchasePrice - total purchase price of asset
     * @param pricePerShare - current price per share
     * @param dividend - dividend
     */
    public DividendStock(String symbol, int numOfShares, double purchasePrice, double pricePerShare, double dividend) {
        super(symbol,numOfShares,purchasePrice, pricePerShare);
        this.dividend = dividend;
    }

    /**
     * getter for dividend
     * @return paid dividend
     */
    public double getDividend() {
        return dividend;
    }

    /**
     * helper to calculate current dividend
     * @return total dividend
     */
    private double calcDividendTotal(){
        return dividend * getPricePerShare()* getNumOfShares();
    }

    @Override
    public double currentMarketValue(){
        return  super.currentMarketValue() + calcDividendTotal();
    }
}
