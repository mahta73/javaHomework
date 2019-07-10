
public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature mothTemperatures = new Temperature();
        mothTemperatures.inputTemperatures();
        double difference = mothTemperatures.hottestColdesDifference();
        System.out.println("The difference between coldest and the hotest day is " + difference);
        double average = mothTemperatures.averageTemperature();
        System.out.println("The average temperature is " + average);
    }
}