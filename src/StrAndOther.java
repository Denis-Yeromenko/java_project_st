import java.util.Scanner;

public class StrAndOther {
    public static void main(String[] args) {
        String[] month = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"};

        for(int i = 0; i < month.length; i++)
        {
            if(i != month.length-1)
            {
                System.out.print("\" " + month[i] + "\" " + ", ");
            } else{
                System.out.print("\" " + month[i] + "\" " + ".");
            }

        }

        int numOfMonth;
        String nameOfMonth;

        Scanner monthScan = new Scanner(System.in);
        System.out.println("\n Enter a number of month ");
        numOfMonth = monthScan.nextInt();

        switch (numOfMonth) {
            case 1: nameOfMonth = "Jan";
                break;
            case 2: nameOfMonth = "Feb";
                break;
            case 3: nameOfMonth = "Mar";
                break;
            case 4: nameOfMonth = "Apr";
                break;
            case 5: nameOfMonth = "May";
                break;
            case 6: nameOfMonth = "Jun";
                break;
            case 7: nameOfMonth = "Jul";
                break;
            case 8: nameOfMonth = "Aug";
                break;
            case 9: nameOfMonth = "Sep";
                break;
            case 10: nameOfMonth = "Oct";
                break;
            case 11: nameOfMonth = "Nov";
                break;
            case 12: nameOfMonth = "Dec";
                break;
            default: nameOfMonth = "Invalid number of month!";
        }
        System.out.println(nameOfMonth);
    }
}
