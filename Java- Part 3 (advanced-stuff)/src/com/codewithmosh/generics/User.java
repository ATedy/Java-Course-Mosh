package src.com.codewithmosh.generics;

public class User implements Comparable<User>{
    private int points;
    public User(int points) {
        this.points = points;
    }
    @Override
    //comparing to objects based on points
    public int compareTo(User other) {
        return points - other.points;
    }

    /**
     *  we are overidding the to string method as it will simple display the string version of the reference
     */
    @Override
    public String toString() {
        return "Points = " + points;
    }
}
