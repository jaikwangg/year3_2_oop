public class App {

	public static void main(String[] args) {
		
		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();
		CSVParser stockMarket = new StockMarketDataParserAdapter();
			
		parse(realEstate);
		parse(machineLearning);
		parse(stockMarket);
	}
	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}
