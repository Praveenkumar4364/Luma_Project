package women;
import org.testng.annotations.Test;
import genericUtility.Base_Class;
import objectRepository.Home_Page;
import objectRepository.Jackets_Class;
import objectRepository.Learn_More_Class;
import objectRepository.ReviewAndPayment;
import objectRepository.Shipping_Address;
import objectRepository.Shipping_Cart_Class;

public class Women_Product extends Base_Class{

	@Test
	public void product() throws Exception
	{
		String data= eUtil.getDatafromExcel("Jackets",3,0);
		String QUANTITY=eUtil.getDatafromExcel("Jackets",1,2);
		String QTY=eUtil.getDatafromExcel("ShippingCart",1,0);
		
		String STREET=eUtil.getDatafromExcel("ShippingOrder",2,0);
		String CITY=eUtil.getDatafromExcel("ShippingOrder",2,1);
		String STATE=eUtil.getDatafromExcel("ShippingOrder",2,2);
		String POSTALCODE=eUtil.getDatafromExcel("ShippingOrder",2,3);
		String COUNTRY=eUtil.getDatafromExcel("ShippingOrder",2,4);
		String PHNO=eUtil.getDatafromExcel("ShippingOrder",2,5);
		Home_Page hp=new Home_Page(driver);
		hp.womenproductOnTopJackets(driver);
		Jackets_Class js=new Jackets_Class(driver);
		js.operationOnJackets(data);
		Learn_More_Class lp=new Learn_More_Class(driver);
		lp.operationOnLearnmore(driver,QUANTITY);
		Shipping_Cart_Class sp=new Shipping_Cart_Class(driver);
		sp.operationOnShippingcart(QTY);
		Shipping_Address shp=new Shipping_Address(driver);
		shp.shippingorderOperation(STREET, CITY, STATE, POSTALCODE, COUNTRY, PHNO);
		//shp.shippingorderOperation();
		ReviewAndPayment rp=new ReviewAndPayment(driver);
		rp.operationOnPaymentpage();
		Thread.sleep(5000);
		
	}
}
