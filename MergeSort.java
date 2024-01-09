public class MergeSort
{
    public static void main(String[] args) {
        int [] arr1={6,3,9,5,2,8};
        mergeSort(arr1,0,arr1.length-1);
        printArry(arr1);
    }

    public  static void mergeSort(int[] arr, int si, int ei){
        if (si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);//left part
        mergeSort(arr,mid+1,ei);//right part
        mergeAll(arr,si,mid,ei);
    }
    public static void mergeAll(int[] arr, int si, int mid, int ei){
        int[] temp =new int[(ei-si)+1];
        int l=si;//itaretor for left part
        int r=mid+1;//itaretor for right part
        int k=0;//iterator for temp array

        while (l<=mid && r<=ei)
        {
            if (arr[l] < arr[r])
            {
                temp[k]=arr[l];
                l++;
            }
            else
            {
                temp[k]=arr[r];
                r++;
            }
            k++;
        }
        //left part
        while (l<=mid)
        {
//            temp[k]=arr[l];
//            l++;
//            k++;
            temp[k++]=arr[l++];
        }
        //right part
        while (r<=ei)
        {
            temp[k++]=arr[r++];
//            temp[k]=arr[r];
//            r++;
//            k++;
        }
        //copy temp arr to original arr
        for (k=0, l=si; k< temp.length;k++,l++)
        {
            arr[l]=temp[k];
        }
    }

    public static void printArry(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
