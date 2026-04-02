package weather;

public class Email implements Notifier {
    @Override
    public String generateWeatherAlert(String weather) {
        return "It is " + weather;
    }
}