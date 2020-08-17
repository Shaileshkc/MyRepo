package com.myproject.utility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class BidItemAccessor extends BidKey implements Serializable {
	private static final long serialVersionUID = 1928285041773892755L;
	
	public BidItemAccessor() { super(); }
	
	public BidItemAccessor(String bidId, String sourceSystem){
		super();
		this.setBidId(bidId);
		this.setSourceSysCd(sourceSystem);
	}
	public BidItemAccessor(String bidId, String sourceSystem, int batchId){
		super();
		this.setBidId(bidId);
		this.setSourceSysCd(sourceSystem);
		this.setBatchId(batchId);
	}
	
	public String getSourceSystem() {
		return this.getSourceSysCd();
	}
	public void setSourceSystem(String sourceSystem) {
		this.setSourceSysCd(sourceSystem);
	}

	@Override
	public String toString() {
		return "BidItemAccessor [Super()=" + super.toString() + "]";
	}
}
