import java.util.Map;
import java.util.HashMap;

interface Task {
    void execute();

    int getPriority();
}

class BackUpTask implements Task {
    int priority;

    public BackUpTask() {
        this.priority = 4;
    }

    public void execute() {
        System.out.println("from backuptask");
    }

    public int getPriority() {
        return priority;

    }
}

class CleanUpTask implements Task {
    int priority;

    public CleanUpTask() {
        this.priority = 2;
    }

    public void execute() {
        System.out.println("from cleanuptask");
    }

    public int getPriority() {
        return priority;
    }
}

class ReportTask implements Task {
    int priority;

    public ReportTask() {
        this.priority = 3;
    }

    public void execute() {
        System.out.println("from reporttask");
    }

    public int getPriority() {
        return priority;
    }
}

class LaunchTask {

    Map <Integer,Task> mp = new HashMap<>();

    public void addTask(Task task) {
        mp.put(task.getPriority(), task);
    }


    public void executeTask(){

        while(!mp.isEmpty()){
            int maxp = Integer.MIN_VALUE;
            int selected_p = -1;
    
            for (Integer priority  : mp.keySet()){
                if (priority > maxp){
                    maxp = priority;
                    selected_p = priority;
                }
            }
            if(selected_p != -1){
                mp.get(selected_p).execute();
                mp.remove(selected_p);
                maxp = Integer.MIN_VALUE;
            }
        }
    }

    public static void main(String[] args) {
        LaunchTask scheduler = new LaunchTask();

        // Adding tasks
        scheduler.addTask(new BackUpTask());
        scheduler.addTask(new CleanUpTask());
        scheduler.addTask(new ReportTask());

        // Execute tasks based on priority
        scheduler.executeTask();

}
}