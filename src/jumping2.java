public class jumping2 {//condition statement
    public static void main(String[] args){
        int i=1;
        while(i<=10)
        {
            i++;
            if(i==5)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
