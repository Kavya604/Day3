package com.training.org;

public class XYZBank {
    private String bankName;
    private String bankAddress;
    private int noOfEmployee;

    public XYZBank(){
        System.out.println("Default constructor of XYZBank is called");
        bankName="";
        bankAddress="";
        noOfEmployee=0;
    }

    public XYZBank(String bankName, String bankAddress, int noOfEmployees) {
        System.out.println("Parameterised constructor of XYZBank is called");
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.noOfEmployee = noOfEmployees;
    }

    public String toString(){
        return "Bank Details are "+bankName+" Address "+bankAddress+" NoOfEmployees"+noOfEmployee;
    }


}
