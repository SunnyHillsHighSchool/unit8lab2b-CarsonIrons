public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
//create counter
int count=0;
//traverse rows
for(int r=0;r<nameArray.length;r++){
//traverse columns
for(int c=0; c<nameArray[0].length;c++){
//check whether the current String contains target name (assuming the Strings inputed to the array are in //the correct format "lastName, FirstName"), if it does increment count
if(nameArray[r][c].substring(0,lastName.length()).toLowerCase().equals(lastName.toLowerCase())){
count++;
//end if
}
//end nested loop
}
//end outter loop
}
//return count
return count;
//end method
  }
    
}