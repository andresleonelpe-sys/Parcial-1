package impSubject;

import observer.Subject;
import observer.Observer;
import modelo.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog implements Subject {
    private final List<Observer> observers;
    private final List<Course> courses;
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        if (o==null) return;
        if (!observers.contains(o)) observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers(Course course) {
        for (Observer o : new ArrayList<>(observers)){
            o.update(course);
        }
    }
    public void addCourse(Course course) {
        if (course == null) return;
        courses.add(course);
        System.out.println("New course added: " + course);
        notifyObservers(course);
    }
    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }
}