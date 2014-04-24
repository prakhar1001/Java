package edu.java.net;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;

//use InetAddress
//url decoder
//url encoder
//url and urlconnection
//url is a special uri(uniform resource identifier)
public class address {

	/*
	 * 
	 * 
	 */
	public static void test1(String num) throws IOException{
		InetAddress ip = InetAddress.getByName("www.google.com");
		System.out.println(ip.isReachable(100));
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		
		InetAddress ip2 = InetAddress.getByAddress(new byte[] {127,0,0,1});
		System.out.println(ip2.isReachable(100));
		System.out.println(ip2.getCanonicalHostName());
	}
	
	public static void urlcodetest() throws UnsupportedEncodingException{
		String keys = URLDecoder.decode("%E6%9D%8E%E5%88%9A","UTF-8");
		System.out.println(keys);
		
		String url = URLEncoder.encode("�Ӻ�","GBK");
		System.out.println(url);
	}
	
	//public static 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String num = "n";
		test1(num);
		urlcodetest();
		//TreeSet ts = new TreeSet();
		
	}

}
