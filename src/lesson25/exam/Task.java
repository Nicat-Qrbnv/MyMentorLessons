package lesson25.exam;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private final String text;
    private final PriorityLevel priority;

    public Task(String text, int maxHour) {
        this.text = text;
        if (maxHour >= 0 && maxHour <= 4) {
            this.priority = PriorityLevel.LOW;
        } else if (maxHour <= 8) {
            this.priority = PriorityLevel.MEDIUM;
        } else {
            this.priority = PriorityLevel.HIGH;
        }
    }

    public String getText() {
        return text;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task t) {
        return (this.priority.ordinal() - t.priority.ordinal()) * 100 + this.text.compareTo(t.text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(text, task.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "[ " + priority + " ] Task: " + text;
    }
}
