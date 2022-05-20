package com.company;

public class Shopping {
    //data types
    private String typesOfClothes;
    private double cost;
   private  boolean istrending;
    private int luckyNumber;
   private  boolean award;
    //constructor
    public Shopping(String typesOfClothes, double cost, boolean istrending,  int luckyNumber, boolean award){
        this.setTypesOfClothes(typesOfClothes);
        this.setCost(cost);
        this.setIstrending(istrending);
        this.setLuckyNumber(luckyNumber);
        this.setAward(award);
    }
    public void setTypesOfClothes(String typesOfClothes){
        if(typesOfClothes.equals("T-shirt")|| typesOfClothes.equals("Trousers")
                ||typesOfClothes.equals("Skirt")||typesOfClothes.equals("Socks")||
                typesOfClothes.equals("Underwear")){
            this.typesOfClothes = typesOfClothes;
        }else{
            this.typesOfClothes = "Undefined";
        }
    }
        public String getTypesOfClothes(){
            return typesOfClothes;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public double getCost(){
        return cost;

    }
    public void setIstrending(boolean istrending){
        this.istrending = istrending;
    }
    public boolean getIstrending(){
        return istrending;
    }
    public void setLuckyNumber(int luckyNumber){
        this.luckyNumber = luckyNumber;
    }
    public int getLuckyNumber(){
        return luckyNumber;
    }

    public void setAward(boolean award) {
        if(luckyNumber % 100 == 0){
            this.award = true;
        }else{
            this.award = false;
        }

    }
    public boolean getAward(){
        return award;
    }
}
