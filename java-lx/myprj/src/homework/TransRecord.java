package homework;

import java.math.BigDecimal;
import java.util.Date;


public class TransRecord {
	
	//#客户号 姓名 所述机构号 性别 帐号 发生时间 发生额
	private String customerNumber;
	private String name;
	private String orgNumber;
	private String sex;
	private String account;
	private Date createDate;
	private BigDecimal money;
	
	public TransRecord(){
		
	}
	
	
	@Override
	public String toString() {
		return "TransRecord [name=" + name + "]";
	}


	public TransRecord(String customerNumber, String name, String orgNumber,
			String sex, String account, Date createDate, BigDecimal money) {
		super();
		this.customerNumber = customerNumber;
		this.name = name;
		this.orgNumber = orgNumber;
		this.sex = sex;
		this.account = account;
		this.createDate = createDate;
		this.money = money;
	}


	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrgNumber() {
		return orgNumber;
	}
	public void setOrgNumber(String orgNumber) {
		this.orgNumber = orgNumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
	
	
}




