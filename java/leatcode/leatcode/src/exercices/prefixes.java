package exercices;

public class prefixes {
    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};

        String prefix="";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].charAt(i) == words[j].charAt(i)){
                    if (j >1){
                        prefix+=words[i].charAt(i);
                    }
                }
            }
        }
    }
}
