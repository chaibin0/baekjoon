package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic {

	public static void main(String[] args) throws Exception{
		String first="A";
		String second="a";
		
		
		List<String> list=new ArrayList<>();
		
		list.add("B");
		list.add("z");
		list.add("b");
		list.add("Z");
		list.add(second);
		list.add(first);
		
		Collections.sort(list,Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		for(String data:list)
			System.out.println(data);
		
		A a=new A();
		
		
	}
	

}


class A{
	private class B{
		
	}
	
	int a(){
		B b=new B();
		return 0;
	}
}
