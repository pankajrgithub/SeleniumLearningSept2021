package EncodeDecodePswd;

import org.apache.commons.codec.binary.Base64;

public class EncodeDecodeString {

	public static void main(String[] args) 
	{
		String s="admin123" ;
		
	  byte[] encodeString =Base64.encodeBase64(s.getBytes());
      String encodepwd=new String(encodeString);
      System.out.println(encodepwd);
      
      
      byte[] decodePwd=Base64.decodeBase64(encodepwd);
      System.out.println(new String(decodePwd));
	}

}
