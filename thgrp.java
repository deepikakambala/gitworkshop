import java.util.Scanner;
import java.io.*;
import java.lang.Thread;
class thgrp
{
	public static void main(String ar[])
	{
		Thread t=Thread.currentThread();
		System.out.println("current thread:"+t);
		t.getName();
		System.out.println("Thread name:");
		t.getPriority();
		System.out.println("Thread priority:");
		t.setName("my thread");
		t.setPriority(10);
		System.out.println("After changing \n current thread:"+t);
		t.getName();
	    System.out.println("Thread name:");
	    t.getPriority();
		System.out.println("Thread priority:");
		try
		{
			for(int i=5;i>0;i--)
			{ 
				System.out.println("Thread:"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread interrupted");
		}
	}
}