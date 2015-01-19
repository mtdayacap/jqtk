package mtd.quant.toolkit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.collections.MapUtils;

public class StockQuotes {
	private String symbol;

	private TreeMap<Date, Quote> quotes;

	public StockQuotes() {
	}

	public StockQuotes(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

	public Quote getQuoteByDay(Date date) {
		return quotes.get(date);
	}

	public void add(Date date, Quote quote) {
		if(MapUtils.isEmpty(quotes)){
			quotes = new TreeMap<Date, Quote>();
		}
		quotes.put(date, quote);
	}

	public Map<Date, Quote> getQuotes() {
		return quotes;
	}

	public List<Date> getDates() {
		return new ArrayList<Date>(quotes.keySet());
	}

	public Quote getQuoteFromPreviousDay(Date date) {
		Entry<Date, Quote> entry = quotes.lowerEntry(date);
		if (entry != null) {
			return entry.getValue();
		}
		return null;
	}

}
