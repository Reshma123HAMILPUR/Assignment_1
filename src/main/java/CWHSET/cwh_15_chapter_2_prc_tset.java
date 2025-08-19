package CWHSET;

public class cwh_15_chapter_2_prc_tset {
    public static void main(String[] args){



//    problem_1

//    String name = "Reshma";
//    name = name.toLowerCase();
//    System.out.println(name);


//    problem_2

        String text = " india   \n" +
                "        i\n" +
                "        n\n" +
                "        d\n " +
                "       i\n " +
                "        a\n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
          "                  \n" +
          "                   \n" +
          "                     \n";
        text = text.replace( " ", "_");
        System.out.println(text);




//            problem _3
        String letter =  "Dear <|name|>, thanks a lot ";
        letter = letter.replace( " <|name|> ", "Reshma");
        System.out.println(letter);

}


}