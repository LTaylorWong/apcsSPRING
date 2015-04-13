import java.util.Random;

public class Selection{
    /*Methods:
    sorting then finding index of
    splitting bianrily
    */
    private int[] data;
    private int p
    public Selection(int[] stuff){
            data=stuff;
    }
    public Selection(int k){
        k=p;
    }
    
    public int pivot(){
        //chooses a pivot index
            Random r = new Random();
            int n = r.nextInt(data.length)+1;
            p=data[n];
    }
    
    public void partition(){
        //partitions the data set to those higher and lowerr than the pivot index
    }
//-----[Main]-------
public static void main(String[] args){
    Selection s = new Selection();
}
    }
