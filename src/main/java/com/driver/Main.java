package com.driver;

public class Main {
    public static void main(String[] args){
        Product p = new Product();
        int ans = p.product(10,20);
        int ans1 = p.product(10,20,30);
        double ans2 = p.product(8.3,9.2);

        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);




    }

    public static class Product {
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }

        public double product(double x, double y){

            return x*y;
        }
    }

}