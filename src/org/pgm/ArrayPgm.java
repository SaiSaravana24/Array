package org.pgm;

public class ArrayPgm {
public static void main(String[] args) {
	//DataType Variablename[] = new DataType[];
	int a[][]=new int [4][4];
	    a[0][0]=0;
	    a[0][1]=2;
	    a[0][2]=4;
	    a[0][3]=6;
	    
	    a[1][0]=0;
	    a[1][1]=8;
	    a[1][2]=10;
	    a[1][3]=12;
	    
	    a[2][0]=0;
	    a[2][1]=14;
	    a[2][2]=16;
	    a[2][3]=18;
	    
	    a[3][0]=0;
	    a[3][1]=20;
	    a[3][2]=22;
	    a[3][3]=24;
  
	    int length=a.length;
	    for(int i=0;i<a.length;i++) {
          for(int j=0;j<a.length;j++) {
	    	     System.out.print("  "+a[i][j]);
              }
          System.out.println();
         }      
	 }
}
    


