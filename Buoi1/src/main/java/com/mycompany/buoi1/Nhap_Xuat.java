/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buoi1;

import java.util.Scanner;

/**
 *
 * @author van95
 */
public class Nhap_Xuat {

    public static void main(String[] args) {
            float stp;
        //Bước 1 : Khai báo 1 đối tượng thuộc lớp Scanner : giúp nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        String name = "Luân";
        String major = "IT";
        String school = "FPT";
        int age;
//        //Kiểu in 1 : in xong không xuống dòng
//        System.out.print(name);
//        System.out.print(major);
//        System.out.print(school);
//        //Kiểu in 2 : in xong có xuống dòng 
//        System.out.println(name);
//        System.out.println(major);
//        System.out.println(school);
        //Kiểu 3 : in có điều kiện
//        System.out.println("Xin chào, tên tôi là : " + name + " Học chuyên ngành " + major + " Tại trường " + school);
//        System.out.printf("Tên tôi là %s học tại %s chuyên ngành %s", name, school, major);
        //%d : số nguyên, %f : số thực, %s : chuỗi , \n xuống dòng, \t : 1 tab
        //printf

        //Nhập vào từ bàn phím
        System.out.println("Xin mời nhập tuổi");
        age = sc.nextInt();
        System.out.println("Tuổi của bạn là : " + age);
        
//        nextInt : số nguyên
//        next() : "Nguyen Luan" -> "Nguyen";l
//        nextLine(): lấy cả chuỗi 
//        nextLong : lấy số long
        System.out.println("Nhap stp");
        stp = sc.nextFloat();
    }
}
