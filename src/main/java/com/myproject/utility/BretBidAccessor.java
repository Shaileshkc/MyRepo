package com.myproject.utility;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class BretBidAccessor extends BidItemAccessor implements Serializable {
	private static final long serialVersionUID = 5438797733113527705L;

	private Timestamp myTaskTs;
	private Timestamp createdTs;
	//Story 1047098 fix
	private Timestamp origCreatedTs;
	private String custCtryName;
	private String region;
	private BigDecimal priceToBp;
	private BigDecimal priceToCust;
	private BigDecimal listPrice;
	private String brand;
	private String bidGeoCd; //Story 1091702
	private String tier1Name;
	private String tier1Ceid;
	private String tier2Name;
	private String tier2Ceid;
	private String t1SevLvl; //Story 1184774
	private String t2SevLvl; //Story 1184774
	private String t3SevLvl; //Story 1195470
	private String t4SevLvl; //Story 1195470
	private String bidMgr; //Story 1195534
	private String salesRepOO; //Story 1195534
	private String custName;
	private String sapQuoteNum;
	private String bretFocusFlag;
	private String riskFactorBpcOpsFlag;
	private String riskFactorCompositeFlag;
	private String riskFactorDiscMargFlag;
	private String riskFactorQuestionsFlag;
	private String bretStatus;
	private String reviewer;
	private Timestamp reviewedTs;
	private String subregion;
	private Timestamp completeTs;
	private String bidFactorList;
	private String bidType;
	private String cpsNumber;
	private Timestamp readyForReviewTs;
	private Timestamp releasedTs;
	private String t1BpcConfidentOutlier;
	private String t1BpcRouteOutlier;
	private String t1BpcOverbillOutlier;
	private String t1BpcInvestigationOutlier;
	private String t2BpcConfidentOutlier;
	private String t2BpcRouteOutlier;
	private String t2BpcOverbillOutlier;
	private String t2BpcInvestigationOutlier;
	private BigDecimal bidMargin;
	private BigDecimal bidWAMargin;
	private String maxMargOutlier;
	private BigDecimal bidDiscount;
	private String maxDiscOutlier;
	private int maxOtherScore;
	private Integer totalBidScore;
	private String confidentialityOutlier;
	private String routeToMarketOutlier;
	private String nonCompetitiveBidOutlier;
	private String offShorePmtTermsOutlier;
	private String bundledSolutionOutlier;
	private String contingencyFeeOutlier;
	private String compExpl;
	private String chnlOvrrdReasCode; //Story 1197661
	private String chnlOvrrdReasCodeDescr; //Story 1197661
	private String custCmrNum;
	private Timestamp bidExpiryDate;
	private String opptyNum; //Story 1195674
	private BigDecimal bidDiscountTotal;
	private String totMargOutlier;
	private String totDiscOutlier;
	private BigDecimal bidMarginTotal;
	private int t2BpcOverbillScore;
	private int t2BpcRouteScore;
	private BigDecimal bpAvgBidSize;
	private int bpBidSizeHighcut;
	private String bpBidSizeOutlier;
	private int bpBidSizeScore;
	private BigDecimal bpCcRevGoePpy;
	private int bpCcRevGoePpyHighcut;
	private BigDecimal bpCcRevGoePpyPct;
	private int bpCcRevGoePpyScore;
	private BigDecimal bpCtryRevT1Ppy;
	private int bpCtryRevT1PpyPct;
	private BigDecimal bpCustWinRate;
	private int bpCustWinRateBpBids;
	private BigDecimal bpDwrNgoe;
	private int bpDwrNgoeScore;
	private String bpDwrNgoeOutlier;
	private int bpDwrNgoeHighcut;
	private BigDecimal bpDwrTot;
	private int bpDwrTotScore;
	private String bpDwrTotOutlier;
	private int bpDwrTotHighcut;
	private BigDecimal bpGoeGrowthPpyPppyPct;
	private BigDecimal bpGoeRevenuePct;
	private BigDecimal bpGoeRevenueTotal;
	private BigDecimal bpGoeWinRate;
	private int bpGoeWinRateBpBids;
	private int bpGoeWinRateHighcut;
	private int bpGoeWinScore;
	private int bpGrowthPpyDeltaScore;
	private BigDecimal bpGrowthPpyPppyPct;
	private String bpGrowthPpyPppyOutlier;
	private int bpGrowthPpyPppyHighcut;
	private int bpGrowthPyDeltaScore;
	private BigDecimal bpGrowthPyPpyPct;
	private String bpGrowthPyPpyOutlier;
	private int bpGrowthPyPpyHighcut;
	private int bpIntegrityTrainingScore;
	private String bpIntegrityTrainingOutlier;
	private BigDecimal bpMaxBidSize;
	private String bpNewCeidOutlier;
	private int bpNewCeidScore;
	private String bpNewGoeCust;
	private int bpNewGoeCustScore;
	private String bpProductivity;
	private String bpProductivityOutlier;
	private int bpProductivityScore;
	private int bpProductivitySellersNum;
	private BigDecimal bpTotalWinRate;
	private int bpTotalWinRateBpBids;
	private int bpTotalWinRateHighcut;
	private int bpTotalWinScore;
	private String bundledSolution;
	private int bundledSolutionScore;
	private String confidentiality;
	private int confidentialityScore;
	private String contingencyFee;
	private int contingencyFeeScore;
	private BigDecimal custCcRevT2Ppy;
	private int custCcRevT2PpyHighcut;
	private BigDecimal custCcRevT2PpyPct;
	private int custCcRevT2PpyScore;
	private BigDecimal discHighcutPct;
	private BigDecimal discHighcutTot;
	private BigDecimal discMedianPct;
	private BigDecimal discMedianTot;
	private BigDecimal margHighcutPct;
	private BigDecimal margHighcutTot;
	private BigDecimal margMedianPct;
	private BigDecimal margMedianTot;
	private int maxDiscScore;
	private int maxMargScore;
	private String maxOtherOutlier;
	private String nonCompetitiveBid;
	private int nonCompetitiveBidScore;
	private String offShorePmtTerms;
	private int offShorePmtTermsScore;
	private String routeToMarket;
	private int routeToMarketScore;
	private int t1BpcConfidentScore;
	private int t1BpcInvestigationScore;
	private int t1BpcOverbillScore;
	private int t1BpcRouteScore;
	private BigDecimal t1RevT2cPpy;
	private int t1RevT2cPpyHighcut;
	private BigDecimal t1RevT2cPpyPct;
	private int t1RevT2cPpyScore;
	private int t2BpcConfidentScore;
	private int t2BpcInvestigationScore;
	private String t3BpcConfidentOutlier;
	private int t3BpcConfidentScore;
	private String t3BpcInvestigationOutlier;
	private int t3BpcInvestigationScore;
	private String t3Name;
	private String t4BpcConfidentOutlier;
	private int t4BpcConfidentScore;
	private String t4BpcInvestigationOutlier;
	private int t4BpcInvestigationScore;
	private String t4Name;
	private String t5BpcConfidentOutlier;
	private int t5BpcConfidentScore;
	private String t5BpcInvestigationOutlier;
	private int t5BpcInvestigationScore;
	private String t5Name;
	private String bpNotAuthorized; //Story 1195470
	private String thirdPartyProductsOutlier;
	private String thirdPartyProducts; //Story 977709
	private int thirdPartyProductsScore;
	private String totalBidOutlier;
	private BigDecimal totalHighcutThreshold;
	private int totDiscScore;
	private int totMargScore;
	private String bretComplete;
	private String remediationFactors;
	private String administrator;
	private String cmrSysLocd;
	private String bidSize;
	private BigDecimal custBidDiscount;
	private BigDecimal discLowcutPct;
	private String bpGoeWinOutlier;
	private String bpTotalWinOutlier;
	private int bpGoeRevenueScore;
	private BigDecimal bpGoeGrowthPyPpyPct;
	private String t3Ceid;
	private String t4Ceid;
	private String t5Ceid;
	private int bpCustWinRateHighcut;
	private String bpCustWinRateOutlier;
	private int bpCustWinRateScore;
	private int bpGoeRevenueHighcut;
	private String bpGoeRevenueOutlier;
	private BigDecimal bpCtryRevT1PpyScore;
	private String bpCtryRevT1PpyOutlier;
	private int bpCtryRevT1PpyHighcut;
	private String bpCcRevGoePpyOutlier;
	private String custCcRevT2PpyOutlier;
	private String t1RevT2cPpyOutlier;
	private BigDecimal bpRevenueTotal;
	private String reviewerComments;
	private String readyForReviewBy;
	private String maxSfOutlier;
	private int maxSfScore;
	private float grossProfitPerc;
	
	
	//for story 110
	private BigDecimal bpmT1Fin;
	private BigDecimal bpmT1Serv;
	private BigDecimal bpmT1InsFreight;
	private BigDecimal bpmT1Profit;
	private BigDecimal bpmT2Fin;
	private BigDecimal bpmT2Serv;
	private BigDecimal bpmT2InsFreight;
	private BigDecimal bpmT2Profit;
	private BigDecimal bpmOther;
	private Timestamp bidDate;
	private String supporingFactorList;
	
	
	public String getSupporingFactorList() {
		return supporingFactorList;
	}
	public void setSupporingFactorList(String supporingFactorList) {
		this.supporingFactorList = supporingFactorList;
	}
	public Timestamp getBidDate() {
		return bidDate;
	}
	public void setBidDate(Timestamp bidDate) {
		this.bidDate = bidDate;
	}
	public BigDecimal getBpmT1Fin() {
		return bpmT1Fin;
	}
	public void setBpmT1Fin(BigDecimal bpmT1Fin) {
		this.bpmT1Fin = bpmT1Fin;
	}
	public BigDecimal getBpmT1Serv() {
		return bpmT1Serv;
	}
	public void setBpmT1Serv(BigDecimal bpmT1Serv) {
		this.bpmT1Serv = bpmT1Serv;
	}
	public BigDecimal getBpmT1InsFreight() {
		return bpmT1InsFreight;
	}
	public void setBpmT1InsFreight(BigDecimal bpmT1InsFreight) {
		this.bpmT1InsFreight = bpmT1InsFreight;
	}
	public BigDecimal getBpmT1Profit() {
		return bpmT1Profit;
	}
	public void setBpmT1Profit(BigDecimal bpmT1Profit) {
		this.bpmT1Profit = bpmT1Profit;
	}
	public BigDecimal getBpmT2Fin() {
		return bpmT2Fin;
	}
	public void setBpmT2Fin(BigDecimal bpmT2Fin) {
		this.bpmT2Fin = bpmT2Fin;
	}
	public BigDecimal getBpmT2Serv() {
		return bpmT2Serv;
	}
	public void setBpmT2Serv(BigDecimal bpmT2Serv) {
		this.bpmT2Serv = bpmT2Serv;
	}
	public BigDecimal getBpmT2InsFreight() {
		return bpmT2InsFreight;
	}
	public void setBpmT2InsFreight(BigDecimal bpmT2InsFreight) {
		this.bpmT2InsFreight = bpmT2InsFreight;
	}
	public BigDecimal getBpmT2Profit() {
		return bpmT2Profit;
	}
	public void setBpmT2Profit(BigDecimal bpmT2Profit) {
		this.bpmT2Profit = bpmT2Profit;
	}
	public BigDecimal getBpmOther() {
		return bpmOther;
	}
	public void setBpmOther(BigDecimal bpmOther) {
		this.bpmOther = bpmOther;
	}
	public Timestamp getMyTaskTs() {
		return myTaskTs;
	}
	public void setMyTaskTs(Timestamp myTaskTs) {
		this.myTaskTs = myTaskTs;
	}
	public Timestamp getCreatedTs() {
		return createdTs;
	}
	public void setOrigCreatedTs(Timestamp origCreatedTs) {
		this.origCreatedTs = origCreatedTs;
	}
	public Timestamp getOrigCreatedTs() {
		return origCreatedTs;
	}
	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}
	public String getCustCtryName() {
		return custCtryName;
	}
	public void setCustCtryName(String custCtryName) {
		this.custCtryName = custCtryName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public BigDecimal getPriceToBp() {
		return priceToBp;
	}
	public void setPriceToBp(BigDecimal priceToBp) {
		this.priceToBp = priceToBp;
	}
	public BigDecimal getPriceToCust() {
		return priceToCust;
	}
	public void setPriceToCust(BigDecimal priceToCust) {
		this.priceToCust = priceToCust;
	}
	public BigDecimal getListPrice() {
		return listPrice;
	}
	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getTier1Name() {
		return tier1Name;
	}
	public void setTier1Name(String tier1Name) {
		this.tier1Name = tier1Name;
	}
	public String getTier1Ceid() {
		return tier1Ceid;
	}
	public void setTier1Ceid(String tier1Ceid) {
		this.tier1Ceid = tier1Ceid;
	}
	public String getTier2Name() {
		return tier2Name;
	}
	public void setTier2Name(String tier2Name) {
		this.tier2Name = tier2Name;
	}
	public String getTier2Ceid() {
		return tier2Ceid;
	}
	public void setTier2Ceid(String tier2Ceid) {
		this.tier2Ceid = tier2Ceid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getSapQuoteNum() {
		return sapQuoteNum;
	}
	public void setSapQuoteNum(String sapQuoteNum) {
		this.sapQuoteNum = sapQuoteNum;
	}
	public String getBretFocusFlag() {
		return bretFocusFlag;
	}
	public void setBretFocusFlag(String bretFocusFlag) {
		this.bretFocusFlag = bretFocusFlag;
	}
	public String getRiskFactorBpcOpsFlag() {
		return riskFactorBpcOpsFlag;
	}
	public void setRiskFactorBpcOpsFlag(String riskFactorBpcOpsFlag) {
		this.riskFactorBpcOpsFlag = riskFactorBpcOpsFlag;
	}
	public String getRiskFactorCompositeFlag() {
		return riskFactorCompositeFlag;
	}
	public void setRiskFactorCompositeFlag(String riskFactorCompositeFlag) {
		this.riskFactorCompositeFlag = riskFactorCompositeFlag;
	}
	public String getRiskFactorDiscMargFlag() {
		return riskFactorDiscMargFlag;
	}
	public void setRiskFactorDiscMargFlag(String riskFactorDiscMargFlag) {
		this.riskFactorDiscMargFlag = riskFactorDiscMargFlag;
	}
	public String getRiskFactorQuestionsFlag() {
		return riskFactorQuestionsFlag;
	}
	public void setRiskFactorQuestionsFlag(String riskFactorQuestionsFlag) {
		this.riskFactorQuestionsFlag = riskFactorQuestionsFlag;
	}
	public String getBretStatus() {
		return bretStatus;
	}
	public void setBretStatus(String bretStatus) {
		this.bretStatus = bretStatus;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
	public Timestamp getReviewedTs() {
		return reviewedTs;
	}
	public void setReviewedTs(Timestamp reviewedTs) {
		this.reviewedTs = reviewedTs;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public Timestamp getCompleteTs() {
		return completeTs;
	}
	public void setCompleteTs(Timestamp completeTs) {
		this.completeTs = completeTs;
	}
	
	public String getBidFactorList() {
		return bidFactorList;
	}
	public void setBidFactorList(String bidFactorList) {
		this.bidFactorList = bidFactorList;
	}
	public String getBidType() {
		return bidType;
	}
	public void setBidType(String bidType) {
		this.bidType = bidType;
	}
	public String getCpsNumber() {
		return cpsNumber;
	}
	public void setCpsNumber(String cpsNumber) {
		this.cpsNumber = cpsNumber;
	}
	public Timestamp getReadyForReviewTs() {
		return readyForReviewTs;
	}
	public void setReadyForReviewTs(Timestamp readyForReviewTs) {
		this.readyForReviewTs = readyForReviewTs;
	}
	public Timestamp getReleasedTs() {
		return releasedTs;
	}
	public void setReleasedTs(Timestamp releasedTs) {
		this.releasedTs = releasedTs;
	}
	public String getT1BpcConfidentOutlier() {
		return t1BpcConfidentOutlier;
	}
	public void setT1BpcConfidentOutlier(String t1BpcConfidentOutlier) {
		this.t1BpcConfidentOutlier = t1BpcConfidentOutlier;
	}
	public String getT1BpcRouteOutlier() {
		return t1BpcRouteOutlier;
	}
	public void setT1BpcRouteOutlier(String t1BpcRouteOutlier) {
		this.t1BpcRouteOutlier = t1BpcRouteOutlier;
	}
	public String getT1BpcOverbillOutlier() {
		return t1BpcOverbillOutlier;
	}
	public void setT1BpcOverbillOutlier(String t1BpcOverbillOutlier) {
		this.t1BpcOverbillOutlier = t1BpcOverbillOutlier;
	}
	public String getT1BpcInvestigationOutlier() {
		return t1BpcInvestigationOutlier;
	}
	public void setT1BpcInvestigationOutlier(String t1BpcInvestigationOutlier) {
		this.t1BpcInvestigationOutlier = t1BpcInvestigationOutlier;
	}
	public String getT2BpcConfidentOutlier() {
		return t2BpcConfidentOutlier;
	}
	public void setT2BpcConfidentOutlier(String t2BpcConfidentOutlier) {
		this.t2BpcConfidentOutlier = t2BpcConfidentOutlier;
	}
	public String getT2BpcRouteOutlier() {
		return t2BpcRouteOutlier;
	}
	public void setT2BpcRouteOutlier(String t2BpcRouteOutlier) {
		this.t2BpcRouteOutlier = t2BpcRouteOutlier;
	}
	public String getT2BpcOverbillOutlier() {
		return t2BpcOverbillOutlier;
	}
	public void setT2BpcOverbillOutlier(String t2BpcOverbillOutlier) {
		this.t2BpcOverbillOutlier = t2BpcOverbillOutlier;
	}
	public String getT2BpcInvestigationOutlier() {
		return t2BpcInvestigationOutlier;
	}
	public void setT2BpcInvestigationOutlier(String t2BpcInvestigationOutlier) {
		this.t2BpcInvestigationOutlier = t2BpcInvestigationOutlier;
	}
	public BigDecimal getBidMargin() {
		return bidMargin;
	}
	public void setBidMargin(BigDecimal bidMargin) {
		this.bidMargin = bidMargin;
	}
	public BigDecimal getBidWAMargin() {
		return bidWAMargin;
	}
	public void setBidWAMargin(BigDecimal bidWAMargin) {
		this.bidWAMargin = bidWAMargin;
	}
	
	public String getMaxMargOutlier() {
		return maxMargOutlier;
	}
	public void setMaxMargOutlier(String maxMargOutlier) {
		this.maxMargOutlier = maxMargOutlier;
	}
	public BigDecimal getBidDiscount() {
		return bidDiscount;
	}
	public void setBidDiscount(BigDecimal bidDiscount) {
		this.bidDiscount = bidDiscount;
	}
	public String getMaxDiscOutlier() {
		return maxDiscOutlier;
	}
	public void setMaxDiscOutlier(String maxDiscOutlier) {
		this.maxDiscOutlier = maxDiscOutlier;
	}
	public int getMaxOtherScore() {
		return maxOtherScore;
	}
	public void setMaxOtherScore(int maxOtherScore) {
		this.maxOtherScore = maxOtherScore;
	}
	public Integer getTotalBidScore() {
		return totalBidScore;
	}
	public void setTotalBidScore(Integer totalBidScore) {
		this.totalBidScore = totalBidScore;
	}
	public String getConfidentialityOutlier() {
		return confidentialityOutlier;
	}
	public void setConfidentialityOutlier(String confidentialityOutlier) {
		this.confidentialityOutlier = confidentialityOutlier;
	}
	public String getRouteToMarketOutlier() {
		return routeToMarketOutlier;
	}
	public void setRouteToMarketOutlier(String routeToMarketOutlier) {
		this.routeToMarketOutlier = routeToMarketOutlier;
	}
	public String getNonCompetitiveBidOutlier() {
		return nonCompetitiveBidOutlier;
	}
	public void setNonCompetitiveBidOutlier(String nonCompetitiveBidOutlier) {
		this.nonCompetitiveBidOutlier = nonCompetitiveBidOutlier;
	}
	public String getOffShorePmtTermsOutlier() {
		return offShorePmtTermsOutlier;
	}
	public void setOffShorePmtTermsOutlier(String offShorePmtTermsOutlier) {
		this.offShorePmtTermsOutlier = offShorePmtTermsOutlier;
	}
	public String getBundledSolutionOutlier() {
		return bundledSolutionOutlier;
	}
	public void setBundledSolutionOutlier(String bundledSolutionOutlier) {
		this.bundledSolutionOutlier = bundledSolutionOutlier;
	}
	public String getContingencyFeeOutlier() {
		return contingencyFeeOutlier;
	}
	public void setContingencyFeeOutlier(String contingencyFeeOutlier) {
		this.contingencyFeeOutlier = contingencyFeeOutlier;
	}
	public String getCompExpl() {
		return compExpl;
	}
	public void setCompExpl(String compExpl) {
		this.compExpl = compExpl;
	}
	public String getCustCmrNum() {
		return custCmrNum;
	}
	public void setCustCmrNum(String custCmrNum) {
		this.custCmrNum = custCmrNum;
	}
	public Timestamp getBidExpiryDate() {
		return bidExpiryDate;
	}
	public void setBidExpiryDate(Timestamp bidExpiryDate) {
		this.bidExpiryDate = bidExpiryDate;
	}
	
	public BigDecimal getBidDiscountTotal() {
		return bidDiscountTotal;
	}
	public void setBidDiscountTotal(BigDecimal bidDiscountTotal) {
		this.bidDiscountTotal = bidDiscountTotal;
	}
	public String getTotMargOutlier() {
		return totMargOutlier;
	}
	public void setTotMargOutlier(String totMargOutlier) {
		this.totMargOutlier = totMargOutlier;
	}
	public String getTotDiscOutlier() {
		return totDiscOutlier;
	}
	public void setTotDiscOutlier(String totDiscOutlier) {
		this.totDiscOutlier = totDiscOutlier;
	}
	public BigDecimal getBidMarginTotal() {
		return bidMarginTotal;
	}
	public void setBidMarginTotal(BigDecimal bidMarginTotal) {
		this.bidMarginTotal = bidMarginTotal;
	}
	public int getT2BpcOverbillScore() {
		return t2BpcOverbillScore;
	}
	public void setT2BpcOverbillScore(int t2BpcOverbillScore) {
		this.t2BpcOverbillScore = t2BpcOverbillScore;
	}
	public int getT2BpcRouteScore() {
		return t2BpcRouteScore;
	}
	public void setT2BpcRouteScore(int t2BpcRouteScore) {
		this.t2BpcRouteScore = t2BpcRouteScore;
	}
	public BigDecimal getBpAvgBidSize() {
		return bpAvgBidSize;
	}
	public void setBpAvgBidSize(BigDecimal bpAvgBidSize) {
		this.bpAvgBidSize = bpAvgBidSize;
	}
	public int getBpBidSizeHighcut() {
		return bpBidSizeHighcut;
	}
	public void setBpBidSizeHighcut(int bpBidSizeHighcut) {
		this.bpBidSizeHighcut = bpBidSizeHighcut;
	}
	public String getBpBidSizeOutlier() {
		return bpBidSizeOutlier;
	}
	public void setBpBidSizeOutlier(String bpBidSizeOutlier) {
		this.bpBidSizeOutlier = bpBidSizeOutlier;
	}
	public int getBpBidSizeScore() {
		return bpBidSizeScore;
	}
	public void setBpBidSizeScore(int bpBidSizeScore) {
		this.bpBidSizeScore = bpBidSizeScore;
	}
	public BigDecimal getBpCcRevGoePpy() {
		return bpCcRevGoePpy;
	}
	public void setBpCcRevGoePpy(BigDecimal bpCcRevGoePpy) {
		this.bpCcRevGoePpy = bpCcRevGoePpy;
	}
	public int getBpCcRevGoePpyHighcut() {
		return bpCcRevGoePpyHighcut;
	}
	public void setBpCcRevGoePpyHighcut(int bpCcRevGoePpyHighcut) {
		this.bpCcRevGoePpyHighcut = bpCcRevGoePpyHighcut;
	}
	public BigDecimal getBpCcRevGoePpyPct() {
		return bpCcRevGoePpyPct;
	}
	public void setBpCcRevGoePpyPct(BigDecimal bpCcRevGoePpyPct) {
		this.bpCcRevGoePpyPct = bpCcRevGoePpyPct;
	}
	public int getBpCcRevGoePpyScore() {
		return bpCcRevGoePpyScore;
	}
	public void setBpCcRevGoePpyScore(int bpCcRevGoePpyScore) {
		this.bpCcRevGoePpyScore = bpCcRevGoePpyScore;
	}
	public BigDecimal getBpCtryRevT1Ppy() {
		return bpCtryRevT1Ppy;
	}
	public void setBpCtryRevT1Ppy(BigDecimal bpCtryRevT1Ppy) {
		this.bpCtryRevT1Ppy = bpCtryRevT1Ppy;
	}
	public int getBpCtryRevT1PpyPct() {
		return bpCtryRevT1PpyPct;
	}
	public void setBpCtryRevT1PpyPct(int bpCtryRevT1PpyPct) {
		this.bpCtryRevT1PpyPct = bpCtryRevT1PpyPct;
	}
	public BigDecimal getBpCustWinRate() {
		return bpCustWinRate;
	}
	public void setBpCustWinRate(BigDecimal bpCustWinRate) {
		this.bpCustWinRate = bpCustWinRate;
	}
	public int getBpCustWinRateBpBids() {
		return bpCustWinRateBpBids;
	}
	public void setBpCustWinRateBpBids(int bpCustWinRateBpBids) {
		this.bpCustWinRateBpBids = bpCustWinRateBpBids;
	}
	public BigDecimal getBpDwrNgoe() {
		return bpDwrNgoe;
	}
	public void setBpDwrNgoe(BigDecimal bpDwrNgoe) {
		this.bpDwrNgoe = bpDwrNgoe;
	}
	public int getBpDwrNgoeScore() {
		return bpDwrNgoeScore;
	}
	public void setBpDwrNgoeScore(int bpDwrNgoeScore) {
		this.bpDwrNgoeScore = bpDwrNgoeScore;
	}
	public String getBpDwrNgoeOutlier() {
		return bpDwrNgoeOutlier;
	}
	public void setBpDwrNgoeOutlier(String bpDwrNgoeOutlier) {
		this.bpDwrNgoeOutlier = bpDwrNgoeOutlier;
	}
	public int getBpDwrNgoeHighcut() {
		return bpDwrNgoeHighcut;
	}
	public void setBpDwrNgoeHighcut(int bpDwrNgoeHighcut) {
		this.bpDwrNgoeHighcut = bpDwrNgoeHighcut;
	}
	public BigDecimal getBpDwrTot() {
		return bpDwrTot;
	}
	public void setBpDwrTot(BigDecimal bpDwrTot) {
		this.bpDwrTot = bpDwrTot;
	}
	public int getBpDwrTotScore() {
		return bpDwrTotScore;
	}
	public void setBpDwrTotScore(int bpDwrTotScore) {
		this.bpDwrTotScore = bpDwrTotScore;
	}
	public String getBpDwrTotOutlier() {
		return bpDwrTotOutlier;
	}
	public void setBpDwrTotOutlier(String bpDwrTotOutlier) {
		this.bpDwrTotOutlier = bpDwrTotOutlier;
	}
	public int getBpDwrTotHighcut() {
		return bpDwrTotHighcut;
	}
	public void setBpDwrTotHighcut(int bpDwrTotHighcut) {
		this.bpDwrTotHighcut = bpDwrTotHighcut;
	}
	public BigDecimal getBpGoeGrowthPpyPppyPct() {
		return bpGoeGrowthPpyPppyPct;
	}
	public void setBpGoeGrowthPpyPppyPct(BigDecimal bpGoeGrowthPpyPppyPct) {
		this.bpGoeGrowthPpyPppyPct = bpGoeGrowthPpyPppyPct;
	}
	public BigDecimal getBpGoeRevenuePct() {
		return bpGoeRevenuePct;
	}
	public void setBpGoeRevenuePct(BigDecimal bpGoeRevenuePct) {
		this.bpGoeRevenuePct = bpGoeRevenuePct;
	}
	public BigDecimal getBpGoeRevenueTotal() {
		return bpGoeRevenueTotal;
	}
	public void setBpGoeRevenueTotal(BigDecimal bpGoeRevenueTotal) {
		this.bpGoeRevenueTotal = bpGoeRevenueTotal;
	}
	public BigDecimal getBpGoeWinRate() {
		return bpGoeWinRate;
	}
	public void setBpGoeWinRate(BigDecimal bpGoeWinRate) {
		this.bpGoeWinRate = bpGoeWinRate;
	}
	public int getBpGoeWinRateBpBids() {
		return bpGoeWinRateBpBids;
	}
	public void setBpGoeWinRateBpBids(int bpGoeWinRateBpBids) {
		this.bpGoeWinRateBpBids = bpGoeWinRateBpBids;
	}
	public int getBpGoeWinRateHighcut() {
		return bpGoeWinRateHighcut;
	}
	public void setBpGoeWinRateHighcut(int bpGoeWinRateHighcut) {
		this.bpGoeWinRateHighcut = bpGoeWinRateHighcut;
	}
	public int getBpGoeWinScore() {
		return bpGoeWinScore;
	}
	public void setBpGoeWinScore(int bpGoeWinScore) {
		this.bpGoeWinScore = bpGoeWinScore;
	}
	public int getBpGrowthPpyDeltaScore() {
		return bpGrowthPpyDeltaScore;
	}
	public void setBpGrowthPpyDeltaScore(int bpGrowthPpyDeltaScore) {
		this.bpGrowthPpyDeltaScore = bpGrowthPpyDeltaScore;
	}
	public BigDecimal getBpGrowthPpyPppyPct() {
		return bpGrowthPpyPppyPct;
	}
	public void setBpGrowthPpyPppyPct(BigDecimal bpGrowthPpyPppyPct) {
		this.bpGrowthPpyPppyPct = bpGrowthPpyPppyPct;
	}
	public String getBpGrowthPpyPppyOutlier() {
		return bpGrowthPpyPppyOutlier;
	}
	public void setBpGrowthPpyPppyOutlier(String bpGrowthPpyPppyOutlier) {
		this.bpGrowthPpyPppyOutlier = bpGrowthPpyPppyOutlier;
	}
	public int getBpGrowthPpyPppyHighcut() {
		return bpGrowthPpyPppyHighcut;
	}
	public void setBpGrowthPpyPppyHighcut(int bpGrowthPpyPppyHighcut) {
		this.bpGrowthPpyPppyHighcut = bpGrowthPpyPppyHighcut;
	}
	public int getBpGrowthPyDeltaScore() {
		return bpGrowthPyDeltaScore;
	}
	public void setBpGrowthPyDeltaScore(int bpGrowthPyDeltaScore) {
		this.bpGrowthPyDeltaScore = bpGrowthPyDeltaScore;
	}
	public BigDecimal getBpGrowthPyPpyPct() {
		return bpGrowthPyPpyPct;
	}
	public void setBpGrowthPyPpyPct(BigDecimal bpGrowthPyPpyPct) {
		this.bpGrowthPyPpyPct = bpGrowthPyPpyPct;
	}
	public String getBpGrowthPyPpyOutlier() {
		return bpGrowthPyPpyOutlier;
	}
	public void setBpGrowthPyPpyOutlier(String bpGrowthPyPpyOutlier) {
		this.bpGrowthPyPpyOutlier = bpGrowthPyPpyOutlier;
	}
	public int getBpGrowthPyPpyHighcut() {
		return bpGrowthPyPpyHighcut;
	}
	public void setBpGrowthPyPpyHighcut(int bpGrowthPyPpyHighcut) {
		this.bpGrowthPyPpyHighcut = bpGrowthPyPpyHighcut;
	}
	public int getBpIntegrityTrainingScore() {
		return bpIntegrityTrainingScore;
	}
	public void setBpIntegrityTrainingScore(int bpIntegrityTrainingScore) {
		this.bpIntegrityTrainingScore = bpIntegrityTrainingScore;
	}
	public String getBpIntegrityTrainingOutlier() {
		return bpIntegrityTrainingOutlier;
	}
	public void setBpIntegrityTrainingOutlier(String bpIntegrityTrainingOutlier) {
		this.bpIntegrityTrainingOutlier = bpIntegrityTrainingOutlier;
	}
	public BigDecimal getBpMaxBidSize() {
		return bpMaxBidSize;
	}
	public void setBpMaxBidSize(BigDecimal bpMaxBidSize) {
		this.bpMaxBidSize = bpMaxBidSize;
	}
	public String getBpNewCeidOutlier() {
		return bpNewCeidOutlier;
	}
	public void setBpNewCeidOutlier(String bpNewCeidOutlier) {
		this.bpNewCeidOutlier = bpNewCeidOutlier;
	}
	public int getBpNewCeidScore() {
		return bpNewCeidScore;
	}
	public void setBpNewCeidScore(int bpNewCeidScore) {
		this.bpNewCeidScore = bpNewCeidScore;
	}
	public String getBpNewGoeCust() {
		return bpNewGoeCust;
	}
	public void setBpNewGoeCust(String bpNewGoeCust) {
		this.bpNewGoeCust = bpNewGoeCust;
	}
	public int getBpNewGoeCustScore() {
		return bpNewGoeCustScore;
	}
	public void setBpNewGoeCustScore(int bpNewGoeCustScore) {
		this.bpNewGoeCustScore = bpNewGoeCustScore;
	}
	public String getBpProductivity() {
		return bpProductivity;
	}
	public void setBpProductivity(String bpProductivity) {
		this.bpProductivity = bpProductivity;
	}
	public String getBpProductivityOutlier() {
		return bpProductivityOutlier;
	}
	public void setBpProductivityOutlier(String bpProductivityOutlier) {
		this.bpProductivityOutlier = bpProductivityOutlier;
	}
	public int getBpProductivityScore() {
		return bpProductivityScore;
	}
	public void setBpProductivityScore(int bpProductivityScore) {
		this.bpProductivityScore = bpProductivityScore;
	}
	public int getBpProductivitySellersNum() {
		return bpProductivitySellersNum;
	}
	public void setBpProductivitySellersNum(int bpProductivitySellersNum) {
		this.bpProductivitySellersNum = bpProductivitySellersNum;
	}
	public BigDecimal getBpTotalWinRate() {
		return bpTotalWinRate;
	}
	public void setBpTotalWinRate(BigDecimal bpTotalWinRate) {
		this.bpTotalWinRate = bpTotalWinRate;
	}
	public int getBpTotalWinRateBpBids() {
		return bpTotalWinRateBpBids;
	}
	public void setBpTotalWinRateBpBids(int bpTotalWinRateBpBids) {
		this.bpTotalWinRateBpBids = bpTotalWinRateBpBids;
	}
	public int getBpTotalWinRateHighcut() {
		return bpTotalWinRateHighcut;
	}
	public void setBpTotalWinRateHighcut(int bpTotalWinRateHighcut) {
		this.bpTotalWinRateHighcut = bpTotalWinRateHighcut;
	}
	public int getBpTotalWinScore() {
		return bpTotalWinScore;
	}
	public void setBpTotalWinScore(int bpTotalWinScore) {
		this.bpTotalWinScore = bpTotalWinScore;
	}
	public String getBundledSolution() {
		return bundledSolution;
	}
	public void setBundledSolution(String bundledSolution) {
		this.bundledSolution = bundledSolution;
	}
	public int getBundledSolutionScore() {
		return bundledSolutionScore;
	}
	public void setBundledSolutionScore(int bundledSolutionScore) {
		this.bundledSolutionScore = bundledSolutionScore;
	}
	public String getConfidentiality() {
		return confidentiality;
	}
	public void setConfidentiality(String confidentiality) {
		this.confidentiality = confidentiality;
	}
	public int getConfidentialityScore() {
		return confidentialityScore;
	}
	public void setConfidentialityScore(int confidentialityScore) {
		this.confidentialityScore = confidentialityScore;
	}
	public String getContingencyFee() {
		return contingencyFee;
	}
	public void setContingencyFee(String contingencyFee) {
		this.contingencyFee = contingencyFee;
	}
	public int getContingencyFeeScore() {
		return contingencyFeeScore;
	}
	public void setContingencyFeeScore(int contingencyFeeScore) {
		this.contingencyFeeScore = contingencyFeeScore;
	}
	public BigDecimal getCustCcRevT2Ppy() {
		return custCcRevT2Ppy;
	}
	public void setCustCcRevT2Ppy(BigDecimal custCcRevT2Ppy) {
		this.custCcRevT2Ppy = custCcRevT2Ppy;
	}
	public int getCustCcRevT2PpyHighcut() {
		return custCcRevT2PpyHighcut;
	}
	public void setCustCcRevT2PpyHighcut(int custCcRevT2PpyHighcut) {
		this.custCcRevT2PpyHighcut = custCcRevT2PpyHighcut;
	}
	public BigDecimal getCustCcRevT2PpyPct() {
		return custCcRevT2PpyPct;
	}
	public void setCustCcRevT2PpyPct(BigDecimal custCcRevT2PpyPct) {
		this.custCcRevT2PpyPct = custCcRevT2PpyPct;
	}
	public int getCustCcRevT2PpyScore() {
		return custCcRevT2PpyScore;
	}
	public void setCustCcRevT2PpyScore(int custCcRevT2PpyScore) {
		this.custCcRevT2PpyScore = custCcRevT2PpyScore;
	}
	public BigDecimal getDiscHighcutPct() {
		return discHighcutPct;
	}
	public void setDiscHighcutPct(BigDecimal discHighcutPct) {
		this.discHighcutPct = discHighcutPct;
	}
	public BigDecimal getDiscHighcutTot() {
		return discHighcutTot;
	}
	public void setDiscHighcutTot(BigDecimal discHighcutTot) {
		this.discHighcutTot = discHighcutTot;
	}
	public BigDecimal getDiscMedianPct() {
		return discMedianPct;
	}
	public void setDiscMedianPct(BigDecimal discMedianPct) {
		this.discMedianPct = discMedianPct;
	}
	public BigDecimal getDiscMedianTot() {
		return discMedianTot;
	}
	public void setDiscMedianTot(BigDecimal discMedianTot) {
		this.discMedianTot = discMedianTot;
	}
	public BigDecimal getMargHighcutPct() {
		return margHighcutPct;
	}
	public void setMargHighcutPct(BigDecimal margHighcutPct) {
		this.margHighcutPct = margHighcutPct;
	}
	public BigDecimal getMargHighcutTot() {
		return margHighcutTot;
	}
	public void setMargHighcutTot(BigDecimal margHighcutTot) {
		this.margHighcutTot = margHighcutTot;
	}
	public BigDecimal getMargMedianPct() {
		return margMedianPct;
	}
	public void setMargMedianPct(BigDecimal margMedianPct) {
		this.margMedianPct = margMedianPct;
	}
	public BigDecimal getMargMedianTot() {
		return margMedianTot;
	}
	public void setMargMedianTot(BigDecimal margMedianTot) {
		this.margMedianTot = margMedianTot;
	}
	public int getMaxDiscScore() {
		return maxDiscScore;
	}
	public void setMaxDiscScore(int maxDiscScore) {
		this.maxDiscScore = maxDiscScore;
	}
	public int getMaxMargScore() {
		return maxMargScore;
	}
	public void setMaxMargScore(int maxMargScore) {
		this.maxMargScore = maxMargScore;
	}
	public String getMaxOtherOutlier() {
		return maxOtherOutlier;
	}
	public void setMaxOtherOutlier(String maxOtherOutlier) {
		this.maxOtherOutlier = maxOtherOutlier;
	}
	public String getNonCompetitiveBid() {
		return nonCompetitiveBid;
	}
	public void setNonCompetitiveBid(String nonCompetitiveBid) {
		this.nonCompetitiveBid = nonCompetitiveBid;
	}
	public int getNonCompetitiveBidScore() {
		return nonCompetitiveBidScore;
	}
	public void setNonCompetitiveBidScore(int nonCompetitiveBidScore) {
		this.nonCompetitiveBidScore = nonCompetitiveBidScore;
	}
	public String getOffShorePmtTerms() {
		return offShorePmtTerms;
	}
	public void setOffShorePmtTerms(String offShorePmtTerms) {
		this.offShorePmtTerms = offShorePmtTerms;
	}
	public int getOffShorePmtTermsScore() {
		return offShorePmtTermsScore;
	}
	public void setOffShorePmtTermsScore(int offShorePmtTermsScore) {
		this.offShorePmtTermsScore = offShorePmtTermsScore;
	}
	public String getRouteToMarket() {
		return routeToMarket;
	}
	public void setRouteToMarket(String routeToMarket) {
		this.routeToMarket = routeToMarket;
	}
	public int getRouteToMarketScore() {
		return routeToMarketScore;
	}
	public void setRouteToMarketScore(int routeToMarketScore) {
		this.routeToMarketScore = routeToMarketScore;
	}
	public int getT1BpcConfidentScore() {
		return t1BpcConfidentScore;
	}
	public void setT1BpcConfidentScore(int t1BpcConfidentScore) {
		this.t1BpcConfidentScore = t1BpcConfidentScore;
	}
	public int getT1BpcInvestigationScore() {
		return t1BpcInvestigationScore;
	}
	public void setT1BpcInvestigationScore(int t1BpcInvestigationScore) {
		this.t1BpcInvestigationScore = t1BpcInvestigationScore;
	}
	public int getT1BpcOverbillScore() {
		return t1BpcOverbillScore;
	}
	public void setT1BpcOverbillScore(int t1BpcOverbillScore) {
		this.t1BpcOverbillScore = t1BpcOverbillScore;
	}
	public int getT1BpcRouteScore() {
		return t1BpcRouteScore;
	}
	public void setT1BpcRouteScore(int t1BpcRouteScore) {
		this.t1BpcRouteScore = t1BpcRouteScore;
	}
	public BigDecimal getT1RevT2cPpy() {
		return t1RevT2cPpy;
	}
	public void setT1RevT2cPpy(BigDecimal t1RevT2cPpy) {
		this.t1RevT2cPpy = t1RevT2cPpy;
	}
	public int getT1RevT2cPpyHighcut() {
		return t1RevT2cPpyHighcut;
	}
	public void setT1RevT2cPpyHighcut(int t1RevT2cPpyHighcut) {
		this.t1RevT2cPpyHighcut = t1RevT2cPpyHighcut;
	}
	public BigDecimal getT1RevT2cPpyPct() {
		return t1RevT2cPpyPct;
	}
	public void setT1RevT2cPpyPct(BigDecimal t1RevT2cPpyPct) {
		this.t1RevT2cPpyPct = t1RevT2cPpyPct;
	}
	public int getT1RevT2cPpyScore() {
		return t1RevT2cPpyScore;
	}
	public void setT1RevT2cPpyScore(int t1RevT2cPpyScore) {
		this.t1RevT2cPpyScore = t1RevT2cPpyScore;
	}
	public int getT2BpcConfidentScore() {
		return t2BpcConfidentScore;
	}
	public void setT2BpcConfidentScore(int t2BpcConfidentScore) {
		this.t2BpcConfidentScore = t2BpcConfidentScore;
	}
	public int getT2BpcInvestigationScore() {
		return t2BpcInvestigationScore;
	}
	public void setT2BpcInvestigationScore(int t2BpcInvestigationScore) {
		this.t2BpcInvestigationScore = t2BpcInvestigationScore;
	}
	public String getT3BpcConfidentOutlier() {
		return t3BpcConfidentOutlier;
	}
	public void setT3BpcConfidentOutlier(String t3BpcConfidentOutlier) {
		this.t3BpcConfidentOutlier = t3BpcConfidentOutlier;
	}
	public int getT3BpcConfidentScore() {
		return t3BpcConfidentScore;
	}
	public void setT3BpcConfidentScore(int t3BpcConfidentScore) {
		this.t3BpcConfidentScore = t3BpcConfidentScore;
	}
	public String getT3BpcInvestigationOutlier() {
		return t3BpcInvestigationOutlier;
	}
	public void setT3BpcInvestigationOutlier(String t3BpcInvestigationOutlier) {
		this.t3BpcInvestigationOutlier = t3BpcInvestigationOutlier;
	}
	public int getT3BpcInvestigationScore() {
		return t3BpcInvestigationScore;
	}
	public void setT3BpcInvestigationScore(int t3BpcInvestigationScore) {
		this.t3BpcInvestigationScore = t3BpcInvestigationScore;
	}
	public String getT3Name() {
		return t3Name;
	}
	public void setT3Name(String t3Name) {
		this.t3Name = t3Name;
	}
	public String getT4BpcConfidentOutlier() {
		return t4BpcConfidentOutlier;
	}
	public void setT4BpcConfidentOutlier(String t4BpcConfidentOutlier) {
		this.t4BpcConfidentOutlier = t4BpcConfidentOutlier;
	}
	public int getT4BpcConfidentScore() {
		return t4BpcConfidentScore;
	}
	public void setT4BpcConfidentScore(int t4BpcConfidentScore) {
		this.t4BpcConfidentScore = t4BpcConfidentScore;
	}
	public String getT4BpcInvestigationOutlier() {
		return t4BpcInvestigationOutlier;
	}
	public void setT4BpcInvestigationOutlier(String t4BpcInvestigationOutlier) {
		this.t4BpcInvestigationOutlier = t4BpcInvestigationOutlier;
	}
	public int getT4BpcInvestigationScore() {
		return t4BpcInvestigationScore;
	}
	public void setT4BpcInvestigationScore(int t4BpcInvestigationScore) {
		this.t4BpcInvestigationScore = t4BpcInvestigationScore;
	}
	public String getT4Name() {
		return t4Name;
	}
	public void setT4Name(String t4Name) {
		this.t4Name = t4Name;
	}
	public String getT5BpcConfidentOutlier() {
		return t5BpcConfidentOutlier;
	}
	public void setT5BpcConfidentOutlier(String t5BpcConfidentOutlier) {
		this.t5BpcConfidentOutlier = t5BpcConfidentOutlier;
	}
	public int getT5BpcConfidentScore() {
		return t5BpcConfidentScore;
	}
	public void setT5BpcConfidentScore(int t5BpcConfidentScore) {
		this.t5BpcConfidentScore = t5BpcConfidentScore;
	}
	public String getT5BpcInvestigationOutlier() {
		return t5BpcInvestigationOutlier;
	}
	public void setT5BpcInvestigationOutlier(String t5BpcInvestigationOutlier) {
		this.t5BpcInvestigationOutlier = t5BpcInvestigationOutlier;
	}
	public int getT5BpcInvestigationScore() {
		return t5BpcInvestigationScore;
	}
	public void setT5BpcInvestigationScore(int t5BpcInvestigationScore) {
		this.t5BpcInvestigationScore = t5BpcInvestigationScore;
	}
	public String getT5Name() {
		return t5Name;
	}
	public void setT5Name(String t5Name) {
		this.t5Name = t5Name;
	}
	public String getThirdPartyProductsOutlier() {
		return thirdPartyProductsOutlier;
	}
	public void setThirdPartyProductsOutlier(String thirdPartyProductsOutlier) {
		this.thirdPartyProductsOutlier = thirdPartyProductsOutlier;
	}
	public String getThirdPartyProducts() {
		return thirdPartyProducts;
	}
	public void setThirdPartyProducts(String thirdPartyProducts) {
		this.thirdPartyProducts = thirdPartyProducts;
	}
	public int getThirdPartyProductsScore() {
		return thirdPartyProductsScore;
	}
	public void setThirdPartyProductsScore(int thirdPartyProductsScore) {
		this.thirdPartyProductsScore = thirdPartyProductsScore;
	}
	public String getTotalBidOutlier() {
		return totalBidOutlier;
	}
	public void setTotalBidOutlier(String totalBidOutlier) {
		this.totalBidOutlier = totalBidOutlier;
	}
	public BigDecimal getTotalHighcutThreshold() {
		return totalHighcutThreshold;
	}
	public void setTotalHighcutThreshold(BigDecimal totalHighcutThreshold) {
		this.totalHighcutThreshold = totalHighcutThreshold;
	}
	public int getTotDiscScore() {
		return totDiscScore;
	}
	public void setTotDiscScore(int totDiscScore) {
		this.totDiscScore = totDiscScore;
	}
	public int getTotMargScore() {
		return totMargScore;
	}
	public void setTotMargScore(int totMargScore) {
		this.totMargScore = totMargScore;
	}
	public String getBretComplete() {
		return bretComplete;
	}
	public void setBretComplete(String bretComplete) {
		this.bretComplete = bretComplete;
	}
	public String getRemediationFactors() {
		return remediationFactors;
	}
	public void setRemediationFactors(String remediationFactors) {
		this.remediationFactors = remediationFactors;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	public String getCmrSysLocd() {
		return cmrSysLocd;
	}
	public void setCmrSysLocd(String cmrSysLocd) {
		this.cmrSysLocd = cmrSysLocd;
	}
	public String getBidSize() {
		return bidSize;
	}
	public void setBidSize(String bidSize) {
		this.bidSize = bidSize;
	}
	public BigDecimal getCustBidDiscount() {
		return custBidDiscount;
	}
	public void setCustBidDiscount(BigDecimal custBidDiscount) {
		this.custBidDiscount = custBidDiscount;
	}
	public BigDecimal getDiscLowcutPct() {
		return discLowcutPct;
	}
	public void setDiscLowcutPct(BigDecimal discLowcutPct) {
		this.discLowcutPct = discLowcutPct;
	}
	public String getBpGoeWinOutlier() {
		return bpGoeWinOutlier;
	}
	public void setBpGoeWinOutlier(String bpGoeWinOutlier) {
		this.bpGoeWinOutlier = bpGoeWinOutlier;
	}
	public String getBpTotalWinOutlier() {
		return bpTotalWinOutlier;
	}
	public void setBpTotalWinOutlier(String bpTotalWinOutlier) {
		this.bpTotalWinOutlier = bpTotalWinOutlier;
	}
	public int getBpGoeRevenueScore() {
		return bpGoeRevenueScore;
	}
	public void setBpGoeRevenueScore(int bpGoeRevenueScore) {
		this.bpGoeRevenueScore = bpGoeRevenueScore;
	}
	public BigDecimal getBpGoeGrowthPyPpyPct() {
		return bpGoeGrowthPyPpyPct;
	}
	public void setBpGoeGrowthPyPpyPct(BigDecimal bpGoeGrowthPyPpyPct) {
		this.bpGoeGrowthPyPpyPct = bpGoeGrowthPyPpyPct;
	}
	public String getT3Ceid() {
		return t3Ceid;
	}
	public void setT3Ceid(String t3Ceid) {
		this.t3Ceid = t3Ceid;
	}
	public String getT4Ceid() {
		return t4Ceid;
	}
	public void setT4Ceid(String t4Ceid) {
		this.t4Ceid = t4Ceid;
	}
	public String getT5Ceid() {
		return t5Ceid;
	}
	public void setT5Ceid(String t5Ceid) {
		this.t5Ceid = t5Ceid;
	}
	public int getBpCustWinRateHighcut() {
		return bpCustWinRateHighcut;
	}
	public void setBpCustWinRateHighcut(int bpCustWinRateHighcut) {
		this.bpCustWinRateHighcut = bpCustWinRateHighcut;
	}
	public String getBpCustWinRateOutlier() {
		return bpCustWinRateOutlier;
	}
	public void setBpCustWinRateOutlier(String bpCustWinRateOutlier) {
		this.bpCustWinRateOutlier = bpCustWinRateOutlier;
	}
	public int getBpCustWinRateScore() {
		return bpCustWinRateScore;
	}
	public void setBpCustWinRateScore(int bpCustWinRateScore) {
		this.bpCustWinRateScore = bpCustWinRateScore;
	}
	public int getBpGoeRevenueHighcut() {
		return bpGoeRevenueHighcut;
	}
	public void setBpGoeRevenueHighcut(int bpGoeRevenueHighcut) {
		this.bpGoeRevenueHighcut = bpGoeRevenueHighcut;
	}
	public String getBpGoeRevenueOutlier() {
		return bpGoeRevenueOutlier;
	}
	public void setBpGoeRevenueOutlier(String bpGoeRevenueOutlier) {
		this.bpGoeRevenueOutlier = bpGoeRevenueOutlier;
	}
	public BigDecimal getBpCtryRevT1PpyScore() {
		return bpCtryRevT1PpyScore;
	}
	public void setBpCtryRevT1PpyScore(BigDecimal bpCtryRevT1PpyScore) {
		this.bpCtryRevT1PpyScore = bpCtryRevT1PpyScore;
	}
	public String getBpCtryRevT1PpyOutlier() {
		return bpCtryRevT1PpyOutlier;
	}
	public void setBpCtryRevT1PpyOutlier(String bpCtryRevT1PpyOutlier) {
		this.bpCtryRevT1PpyOutlier = bpCtryRevT1PpyOutlier;
	}
	public int getBpCtryRevT1PpyHighcut() {
		return bpCtryRevT1PpyHighcut;
	}
	public void setBpCtryRevT1PpyHighcut(int bpCtryRevT1PpyHighcut) {
		this.bpCtryRevT1PpyHighcut = bpCtryRevT1PpyHighcut;
	}
	public String getBpCcRevGoePpyOutlier() {
		return bpCcRevGoePpyOutlier;
	}
	public void setBpCcRevGoePpyOutlier(String bpCcRevGoePpyOutlier) {
		this.bpCcRevGoePpyOutlier = bpCcRevGoePpyOutlier;
	}
	public String getCustCcRevT2PpyOutlier() {
		return custCcRevT2PpyOutlier;
	}
	public void setCustCcRevT2PpyOutlier(String custCcRevT2PpyOutlier) {
		this.custCcRevT2PpyOutlier = custCcRevT2PpyOutlier;
	}
	public String getT1RevT2cPpyOutlier() {
		return t1RevT2cPpyOutlier;
	}
	public void setT1RevT2cPpyOutlier(String t1RevT2cPpyOutlier) {
		this.t1RevT2cPpyOutlier = t1RevT2cPpyOutlier;
	}
	public BigDecimal getBpRevenueTotal() {
		return bpRevenueTotal;
	}
	public void setBpRevenueTotal(BigDecimal bpRevenueTotal) {
		this.bpRevenueTotal = bpRevenueTotal;
	}
	public String getReviewerComments() {
		return reviewerComments;
	}
	public void setReviewerComments(String reviewerComments) {
		this.reviewerComments = reviewerComments;
	}
	public String getReadyForReviewBy() {
		return readyForReviewBy;
	}
	public void setReadyForReviewBy(String readyForReviewBy) {
		this.readyForReviewBy = readyForReviewBy;
	}
	public String getMaxSfOutlier() {
		return maxSfOutlier;
	}
	public void setMaxSfOutlier(String maxSfOutlier) {
		this.maxSfOutlier = maxSfOutlier;
	}
	public int getMaxSfScore() {
		return maxSfScore;
	}
	public void setMaxSfScore(int maxSfScore) {
		this.maxSfScore = maxSfScore;
	}
	public String getBidGeoCd() {
		return bidGeoCd;
	}
	public void setBidGeoCd(String bidGeoCd) {
		this.bidGeoCd = bidGeoCd;
	}
	public String getChnlOvrrdReasCode() {
		return chnlOvrrdReasCode;
	}
	public void setChnlOvrrdReasCode(String chnlOvrrdReasCode) {
		this.chnlOvrrdReasCode = chnlOvrrdReasCode;
	}
	public String getChnlOvrrdReasCodeDescr() {
		return chnlOvrrdReasCodeDescr;
	}
	public void setChnlOvrrdReasCodeDescr(String chnlOvrrdReasCodeDescr) {
		this.chnlOvrrdReasCodeDescr = chnlOvrrdReasCodeDescr;
	}
	public String getT1SevLvl() {
		return t1SevLvl;
	}
	public void setT1SevLvl(String t1SevLvl) {
		this.t1SevLvl = t1SevLvl;
	}
	public String getT2SevLvl() {
		return t2SevLvl;
	}
	public void setT2SevLvl(String t2SevLvl) {
		this.t2SevLvl = t2SevLvl;
	}
	public String getBidMgr() {
		return bidMgr;
	}
	public void setBidMgr(String bidMgr) {
		this.bidMgr = bidMgr;
	}
	public String getSalesRepOO() {
		return salesRepOO;
	}
	public void setSalesRepOO(String salesRepOO) {
		this.salesRepOO = salesRepOO;
	}
	public String getOpptyNum() {
		return opptyNum;
	}
	public void setOpptyNum(String opptyNum) {
		this.opptyNum = opptyNum;
	}
	public String getBpNotAuthorized() {
		return bpNotAuthorized;
	}
	public void setBpNotAuthorized(String bpNotAuthorized) {
		this.bpNotAuthorized = bpNotAuthorized;
	}
	public String getT3SevLvl() {
		return t3SevLvl;
	}
	public void setT3SevLvl(String t3SevLvl) {
		this.t3SevLvl = t3SevLvl;
	}
	public String getT4SevLvl() {
		return t4SevLvl;
	}
	public void setT4SevLvl(String t4SevLvl) {
		this.t4SevLvl = t4SevLvl;
	}
	public float getGrossProfitPerc() {
		return grossProfitPerc;
	}
	public void setGrossProfitPerc(float grossProfitPerc) {
		this.grossProfitPerc = grossProfitPerc;
	}
}
