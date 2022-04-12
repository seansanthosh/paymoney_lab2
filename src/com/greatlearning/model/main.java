package com.greatlearning.model;


import java.util.Scanner;

public class main {

    public static void money(String[] args) {
        int transArraySize,i,noOfTargets,valueOfTarget,sum=0,j,value=0,flag=0; //variable declare
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of transaction array");
        transArraySize=sc.nextInt(); //taking array size from user
        int array[] = new int[transArraySize]; // Array declaration using array size entered by user
        System.out.println("Enter the values of array");
        for(i=0;i<transArraySize;i++)
            array[i]=sc.nextInt(); // getting array elements from user
        System.out.println("Enter the total no of targets that needs to be achieved");
        noOfTargets=sc.nextInt(); // Taking the number of targets to compare
        for(i=0;i<noOfTargets;i++,sum=0,flag=0){
            System.out.println("Enter the value of target");
            valueOfTarget=sc.nextInt(); // Accepting each comparison value
            for(j=0;j<transArraySize;j++){
                if(sum>=valueOfTarget) {
                    value = j;  //Value of  'j' is number of transactions.So sum>=target value, value of j should be returned
                    flag=1; // flag is set to value 1, inorder to identify whether target is achieved or not
                    break;
                }
                else
                    sum+=array[j]; // sum is evaluated for each array elemnts
            }
            if(flag==1)
                System.out.println("Target achieved after "+value+" transactions"); // If flag value is 1, then value is printed
            else
                System.out.println("Given target is not achieved "); // if flag value is not 1, then target can,t be achieved.
        }

        }

}
