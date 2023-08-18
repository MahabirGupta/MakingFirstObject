package MovieClass;

public class MovieTestDrive {

    public static void main(String[] args) {

//        Creat object 1 of Movie class
        Movie one = new Movie();
        one.title = "Gone with the Wind!";
        one.genre = "Tragic";
        one.rating = -2;

        //        Creat object 2 of Movie class
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space!";
        two.genre = "Comedy";
        two.rating = -5;
//        calling the playIt() method in the Movie Class
        two.playIt();

        //        Creat object 3 of Movie class
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting!";
        three.rating = 127;

    }

}
