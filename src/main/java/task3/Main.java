package task3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Auth auth = new Auth();
        if (auth.authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
