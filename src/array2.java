public class array2 {
    public static void main(String[] args){
        int array[]={2,9,12,3,1};
        //int large=array[0];
        int smallest=array[0];
        for(int i=1;i<array.length;i++){
            //if(array[i]>large){//if condition false come out from the loop
                //large=array[i];
            if (array[i]<smallest){
                smallest=array[i];//smallest value in array
            }
        }
        //System.out.println(large);
    System.out.println(smallest);
    }
}
