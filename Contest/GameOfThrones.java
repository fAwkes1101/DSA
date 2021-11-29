//If the given string can be converted to a palindromic string or not

public static String gameOfThrones( String s){

     int[] freq = new int[26]; //Frequency array
  
  for(char ch: s.toCharArray()){
  
     freq[ch-'a']++;
  }
  int odd count =0;
  for(int i=0;; i<26 ;i++){
     if(freq[i]%2==1){
     oddCount++;
     }
  }
  if(oddcount<=1) return "YES";
  else return "NO";
}
 }
