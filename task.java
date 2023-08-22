import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Task {
    private String title;
    private int priority;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle() {

        this.title = title;
    }

    public int getPriority() {

        return priority;
    }

    public void setPriority() {

        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "\nPriority: " + priority;

    }
}

class Main {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Tasky!");
            System.out.println("1. Task List");
            System.out.println("2. Add Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    taskList();
                    break;
                case 2:
                    addTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }

        }
    }

    private static void taskList() {
        class TaskManager {
            private List<Task> tasks;
        
            public TaskManager() {
                tasks = new ArrayList<>();
            }
    }

    private static void addTask() {
        System.out.println("Enter Task Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Task Priority: ");
        int priority = scanner.nextInt();
        Task task = new Task(title, priority);
        tasks.add(task);
        System.out.println("Task Created Successfully!");
    }

    private static void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("No Tasks are there!");
            return;
        }
        System.out.println("Enter Task number Delete!");
        int taskNumber = scanner.nextInt();
        scanner.nextInt();
    }
}

// Title:Task Name,
// Priority:
// High

// Title:Task Name,
// Priority:
// High

// Title:Task Name,
// Priority:
// High

// Title:
// Task Name,
// Priority:
// High