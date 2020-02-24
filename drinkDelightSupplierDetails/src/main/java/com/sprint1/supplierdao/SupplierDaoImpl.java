package com.sprint1.supplierdao;

import java.util.*;
import com.sprint1.suppliermodel.SupplierDetails;

public class SupplierDaoImpl implements SupplierDao {// 6
	public String displayOrder(String OrderId) {
		Map<String, SupplierDetails> raws = new HashMap<String, SupplierDetails>();
		SupplierDetails order = new SupplierDetails("1", "puma", "4-9-7/b", 86399552);
		SupplierDetails order1 = new SupplierDetails("2", "Leo", "9-97-675/g", 84999902);
		SupplierDetails order11 = new SupplierDetails("3", "Gucci", "56-801/7g", 434678);
		SupplierDetails order12 = new SupplierDetails("4", "Nike", "66/734lk", 414789);
		SupplierDetails order13 = new SupplierDetails("5", "philliphines", "12p/7/89s", 404908);

		raws.put(order.getSupplierId(), order);
		raws.put(order1.getSupplierId(), order1);
		raws.put(order11.getSupplierId(), order11);
		raws.put(order12.getSupplierId(), order12);
		raws.put(order13.getSupplierId(), order13);
		for (String ord : raws.keySet())// 17
		{
			if (raws.get(ord).getSupplierId().equalsIgnoreCase(OrderId)) {
				System.out.println(raws.get(ord));
			}

		}
		return null;

	}
}
