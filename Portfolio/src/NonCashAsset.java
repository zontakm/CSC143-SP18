/**
 * Abstract class to contain:
 * purchasePrice
 * pricePerShare
 * symbol
 */
public abstract class NonCashAsset implements ProfitableAsset {
    private double purchasePrice;
    private double pricePerShare;
    private String symbol;

    /**
     * constructs Stock
     * @param symbol - stock symbol
     * @param purchasePrice - total purchase price of asset
     * @param pricePerShare - current price per share
     */
    public NonCashAsset (String symbol, double purchasePrice, double pricePerShare ){
        this.purchasePrice = purchasePrice;
        this.pricePerShare = pricePerShare;
        this.symbol = symbol;
    }

    @Override
    public double currentMarketValue() {
        return getNumOfShares()*getPricePerShare() ;
    }

    @Override
    public double getProfit(){
        return  currentMarketValue() - purchasePrice;
    }
    /**
     * getter pricePerShare
     * @return value of share
     */

    public double getPricePerShare(){
        return pricePerShare;
    }

    /**
     * abstract getter  or numOfShares
     * @return number of shares
     */
    abstract public double getNumOfShares();
}
