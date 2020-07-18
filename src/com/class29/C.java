package com.class29;

class A {
    
    private void displayParentInfo(){
         System.out.println("2.From Parent Class display info");
    }
    
    private void addInterest() {
    	balance = balance + interestAmount;
    }
    
}

class B extends A{
    public void displayInfo(){
         System.out.println("3.From Child Class");
    }
}


public class C{
    public static void main(String args[]){
        A a = new A();
        a.displayParentInfo();
    }
}