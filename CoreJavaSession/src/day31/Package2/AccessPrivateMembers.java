package day31.Package2;

import day31.Package.PrivateMembers;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

/**
 * If your try to access one package class to another package dn you have to use impport statement
 */