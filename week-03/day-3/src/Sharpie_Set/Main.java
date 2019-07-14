package Sharpie_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SharpieSet sharpieSet = new SharpieSet();


        System.out.println(sharpieSet);
        System.out.println(sharpieSet.countUsable());
        sharpieSet.removeTrash();
        System.out.println(sharpieSet);
    }
}
