import java.util.Scanner;
public class TestPalindromicWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner input = new Scanner (System.in);
	 String inStr;
	 inStr = input.nextLine().toLowerCase();
	 TestPalindromicWord ( inStr );
	 TestPalindromicPhrase (inStr);
	}
	 public static void TestPalindromicWord (String inStr) {
	  int strLen = inStr.length();
      int fIdx = 0;
      int bIdx = strLen - 1;
      while ( fIdx < bIdx ) {
    	 if (inStr.charAt(fIdx) == inStr.charAt(bIdx) ) {
    	  ++fIdx;
          --bIdx; 
    	 } else {
    		fIdx = 3 ;
    		bIdx = 1 ;
    	 }  
      }
      if(bIdx == fIdx + 1 || bIdx == fIdx ) {
    	 System.out.println("'" + inStr + "' is palindrome");
      } else
    	 System.out.println("'" + inStr + "' is not palindrome");
	  }
	
	public static void TestPalindromicPhrase (String inStr) {
     String ouStr = inStr.replaceAll("[-+.^:,_'!()”*]","").replaceAll(" ", "");
	 int strLen = ouStr.length();
	 int fIdx = 0;
	 int bIdx = strLen - 1;
	 while ( fIdx < bIdx ) {
	    if (ouStr.charAt(fIdx) == ouStr.charAt(bIdx) ) {
	     ++fIdx;
	     --bIdx; 
	    } else {
	     fIdx = 3 ;
	     bIdx = 1 ;
	    }  
	     }
	    if(bIdx == fIdx + 1 || bIdx == fIdx || fIdx == bIdx + 1) {
	      System.out.println("'" + inStr + "' is TestPalindromicPhrase");
	    } else
	      System.out.println("'" + inStr + "' is not TestPalindromicPhrase");
		}		
}