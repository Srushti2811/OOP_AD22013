public class PraticalNo4 {

    public static void printName(String name) {
       
        name = name.trim();
       
        
        String[] names = name.split("\\s+");

        
        if (names.length >= 2) {
           
            String formattedName = names[names.length - 1] + ", " + names[0];
            System.out.println(formattedName);
        } else {
            
            System.out.println("Invalid name format");
        }
    }

    public static void main(String[] args) {
        
        String nameInput = "   Bill    Joy   ";
        printName(nameInput);
    }
}

