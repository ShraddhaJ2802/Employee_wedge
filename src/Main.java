public class Main {

    int isPresent=0;
    int isPartTime=2;
    int isAbscent=1;
    int dailySalery;

  //  int salaryPerHours=20;
   // int numOfWorkingDays=2;

    //int maxHrsInMonth=10;
    public  int computeEmpWage (String company , int salaryPerHours , int numOfWorkingDays , int maxHrsInMonth)
        {
            int workHours=0;  int totalEmpWage=0;
            int totalEmpHrs=0, totalWorkingDays=0;
            while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {

                totalWorkingDays++;
                int checkAttendence = (int) ((Math.random() * 10) % 3);

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
                totalEmpHrs += workHours;
                System.out.println("Days#: " + totalWorkingDays + "Emp hr: " + workHours);
                //dailySalery=workHours*salaryPerHours;
                //totalEmpWage+=dailySalery;

                //System.out.println("Daily salary is:"+dailySalery);
            }
            totalEmpWage = workHours * salaryPerHours;
            System.out.println("Total employee sallary is:" + totalEmpWage);
            return totalEmpWage;
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
    public static void main(String[] args) {

        Main emp=new Main();
        emp.computeEmpWage("DMart" , 20 ,2 ,10);
        emp.computeEmpWage("Reliance" , 10 ,4 ,20);

    }
}