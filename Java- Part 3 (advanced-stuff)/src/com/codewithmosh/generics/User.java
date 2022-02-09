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
}
