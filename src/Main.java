public class Main {
    public static void main(String[] args) {
        int isPresent=0;
        int isAbscent=1;
        int checkAttendence=(int)((Math.random()*10)%2);
        if(checkAttendence==isPresent)
        {
            System.out.println("Emloyee is present");
        }
        else
        {
            System.out.println("Emloyee is abscent");
        }
    }
}