import java.util.*;
    class Task {
    int id;
    String name;
    boolean isDone;

    Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.isDone = false;
    }
    }
    

public class TodoApp {

    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int idCounter = 1;

        while (true) {

            System.out.println("\n--- TO DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            // ADD TASK
            if (choice == 1) {
                System.out.println("Enter task:");
                String name = sc.nextLine();

                tasks.add(new Task(idCounter++, name));
                System.out.println("Task added!");
            }

            // VIEW TASKS
            else if (choice == 2) {
                System.out.println("\nYour Tasks:");

                for (Task t : tasks) {
                    System.out.println(t.id + ". " + t.name +
                            (t.isDone ? " ✔ Done" : " ❌ Pending"));
                }
            }

            // MARK DONE
            else if (choice == 3) {
                System.out.println("Enter task id:");
                int id = sc.nextInt();

                for (Task t : tasks) {
                    if (t.id == id) {
                        t.isDone = true;
                        System.out.println("Marked as done!");
                    }
                }
            }

            // DELETE TASK
            else if (choice == 4) {
                System.out.println("Enter task id:");
                int id = sc.nextInt();

                tasks.removeIf(t -> t.id == id);
                System.out.println("Task deleted!");
            }

            else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}




    
