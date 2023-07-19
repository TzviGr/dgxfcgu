public class ToDo {
    private String dis;
    private String name;
    private boolean isDone;

    public String getName() {
        return name;
    }

    public String getDis() {
        return dis;
    }

    public boolean getIsDone() {
        return isDone;
    }
    public int countOfToDo(ToDo[] toDos){
        int count=0;
        for (int i = 0; i <toDos.length ; i++) {
            if (!toDos[i].getIsDone()){
                count++;
            }
        }
        return count;
    }
    public int countOfToDo1(ToDo[] toDos){
        int count=0;
        for (int i = 0; i <toDos.length ; i++) {
            if (toDos[i].getIsDone()){
                count++;
            }
        }
        return count;
    }
}
