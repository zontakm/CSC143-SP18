public interface ProfitableAsset extends Asset {
    /**
     * To get current profit of a non-cash asset
     * @return profit of a non-cash asset
     */
    double getProfit();
}
