package mtd.quant.toolkit.entity;

import java.math.BigDecimal;

public class Quote {

	public static final String DATE_PATTERN = "yyyy-MM-dd";
	
	public static final String DATE_HEADER = "Date";
	
	public static final String OPEN_HEADER = "Open";
	
	public static final String HIGH_HEADER = "High";
	
	public static final String LOW_HEADER = "Low";
	
	public static final String VOLUME_HEADER = "Volume";
	
	public static final String ADJ_CLOSE_HEADER = "Adj Close";
	
	public static final String CLOSE_HEADER = "Close";
	
	private BigDecimal open;

	private BigDecimal close;

	private BigDecimal high;

	private BigDecimal low;

	public Quote(String open, String high, String low, String close) throws NumberFormatException {
			this.open = new BigDecimal(open);
			this.high = new BigDecimal(high);
			this.low = new BigDecimal(low);
			this.close = new BigDecimal(close);
	}

	public BigDecimal getClose() {
		return close;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public BigDecimal getLow() {
		return low;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

}
