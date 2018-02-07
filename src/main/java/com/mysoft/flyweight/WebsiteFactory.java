package com.mysoft.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {

	Map<String,Website> map = new HashMap<String,Website>();
	
	public Website getWebsite(String key){
		if(map.containsKey(key)){
			return map.get(key);
		}else{
			Website website = new WebsiteOne(key);
			map.put(key, website);
			return website;
		}
	}
	
	public int getTotal(){
		return map.size();
	}
	
	
}
