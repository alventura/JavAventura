package com.ReviewMay8;

public class Marketing {

private String productName,employeeName;
private double saleAmount;

public Marketing(String employeeName, String productName, double saleAmount) {
	this.employeeName=employeeName;
	this.productName=productName;
	this.saleAmount=saleAmount;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public double getSaleAmount() {
	return saleAmount;
}

public void setSaleAmount(double saleAmount) {
	this.saleAmount = saleAmount;
}

public void print() {
    if(saleAmount>3000) {
       System.out.println(employeeName+" reached the target of 3000$ in sales");
    }
}
@Override
public String toString() {
	return "Marketing [productName=" + productName + ", employeeName=" + employeeName + ", saleAmount=" + saleAmount
			+ "]";
}

	

}
