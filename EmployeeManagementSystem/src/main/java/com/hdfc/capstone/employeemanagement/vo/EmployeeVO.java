package com.hdfc.capstone.employeemanagement.vo;
/**
 * 
 * @author Akshat Pareek
 * Date 24/04/23
 *
 */
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.util.Base64Utils;

public class EmployeeVO {
	
	private long employeeId;
	private String employeeName;
	private String dateOfBirth;
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public EmployeeVO(long employeeId, String employeeName, String dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}
	public EmployeeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static final String KEY = "32313029282726252423222120191817";
    
    public static String encrypt(String date) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(date.getBytes());
        return Base64Utils.encodeToString(encrypted);
    }
}
