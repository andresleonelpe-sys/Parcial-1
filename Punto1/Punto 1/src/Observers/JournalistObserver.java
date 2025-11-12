package Observers;
import modelo.Course;
import observer.Observer;

public class JournalistObserver implements Observer {
  private final String name;
    public JournalistObserver(String name) {
        this.name = name;
    }
    public void update(Course course) {
        System.out.println("Journalist " + name + " notified of new course: " + course);
    }
}
