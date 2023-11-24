package searching;

public class linear {
    public void LinearSearch(int[] arr,int n,int item)
    {
        int loc =0;
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==item)
            {
                loc=1;
                break;
            }
        }
        if(loc==0)
        {
            System.out.println("the search is unsuccessful");
        }
        else {
            System.out.println("search is successfull at  index : - "+i);
        }

    }
}
