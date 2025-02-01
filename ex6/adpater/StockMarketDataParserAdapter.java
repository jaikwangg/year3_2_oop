public class StockMarketDataParserAdapter implements CSVParser{
    private StockMarketDataParser stockMarketDataParser;

    public StockMarketDataParserAdapter() {
        this.stockMarketDataParser = new StockMarketDataParser();
    }

    @Override
    public void parseCSV() {
        stockMarketDataParser.parseFromCSV();
    }
}
