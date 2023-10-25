/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buoi1;

/**
 *
 * @author van95
 */
public class Ep_kieu {
    //Phóng to code : giữ ALT + lăn chuột
    public static void main(String[] args) {
        //Ép kiểu : việc gán giá trị của 1 biến có kiểu dữ liệu tới 1 biến khác có kiểu dữ liệu khác
        //Ép kiểu nguyên thủy đối các số : 
        //Vd1 
        int a = 5;
        short b = 9;
        //Có 2 kiểu ép kiểu
        a= (int) b;//Ép kiểu tường minh
        a = b; //Ép kiểu tự động
//        double|float
        //Ép từ chuỗi sang số 
        String num = "38";
        String num2 = "40";
        System.out.println(num+num2);//nối chuỗi
        int temp = Integer.parseInt(num)+ Integer.parseInt(num2);
        //Truyền số kiểu chuỗi : convert từ số dạng chuỗi -> số nguyên thủy phải dùng lớp này
        System.out.println(temp);
        float temp1;
//        Float.parseFloat(num);
//        Double.parseDouble(num);
//        Boolean.parseBoolean();//Chỉ có giá trị true và false
        
    }
}
