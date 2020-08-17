package com.myproject.utility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class BidKey implements Serializable {
	private static final long serialVersionUID = -7328459284173833543L;
	public final static String FLD_SOURCE_SYS_CD="SOURCE_SYS_CD";
	private String sourceSysCd;
	public final static String FLD_BID_ID="BID_ID";
	private String bidId;
	public final static String FLD_BATCH_ID="BATCH_ID";
	private int batchId;
	
	public String getSourceSysCd() {
		return sourceSysCd;
	}
	public void setSourceSysCd(String sourceSysCd) {
		this.sourceSysCd = sourceSysCd;
	}
	public String getBidId() {
		return bidId;
	}
	public void setBidId(String bidId) {
		this.bidId = bidId;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	
	@Override
	public String toString() {
		return "BidKey [sourceSysCd=" + sourceSysCd + ", bidId=" + bidId
				+ ", batchId=" + batchId + "]";
	}
}
