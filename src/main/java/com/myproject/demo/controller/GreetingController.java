package com.myproject.demo.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.utility.BidDetailView;
import com.myproject.utility.BretBidAccessor;
import com.myproject.utility.BretBidDAO;

@RestController
public class GreetingController {
	
	/*@Qualifier("db2DataSource")*/ 
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/greeting/{userName}")
	public String greet(@PathVariable(name="userName") String userName)  {
		
		return "Welcome to IBM Cloud " + userName;
	}
	
	@Cacheable(value="bidCache", key="#bidId")
	@GetMapping("/bidDetail/{bidId}")
	public BretBidAccessor getBidDetail(@PathVariable(name="bidId") String bidId)  {
		/*String query = "select " + BidDetailView.FLD_BID_ID+ "," + BidDetailView.FLD_SOURCE_SYS_CD+ "," +BidDetailView.FLD_BATCH_ID+ "," + 
		BidDetailView.FLD_BID_MANAGER+ "," + BidDetailView.FLD_OPERATION_OWNER + " from BRET.BRETWEB_DETAIL where BID_ID='8500222446'";
		return jdbcTemplate.queryForObject(query, BretBidAccessor.class);*/
		BretBidDAO bretBidDAO = new BretBidDAO();
		BretBidAccessor obj = bretBidDAO.getBidDetail(bidId, dataSource);
		if (obj == null) {
			obj = new BretBidAccessor();
			obj.setSourceSysCd("Not able to fetch from DB");
			obj.setBidId(bidId);
		}
		return obj;
	}
}
