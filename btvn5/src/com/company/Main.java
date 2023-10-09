package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        btvn chia cho 3
//        System.out.println("nhap so cot");
//        int column = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhap so dong");
//        int row = Integer.parseInt(scanner.nextLine());
//        int arr[][] = new int[row][column];
//        int sum=0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.println("mời b nhập giá trị của dòng thứ" + (i + 1) + "cột thứ" + (j + 1));
//                arr[i][j] = Integer.parseInt(scanner.nextLine());
//                if (arr[i][j]%3==0) {
//                    sum+=arr[i][j];
//                }
//            }
//        }
//        System.out.println(sum);


        System.out.println("nhap so cot cua mt1");
        int column = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so dong cua mt1");
        int row= Integer.parseInt(scanner.nextLine());

        int arr [][]= new int[row][column];
        for (int i=0;i<row;i++){
            for (int j = 0; j < column; j++) {
                System.out.println("mời b nhập giá trị của dòng thứ"+(i+1)+"cột thứ"+(j+1)+"mt1");
                arr[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("mt1 là");
        for (int i=0;i<row;i++){
            for (int j = 0; j <column ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("nhap so cot cua mt2");
        int column2 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so dong cua mt2");
        int row2= Integer.parseInt(scanner.nextLine());

        int arr2 [][]= new int[row2][column2];
        for (int i=0;i<row2;i++){
            for (int j = 0; j < column2; j++) {
                System.out.println("mời b nhập giá trị của dòng thứ"+(i+1)+"cột thứ"+(j+1)+"mt2");
                arr2[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("mt2 là");
        for (int i=0;i<row2;i++){
            for (int j = 0; j <column2 ; j++) {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] resultMatix = new int[row][column];
        if (row != row2 && column!=column2){
            System.out.println("ko thể thực hiên");
        } else {
            System.out.println("kết quả cộng 2 mt =");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    resultMatix[i][j] = arr[i][j] + arr2[i][j];
                    System.out.print(resultMatix[i][j] + "\t");
                }
                System.out.println();
            }
        }






    }
}
