public class Main {
    public static void main(String[] args) {
        int isPresent=0;
        int isPartTime=2;
        int isAbscent=1;
        int dailySalery;
        int workHours=0;
        int salaryPerHours=20;
        int numOfWorkingDays=2;
        int totalEmpWage=0;
        int totalEmpHrs=0,totalWorkingDays=0;
        int maxHrsInMonth=10;


        while (totalEmpHrs <=maxHrsInMonth && totalWorkingDays <numOfWorkingDays)
        {

            totalWorkingDays++;
            int checkAttendence=(int)((Math.random()*10)%3);

             // for (int day=0; day < numOfWorkingDays; day++) {

               switch (checkAttendence) {
                case 0:
                    System.out.println("Employee is present");
                    workHours = 8;
                    break;
                case 1:
                    System.out.println("Employee is parttime");
                    workHours = 4;
                    break;
                default:
                    System.out.println("Emloyee is abscent");
                    workHours = 0;
            }
            totalEmpHrs+=workHours;
            System.out.println("Days#: "+totalWorkingDays +"Emp hr: "+workHours);
            //dailySalery=workHours*salaryPerHours;
            //totalEmpWage+=dailySalery;

            //System.out.println("Daily salary is:"+dailySalery);
        }
        totalEmpWage=workHours*salaryPerHours;
        System.out.println("Total employee sallary is:"+totalEmpWage);
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

    }
}