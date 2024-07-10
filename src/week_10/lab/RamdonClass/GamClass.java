package week_10.lab.RamdonClass;

import java.util.Random;

public class GamClass {

    private static String [] name={"Saeed","Ali","Ahmad"};

    public GamClass(String[] name) {
        this.name=name;

    }

    public  void printRandom(){

        Random random=new Random();

        int ramdoIndex= random.nextInt(name.length);
        String randomName=name[ramdoIndex];
        System.out.println("Random given name: "+ randomName);
    }
}
