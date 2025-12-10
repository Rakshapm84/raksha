public class    array1 {
    public static void main(String[] args){
        int array[]={4,1,7,3,8};
        //for(int i=0;i<array.length;i++)  /*   */ comment for multi line
        // {                                // is for single line comment
        //System.out.println(array[i]);
        array[1]=4;// modify the array
        for (int i:array)
        {
            System.out.println(i);
           // System.out.println(array);// if we need to access 1 value index means we need to use
        }
    }
}
