package HashTable;


public class FirstUniqueCharacterIsAString387 {
    //soo slow
    public int firstUniqChar(String s) {
       int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(i)){ count++; }

                if (s.charAt(j) == s.charAt(i) && i != j){
                     count = 0;
                    j = s.length();
                }

                if (count == s.length()-1){ return i; }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterIsAString387 firstUniqueCharacterIsAString387 = new FirstUniqueCharacterIsAString387();
        System.out.println(firstUniqueCharacterIsAString387.firstUniqChar("aahss"));
    }
}
