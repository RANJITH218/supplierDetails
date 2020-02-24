package com.sprint1.supplierui;

import java.util.Scanner;
//import com.sprint1.service.RawMaterialServiceImpl;
import com.sprint1.supplierservice.SupplierImpl;

public class Main {
	public static void main(String[] args) {
		SupplierImpl rawMaterialdetailsImplObj = new SupplierImpl();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter  Id");
		String id = in.nextLine();
		rawMaterialdetailsImplObj.displayOrder(id);
	}
}