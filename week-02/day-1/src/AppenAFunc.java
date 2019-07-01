public class AppenAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        appendAFunc(typo);
        System.out.println(appendAFunc(typo));
    }

    private static String appendAFunc(String name) {
        String newName = name+"a";

        return newName;
    }
}
