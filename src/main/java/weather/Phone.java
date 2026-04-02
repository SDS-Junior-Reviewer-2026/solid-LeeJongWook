package weather;

public class Phone implements Notifier {
    @Override
    public String generateWeatherAlert(String weather) {
        return "It is " + weather;
    }
}
