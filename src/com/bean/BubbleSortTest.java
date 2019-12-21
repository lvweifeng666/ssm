package com.bean;

public class BubbleSortTest {
	//ц╟ещеепР
	public static void main(String[] args) {
		int[] arr=new int[] {1,3,7,0,-1,23,-45,100};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				int temp;
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
	}

}
