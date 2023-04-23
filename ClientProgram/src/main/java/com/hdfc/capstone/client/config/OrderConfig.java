package com.hdfc.capstone.client.config;

import javax.net.ssl.SSLContext;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

@Configuration
public class OrderConfig {
	
	public HttpComponentsClientHttpRequestFactory validateSSL() {
		String location = "C:\\Users\\acer\\OneDrive\\Desktop\\CapstoneFolder\\EmployeeManagementSystem\\src\\main\\resources\\https-employee.jks";
		String password="password";
		SSLContext sslContext=null;
		try {
			sslContext=SSLContextBuilder
					.create()
					.loadTrustMaterial(ResourceUtils.getFile(location),password.toCharArray())
					.build();
		}catch(Exception e) {
			
		}
		SSLConnectionSocketFactory csf=new SSLConnectionSocketFactory(sslContext,new LocalHostnameVerifier());
		CloseableHttpClient httpClient = HttpClients.custome().setSSLSocketFactory(csf).build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
		
		return requestFactory;
	}
}
