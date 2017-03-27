package readExcel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map_examp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=3,b=11;
		Map<Integer,Integer> m = new HashMap();
		for(i=1;i<11;i++)
		{
			m.put(i, b);
			b++;
		}
		Set s = m.keySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(m.get(it.next()));
		}

	}

}
