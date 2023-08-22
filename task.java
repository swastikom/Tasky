import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Task {
    public int id;
    public String title;
    public String priority;

    public Task(String title, String priority) {
        this.id = nextId++;
        this.title = title;
        this.priority = priority;
    }
}

class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Taanky!");
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

            }
        }
    }
}
