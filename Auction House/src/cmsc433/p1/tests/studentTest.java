package cmsc433.p1.tests;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import cmsc433.p1.AuctionServer;
import cmsc433.p1.Item;

public class studentTest {

//	@Test
//	public void submitItem() {
//		//AuctionServer server ;
//		 AuctionServer serverPrinter = AuctionServer.getInstance();
//		 serverPrinter.submitItem("yufan","game 0" , 59, 500);
//		 serverPrinter.submitItem("nao","food" , 20, 550);
//		 serverPrinter.submitItem("ran","bed" , 500, 600);
//		 serverPrinter.submitItem("yufan","game 1" , 59, 500);
//		 for(Item temp:serverPrinter.getItems()) {
//			 System.out.println(temp.seller()+" "+temp.name()+" listID:"+temp.listingID());
//		 }
//		 
//		 System.out.println("---------------submitItem over---------------------------------------");
//	     //submitItem("yufan","games" , 59, 500);
//		
//		
// 		//fail("Not yet implemented");
//	}
	
	@Test
	public void submitBid() {
		 AuctionServer serverPrinter = AuctionServer.getInstance();
		System.out.println(serverPrinter.submitItem("yufan","game 0" , 59, 500));
		//System.out.print("stopped here0");
		 System.out.println(serverPrinter.submitBid("tim", 0, 60));
		 //System.out.print("stopped here1");
		 System.out.println(serverPrinter.submitBid("tim", 2, 60));
		 System.out.println(serverPrinter.submitBid("tim", 0, 60));
		 System.out.println(serverPrinter.submitBid("tim", 0, 660));
		 System.out.println("---------------submitBid over---------------------------------------");
		// fail("Not yet implemented");
	}

}
