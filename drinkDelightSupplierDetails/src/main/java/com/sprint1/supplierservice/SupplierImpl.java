package com.sprint1.supplierservice;

import com.sprint1.supplierdao.*;
import com.sprint1.suppliermodel.SupplierDetails;
import com.sprint1.supplierui.InvalidException;

public class SupplierImpl implements SupplierService {// 4

	public String displayOrder(String OrderId) {
		SupplierDaoImpl rawMaterialOrderDaoImplObj = new SupplierDaoImpl();// 5

		return rawMaterialOrderDaoImplObj.displayOrder(OrderId);// 19
	}

}