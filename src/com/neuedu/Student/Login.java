package com.neuedu.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	            System.out.println("******************************");
	            System.out.println("=======欢迎进入学生信息管理系统=======");
	            System.out.println("1.新增学生");
	            System.out.println("2.删除学生");
	            System.out.println("3.修改学生");
	            System.out.println("4.查询学生");
	            System.out.println("5.退出该系统");
	            System.out.println("******************************");
	            
	            int a = 1;
	           switch (a) {
			case 1:
				add();
				break;
			case 2:
				remove();
				break;
			case 3:
				update();
				break;
			case 4:
				chack();
				break;
				
			default:
				break;
			}  
	}

	private static void chack() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void remove() {
		// TODO Auto-generated method stub
		
	}

	private static void add() {
		// TODO Auto-generated method stub
		
	}
}
