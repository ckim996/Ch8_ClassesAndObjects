public class Month
{
    private int monthNumber;

    public Month()
    {
        monthNumber = 1;
    }

    public Month(int monthNum)
    {
        monthNumber = monthNum;
        if(monthNum < 1 || monthNum > 12)
            monthNumber =1;
    }

    public Month(String month)
    {
        if(month.equalsIgnoreCase("January"))
        {
            monthNumber = 1;
        }else if(month.equalsIgnoreCase("February"))
        {
            monthNumber = 2;
        }else if(month.equalsIgnoreCase("March"))
        {
            monthNumber = 3;
        }else if(month.equalsIgnoreCase("April"))
        {
            monthNumber = 4;
        }else if(month.equalsIgnoreCase("May"))
        {
            monthNumber = 5;
        }else if(month.equalsIgnoreCase("June"))
        {
            monthNumber = 6;
        }else if(month.equalsIgnoreCase("July"))
        {
            monthNumber = 7;
        }else if(month.equalsIgnoreCase("August"))
        {
            monthNumber = 8;
        }else if(month.equalsIgnoreCase("September"))
        {
            monthNumber = 9;
        }else if(month.equalsIgnoreCase("October"))
        {
            monthNumber = 10;
        }else if(month.equalsIgnoreCase("November"))
        {
            monthNumber = 11;
        }else if(month.equalsIgnoreCase("December"))
        {
            monthNumber = 12;
        }
    }

    public void setMonthNumber(int x)
    {
        monthNumber = x;
        if(x < 1 || x > 12)
            monthNumber = 1;
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }

    public String monthName()
    {
        if(monthNumber == 1)
        {
            return "January";
        }else if(monthNumber == 2)
        {
            return "February";
        }else if(monthNumber == 3)
        {
            return "March";
        }else if(monthNumber == 4)
        {
            return "April";
        }else if(monthNumber == 5)
        {
            return "May";
        }else if(monthNumber == 6)
        {
            return "June";
        }else if(monthNumber == 7)
        {
            return "July";
        }else if(monthNumber == 8)
        {
            return "August";
        }else if(monthNumber == 9)
        {
            return "September";
        }else if(monthNumber == 10) {
            return "October";
        }else if(monthNumber == 11)
        {
            return "November";
        }else if(monthNumber == 12)
        {
            return "December";
        }else{
            return "WRONG NUMBER";
        }
    }

    public String toString()
    {
        return monthName();

        /*
        String str = monthName();
        return str;

         */
    }

    public boolean equals(Month m)
    {
        boolean status;
        if(monthNumber == m.monthNumber)
        {
            return status = true;
        }else{
            return status = false;
        }
    }

    public boolean greaterThan(Month m)
    {
        boolean status;
        if(monthNumber > m.monthNumber)
        {
            return status = true;
        }else{
            return status = false;
        }
    }

    public boolean lessThan(Month m)
    {
        boolean status;
        if(monthNumber < m.monthNumber)
        {
            return status = true;
        }else{
            return status = false;
        }
    }
}
