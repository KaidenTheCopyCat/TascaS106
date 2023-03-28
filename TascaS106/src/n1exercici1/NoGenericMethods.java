package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class NoGenericMethods {

	private Object o1,o2,o3;
	private List list;
	
	
	@SuppressWarnings("unchecked")
	public NoGenericMethods(Object o1, Object o2, Object o3) {
		list = new ArrayList<>();
		
		this.o1= o1;
		list.add(this.o1);
		
		this.o2= o2;
		
		list.add(this.o2);
		
		this.o3= o3;
		list.add(this.o3);
	}


	public Object getO1() {
		return o1;
	}


	public void setO1(Object o1) {
		this.o1 = o1;
	}


	public Object getO2() {
		return o2;
	}


	public void setO2(Object o2) {
		this.o2 = o2;
	}


	public Object getO3() {
		return o3;
	}


	public void setO3(Object o3) {
		this.o3 = o3;
	}


	public List<Object> getList() {
		return list;
	}


	public void setList(List<Object> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "NoGenericMethods [list=" + list + "]";
	}
	
	
}
