package com.neuedu.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	            System.out.println("******************************");
	            System.out.println("=======��ӭ����ѧ����Ϣ����ϵͳ=======");
	            System.out.println("1.����ѧ��");
	            System.out.println("2.ɾ��ѧ��");
	            System.out.println("3.�޸�ѧ��");
	            System.out.println("4.��ѯѧ��");
	            System.out.println("5.�˳���ϵͳ");
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
