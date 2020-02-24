package inventoryMangement.drinkDelightSupplierDetails;
//package inventoryMangement.drinkDelightSupplierDetails;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.sprint1.supplierdao.SupplierDao;
import com.sprint1.supplierdao.SupplierDaoImpl;
import com.sprint1.suppliermodel.SupplierDetails;
import com.sprint1.supplierservice.SupplierImpl;
import com.sprint1.supplierservice.SupplierService;
import com.sprint1.supplierui.Main;
//import com.sprint1.supplierdao.SupplierDao;

public class AppTest 
{
	//SupplierService service=new SupplierService();
	
	static SupplierDaoImpl dao=new SupplierDaoImpl();
	SupplierDetails object=new SupplierDetails();
	static Map<String, SupplierDetails > supplierid;
	static Supplier ac1;
	@BeforeAll
	public String displayOrder(String OrderId) {
        Map<String,SupplierDetails> raws =new HashMap<String, SupplierDetails>();//7

        SupplierDetails order=new SupplierDetails ("1","puma","4-9-7/b",86399552);//8
        SupplierDetails order1=new SupplierDetails ("2","Leo","9-97-675/g",84999902);//9
        SupplierDetails  order11=new SupplierDetails("3","Gucci","56-801/7g",434678);//10
        SupplierDetails  order12=new SupplierDetails ("4","Nike","66/734lk",414789);//11
        SupplierDetails  order13=new SupplierDetails ("5","philliphines","12p/7/89s",404908);//12
		return OrderId;

	}
	
	//Checking Get Account
	@RepeatedTest(value = 1)
	public void testGetAccountInfo() {
		String displayOrder =object.getSupplierId();
	
		assertEquals("1", displayOrder );
	}
/*
	private int getSupplierId() {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	
	//Checking For Invaild Amount Exception
//	@Nested
//	class CheckExceptions{
	/*@Test
	public void testInvaildAmountException() {
		assertThrows(InvaildAmountException.class, new Executable() {
			public void execute() throws Throwable {
				service.addAmount(1001125256,-50000);
			}*/
		//});
	}
	