/**
 * Models Mutual Fund  in a Portfolio
 */
public class MutualFund extends NonCashAsset {

    private double numOfShares;
    /**
     * constructs MutualFund
     * @param symbol - stock symbol
     * @param numOfShares  - number of shares (can hold PARTAL share!!!
     * @param purchasePrice - total purchase price of asset
     * @param pricePerShare - current price per share
     */
    public MutualFund(String symbol,int numOfShares, double purchasePrice, double pricePerShare) {
        super(symbol, purchasePrice, pricePerShare);
        this.numOfShares = numOfShares;
    }
    /**
     * returns the number of shares per asset
     * @return number of shares
     */
    public double getNumOfShares(){
        return numOfShares;
    }

}
