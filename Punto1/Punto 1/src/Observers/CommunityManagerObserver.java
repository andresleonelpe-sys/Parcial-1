package Observers;
import modelo.Course;
import observer.Observer;

public class CommunityManagerObserver implements Observer {
  private final String name;
    public CommunityManagerObserver(String name) {
        this.name = name;
    }
    public void update(Course course) {
        System.out.println("Community Manager " + name + " notified of new course: " + course);
    }
}
