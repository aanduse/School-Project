public interface LanguageDepartment extends School{
    public static final String DEPARTMENT_NAME = "Language Department";
    public abstract Instructor instructor();
    public abstract Student student();
    public String labName();
    public boolean isLabAvailable();
}
