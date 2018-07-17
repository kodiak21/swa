package model.resource;

import java.math.BigDecimal;

public interface Resource {
	
	public BigDecimal getPrice();
	public void setPrice(BigDecimal resourcePrice);
	public void getSelectedResourceGer(Resource resource, int childSeats);
	public void getSelectedResourceEng(Resource resource, int childSeats);
	public String toString(Resource resource);
}
