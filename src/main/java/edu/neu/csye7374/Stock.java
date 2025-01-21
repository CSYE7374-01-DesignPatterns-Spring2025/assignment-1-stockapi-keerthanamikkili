package edu.neu.csye7374;

public class Stock implements Tradable {
	   
	    private String ID;
	    private String description;
	    protected double price;
	    private int metric;
	    
		public Stock(String iD, double price, String description) {
			ID = iD;
			this.price = price;
			this.description = description;
			this.metric = 0;
		}

		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			this.ID = iD;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			 if(this.price > price) {
		            setMetric(this.metric - 10);
		        }
			 else {
		            setMetric(this.metric + 10);
		        }
		        this.price = price;
		}
		
		@Override
		public void setBid(String bid) {
		        setPrice(Double.parseDouble(bid));
		    }

		@Override
		public int getMetric() {
			return this.metric;
		}

		public void setMetric(int metric) {
			this.metric = metric;
		}

		@Override
		public String toString() {
			 return "Stock{" +
		                "ID='" + ID + '\'' +
		                ", price=" + price +
		                ", description='" + description + '\'' +
		                ", metric=" + metric +
		                '}';
		}
	    
	    
}
