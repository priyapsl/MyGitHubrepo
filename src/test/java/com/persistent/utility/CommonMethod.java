package com.persistent.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonMethod {
	
	public  void ckickon()
	{
		
	}


    public  void waifor() 
    {
    	try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

  
    public  void toString(List<String> alist)
    {
    	Iterator<String> itr = alist.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
		
    	 
    }

}
