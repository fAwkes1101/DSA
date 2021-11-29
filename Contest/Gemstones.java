int[] freq = new int[26]; //Freq array 

for(int i=0 ;i<arr.size(); i++)// loop on array of strings
{
 int[] tempfreq = new int[26];
  for(int j=0; j< arr.get(i).length(); i++){ // loop on each string
   char ch = arr.get(i).charAt(j);
    tempfreq[ch- 'a']++;
  }
  
  for(int j=0; j<26; j++){ //updating freq array
  
    if(tempfreq[j]>0){
    freq[j]++;
    }
   }
}
int countofGemStones=0;
for(int i=0;i<26; i++){ //counting geM Stones
 
  if(freq[i]==arr.size()){
    
    countofGemStones++;
  }

}
return countofGemStones;
