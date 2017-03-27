package com.ssss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class image_download {

	public static void main(String[] args) throws Exception, Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet hg =new HttpGet("http://c.hiphotos.baidu.com/image/pic/item/d439b6003af33a874b70869fce5c10385343b512.jpg");
		CloseableHttpResponse hr = httpclient.execute(hg);
		HttpEntity entity = hr.getEntity();
		InputStream in =entity.getContent();
		File file = new File("c:\\abc.jpg");
		try{
			FileOutputStream fout =new FileOutputStream(file);
			int l = -1;
			byte[] tmp =new byte[1024];
			while((l = in.read(tmp)) != -1) {
			fout.write(tmp,0, l);
			}
			fout.flush();
			fout.close();
			}finally{
			in.close();
			}
		
	}
	
}
