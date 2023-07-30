package day1;

import java.util.*;


class Laptop 
{
	int ram;
	int ssd;
	int price;
	
	Laptop(int ram,int ssd,int price)
	{
		this.ram=ram;
		this.ssd=ssd;
		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return " Ram: "+ram+" ssd: "+ssd+" Price: "+price;
	}
	@Override
	public boolean equals(Object o)
	{
		Laptop temp=(Laptop) o;      //Downcast   using downcast we use child properties using parent properties
		if(this.ram==temp.ram && this.ssd==temp.ssd && this.price==temp.price)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return ((Integer)ram).hashCode()+((Integer)ssd).hashCode()+((Integer)price).hashCode();
		
	}
}




class ramComparator implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		Laptop l1=(Laptop) o1;
		Laptop l2=(Laptop) o2;
		
		if(l1.ram>l2.ram)
		{
			return 1;
		}
		if(l1.ram<l2.ram)
		{
			return -1;
		}
		return 0;
	}
}

class ssdComparator implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		Laptop l1=(Laptop) o1;
		Laptop l2=(Laptop) o2;
		
		if(l1.ssd>l2.ssd)
		{
			return 1;
		}
		if(l1.ssd<l2.ssd)
		{
			return -1;
		}
		return 0;
	}
}

class priceComparator implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		Laptop l1=(Laptop) o1;
		Laptop l2=(Laptop) o2;
		
		if(l1.price>l2.price)
		{
			return 1;
		}
		if(l1.price<l2.price)
		{
			return -1;
		}
		return 0;
	}
}



class Main
{
	public static void main(String[] args)
	{
		
		ArrayList a1=new ArrayList();
		
		a1.add(new Laptop(8,512,50000));
		a1.add(new Laptop(4,512,40000));
		a1.add(new Laptop(2,512,20000));
		
		Collections.sort(a1,new ramComparator());     //which accepts collection ,ComparatorObject
		
		for(Object i:a1)
		{
			System.out.println(i);
		}
		
		
		System.out.println("=============================");
		
		
		Collections.sort(a1,new ssdComparator());     //imp step   //sort method which accepts collection ,ComparatorObject
		
		for(Object j:a1)
		{
			System.out.println(j);
		}
		
		System.out.println("=============================");
		
		
		
		Collections.sort(a1,new priceComparator());     //which accepts collection ,ComparatorObject
		
		for(Object k:a1)
		{
			System.out.println(k);
			
		}
		
		
		System.out.println("=============================");
	}
	
}

