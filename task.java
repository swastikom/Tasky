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
            
            System.out.println();
            System.out.println("Welcome to Tasky!");
            System.out.println();
            System.out.println("1. Task List");
            System.out.println("2. Add Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

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
        if (tasks.isEmpty())
        {
            System.out.println( "No tasks exits!");
        }
       else{
        System.out.println("List of Tasks : ");
        for (int i = 0 ; i < tasks.size() ; i++ )
        {
            System.out.println(tasks.get(i));
            System.out.println();
        }
       }
    }

    private static void addTask() {
        System.out.println();
        System.out.println("!-------------Add Task----------------!");
        System.out.println();
        System.out.println("Enter Task Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Task Priority: ");
        int priority = scanner.nextInt();
        Task task = new Task(title, priority);
        tasks.add(task);
        System.out.println();
        System.out.println("!------Task Created Successfully------!");
        System.out.println();
    }

    private static void deleteTask() {
    if (tasks.isEmpty()) {
        System.out.println("Oops! No task to Delete.");
        return;
    }

    
        System.out.println("!-----------Delete Task-------------!");

    System.out.println();
    System.out.print("Enter the task number to delete: ");
    int taskNumber = scanner.nextInt();
    scanner.nextLine();  // Consume the newline character

    if (taskNumber < 1 || taskNumber > tasks.size()) {
        System.out.println("Invalid task number.");
        return;
    }

    Task removedTask = tasks.remove(taskNumber - 1);
    System.out.println();
    System.out.println("!------Task removed------!");
    System.out.println();
    System.out.println(removedTask);
    System.out.println();
    System.out.println("!------------------------!");
    System.out.println();
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