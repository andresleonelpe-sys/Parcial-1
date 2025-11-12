package Observers;
import modelo.Course;
import observer.Observer;

public class WebMasterObserver implements Observer {
  private final String name;
    public WebMasterObserver(String name) {
        this.name = name;
    }
    public void update(Course course) {
        System.out.println("WebMaster " + name + " notified of new course: " + course);
    }
}
