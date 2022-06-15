import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Clear the console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    // Create Variables
    int foundIndex;
    
    // Create a toolbox object
    toolbox tools = new toolbox();
    
    // Create a scanner object
    Scanner scanner = new Scanner(System.in);

    System.out.println("Would you like to search for a string or int?");
    String searchType = scanner.nextLine();
    System.out.println();
    
    System.out.println("Please type a key to search for:");
    if(searchType.equalsIgnoreCase("string")){
      String key = scanner.nextLine();
      foundIndex = tools.stringSearch(files.readStringFile("inputStringsFile.txt"), key);
    }else {
      int key = scanner.nextInt();
      scanner.nextLine();
      foundIndex = tools.intSearch(files.readIntFile("inputIntsFile.txt"), key);
    }

    System.out.println();

    if(foundIndex >= 0){
      System.out.println("Key was found in the array at index " + foundIndex);
    }
    else{
      System.out.println("Key was not found in the array.");
    }
  }
}