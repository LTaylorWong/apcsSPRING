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
            Random r = new Random();
            int n = r.nextInt(data.length)+1;
            p = n;
    }
//-----[Main]-------
public static void main(String[] args){
    Selection s = new Selection();
}
    }
