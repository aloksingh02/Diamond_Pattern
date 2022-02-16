package com.company;

public class Main {
            public static void main(String[] args) {
                int n=5;
                for(int i=0;i<n;i++)
                {
                    for(int k=4;k>i;k--)
                    {
                        System.out.print(" ");
                    }
                    for(int j=0;j<i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                for(int i=4;i>0;i--)
                {
                    for(int k=4;k>i;k--)
                    {
                        System.out.print(" ");
                    }
                    for(int j=0;j<i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                // write your code here
            }
        }