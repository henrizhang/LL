/* Henry Zhang
 ;APCS2 pd9
 ;HW #12b: Truckin’ Through the Night
 ;2016-03-14
 */


public class LList implements List{
    private LLNode head;
    public LList(){
        head=null;
    }
    public boolean add(String x){
        head= new LLNode(x, head);
	return true;
    }
    public String get(int i){
        LLNode temp=head;
        int x=0;
        while(x<i){
            temp=head.getLinkage();
            x++;
        }
        return temp.getCargo();
        
    }
    
    public String set(int i, String x){
        int p=0;
        LLNode temp=head;
        while(p<i){
            temp=head.getLinkage();
            p++;
        }
       
	LLNode end= new LLNode(x, head.getLinkage());
        head.setLinkage(end);
	return head.getCargo();
	
    }
    public int size(){
        int x=0;
	LLNode temp=head;
        while(1==1){
            if (head.getCargo()==null){
                return x;
            }
            else{
                temp=head.getLinkage();
                x++;
            }
        }
        
    }
    
}
