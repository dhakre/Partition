import java.util.ArrayList;
import java.util.List;

public class ListPartition {
	
	//As the list partition function is generic and static so the class don't need to be having the member variables.

	//list function
	public  static<T> List [] partition(List<T> list,int n)
	{
		//if list is null
		List<T>[] part;
		if(list==null)
		{
			throw new IllegalArgumentException("List must not be null");
		}
		
		//if part size is less than 1
		else if(n<1)
		{
		  throw new IllegalArgumentException("Parttition size must be 1 or greater");
		}
		else if(n>list.size())
		{
			throw new IllegalArgumentException("Parttition size must be less than the size of the list");
		}
		else
		{	
		int size= list.size();
		
		int m=size/n;
		
		if(size%n !=0)
		{
			m++;
		}
		part=new ArrayList[m];
		for(int i=0;i<m;i++)
		{
			int start=i*n;
			int end=(i*n+ n < size) ? (i*n+n) :size;
			part[i]=new ArrayList(list.subList(start, end));
		}
		}
			
		return part;
			
	}

	public static void main(String[] args) {
		
		ListPartition lp=new ListPartition();
		int part=3;
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//list.add(6);
		List[] part1=ListPartition.partition(list, part);
		for(List a: part1)
		{
			System.out.println("list part"+a);
		}
		
		
		

	}
	
	
	
	

}
