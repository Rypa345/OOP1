package belajarhuffmanmain;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BelajarHuffmanMain {
 private int[] charCounts;
    private float[] charProbabilities;
    private int totalBytes;
    private int distinctChars;
    private int[] charsOrder;
    
    public static final int MAX_CHAR = 256;
    public static final int MAX_BUFFER = 1024;
    public static final int COMPRESS =0;
    public static final int DECOMPRESS = 1;
    
    private LengthNode root;
    private ArrayList huffmanCodes;
    private HuffmanCode padding;
    
    public BelajarHuffmanMain() {
       charCounts = new int[MAX_CHAR];
       charProbabilities = new float[MAX_CHAR];
       clearStats();
       
    }
       //Clear statistical data
       private void clearStats(){
           totalBytes = 0;
           distinctChars = 0;
           root = null;
           huffmanCodes = null;
           
           for (int i = 0; i < MAX_CHAR; i++){
               charCounts[i] = 0;
               charProbabilities[i] = 0.0f;
           }
       }
       
       //GET the counts of each instance of each inuque ASCII
       //Character in an array of bytes. this array can be
       //the data from a input stream such as a file
               
      private void countCharacters (byte[] bArr, int len ){
    int iv;
    
    if (bArr != null){
        totalBytes += len;
        
        for (int i = 0; i < bArr.length && i < len; i++){
            iv = bArr[i] & 0xff;
            charCounts[iv]++;
        }
    }
} 
      //same as rhe method directly above.
      private void countCharacters(byte[] bArr){
          if (bArr != null){
              countCharacters(bArr, bArr.length);
          }
      }
      
      private void analyzeStream(InputStream ins)
              throws IOException{ 
          byte[] ba = new byte [MAX_BUFFER];
          int cnt;
          
          do{
              cnt = ins.read(ba);
              if (cnt > 0){
                  countCharacters(ba, cnt);
              }
          } while (cnt != -1);
              
              calculateProbabilities();
              sortCharOrder();
          }


     
       public static void main(String[] args) {
        // TODO code application logic here
    }
    
}





   
   