package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = input.nextInt();
        findMaxIntem(createArray(size));
    }

    public static int[][] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.printf("Nhập phần tử thứ %d-%d: ",i,j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static void findMaxIntem(int[][] arr) {
        int max = arr[0][0];
        int[] index = new int[2];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        System.out.printf("Giá trị lớn nhất mảng là %d ở vị trí %d - %d",max,index[0],index[1]);
    }
}
