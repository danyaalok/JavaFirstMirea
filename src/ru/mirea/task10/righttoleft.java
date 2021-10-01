package ru.mirea.task10;

public class righttoleft {

    public righttoleft() {}

    public void task(int n){
        if (n!=0){
            task(n/10);
            System.out.print(n%10 + " ");
        }
    }

    public static void main(String[] args) {
        righttoleft a = new righttoleft();
        a.task(1234);
    }
}
