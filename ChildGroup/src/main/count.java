package main;

public class count {

	public static void main(String[] args) {
		
		System.out.println("当前数组为：");
		int n = (int) (Math.random()*20);
		int[] arr = generateArray(n, 100, -100);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
//		int max=0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for (int j = 0; j < arr.length; j++) {
//					if (j>i) {
//						int sum=0;
//						for (int k = i; k < j; k++) {
//							sum += arr[k];
//						}
//						if (sum>max) {
//							max = sum;
//						}
//					}
//					else if (j<i) {
//						int sum=0;
//						for (int k = i; k < arr.length; k++) {
//							sum += arr[k];
//						}
//						for (int k = 0; k < j-1; k++) {
//							sum +=arr[k];
//						}
//						if (sum>max) {
//							max = sum;
//						}
//					} 
//			}
//		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] > 0) {
				arr[i] = arr[i] + arr[i-1];
			}
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("最大子数组之和为：\n"+max);

	}
	
	public static int[] generateArray(int len,int max,int min)
	{
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min)+min);
		}
		return arr;
	}

}
