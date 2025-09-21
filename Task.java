import java.util.*;


class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task: " + name + " (Priority " + priority + ")";
    }
}

class TaskManager {

    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();

    public void addTask(Task task) {
        taskQueue.add(task);
        System.out.println("Added " + task);
    }

    public void processNextTask() {
        Task next = taskQueue.poll();
        if (next != null) {
            System.out.println("Processing " + next);
        } else {
            System.out.println("No tasks left.");
        }
    }
}
