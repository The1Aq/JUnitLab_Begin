package csc131.junit;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class GiftCardTest {

	@Test
	void testGetIssuingStore() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore,balance);
		
		assertEquals("getIssuingStore()",issuingStore,card.getIssuingStore());
		
	}
	@Test
	void testGetBalance() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore,balance);
		assertEquals("getBalance()",balance,card.getBalance(),.001);
	}
	@Test 
	public void deduct_RemainingBalance() 
	{ 
		double balance; 
		GiftCard card; 
		int issuingStore; 
		String s = "Remaining Balance:  50.00";
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore,balance);
		assertEquals("deduct()",s,card.deduct(50));
	}
	 


}
