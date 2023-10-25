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
public class Switch_case {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Cấu trúc Switch_case cho phép lựa chọn 1 trong nhiều lựa chọn
        int i = sc.nextInt();
        switch (i) {
            case 1 -> {
                System.out.println("Thực hiện chức năng 1 ");
                break;
            }
               case 2 -> {
                System.out.println("Thực hiện chức năng 2 ");
                break;
            }
                  case 3 -> {
                System.out.println("Thực hiện chức năng 3 ");
                break;
            }
            default -> throw new AssertionError();
        }
    }
}
