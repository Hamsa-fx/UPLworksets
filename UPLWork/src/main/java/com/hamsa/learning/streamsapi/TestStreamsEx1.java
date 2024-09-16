package com.hamsa.learning.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamsEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		System.out.println("al" + al);
		List<Integer> al1 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
				System.out.println(al1);
				// example 2: map on collection
				ArrayList<Integer> mapList = new ArrayList<Integer>();
				mapList.add(10);
				mapList.add(15);
				mapList.add(20);
				mapList.add(25);
				mapList.add(30);
				System.out.println("mapList" + mapList);
				List<Integer> updatedMarks = mapList.stream().map(i->i+5).collect(Collectors.toList());

				System.out.println("updatedMarks" + updatedMarks);

				ArrayList<Integer> mapList1 = new ArrayList<Integer>();
				mapList1.add(40);
				mapList1.add(25);
				mapList1.add(30);
				mapList1.add(25);
				mapList1.add(35);
				System.out.println(mapList1);
				long failedCount = mapList1.stream().filter(i->i<30).count();
				System.out.println(failedCount);
				// example3: sorted on collection
				ArrayList<Integer> mapList2 = new ArrayList<Integer>();
				mapList2.add(40);
				mapList2.add(25);
				mapList2.add(30);
				mapList2.add(25);
				mapList2.add(35);
				System.out.println(mapList2);
				List<Integer> sortedList = mapList2.stream().sorted().collect(Collectors.toList());
				System.out.println(sortedList);

				// sorted ->natural order

				ArrayList<Integer> mapList3 = new ArrayList<Integer>();
				mapList3.add(40);
				mapList3.add(25);
				mapList3.add(30);
				mapList3.add(25);
				mapList3.add(35);
				System.out.println(mapList3);
				List<Integer> sortedList3 = mapList3.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
				System.out.println(sortedList3);
				List<Integer> sortedList4 = mapList3.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
				System.out.println(sortedList4);
				Integer min = mapList3.stream().min((i1,i2)->i1.compareTo(i2)).get();

						System.out.println(min);

						Integer max = mapList3.stream().max((i1,i2)-> i1.compareTo(i2)).get();

						System.out.println(max);
	}
}


