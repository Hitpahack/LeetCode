class Solution3174A {
    public static int[] twoSum(int[] arr, int target) {
         int a[]=new int[2];
        a[0]=-1;
        a[1]=-1;
        for(int i=0;i<arr.length;i++)   
        {
           for(int j=i+1;j<arr.length;j++) 
           {
               if(arr[i]+arr[j]==target)
               {
                   a[0]=i;
                   a[1]=j;
                   break;
               }
           }
        }
        return a;
    }
    public static void main(String args[]) {
        int[] a = { 1, 4, 5, 11, 12 };
        int target = 9;
        for (int x : twoSum(a, target))
            System.out.print(x + " ");
    }
}