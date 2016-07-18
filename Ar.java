/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar;

/**
 *
 * @author Student
 */
public class Ar {

    
    public static void main(String[] args) {
      int n = args.length;
		int []a=new int[n];
		int []b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);		
		b[i]=0;
		}
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			{
				b[i]=b[i]+1;
			}
			
			}}
		for(int i=0;i<n;i++)
		{
			if(b[i]==2)
			{
			System.out.println(a[i]);
			}
			}
		}
	}
    

