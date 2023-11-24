package searching;

public class binarySearch
{
        public void binaryS(int[] arr,int n,int item,int lb,int ub)
        {
            int loc =0;
            //if the person input the unsorted array this is to sort an array because the binary search is only exicuted on sorted array
            for(int i=0;i<n-1;i++)
            {
                for(int j=i;j<n-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            int mid=(ub+lb)/2;
            while(lb<=ub)
            {
                if(arr[mid]==item)
                {
                    loc =1;
                    break;
                }
                else if(arr[mid]<item)
                {
                    lb=mid+1;
                }
                else
                {
                    ub=mid-1;
                }
                mid=(ub+lb)/2;
            }
            if(loc==1)
            {
                System.out.println("search is successfull "+mid);
            }
            else {
                System.out.println("searching is unsuccessfull");
            }

        }
}
