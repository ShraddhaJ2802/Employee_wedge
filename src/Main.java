public class Main {
    public static void main(String[] args) {
        int isPresent=0;
        int isAbscent=1;
        int dailySalery;
        int workHours;
        int salaryPerHours=20;
        int checkAttendence=(int)((Math.random()*10)%2);
        if(checkAttendence==isPresent)
        {
            System.out.println("Emloyee is present");
            workHours=8;
        }
        else
        {
            System.out.println("Emloyee is abscent");
            workHours=0;
        }
        dailySalery=workHours*salaryPerHours;
        System.out.println("Daily salary is:"+dailySalery);
    }
}