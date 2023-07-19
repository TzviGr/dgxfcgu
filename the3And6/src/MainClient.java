public class MainClient {
    public static void main(String[] args) {

    }
    public static void printClients(Client[] clients) {
        boolean hasMembers = false;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].isClubMember()) {
                System.out.println(clients[i].getFirstName() + " " + clients[i].getLastName());
                hasMembers = true;
            }
        }
        if (!hasMembers) {
            System.out.println("No Members Yet");
        }
    }
    public static void printNameOfClient(Client[] clients,int year){
        int max=clients[0].discount(year);
        String name="";
        for (int i = 0; i < clients.length ; i++) {
            if (clients[i].discount(year)>max){
                max=clients[i].discount(year);
                name=clients[i].getFirstName();
            }
        }
        System.out.println(name);
    }
}


