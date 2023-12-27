import java.time.Instant;

public class EpochSecondsExample {
    public static void main(String[] args) {
        long epochSeconds = Instant.now().getEpochSecond();
        System.out.println(epochSeconds);
    }
}
