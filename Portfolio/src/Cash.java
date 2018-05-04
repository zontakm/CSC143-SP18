/**
 * Models Cash
 */
public class Cash implements Asset {
    private double cash;
    /**
     * constructs Stock
     * @param money - cash amount
     */
    public Cash(double money) {
        cash = money;
    }

    @Override
    public double currentMarketValue(){
        return cash;
    }
}
