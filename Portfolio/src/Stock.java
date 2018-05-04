/**
 * Models Stock in a Portfolio
 */
public class Stock extends AbstractStock {
    /**
     * constructs Stock
     * @param symbol - stock symbol
     * @param numOfShares  - number of shares
     * @param purchasePrice - total purchase price of asset
     * @param pricePerShare - current price per share
     */
    public Stock(String symbol, int numOfShares, double purchasePrice, double pricePerShare) {
        super(symbol, numOfShares, purchasePrice, pricePerShare);
    }

}
