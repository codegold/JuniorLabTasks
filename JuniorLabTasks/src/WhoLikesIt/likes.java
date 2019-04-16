package WhoLikesIt;

public class likes {
    public static String likes(String[] names) {
        String addComment = "";
        if (names.length == 0 || names[0].isEmpty()) {
            addComment += "no one likes this";
        } else if (names.length == 1) {
            addComment += names[0] + " likes this";
        } else if (names.length == 2) {
            addComment += names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            addComment += names[0] + "," + names[1] + " and " +
                    names[2] + " like this";
        } else if (names.length > 3) {
            addComment += names[0] + "," + names[1] + " and " +
                    (names.length-2) + " others like this";}

        return addComment;
    }


    public static void main(String[] args) {
   //     System.out.println(likes(""));
//        System.out.println(likes("Peter"));
//        System.out.println(likes("Jacob", "Alex"));
//        System.out.println(likes("Max", "John", "Mark"));
//        System.out.println(likes("Alex", "Jacob", "Mark", "Max"));
    }

}