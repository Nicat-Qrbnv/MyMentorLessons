package lesson15.exercise;

public interface Transport {
    int getCapacity();
    String getDestination();
    void setDestination(String destination);
    void setDestination(String destination, int number);
}
