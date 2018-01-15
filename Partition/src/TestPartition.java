import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.junit.Test;


@RunWith(JUnit4.class)
public class TestPartition {
	
//test if the list is null and the partitioned list is not null
	@Test
	public void listNull()
	{
		ListPartition lp=new ListPartition();
		int part=2;
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
		List[] newlp=null;
		
		List[] part1=lp.partition(list, part);
		Assert.assertNotNull(part1);		
		Assert.assertNull(newlp);	
		
	}
	
	//Test to check the ListPartition function that its returning the expected partitions or not
	@Test
	public void wrongPartitionsize()
	{
		List<Integer> list=Arrays.asList(10,20,30,4,5,50,40,60);
		int part=3;
		List[] partition=ListPartition.partition(list, part);
		
		List expect=partition[0];
		Assert.assertEquals(Arrays.asList(10,20,30), expect);  //true
		
	}
	
	//Test to check if the function throws the expected exception or not for partition size greater than the list size
	@Test(expected= IllegalArgumentException.class)
	public void expectedExceptionSize()
	{
		List<Integer> list=Arrays.asList(10,20,30,4,5,50,40,60);
		int part=20;
		List[] partition=ListPartition.partition(list, part);
		
	}
	
	//function to test all the partitions
	@Test
	public void checkAllPartitions()
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		int part=2;
		List[] partition=ListPartition.partition(list, part);
		
		List expect=partition[0];
		Assert.assertEquals(Arrays.asList(1,2), expect);
		
		expect=partition[1];
		Assert.assertEquals(Arrays.asList(3,4), expect);
		
		expect=partition[2];
		Assert.assertEquals(Arrays.asList(5), expect);
		
	}
	
	//test for another Data types
	
	@Test
	public void stringPartition()
	{
		List<String> list=Arrays.asList("A","B","C","D","E");
		int part=2;
		List[] partition=ListPartition.partition(list, part);
		
		List expect=partition[0];
		Assert.assertEquals(Arrays.asList("A","B"), expect);
		
		expect=partition[1];
		Assert.assertEquals(Arrays.asList("C","D"), expect);
		
		expect=partition[2];
		Assert.assertEquals(Arrays.asList("E"), expect);
	}
	
}
