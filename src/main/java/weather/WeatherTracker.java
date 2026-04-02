package weather;//package weather;
//
//public class WeatherTracker {
//    String currentConditions;
//    Phone phone;
//    Email email;
//
//    public WeatherTracker() {
//        phone = new Phone();
//        email = new Email();
//    }
//
//    public void setCurrentConditions(String weatherDescription) {
//        this.currentConditions = weatherDescription;
//        if (weatherDescription == "rainy") {
//            String alert = phone.generateWeatherAlert(weatherDescription);
//            System.out.print(alert);
//        }
//        if (weatherDescription == "sunny") {
//            String alert = email.generateWeatherAlert(weatherDescription);
//            System.out.print(alert);
//        }
//    }
//}


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherTracker {
    String currentConditions;
    private List<Notifier> notifiers = new ArrayList<>();
    public void addNotifier(Notifier notifier) {
        notifiers.add(notifier);
    }
    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (Objects.equals(this.currentConditions, "sunny")){
            this.addNotifier(new Phone());
        }else if (Objects.equals(this.currentConditions, "rainy")){
            this.addNotifier(new Email());
        }
        for (Notifier notifier : notifiers) {
            System.out.print(notifier.generateWeatherAlert(weatherDescription));
        }
    }
}