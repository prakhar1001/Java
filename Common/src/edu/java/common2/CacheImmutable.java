package edu.java.common2;

public class CacheImmutable {
	//this class illustrate the usage of immutable class and cache in java
	private final String name;
	private static CacheImmutable[] cache = new CacheImmutable[10];
	//record the cacheimmuable instance pos, cache[pos-1] is the newest one
	private static int pos = 0;
	public CacheImmutable(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static CacheImmutable valueOf(String name){
		//travsal all the cache objects
		for(int i = 0; i<pos; i++){
			if(cache[i] !=null && cache[i].getName().equals(name)){
				//if there is a same object as in the cache, take it out
				return cache[i];
			}
		}
		if(pos ==10){
				//if full, fifo
			cache[0] = new CacheImmutable(name);
			pos = 1;
			return cache[0];
		}
		else{
			cache[pos++]=new CacheImmutable(name);
			return cache[pos-1];
		}
	}
	public boolean equals(Object obj){
		if(obj instanceof CacheImmutable){
			CacheImmutable ci = (CacheImmutable)obj;
			if (name.equals(ci.getName())){
				return true;
			}
		}
		return false;
	}
	
	public int hashCode(){
		return name.hashCode();
	}
	
	public static void main(String... args){
		CacheImmutable c1 = CacheImmutable.valueOf("hello");
		CacheImmutable c2 = CacheImmutable.valueOf("hello");
		System.out.println(c1 == c2);
	}
}
