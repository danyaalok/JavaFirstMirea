package ru.mirea.task29;

import java.io.*;
import java.util.Arrays;

class CurrencyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] UserId;
    private String[] UserPassword;
    private double[] UserBalance;

    public CurrencyInfo(String[] UserId, String[] UserPassword, double[] UserBalance){
        this.UserId = UserId;
        this.UserPassword = UserPassword;
        this.UserBalance = UserBalance;
    }

    public String[] getUserId() {
        return UserId;
    }

    public void setUserId(String[] UserId) {
        this.UserId = UserId;
    }

    public String[] getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String[] UserPassword) {
        this.UserPassword = UserPassword;
    }

    public double[] getUserBalance() {
        return UserBalance;
    }

    public void setUserBalance(double[] UserBalance) {
        this.UserBalance = UserBalance;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "UserId=" + Arrays.toString(UserId) +
                ", UserPassword=" + Arrays.toString(UserPassword) +
                ", UserBalance=" + Arrays.toString(UserBalance) +
                '}';
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] UserId = {"Name1", "Name2", "Name3"};
        String[] UserPassword = {"123", "321", "aaa"};
        double[] UserBalance = {2134.4,23422.1, 444.3};

        CurrencyInfo currencyInfo = new CurrencyInfo(UserId, UserPassword, UserBalance);

        FileOutputStream outputStream = new FileOutputStream("TestFile.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("TestFile.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo currencyInfo2 = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(currencyInfo2);
    }
}
