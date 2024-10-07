import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getYear() + "\n"
        + (now.getDayOfYear()/30+1) + "\n"
        + now.getDayOfMonth() + "\n");
    }
}