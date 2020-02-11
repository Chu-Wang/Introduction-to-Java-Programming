package chapter06;

/**
 * @author WangMingMing
 * @creat 2020-02-11 10:16
 */
public class Exercise06_38 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 10 == 0){
                System.out.println(getRandomUpperCaseLetter());
            }else{
                System.out.print(getRandomUpperCaseLetter() + " ");
            }
        }

        for(int i = 1; i <= 100; i++){
            if(i % 10 == 0){
                System.out.println(getRandomDigitCharacter());
            }else{
                System.out.print(getRandomDigitCharacter() + " ");
            }
        }
    }
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }
}
