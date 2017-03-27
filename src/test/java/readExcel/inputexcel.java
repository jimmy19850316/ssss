package readExcel;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class inputexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Map<String,userinfo> inputexcel_map=readexcel.readexcel_userinfo("c:\\aaa.xls");
		Set s = inputexcel_map.keySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(inputexcel_map.get(it.next()).getUserpasswd());
		}
		
	}

}
