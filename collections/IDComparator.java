package com.practice.collections;

import java.util.Comparator;

public class IDComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student2 s1=(Student2)o1;
		Student2 s2=(Student2)o2;
		if(s1.id>s2.id)
		{
			return 1;
		}
		else if(s1.id<s2.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
