import java.lang.reflect.Array;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int imagesCount;
    private int videosCount;
    private User[] following;
    private User[] followers;

    boolean isValidName() {
        boolean valid = false;
        if (!firstName.matches("[0-9]") && !lastName.matches("[0-9]")) {
            valid = true;
        }
        return valid;
    }
    boolean isVip() {
        int count = 0;
        boolean isVip = false;
        for (int i = 0; i < followers.length; i++) {
            if (followers[i].isValidName()) {
                count++;
            }
        }
        if (isValidName() && imagesCount > 10 && videosCount > 10 && count > 10) {
            isVip = true;
        }
        return isVip;
    }
    int countMutualConnection(){
        int count=0;
        for (int i = 0; i <following.length ; i++) {
            for (int j = 0; j <followers.length ; j++) {
                if (following[i]==followers[j]){
                    count++;
                }
            }
        }
        return count;
    }
    void removeFakeUsers(){
        int count1=0;
        int count2=0;
        for (int i = 0; i <following.length ; i++) {
            if (following[i].isValidName()&&following[i].imagesCount>0&&following[i].videosCount>0&&following[i].countMutualConnection()>0||
                    following[i].isValidName()&&following[i].imagesCount>0&&following[i].countMutualConnection()>0||
                    following[i].isValidName()&&following[i].imagesCount==0&&following[i].countMutualConnection()>0||
                    following[i].isValidName()&&following[i].countMutualConnection()>0&&following[i].videosCount>0||
                    following[i].imagesCount>0&&following[i].countMutualConnection()>0&&following[i].videosCount>0){
                count1++;
            }
        }
        for (int i = 0; i <followers.length ; i++) {
            if (followers[i].isValidName()&&followers[i].imagesCount>0&&followers[i].videosCount>0&&followers[i].countMutualConnection()>0||
                    followers[i].isValidName()&&followers[i].imagesCount>0&&followers[i].videosCount>0||
                    followers[i].isValidName()&&followers[i].imagesCount>0&&followers[i].countMutualConnection()>0||
                    followers[i].isValidName()&&followers[i].videosCount>0&&followers[i].countMutualConnection()>0||
                    followers[i].isValidName()&&followers[i].imagesCount>0&&followers[i].videosCount>0){
                count2++;
            }
        }
        User[] resultFollowing=new User[count1];
        int counter1=0;
        for (int i = 0; i <following.length ; i++) {
            if (following[i].isValidName()&&following[i].imagesCount>0&&following[i].videosCount>0&&following[i].countMutualConnection()>0||
                    following[i].isValidName()&&following[i].imagesCount>0&&following[i].countMutualConnection()>0||
                    following[i].isValidName()&&following[i].imagesCount==0&&following[i].countMutualConnection()>0||
                    following[i].isValidName()&&following[i].countMutualConnection()>0&&following[i].videosCount>0||
                    following[i].imagesCount>0&&following[i].countMutualConnection()>0&&following[i].videosCount>0){
               resultFollowing[counter1]=following[i];
               counter1++;
            }
        }
        User[] resultFollowers=new User[count2];
        int counter2=0;
        for (int i = 0; i <followers.length ; i++) {
            if (followers[i].isValidName()&&followers[i].imagesCount>0&&followers[i].videosCount>0&&followers[i].countMutualConnection()>0||
                    followers[i].isValidName()&&followers[i].imagesCount>0&&followers[i].videosCount>0||
                    followers[i].isValidName()&&followers[i].imagesCount>0&&followers[i].countMutualConnection()>0||
                    followers[i].isValidName()&&followers[i].videosCount>0&&followers[i].countMutualConnection()>0||
                    followers[i].isValidName()&&followers[i].imagesCount>0&&followers[i].videosCount>0){
                resultFollowers[counter2]=following[i];
                counter2++;
            }
        }
        System.out.println(resultFollowing);
        System.out.println(resultFollowers);
    }
}
