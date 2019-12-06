package com.kav.controlstatement;

public class FibonaciSeries {
	public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " , ");
          int sum = t1 + t2;
           t1 = t2;
           	t2 = sum;
        }
    }
}


//First 10 terms: 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 
//First 10 terms: 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 ,