public class Movie {
    String title;
    String category;
    director director;
    int numAward;
     private Actor[] listacteor;
    public Movie(String title, String category, director director) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.listacteor = new Actor[10];
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public director getDirector() {
        return director;
    }

    public void setNumberofAward(int numAward) {
        director.setNumberOfMove(numAward);
    }

    public int getNumberofAward() {
        return director.getNumberOfMove();
    }

    public String toString() {
        return "Movie[title= " + title + ", Category=" + category + ", director name= " + director.getName()
                + ", director surname= " + director.getSurname() + ", number of award= " + getNumberofAward() + "]";
    }
    public void addactore(Actor actor, int position) {
        if (position >= 0 && position < listacteor.length) {
            listacteor[position] = actor;
        }
    }
   public void displayActors() {
    System.out.println("Actors in the "+title+":");
    for (Actor actor_1 : listacteor) {
        if (actor_1 != null) {
            System.out.println("- " + actor_1.getname());
        }
    }
}
    
        
    }

