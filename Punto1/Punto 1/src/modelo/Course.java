package modelo;

public class Course {
    private String code;
    private String title;
    private int description;

    public Course(String code, String title, int description) {
        this.code = code;
        this.title = title;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[" + code + "] " + title + ": " + description;
    }
}