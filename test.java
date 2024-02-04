public class test {
    public static void main(String[] args) {
        director director_1=new director("james", "cameron");
        director_1.getName();
        director_1.getSurname();
        director_1.setNumberOfMove(23);
        director_1.getNumberOfMove();
        director_1.setbod(new date(12, 5, 1980));
        director_1.getDob();

        date dob=new date(16, 8, 1954);
        director_1.setbod(dob);
        System.out.println(director_1.toString());
        System.out.println("name is: " + director_1.getName());
        System.out.println("Surname is: " + director_1.getSurname());
        System.out.println("Date of birth is: " + director_1.getDob());
        System.out.println("Number of directed movies is: " + director_1.getNumberOfMove());

       Movie Movie_1=new Movie("Aveter", "Fantasy", director_1);
        System.out.println(Movie_1.toString());
        System.out.println("title is: " + Movie_1.getTitle());
        System.out.println("category is: " + Movie_1.getCategory());
        System.out.println("name of director is: " + Movie_1.getDirector().getName());
        System.out.println("surname of director is: " + Movie_1.getDirector().getSurname());
        System.out.println("number of awards is " + Movie_1.getNumberofAward());

        Actor actor_1=new Actor("David Moore");
        Actor actor_2=new Actor("Chritian Bale");
       Movie_1.addactore(actor_2,0);
       Movie_1.addactore(actor_1, 1);
       Movie_1.displayActors();
    }
}
