/*import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap to store alphabetical values
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        // Store alphabetical values from A to Z
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            int numericValue = letter - 'A' + 1;
            alphabetMap.put(letter, numericValue);
        }

        // Access values in the hashmap
        System.out.println(alphabetMap);
        System.out.println(alphabetMap.get('A')); // Output: 1
        System.out.println(alphabetMap.get('Z')); // Output: 26
    }
}*/
    import java.util.HashMap;
    public int hashmap(String s) {
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        int i;
        // Store alphabetical values from A to Z
        for (char letter = 'a'; letter <= 'z'; letter++) {
            int numericValue = letter - 'a' + 1;
            alphabetMap.put(letter, numericValue);
        }
        for(i=0;i<s.length;i++)
        {
            s[i]=alphabetMap.get(s[i]);
            System.out.print(s[i]);
        }
        
    }
    hashmap("Avishek");

