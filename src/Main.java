public class Main {
    public static void main(String[] args) {
        int isPresent=0;
        int isPartTime=2;
        int isAbscent=1;
        int dailySalery;
        int workHours;
        int salaryPerHours=20;
        int checkAttendence=(int)((Math.random()*10)%3);
        switch (checkAttendence)
        {
            case 0:
                    System.out.println("Employee is present");
                    workHours=8;
                    break;
            case 1:
                   System.out.println("Employee is parttime");
                   workHours=4;
                   break;
            default:
                   System.out.println("Emloyee is abscent");
                   workHours=0;
        }
     /*   if(checkAttendence==isPresent)
        {
            System.out.println("Emloyee is present");
            workHours=8;
        } else if (checkAttendence==isPartTime)
        {
            System.out.println("Employee is parttime");
            workHours=4;
        } else
        {
            System.out.println("Emloyee is abscent");
            workHours=0;
        }*/
        dailySalery=workHours*salaryPerHours;
        System.out.println("Daily salary is:"+dailySalery);
    }
}