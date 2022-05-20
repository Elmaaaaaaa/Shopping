package com.company;

public class Program {

    public static void main(String[] args) {
	// create an object
        Shopping myShopping1 = new Shopping("T-shirt", 34.5, true,
                300, true);
        myShopping1.setTypesOfClothes("Trousers");
        System.out.println(myShopping1.getTypesOfClothes());
        System.out.println(myShopping1.getAward());
    }
}
