package Sharpie_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SharpieSet sharpieSet = new SharpieSet();
        fillSharpieSet(sharpieSet);
        useSharpie(sharpieSet,100);
        System.out.println(writeOut(sharpieSet));


        System.out.println(sharpieSet.countUsable());
        sharpieSet.removeTrash();
        System.out.println(writeOut(sharpieSet));
    }

    private static void useSharpie(SharpieSet sharpieSet, int inkAmount) {
        for (int i = 0; i <sharpieSet.sharpieList.size() ; i++) {
            sharpieSet.sharpieList.get(i).use(inkAmount);
        }
    }


    private static List<String> writeOut(SharpieSet sharpieSet) {
        List<String> arrayLine = new ArrayList<>();
        String stringLine;
        for (Sharpie sh:sharpieSet.sharpieList) {
            stringLine = " Color: "+sh.color+" Width: "+sh.width+" Amount: "+sh.inkAmount+"\n";
             arrayLine.add(stringLine);
        }

        return arrayLine;
    }


    private static SharpieSet fillSharpieSet(SharpieSet sharpieSet) {
        sharpieSet.add("red",15);
        sharpieSet.add("blue", 28);
        sharpieSet.add("green", 18);
        sharpieSet.add("yellow",88);

    return sharpieSet;

    }


}
