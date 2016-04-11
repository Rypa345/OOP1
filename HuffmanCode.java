package belajarhuffmanmain;

/**
 *
 * @author Robert c. Ilardi rogue logic
 */
public class HuffmanCode {
    private int ascii;
    private String binary;
    
    public HuffmanCode(int ascii, String binary) {
        this.ascii = ascii;
        this.binary = binary;    
    }
    
    public int getAscii(){
        return ascii;
        
    }

    public String getBinary(){
        return binary;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("ASCII: ");
        sb.append(getAscii());
        sb.append("\n");
        sb.append("Binary: ");
        sb.append(getBinary());
        sb.append("\n");
        
        return sb.toString();
      }
}
