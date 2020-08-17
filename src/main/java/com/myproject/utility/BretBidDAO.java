package com.myproject.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

public class BretBidDAO {
	
	public BretBidAccessor getBidDetail(String bidId, DataSource dataSource) {
		BretBidAccessor rec = null;
		
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(BidDetailView.FLD_BID_ID).append(", ");
		sb.append(BidDetailView.FLD_SOURCE_SYS_CD).append(", ");
		sb.append(BidDetailView.FLD_BATCH_ID).append(", ");
		sb.append(BidDetailView.FLD_BRET_COMPLETE).append(", ");
		sb.append(BidDetailView.FLD_BRET_FOCUS_FLAG).append(", ");
		sb.append(BidDetailView.FLD_BRET_STATUS).append(", ");
		sb.append(BidDetailView.FLD_RECORD_CREATE_TS).append(", ");
		sb.append(BidDetailView.FLD_BID_DATE).append(", ");
		sb.append(BidDetailView.FLD_ADMINISTRATOR).append(", ");
		sb.append(BidDetailView.FLD_COMPLETE_TS).append(", ");
		sb.append(BidDetailView.FLD_READY_FOR_REVIEW_BY).append(", ");
		sb.append(BidDetailView.FLD_READY_FOR_REVIEW_TS).append(", ");
		sb.append(BidDetailView.FLD_BID_DISCOUNT).append(", ");
		sb.append(BidDetailView.FLD_BID_DISCOUNT_TOT).append(", ");
		sb.append(BidDetailView.FLD_BID_EXPIRY_DATE).append(", ");
		sb.append(BidDetailView.FLD_OPPTY_NUM).append(", ");
		sb.append(BidDetailView.FLD_BID_MANAGER).append(", ");
		sb.append(BidDetailView.FLD_OPERATION_OWNER).append(", ");
		sb.append(BidDetailView.FLD_BID_FACTOR_LIST).append(", ");
		sb.append(BidDetailView.FLD_BID_MARGIN).append(", ");
		sb.append(BidDetailView.FLD_BID_WA_MARGIN).append(", ");
		sb.append(BidDetailView.FLD_BID_MARGIN_TOT).append(", ");
		sb.append(BidDetailView.FLD_T2_BPC_OVERBILL_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T2_BPC_OVERBILL_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T2_BPC_ROUTE_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T2_BPC_ROUTE_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_AVG_BID_SIZE).append(", ");
		sb.append(BidDetailView.FLD_BP_BID_SIZE_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_BP_BID_SIZE_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BP_BID_SIZE_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_CC_REV_GOE_PPY).append(", ");
		sb.append(BidDetailView.FLD_BP_CC_REV_GOE_PPY_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_BP_CC_REV_GOE_PPY_PCT).append(", ");
		sb.append(BidDetailView.FLD_BP_CC_REV_GOE_PPY_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_CTRY_REV_T1_PPY).append(", ");
		sb.append(BidDetailView.FLD_BP_CTRY_REV_T1_PPY_PCT).append(", ");
		sb.append(BidDetailView.FLD_BP_CUST_WIN_RATE).append(", ");
		sb.append(BidDetailView.FLD_BP_CUST_WIN_RATE_BP_BIDS).append(", ");
		sb.append(BidDetailView.FLD_BP_DWR_NGOE).append(", ");
		sb.append(BidDetailView.FLD_BP_DWR_NGOE_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_BP_DWR_NGOE_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BP_DWR_NGOE_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_DWR_TOT).append(", ");
		sb.append(BidDetailView.FLD_BP_DWR_TOT_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_BP_DWR_TOT_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BP_DWR_TOT_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_GOE_GROWTH_PPY_PPPY_PCT).append(", ");
		sb.append(BidDetailView.FLD_BP_GOE_REVENUE_PCT).append(", ");
		sb.append(BidDetailView.FLD_BP_GOE_REVENUE_TOTAL).append(", ");
		sb.append(BidDetailView.FLD_BP_GOE_WIN_RATE).append(", ");
		sb.append(BidDetailView.FLD_BP_GOE_WIN_RATE_BP_BIDS).append(", ");
		sb.append(BidDetailView.FLD_BP_GOE_WIN_RATE_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_BP_GOE_WIN_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_GROWTH_PPY_DELTA_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_GROWTH_PPY_PPPY_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_BP_GROWTH_PPY_PPPY_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BP_GROWTH_PPY_PPPY_PCT).append(", ");
		sb.append(BidDetailView.FLD_BP_GROWTH_PY_DELTA_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_GROWTH_PY_PPY_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_BP_GROWTH_PY_PPY_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BP_GROWTH_PY_PPY_PCT).append(", ");
		sb.append(BidDetailView.FLD_BP_INTEGRITY_TRAINING_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BP_INTEGRITY_TRAINING_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_MAX_BID_SIZE).append(", ");
		sb.append(BidDetailView.FLD_BP_NEW_CEID_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BP_NEW_CEID_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_NEW_GOE_CUST).append(", ");
		sb.append(BidDetailView.FLD_BP_NEW_GOE_CUST_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_PRODUCTIVITY).append(", ");
		sb.append(BidDetailView.FLD_BP_PRODUCTIVITY_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BP_PRODUCTIVITY_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_PRODUCTIVITY_SELLERS_NUM).append(", ");
		sb.append(BidDetailView.FLD_BP_TOTAL_WIN_RATE).append(", ");
		sb.append(BidDetailView.FLD_BP_TOTAL_WIN_RATE_BP_BIDS).append(", ");
		sb.append(BidDetailView.FLD_BP_TOTAL_WIN_RATE_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_BP_TOTAL_WIN_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BRAND).append(", ");
		sb.append(BidDetailView.FLD_BID_GEO_CD).append(", ");
		sb.append(BidDetailView.FLD_BUNDLED_SOLUTION).append(", ");
		sb.append(BidDetailView.FLD_BUNDLED_SOLUTION_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_BUNDLED_SOLUTION_SCORE).append(", ");
		sb.append("DET.").append(BidDetailView.FLD_CMR_SYS_LOC_CD).append(", ");
		sb.append(BidDetailView.FLD_COMP_EXPL).append(", ");
		sb.append(BidDetailView.FLD_CHNL_OVRRD_REAS_CODE).append(", ");
		sb.append(BidDetailView.FLD_CHNL_OVRRD_REAS_CODE_DSCR).append(", ");
		sb.append(BidDetailView.FLD_CONFIDENTIALITY).append(", ");
		sb.append(BidDetailView.FLD_CONFIDENTIALITY_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_CONFIDENTIALITY_SCORE).append(", ");
		sb.append(BidDetailView.FLD_CONTINGENCY_FEE).append(", ");
		sb.append(BidDetailView.FLD_CONTINGENCY_FEE_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_CONTINGENCY_FEE_SCORE).append(", ");
		sb.append(BidDetailView.FLD_CUST_CC_REV_T2_PPY).append(", ");
		sb.append(BidDetailView.FLD_CUST_CC_REV_T2_PPY_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_CUST_CC_REV_T2_PPY_PCT).append(", ");
		sb.append(BidDetailView.FLD_CUST_CC_REV_T2_PPY_SCORE).append(", ");
		sb.append("DET.").append(BidDetailView.FLD_CUST_CMR_NUM).append(", ");
		sb.append(BidDetailView.FLD_CUST_CTRY_NAME).append(", ");
		sb.append(BidDetailView.FLD_CUST_NAME).append(", ");
		sb.append(BidDetailView.FLD_DISC_HIGHCUT_PCT).append(", ");
		sb.append(BidDetailView.FLD_DISC_HIGHCUT_TOT).append(", ");
		sb.append(BidDetailView.FLD_DISC_MEDIAN_PCT).append(", ");
		sb.append(BidDetailView.FLD_DISC_MEDIAN_TOT).append(", ");
		sb.append(BidDetailView.FLD_LIST_PRICE).append(", ");
		sb.append(BidDetailView.FLD_MARG_HIGHCUT_PCT).append(", ");
		sb.append(BidDetailView.FLD_MARG_HIGHCUT_TOT).append(", ");
		sb.append(BidDetailView.FLD_MARG_MEDIAN_PCT).append(", ");
		sb.append(BidDetailView.FLD_MARG_MEDIAN_TOT).append(", ");
		sb.append(BidDetailView.FLD_MAX_DISC_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_MAX_DISC_SCORE).append(", ");
		sb.append(BidDetailView.FLD_MAX_MARG_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_MAX_MARG_SCORE).append(", ");
		sb.append(BidDetailView.FLD_MAX_OTHER_SCORE).append(", ");
		sb.append(BidDetailView.FLD_MAX_SF_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_MAX_SF_SCORE).append(", ");
		sb.append(BidDetailView.FLD_NON_COMPETITIVE_BID).append(", ");
		sb.append(BidDetailView.FLD_NON_COMPETITIVE_BID_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_NON_COMPETITIVE_BID_SCORE).append(", ");
		sb.append(BidDetailView.FLD_OFF_SHORE_PMT_TERMS).append(", ");
		sb.append(BidDetailView.FLD_OFF_SHORE_PMT_TERMS_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_OFF_SHORE_PMT_TERMS_SCORE).append(", ");
		sb.append(BidDetailView.FLD_PRICE_TO_BP).append(", ");
		sb.append(BidDetailView.FLD_PRICE_TO_CUST).append(", ");
		sb.append(BidDetailView.FLD_REGION).append(", ");
		sb.append(BidDetailView.FLD_REVIEWER).append(", ");
		sb.append(BidDetailView.FLD_REVIEWER_COMMENTS).append(", ");
		sb.append(BidDetailView.FLD_RISK_FACTOR_BPCOPS_FLAG).append(", ");
		sb.append(BidDetailView.FLD_ROUTE_TO_MARKET).append(", ");
		sb.append(BidDetailView.FLD_ROUTE_TO_MARKET_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_ROUTE_TO_MARKET_SCORE).append(", ");
		sb.append(BidDetailView.FLD_SAP_QUOTE_NUM).append(", ");
		sb.append(BidDetailView.FLD_T1_BPC_CONFIDENT_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T1_BPC_CONFIDENT_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T1_BPC_INVESTIGATION_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T1_BPC_INVESTIGATION_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T1_BPC_OVERBILL_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T1_BPC_OVERBILL_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T1_BPC_ROUTE_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T1_BPC_ROUTE_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T1_REV_T2C_PPY).append(", ");
		sb.append(BidDetailView.FLD_T1_REV_T2C_PPY_HIGHCUT).append(", ");
		sb.append(BidDetailView.FLD_T1_REV_T2C_PPY_PCT).append(", ");
		sb.append(BidDetailView.FLD_T1_REV_T2C_PPY_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T2_BPC_CONFIDENT_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T2_BPC_CONFIDENT_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T2_BPC_INVESTIGATION_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T2_BPC_INVESTIGATION_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T3_BPC_CONFIDENT_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T3_BPC_CONFIDENT_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T3_BPC_INVESTIGATION_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T3_BPC_INVESTIGATION_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T3_NAME).append(", ");
		sb.append(BidDetailView.FLD_T3_CEID).append(", ");
		sb.append(BidDetailView.FLD_T4_BPC_CONFIDENT_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T4_BPC_CONFIDENT_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T4_BPC_INVESTIGATION_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T4_BPC_INVESTIGATION_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T4_NAME).append(", ");
		sb.append(BidDetailView.FLD_T4_CEID).append(", ");
		sb.append(BidDetailView.FLD_T5_BPC_CONFIDENT_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T5_BPC_CONFIDENT_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T5_BPC_INVESTIGATION_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_T5_BPC_INVESTIGATION_SCORE).append(", ");
		sb.append(BidDetailView.FLD_T5_NAME).append(", ");
		sb.append(BidDetailView.FLD_THIRD_PARTY_PRODUCTS).append(", ");
		sb.append(BidDetailView.FLD_THIRD_PARTY_PRODUCTS_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_THIRD_PARTY_PRODUCTS_SCORE).append(", ");
		sb.append(BidDetailView.FLD_TIER1_CEID).append(", ");
		sb.append(BidDetailView.FLD_TIER1_NAME).append(", ");
		sb.append(BidDetailView.FLD_TIER2_CEID).append(", ");
		sb.append(BidDetailView.FLD_TIER2_NAME).append(", ");
		sb.append(BidDetailView.FLD_T1_SEVERITY_LEVEL).append(", ");
		sb.append(BidDetailView.FLD_T2_SEVERITY_LEVEL).append(", ");
		sb.append(BidDetailView.FLD_T3_SEVERITY_LEVEL).append(", ");
		sb.append(BidDetailView.FLD_T4_SEVERITY_LEVEL).append(", ");
		sb.append(BidDetailView.FLD_TOT_DISC_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_TOT_DISC_SCORE).append(", ");
		sb.append(BidDetailView.FLD_TOT_MARG_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_TOT_MARG_SCORE).append(", ");
		sb.append(BidDetailView.FLD_TOTAL_BID_OUTLIER).append(", ");
		sb.append(BidDetailView.FLD_TOTAL_BID_SCORE).append(", ");
		sb.append(BidDetailView.FLD_BP_NOT_AUTHORIZED).append(", ");
		sb.append(BidDetailView.FLD_TOTAL_HIGHCUT_THRESHOLD).append(", ");
		sb.append(BidDetailView.FLD_GROSS_PROFIT_PERC).append(", ");
		sb.append(BidDetailView.CMR).append(".").append(BidDetailView.FLD_AUTH_GRP);
		sb.append(" FROM ").append(BidDetailView.TBL_NAME).append(" AS DET");
		sb.append(" LEFT JOIN ").append(BidDetailView.TBL_CMR_GOE_INFO).append(" AS CMR");
		sb.append(" ON");
		sb.append(" DET.").append(BidDetailView.FLD_CUST_CMR_NUM).append(" = ").append(BidDetailView.CMR_NUM);
		sb.append(" AND DET.").append(BidDetailView.FLD_CMR_SYS_LOC_CD).append(" = CMR.").append(BidDetailView.FLD_CMR_SYS_LOC_CD);
		sb.append(" WHERE ");
		sb.append(BidDetailView.FLD_BID_ID).append(" =?");
		/*sb.append(" AND ").append(BidDetailView.FLD_SOURCE_SYS_CD).append(" =?");
		sb.append(" AND ").append(BidDetailView.FLD_BATCH_ID).append(" =?");*/
		
		Connection conn = null;
		try {
			int idx = 0;
			conn = dataSource.getConnection();
    		PreparedStatement pstmt = conn.prepareStatement(sb.toString());
    		pstmt.setString(++idx, bidId);
    		
    		ResultSet rs = pstmt.executeQuery();
    		if (rs.next()) {
    			
	    			rec = new BretBidAccessor();
	    			rec.setReviewerComments(rs.getString(BidDetailView.FLD_REVIEWER_COMMENTS));
	    			// to suppress repeated comments if any from jobs (auto-processing) & to have distinct comments
		    		if (rec.getReviewerComments() != null  && !rec.getReviewerComments().isEmpty()) {
		    			String reviewerComments = rec.getReviewerComments().replaceAll("(<br/>)+", "<br/>");
		    			if (reviewerComments.indexOf("<br/>") == 0 && reviewerComments.length() > 5) {
		    				reviewerComments = reviewerComments.substring(5);
		    			}
		    			if (!reviewerComments.equals("<br/>")) {
				    		String comments[] = reviewerComments.split("<br/>");
				    		StringBuilder resultantComments = new StringBuilder("");
				    		for (String comment: comments) {
				    			if (!resultantComments.toString().contains(comment)) {
				    				resultantComments.append(comment).append("<br/>");
				    			}
				    		}
				    		if (resultantComments.lastIndexOf("<br/>") == resultantComments.length() - 5) {
				    			resultantComments.delete(resultantComments.lastIndexOf("<br/>"), resultantComments.length());
				    		}
				    		rec.setReviewerComments(resultantComments.toString());
		    			}
		    		}
	    			rec.setBidId(rs.getString(BidDetailView.FLD_BID_ID));
	    			rec.setSourceSystem(rs.getString(BidDetailView.FLD_SOURCE_SYS_CD));
	    			rec.setBatchId(rs.getInt(BidDetailView.FLD_BATCH_ID));
	    			rec.setBretComplete(rs.getString(BidDetailView.FLD_BRET_COMPLETE));
	    			rec.setBretFocusFlag(rs.getString(BidDetailView.FLD_BRET_FOCUS_FLAG));
	    			rec.setBretStatus(rs.getString(BidDetailView.FLD_BRET_STATUS));
	    			rec.setCreatedTs(rs.getTimestamp(BidDetailView.FLD_RECORD_CREATE_TS));
	    			rec.setOrigCreatedTs(rs.getTimestamp(BidDetailView.FLD_BID_DATE)); //Story 1205556
	    			rec.setAdministrator(rs.getString(BidDetailView.FLD_ADMINISTRATOR));
	    			rec.setCompleteTs(rs.getTimestamp(BidDetailView.FLD_COMPLETE_TS));
	    			rec.setReadyForReviewBy(rs.getString(BidDetailView.FLD_READY_FOR_REVIEW_BY));
	    			rec.setReadyForReviewTs(rs.getTimestamp(BidDetailView.FLD_READY_FOR_REVIEW_TS));
	    			rec.setBidDiscount(rs.getBigDecimal(BidDetailView.FLD_BID_DISCOUNT));
	    			rec.setBidDiscountTotal(rs.getBigDecimal(BidDetailView.FLD_BID_DISCOUNT_TOT));
	    			rec.setBidExpiryDate(rs.getTimestamp(BidDetailView.FLD_BID_EXPIRY_DATE));
	    			rec.setOpptyNum(rs.getString(BidDetailView.FLD_OPPTY_NUM)); //Story 1195674
	    			rec.setBidMgr(rs.getString(BidDetailView.FLD_BID_MANAGER)); //Story 1195534
	    			rec.setSalesRepOO(rs.getString(BidDetailView.FLD_OPERATION_OWNER)); //Story 1195534
	    			rec.setBidFactorList(rs.getString(BidDetailView.FLD_BID_FACTOR_LIST));
	    			rec.setBidMargin(rs.getBigDecimal(BidDetailView.FLD_BID_MARGIN));
	    			rec.setBidWAMargin(rs.getBigDecimal(BidDetailView.FLD_BID_WA_MARGIN));
	    			rec.setBidMarginTotal(rs.getBigDecimal(BidDetailView.FLD_BID_MARGIN_TOT));
	    			rec.setT2BpcOverbillOutlier(rs.getString(BidDetailView.FLD_T2_BPC_OVERBILL_OUTLIER));
	    			rec.setT2BpcOverbillScore(rs.getInt(BidDetailView.FLD_T2_BPC_OVERBILL_SCORE));
	    			rec.setT2BpcRouteOutlier(rs.getString(BidDetailView.FLD_T2_BPC_ROUTE_OUTLIER));
	    			rec.setT2BpcRouteScore(rs.getInt(BidDetailView.FLD_T2_BPC_ROUTE_SCORE));
	    			rec.setBpAvgBidSize(rs.getBigDecimal(BidDetailView.FLD_BP_AVG_BID_SIZE));
	    			rec.setBpBidSizeHighcut(rs.getInt(BidDetailView.FLD_BP_BID_SIZE_HIGHCUT));
	    			rec.setBpBidSizeOutlier(rs.getString(BidDetailView.FLD_BP_BID_SIZE_OUTLIER));
	    			rec.setBpBidSizeScore(rs.getInt(BidDetailView.FLD_BP_BID_SIZE_SCORE));
	    			rec.setBpCcRevGoePpy(rs.getBigDecimal(BidDetailView.FLD_BP_CC_REV_GOE_PPY));
	    			rec.setBpCcRevGoePpyHighcut(rs.getInt(BidDetailView.FLD_BP_CC_REV_GOE_PPY_HIGHCUT));
	    			rec.setBpCcRevGoePpyPct(rs.getBigDecimal(BidDetailView.FLD_BP_CC_REV_GOE_PPY_PCT));
	    			rec.setBpCcRevGoePpyScore(rs.getInt(BidDetailView.FLD_BP_CC_REV_GOE_PPY_SCORE));
	    			rec.setBpCtryRevT1Ppy(rs.getBigDecimal(BidDetailView.FLD_BP_CTRY_REV_T1_PPY));
	    			rec.setBpCtryRevT1PpyPct(rs.getInt(BidDetailView.FLD_BP_CTRY_REV_T1_PPY_PCT));
	    			rec.setBpCustWinRate(rs.getBigDecimal(BidDetailView.FLD_BP_CUST_WIN_RATE));
	    			rec.setBpCustWinRateBpBids(rs.getInt(BidDetailView.FLD_BP_CUST_WIN_RATE_BP_BIDS));
	    			rec.setBpDwrNgoe(rs.getBigDecimal(BidDetailView.FLD_BP_DWR_NGOE));
	    			rec.setBpDwrNgoeHighcut(rs.getInt(BidDetailView.FLD_BP_DWR_NGOE_HIGHCUT));
	    			rec.setBpDwrNgoeOutlier(rs.getString(BidDetailView.FLD_BP_DWR_NGOE_OUTLIER));
	    			rec.setBpDwrNgoeScore(rs.getInt(BidDetailView.FLD_BP_DWR_NGOE_SCORE));
	    			rec.setBpDwrTot(rs.getBigDecimal(BidDetailView.FLD_BP_DWR_TOT));
	    			rec.setBpDwrTotHighcut(rs.getInt(BidDetailView.FLD_BP_DWR_TOT_HIGHCUT));
	    			rec.setBpDwrTotOutlier(rs.getString(BidDetailView.FLD_BP_DWR_TOT_OUTLIER));
	    			rec.setBpDwrTotScore(rs.getInt(BidDetailView.FLD_BP_DWR_TOT_SCORE));
	    			rec.setBpGoeGrowthPpyPppyPct(rs.getBigDecimal(BidDetailView.FLD_BP_GOE_GROWTH_PPY_PPPY_PCT));
	    			rec.setBpGoeRevenuePct(rs.getBigDecimal(BidDetailView.FLD_BP_GOE_REVENUE_PCT));
	    			rec.setBpGoeRevenueTotal(rs.getBigDecimal(BidDetailView.FLD_BP_GOE_REVENUE_TOTAL));
	    			rec.setBpGoeWinRate(rs.getBigDecimal(BidDetailView.FLD_BP_GOE_WIN_RATE));
	    			rec.setBpGoeWinRateBpBids(rs.getInt(BidDetailView.FLD_BP_GOE_WIN_RATE_BP_BIDS));
	    			rec.setBpGoeWinRateHighcut(rs.getInt(BidDetailView.FLD_BP_GOE_WIN_RATE_HIGHCUT));
	    			rec.setBpGoeWinScore(rs.getInt(BidDetailView.FLD_BP_GOE_WIN_SCORE));
	    			rec.setBpGrowthPpyDeltaScore(rs.getInt(BidDetailView.FLD_BP_GROWTH_PPY_DELTA_SCORE));
	    			rec.setBpGrowthPpyPppyHighcut(rs.getInt(BidDetailView.FLD_BP_GROWTH_PPY_PPPY_HIGHCUT));
	    			rec.setBpGrowthPpyPppyOutlier(rs.getString(BidDetailView.FLD_BP_GROWTH_PPY_PPPY_OUTLIER));
	    			rec.setBpGrowthPpyPppyPct(rs.getBigDecimal(BidDetailView.FLD_BP_GROWTH_PPY_PPPY_PCT));
	    			rec.setBpGrowthPyDeltaScore(rs.getInt(BidDetailView.FLD_BP_GROWTH_PY_DELTA_SCORE));
	    			rec.setBpGrowthPyPpyHighcut(rs.getInt(BidDetailView.FLD_BP_GROWTH_PY_PPY_HIGHCUT));
	    			rec.setBpGrowthPyPpyOutlier(rs.getString(BidDetailView.FLD_BP_GROWTH_PY_PPY_OUTLIER));
	    			rec.setBpGrowthPyPpyPct(rs.getBigDecimal(BidDetailView.FLD_BP_GROWTH_PY_PPY_PCT));
	    			rec.setBpIntegrityTrainingOutlier(rs.getString(BidDetailView.FLD_BP_INTEGRITY_TRAINING_OUTLIER));
	    			rec.setBpIntegrityTrainingScore(rs.getInt(BidDetailView.FLD_BP_INTEGRITY_TRAINING_SCORE));
	    			rec.setBpMaxBidSize(rs.getBigDecimal(BidDetailView.FLD_BP_MAX_BID_SIZE));
	    			rec.setBpNewCeidOutlier(rs.getString(BidDetailView.FLD_BP_NEW_CEID_OUTLIER));
	    			rec.setBpNewCeidScore(rs.getInt(BidDetailView.FLD_BP_NEW_CEID_SCORE));
	    			rec.setBpNewGoeCust(rs.getString(BidDetailView.FLD_BP_NEW_GOE_CUST));
	    			rec.setBpNewGoeCustScore(rs.getInt(BidDetailView.FLD_BP_NEW_GOE_CUST_SCORE));
	    			rec.setBpProductivity(rs.getString(BidDetailView.FLD_BP_PRODUCTIVITY));
	    			rec.setBpProductivityOutlier(rs.getString(BidDetailView.FLD_BP_PRODUCTIVITY_OUTLIER));
	    			rec.setBpProductivityScore(rs.getInt(BidDetailView.FLD_BP_PRODUCTIVITY_SCORE));
	    			rec.setBpProductivitySellersNum(rs.getInt(BidDetailView.FLD_BP_PRODUCTIVITY_SELLERS_NUM));
	    			rec.setBpTotalWinRate(rs.getBigDecimal(BidDetailView.FLD_BP_TOTAL_WIN_RATE));
	    			rec.setBpTotalWinRateBpBids(rs.getInt(BidDetailView.FLD_BP_TOTAL_WIN_RATE_BP_BIDS));
	    			rec.setBpTotalWinRateHighcut(rs.getInt(BidDetailView.FLD_BP_TOTAL_WIN_RATE_HIGHCUT));
	    			rec.setBpTotalWinScore(rs.getInt(BidDetailView.FLD_BP_TOTAL_WIN_SCORE));
	    			rec.setBrand(rs.getString(BidDetailView.FLD_BRAND));
	    			rec.setBidGeoCd(rs.getString(BidDetailView.FLD_BID_GEO_CD));
	    			rec.setBundledSolution(rs.getString(BidDetailView.FLD_BUNDLED_SOLUTION));
	    			rec.setBundledSolutionOutlier(rs.getString(BidDetailView.FLD_BUNDLED_SOLUTION_OUTLIER));
	    			rec.setBundledSolutionScore(rs.getInt(BidDetailView.FLD_BUNDLED_SOLUTION_SCORE));
	    			rec.setCmrSysLocd(rs.getString(BidDetailView.FLD_CMR_SYS_LOC_CD));
	    			rec.setCompExpl(rs.getString(BidDetailView.FLD_COMP_EXPL));
	    			rec.setChnlOvrrdReasCode(rs.getString(BidDetailView.FLD_CHNL_OVRRD_REAS_CODE));
	    			rec.setChnlOvrrdReasCodeDescr(rs.getString(BidDetailView.FLD_CHNL_OVRRD_REAS_CODE_DSCR));
	    			rec.setConfidentiality(rs.getString(BidDetailView.FLD_CONFIDENTIALITY));
	    			rec.setConfidentialityOutlier(rs.getString(BidDetailView.FLD_CONFIDENTIALITY_OUTLIER));
	    			rec.setConfidentialityScore(rs.getInt(BidDetailView.FLD_CONFIDENTIALITY_SCORE));
	    			rec.setContingencyFee(rs.getString(BidDetailView.FLD_CONTINGENCY_FEE));
	    			rec.setContingencyFeeOutlier(rs.getString(BidDetailView.FLD_CONTINGENCY_FEE_OUTLIER));
	    			rec.setContingencyFeeScore(rs.getInt(BidDetailView.FLD_CONTINGENCY_FEE_SCORE));
	    			rec.setCustCcRevT2Ppy(rs.getBigDecimal(BidDetailView.FLD_CUST_CC_REV_T2_PPY));
	    			rec.setCustCcRevT2PpyHighcut(rs.getInt(BidDetailView.FLD_CUST_CC_REV_T2_PPY_HIGHCUT));
	    			rec.setCustCcRevT2PpyPct(rs.getBigDecimal(BidDetailView.FLD_CUST_CC_REV_T2_PPY_PCT));
	    			rec.setCustCcRevT2PpyScore(rs.getInt(BidDetailView.FLD_CUST_CC_REV_T2_PPY_SCORE));
	    			rec.setCustCmrNum(rs.getString(BidDetailView.FLD_CUST_CMR_NUM));
	    			rec.setCustCtryName(rs.getString(BidDetailView.FLD_CUST_CTRY_NAME));
	    			rec.setCustName(rs.getString(BidDetailView.FLD_CUST_NAME));
	    			rec.setDiscHighcutPct(rs.getBigDecimal(BidDetailView.FLD_DISC_HIGHCUT_PCT));
	    			rec.setDiscHighcutTot(rs.getBigDecimal(BidDetailView.FLD_DISC_HIGHCUT_TOT));
	    			rec.setDiscMedianPct(rs.getBigDecimal(BidDetailView.FLD_DISC_MEDIAN_PCT));
	    			rec.setDiscMedianTot(rs.getBigDecimal(BidDetailView.FLD_DISC_MEDIAN_TOT));
	    			rec.setListPrice(rs.getBigDecimal(BidDetailView.FLD_LIST_PRICE));
	    			rec.setMargHighcutPct(rs.getBigDecimal(BidDetailView.FLD_MARG_HIGHCUT_PCT));
	    			rec.setMargHighcutTot(rs.getBigDecimal(BidDetailView.FLD_MARG_HIGHCUT_TOT));
	    			rec.setMargMedianPct(rs.getBigDecimal(BidDetailView.FLD_MARG_MEDIAN_PCT));
	    			rec.setMargMedianTot(rs.getBigDecimal(BidDetailView.FLD_MARG_MEDIAN_TOT));
	    			rec.setMaxDiscOutlier(rs.getString(BidDetailView.FLD_MAX_DISC_OUTLIER));
	    			rec.setMaxDiscScore(rs.getInt(BidDetailView.FLD_MAX_DISC_SCORE));
	    			rec.setMaxMargOutlier(rs.getString(BidDetailView.FLD_MAX_MARG_OUTLIER));
	    			rec.setMaxMargScore(rs.getInt(BidDetailView.FLD_MAX_MARG_SCORE));
	    			rec.setMaxOtherScore(rs.getInt(BidDetailView.FLD_MAX_OTHER_SCORE));
	    			rec.setMaxSfOutlier(rs.getString(BidDetailView.FLD_MAX_SF_OUTLIER));
	    			rec.setMaxSfScore(rs.getInt(BidDetailView.FLD_MAX_SF_SCORE));
	    			rec.setNonCompetitiveBid(rs.getString(BidDetailView.FLD_NON_COMPETITIVE_BID));
	    			rec.setNonCompetitiveBidOutlier(rs.getString(BidDetailView.FLD_NON_COMPETITIVE_BID_OUTLIER));
	    			rec.setNonCompetitiveBidScore(rs.getInt(BidDetailView.FLD_NON_COMPETITIVE_BID_SCORE));
	    			rec.setOffShorePmtTerms(rs.getString(BidDetailView.FLD_OFF_SHORE_PMT_TERMS));
	    			rec.setOffShorePmtTermsOutlier(rs.getString(BidDetailView.FLD_OFF_SHORE_PMT_TERMS_OUTLIER));
	    			rec.setOffShorePmtTermsScore(rs.getInt(BidDetailView.FLD_OFF_SHORE_PMT_TERMS_SCORE));
	    			rec.setPriceToBp(rs.getBigDecimal(BidDetailView.FLD_PRICE_TO_BP));
	    			rec.setPriceToCust(rs.getBigDecimal(BidDetailView.FLD_PRICE_TO_CUST));
	    			rec.setRegion(rs.getString(BidDetailView.FLD_REGION));
	    			rec.setReviewer(rs.getString(BidDetailView.FLD_REVIEWER));
	    			
	    			rec.setRiskFactorBpcOpsFlag(rs.getString(BidDetailView.FLD_RISK_FACTOR_BPCOPS_FLAG));
	    			rec.setRouteToMarket(rs.getString(BidDetailView.FLD_ROUTE_TO_MARKET));
	    			rec.setRouteToMarketOutlier(rs.getString(BidDetailView.FLD_ROUTE_TO_MARKET_OUTLIER));
	    			rec.setRouteToMarketScore(rs.getInt(BidDetailView.FLD_ROUTE_TO_MARKET_SCORE));
	    			rec.setSapQuoteNum(rs.getString(BidDetailView.FLD_SAP_QUOTE_NUM));
	    			rec.setT1BpcConfidentOutlier(rs.getString(BidDetailView.FLD_T1_BPC_CONFIDENT_OUTLIER));
	    			rec.setT1BpcConfidentScore(rs.getInt(BidDetailView.FLD_T1_BPC_CONFIDENT_SCORE));
	    			rec.setT1BpcInvestigationOutlier(rs.getString(BidDetailView.FLD_T1_BPC_INVESTIGATION_OUTLIER));
	    			rec.setT1BpcInvestigationScore(rs.getInt(BidDetailView.FLD_T1_BPC_INVESTIGATION_SCORE));
	    			rec.setT1BpcOverbillOutlier(rs.getString(BidDetailView.FLD_T1_BPC_OVERBILL_OUTLIER));
	    			rec.setT1BpcOverbillScore(rs.getInt(BidDetailView.FLD_T1_BPC_OVERBILL_SCORE));
	    			rec.setT1BpcRouteOutlier(rs.getString(BidDetailView.FLD_T1_BPC_ROUTE_OUTLIER));
	    			rec.setT1BpcRouteScore(rs.getInt(BidDetailView.FLD_T1_BPC_ROUTE_SCORE));
	    			rec.setT1RevT2cPpy(rs.getBigDecimal(BidDetailView.FLD_T1_REV_T2C_PPY));
	    			rec.setT1RevT2cPpyHighcut(rs.getInt(BidDetailView.FLD_T1_REV_T2C_PPY_HIGHCUT));
	    			rec.setT1RevT2cPpyPct(rs.getBigDecimal(BidDetailView.FLD_T1_REV_T2C_PPY_PCT));
	    			rec.setT1RevT2cPpyScore(rs.getInt(BidDetailView.FLD_T1_REV_T2C_PPY_SCORE));
	    			rec.setT2BpcConfidentOutlier(rs.getString(BidDetailView.FLD_T2_BPC_CONFIDENT_OUTLIER));
	    			rec.setT2BpcConfidentScore(rs.getInt(BidDetailView.FLD_T2_BPC_CONFIDENT_SCORE));
	    			rec.setT2BpcInvestigationOutlier(rs.getString(BidDetailView.FLD_T2_BPC_INVESTIGATION_OUTLIER));
	    			rec.setT2BpcInvestigationScore(rs.getInt(BidDetailView.FLD_T2_BPC_INVESTIGATION_SCORE));
	    			rec.setT3BpcConfidentOutlier(rs.getString(BidDetailView.FLD_T3_BPC_CONFIDENT_OUTLIER));
	    			rec.setT3BpcConfidentScore(rs.getInt(BidDetailView.FLD_T3_BPC_CONFIDENT_SCORE));
	    			rec.setT3BpcInvestigationOutlier(rs.getString(BidDetailView.FLD_T3_BPC_INVESTIGATION_OUTLIER));
	    			rec.setT3BpcInvestigationScore(rs.getInt(BidDetailView.FLD_T3_BPC_INVESTIGATION_SCORE));
	    			rec.setT3Name(rs.getString(BidDetailView.FLD_T3_NAME));
	    			rec.setT3Ceid(rs.getString(BidDetailView.FLD_T3_CEID)); //Story 1195470
	    			rec.setT4BpcConfidentOutlier(rs.getString(BidDetailView.FLD_T4_BPC_CONFIDENT_OUTLIER));
	    			rec.setT4BpcConfidentScore(rs.getInt(BidDetailView.FLD_T4_BPC_CONFIDENT_SCORE));
	    			rec.setT4BpcInvestigationOutlier(rs.getString(BidDetailView.FLD_T4_BPC_INVESTIGATION_OUTLIER));
	    			rec.setT4BpcInvestigationScore(rs.getInt(BidDetailView.FLD_T4_BPC_INVESTIGATION_SCORE));
	    			rec.setT4Name(rs.getString(BidDetailView.FLD_T4_NAME));
	    			rec.setT4Ceid(rs.getString(BidDetailView.FLD_T4_CEID)); //Story 1195470
	    			rec.setT5BpcConfidentOutlier(rs.getString(BidDetailView.FLD_T5_BPC_CONFIDENT_OUTLIER));
	    			rec.setT5BpcConfidentScore(rs.getInt(BidDetailView.FLD_T5_BPC_CONFIDENT_SCORE));
	    			rec.setT5BpcInvestigationOutlier(rs.getString(BidDetailView.FLD_T5_BPC_INVESTIGATION_OUTLIER));
	    			rec.setT5BpcInvestigationScore(rs.getInt(BidDetailView.FLD_T5_BPC_INVESTIGATION_SCORE));
	    			rec.setT5Name(rs.getString(BidDetailView.FLD_T5_NAME));
	    			rec.setThirdPartyProducts(rs.getString(BidDetailView.FLD_THIRD_PARTY_PRODUCTS)); //Story 977709
	    			rec.setThirdPartyProductsOutlier(rs.getString(BidDetailView.FLD_THIRD_PARTY_PRODUCTS_OUTLIER));
	    			rec.setThirdPartyProductsScore(rs.getInt(BidDetailView.FLD_THIRD_PARTY_PRODUCTS_SCORE));
	    			rec.setTier1Ceid(rs.getString(BidDetailView.FLD_TIER1_CEID));
	    			rec.setTier1Name(rs.getString(BidDetailView.FLD_TIER1_NAME));
	    			rec.setTier2Ceid(rs.getString(BidDetailView.FLD_TIER2_CEID));
	    			rec.setTier2Name(rs.getString(BidDetailView.FLD_TIER2_NAME));
	    			rec.setT1SevLvl(rs.getString(BidDetailView.FLD_T1_SEVERITY_LEVEL)); //Story 1184774
	    			rec.setT2SevLvl(rs.getString(BidDetailView.FLD_T2_SEVERITY_LEVEL)); //Story 1184774
	    			rec.setT3SevLvl(rs.getString(BidDetailView.FLD_T3_SEVERITY_LEVEL)); //Story 1195470
	    			rec.setT4SevLvl(rs.getString(BidDetailView.FLD_T4_SEVERITY_LEVEL)); //Story 1195470
	    			rec.setTotDiscOutlier(rs.getString(BidDetailView.FLD_TOT_DISC_OUTLIER));
	    			rec.setTotDiscScore(rs.getInt(BidDetailView.FLD_TOT_DISC_SCORE));
	    			rec.setTotMargOutlier(rs.getString(BidDetailView.FLD_TOT_MARG_OUTLIER));
	    			rec.setTotMargScore(rs.getInt(BidDetailView.FLD_TOT_MARG_SCORE));
	    			rec.setTotalBidOutlier(rs.getString(BidDetailView.FLD_TOTAL_BID_OUTLIER));
	    			rec.setTotalBidScore(rs.getInt(BidDetailView.FLD_TOTAL_BID_SCORE));
			//rec.setSupporingFactorList(rs.getString(BidDetailView.FLD_SUPPORING_FACTOR_LIST));
	    			rec.setTotalHighcutThreshold(rs.getBigDecimal(BidDetailView.FLD_TOTAL_HIGHCUT_THRESHOLD));
    			//for story 110
	    			
	    		rec.setBidDate(rs.getTimestamp(BidDetailView.FLD_BID_DATE));
	    		rec.setGrossProfitPerc(rs.getFloat(BidDetailView.FLD_GROSS_PROFIT_PERC));
	    		rec.setBpNotAuthorized(rs.getString(BidDetailView.FLD_BP_NOT_AUTHORIZED)); //Story 119547
    		}
		} catch (Exception e) {
			System.out.println("SQL=" + sb.toString());
			System.out.println("bidKey=" + bidId);
			e.printStackTrace();
		} finally {
			closeConnection(conn);
		}		
		return rec;
	}
	private void closeConnection(Connection conn) {
    	try {
			if (null!=conn && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
