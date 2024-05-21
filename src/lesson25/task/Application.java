package lesson25.task;

import java.util.Objects;

public class Application {
    private final String name;
    private double version;

    public Application(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name +", V%.2f".formatted(version);
    }
}
