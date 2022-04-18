package day11_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {

        if (false) {
            System.out.println("Hello World");} // if statement is false so it will not print

        System.out.println("Second Line"); // just a normal print statement, nothing to do with if statement

        if (true){
            System.out.println("Today is Monday");}//if statement is true, then it will print the value

        int score=80;
        if (score >= 75){
            System.out.println("passing");}// is true so it will print passing
        int score2=60;
        if (score2 >= 75){
            System.out.println("passing");}// is false so it will not print passing and will stop and will see nothing


        int year= 2020;
        boolean lockdown= year==2020 || year==2021;
        if(lockdown){
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("Wear mask");

        }
        if(!lockdown) {  // !false=true
            System.out.println("Party");
            System.out.println("Still practice java");
            System.out.println("Maybe travel");
        }

    }
}
