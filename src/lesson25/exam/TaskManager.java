package lesson25.exam;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask (Task task) throws DuplicateTaskException {
        for (Task t : tasks) {
            if (task.equals(t)) throw new DuplicateTaskException("Task exists!");
        }
        tasks.add(task);
    }

    public void removeTask (String text) {
        for (Task t : tasks) {
            if (t.getText().equals(text)) {
                tasks.remove(t);
                break;
            }
        }
    }

    @Override
    public String toString() {
        tasks.sort((t1, t2) -> t2.getPriority().compareTo(t1.getPriority()));
        StringBuilder list = new StringBuilder("The tasks: \n");
        tasks.forEach(t -> list.append(t.toString().indent(4)));
        return list.toString();
    }
}
