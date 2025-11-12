import modelo.Course;
import impSubject.CourseCatalog;
import Observers.WebMasterObserver;
import Observers.JournalistObserver;
import Observers.CommunityManagerObserver;



public class App {
    public static void main(String[] args) {
        CourseCatalog catalog = new CourseCatalog("Programming Courses");

        WebMasterObserver webMaster = new WebMasterObserver("Andrea Mahecha");
        JournalistObserver journalist = new JournalistObserver("Luz Dary Valera");
        CommunityManagerObserver communityManager = new CommunityManagerObserver("Laura Molano");

        catalog.registerObserver(webMaster);
        catalog.registerObserver(journalist);
        catalog.registerObserver(communityManager);

        Course course1 = new Course("Java Programming", "Learn the basics of Java programming.", 40);
        Course course2 = new Course("Web Development", "Introduction to HTML, CSS, and JavaScript.", 50);

        catalog.addCourse(course1);
        System.out.println("---");
        catalog.addCourse(course2);

        catalog.removeObserver(journalist);
        System.out.println("---");
        Course c3 = new Course("Data Structures", "Learn about data structures in computer science.", 45);
        catalog.addCourse(c3);
    }
}
