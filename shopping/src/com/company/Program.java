package com.company;

public class Program {

    public static void main(String[] args) {
	// create an object
        Shopping myShopping1 = new Shopping("T-shirt", 34.5, true,
                300, true);
        myShopping1.setTypesOfClothes("Trousers");
        System.out.println(myShopping1.getTypesOfClothes());
        System.out.println("Lucky number: " + myShopping1.getAward());
        System.out.println("Today's number of sales is: " + myShopping1.getNumberOfSales());
	    Shopping myShopping2 = new Shopping("Skirt", 25, false, 301, false );
        Shopping myShopping3 = new Shopping("Socks", 13.50, true, 302, true);
        System.out.println("Lucky number: " + myShopping3.getAward());
        System.out.println("Today's number of sales is: " + myShopping1.getNumberOfSales());
    }
}
