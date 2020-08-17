package com.myproject.utility;

import javax.sql.DataSource;
import com.ibm.db2.jcc.DB2Driver;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class DbConfiguration {
	
	//@Bean(name="db2DataSource")
	//@ConfigurationProperties(prefix="spring.datasource")
    /*public DataSource getDataSource() 
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:db2://dgdalbrtdv01.w3-969.ibm.com:60020/RAFTWEB:sslConnection=true;sslTrustStoreLocation=src/ibm-ssl-truststore.jks;sslTrustStorePassword=shruthi;");//;sslTrustStoreLocation=c:\db2_ssl\db2.jks;sslTrustStorePassword=teste123;
        dataSourceBuilder.driverClassName(com.ibm.db2.jcc.DB2Driver.class.getName());
        dataSourceBuilder.username("shales55");
        dataSourceBuilder.password("shales55@123");
        return dataSourceBuilder.build(); //DataSourceBuilder.create().build();
    }*/
}
