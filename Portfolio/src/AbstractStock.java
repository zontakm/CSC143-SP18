/**
 * Abstract class to hold number o shares or Stock and Stock Dividend
 */
public abstract class  AbstractStock extends NonCashAsset {
    private int numOfShares; //must be whole

    /**
     * constructs Abstract Stock
     * @param symbol - stock symbol
     * @param numOfShares  - number of shares
     * @param purchasePrice - total purchase price of asset
     * @param pricePerShare - current price per share
     */
    public AbstractStock(String symbol,int numOfShares, double purchasePrice, double pricePerShare) {
        super(symbol, purchasePrice, pricePerShare);
        this.numOfShares = numOfShares;
    }
    /**
     * returns the number of shares per asset
     * @return number of shares
     */
    public double getNumOfShares(){
        return (double)numOfShares;
    }
}
