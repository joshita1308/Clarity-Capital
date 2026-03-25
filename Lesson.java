public class Lesson {
    private Long id;
    private String title;
    private String category; // e.g., "Finance", "Realty"
    private String summary;

    // Constructor
    public Lesson(Long id, String title, String category, String summary) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.summary = summary;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getSummary() { return summary; }
}