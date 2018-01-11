package com.accolite.ChildMaven;

import java.util.HashMap;

public class SampleClass {
	HashMap<String, String> store;
	
	public SampleClass() {
		super();
		this.store = new HashMap<String, String>();
	}

	public HashMap<String, String> getStore() {
		return store;
	}

	public void setStore(HashMap<String, String> store) {
		this.store = store;
	}
	
	public String get(String key) {
		return this.store.get(key);
	}
	
	public void put(String key, String value) {
		this.store.put(key, value);
	}
}