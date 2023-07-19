public class MainToDo {
    public static void main(String[] args) {

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
    public static String nameManOfMaxToDo(ToDo[] toDos){
        String name="";
        int max=toDos[0].countOfToDo(toDos);
        for (int i = 0; i <toDos.length ; i++) {
            if (toDos[i].countOfToDo(toDos)>max){
                max=toDos[i].countOfToDo(toDos);
                name=toDos[i].getName();
           }
        }
        return name;
    }
    public static String nameManOfMaxToDo1(ToDo[] toDos){
        String name="";
        int max=toDos[0].countOfToDo1(toDos);
        for (int i = 0; i <toDos.length ; i++) {
            if (toDos[i].countOfToDo1(toDos)>max){
                max=toDos[i].countOfToDo1(toDos);
                name=toDos[i].getName();
            }
        }
        return name;
    }
}
