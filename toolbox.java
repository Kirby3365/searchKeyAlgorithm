public class toolbox{
  public int stringSearch(String[] searchArr, String key){
    for(int i = 0; i < searchArr.length; i++){
      if(key.equals(searchArr[i])){
        return i;
      }
      if(i == searchArr.length - 1){
        return -1;
      }
    } 
    return -1;
  }

  public int intSearch(int[] searchArr, int key){
    for(int i = 0; i < searchArr.length; i++){
      if(key == searchArr[i]){
        return i;
      }
      if(i == searchArr.length - 1){
        return -1;
      }
    } 
    return -1;
  }

  public void PrintArray(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}