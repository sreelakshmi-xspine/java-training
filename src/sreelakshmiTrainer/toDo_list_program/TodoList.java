package toDo_list_program;

import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> task = new ArrayList<>();
        addTask(task, "Buy groceries");
        addTask(task, "Cook Dinner");
        addTask(task, "Complete pending works");
        displayTask(task);

        removeTask(task, 1);
        displayTask(task);

    }

    static void addTask(ArrayList<String> listOfTasks, String task) {
        listOfTasks.add(task);
        System.out.println("Task" + task + " added successfully.");
    }

    static void removeTask(ArrayList<String> listOfTasks, int taskNumber) {
        if (listOfTasks.isEmpty()) {
            System.out.println("The task list is empty! Nothing to remove.");
        } else if ((taskNumber > 0)) {
            listOfTasks.remove(taskNumber);
            System.out.println("Removed task successfully");
        } else {
            System.out.println("wrong task number");
        }
    }

    static void displayTask(ArrayList<String> listOfTasks) {
        if (listOfTasks.isEmpty()) {
            System.out.println("The current Todo list is empty");
        } else {
            System.out.println("Current To-do List");
            for (int i = 0; i < listOfTasks.size(); i++) {
                System.out.println((i + 1) + "." + listOfTasks.get(i));
            }
        }
    }

}
