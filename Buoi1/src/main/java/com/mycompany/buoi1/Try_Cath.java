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
public class Try_Cath {
    public static void main(String[] args) {
        int a ;
        double b = Double.valueOf(5);//Locle code
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời bạn nhập vào số nguyên");
        try {
        a = sc.nextInt();
        System.out.println("Số bạn vừa nhập là : "+a);
        } catch (Exception e) {
            System.out.println("Bạn phải nhập số vào");
        }
        System.out.println("bạn đã điền thành công");
        //Try catch : khối try sẽ bao code lại, catch  : đẩy ra `1 exception
//        double || Double
//        || && !
//      Toán tử 3 ngôi : <điều kiện>?<giá trị đúng>:<giá trị sai>
        // Câu điều kiện
        //1. If thiếu 
//        if (condition) {
//            //thực hiện logic code
//        }
        //2. If đủ
//            if (true) {
//            
//        } else {
//        }
//        //3. If bậc thang (if-else if - else)
//            if (condition 1 ) {
//            
//        }
//            else if(conditon 2){
//        
//    }
//            .a..a.. else{
//    }
    }
//            4. If lồng
//            if (condition) {
//            if (true) {
//                
//            }
//}
}
