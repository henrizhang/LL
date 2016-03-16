/* Henry Zhang
 ;APCS2 pd9
 ;HW #12a: We Got a Big Ol’ Convoy...
 ;2016-03-14
 */

public class LLNode{
    private String _cargo;
    private LLNode _next;
    //instance vars
    
    public LLNode(String cargo, LLNode next) {
        _cargo=cargo;
        _next=next;
    }
    //constructor
    public void setCargo(String cargo){
        _cargo=cargo;
        
    }
    //node's data mutator
    public String getCargo(){
        return _cargo;
    }
    //node's data accessor
    public void setLinkage(LLNode next){
        _next=next;
    }
    //change linkage
    public String getStringLinkage(){
        return _next.getCargo();
    }
    public LLNode getLinkage(){
        return _next;
    }
    //linked node accessor
}
