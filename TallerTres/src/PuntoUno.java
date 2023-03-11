public class PuntoUno {
    private String myString1;
    private String myString2;
    private String myString3;
    
    public PuntoUno() {
        
        myString1 = "abc";
        
       
        myString2 = new String("abc");
        
        
        char[] chars = {'a', 'b', 'c'};
        myString3 = new String(chars);
    }
    
    public String getMyString1() {
        return myString1;
    }
    
    public String getMyString2() {
        return myString2;
    }
    
    public String getMyString3() {
        return myString3;
    }
}
