package week_13.finallKeyWord;

public class CountWord {
    public static void main(String[] args) {
        String str="hello World World";
        String search="World";
        int coutword=0;
        for (String word:str.split(" ")){
            if( word.equals(search)) coutword++;{


            }
        }
        System.out.println(coutword);
    }
}
