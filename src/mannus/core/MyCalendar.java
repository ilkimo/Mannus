package mannus.core;

import mannus.exceptions.TimeException;
import java.util.GregorianCalendar;
import java.io.Serializable;
import java.util.Calendar;
import mannus.exceptions.ProjectExceptions;
/**
 * @since 2019/07/16
 * @author Viberti Kim
 * @version 0.1
 * This class adds some handy method to the class Calendar
 */
public class MyCalendar extends GregorianCalendar implements Serializable {
    //Static methods--------------------------------------------------------------------------------------------------------------------------
    /**
     * Take care, input date has months indexed [1-12], that's the reason of:
     *   month = Integer.parseInt(arr[1]) - 1;
     */
    private static int FIRST_WORKING_MONTH = 5, LAST_WORKING_MONTH = 9; //months indexed 1-12
    
    public static MyCalendar getCalendar(String date) throws TimeException {
        int year = 0, month = 0, day = 0;

        if(date.matches("[0-9]+/[0-9]+/[0-9]+")) {
            String[] arr = date.split("/");

            year = Integer.parseInt(arr[0]);
            month = Integer.parseInt(arr[1]) - 1; //0 index system
            day = Integer.parseInt(arr[2]);

        } else {throw new TimeException("Eccezione, la data inserita non segue il formato 'yyyy/mm/dd'");}

        return new MyCalendar(year, month, day);
    }

    private static MyCalendar getCalendar(String date, int offset, int field) throws TimeException {
        MyCalendar res = null;

        try{
            res = getCalendar(date);
        } catch(TimeException e) {throw e;}

        res.add(field, offset);

        return res;
    }
    //Constructors----------------------------------------------------------------------------------------------------------------------------
    private MyCalendar(int year, int month, int day) {
        super(year, month, day);
    }
    //set() & get()---------------------------------------------------------------------------------------------------------------------------
    public int getYEAR() {return get(YEAR);}

    public int getMONTH() {return get(MONTH) + 1;} // because of the months 0 based index system

    public int get_DAY_OF_MONTH() {return get(DAY_OF_MONTH);}

    public String get_NAME_OF_MONTH() { //months indexed 1-12
        int month = getMONTH();
        String res = "";
        
        switch(month) {
            case 1:
                res = "Gennaio";
                break;
            case 2:
                res = "Febbraio";
                break;
            case 3:
                res = "Marzo";
                break;
            case 4:
                res = "Aprile";
                break;
            case 5:
                res = "Maggio";
                break;
            case 6:
                res = "Giugno";
                break;
            case 7:
                res = "Luglio";
                break;
            case 8:
                res = "Agosto";
                break;
            case 9:
                res = "Settembre";
                break;
            case 10:
                res = "Ottobre";
                break;
            case 11:
                res = "Novembre";
                break;
            case 12:
                res = "Dicembre";
                break;
        }
        
        return res;
    }
    
    public String get_DAY_OF_WEEK() {
        int day = get(DAY_OF_WEEK);
        String res = "";

        if(day == 2) {
            res = "Lunedi";
        } else if(day == 3) {
            res = "Martedi";
        } else if(day == 4) {
            res = "Mercoledi";
        } else if(day == 5) {
            res = "Giovedi";
        } else if(day == 6) {
            res = "Venerdi";
        } else if(day == 7) {
            res = "Sabato";
        } else if(day == 1) {
            res = "Domenica";
        }

        return res;
    }
    //Methods---------------------------------------------------------------------------------------------------------------------------------
    public MyCalendar get_last_day_of_week() throws TimeException {
        MyCalendar res = null;
        try {
            res = getCalendar(toString());
        } catch(TimeException e) {throw e;}

        while(res.get(res.DAY_OF_WEEK) != res.SUNDAY) {
            res.add(res.DAY_OF_MONTH, 1);
        }

        return res;
    }
    
    /**
     * If the date isn't currently a Monday, it adds days until the date becomes a Monday
     */
    public void goToFirstMonday() {
        while(get(DAY_OF_WEEK) != MONDAY) {
            add(DAY_OF_WEEK, 1);
        }
    }
    
    public void pointToNextMonday() {
        String dateCheckPoint = toString();
        
        goToFirstMonday();
        
        if(dateCheckPoint.equals(toString())) //if the date was a Monday, now we know it and we add 7 days, else we already have set the date to next monday with goToFirstMonday()
            add(DAY_OF_WEEK, 7);
    }
    
    public boolean dateIsBeforeEndOfSeason() {
        return getMONTH() <= LAST_WORKING_MONTH; // months indexed 1-12
    }
    //Static methods()------------------------------------------------------------------------------------------------------------------------
    public static String[] getWeeksOfOperatingYear(String year) {
        return getWeeksOfOperatingYear(year, FIRST_WORKING_MONTH, LAST_WORKING_MONTH);
    }
    
    /**
     * Returns a String[] containing a list of working weeks of the club, formatted like: "Lun 1 Luglio", "Lun 8 Luglio"...
     * @param year
     * @param FIRST_WORKING_MONTH
     * @param LAST_WORKING_MONTH
     * @return res
     */
    public static String[] getWeeksOfOperatingYear(String year, int FIRST_WORKING_MONTH, int LAST_WORKING_MONTH) {
        String[] res = null;
        MyCalendar cal = getFirstWorkingMonday(year, Integer.toString(FIRST_WORKING_MONTH));
        
        while(cal.dateIsBeforeEndOfSeason()) {
            res = addCalendarsPointedWeek(res, cal);
            cal.pointToNextMonday();
        }
        
        return res;
    }
    
    /**
     * Adds the week pointed from the calendar's date to a collection (used to display the working weeks in the GUI's selection box)
     */
    private static String[] addCalendarsPointedWeek(String[] oldCollection, MyCalendar cal) {
        String[] res;
        String weekToAdd = getFormattedWeekToAdd(cal);
        
        if(oldCollection == null) {
            res = new String[] {weekToAdd};
        } else {
            res = new String[oldCollection.length + 1];
            
            for(int i = 0; i < oldCollection.length; ++i) {
                res[i] = oldCollection[i];
            }
            
            res[res.length - 1] = weekToAdd;
        }
        
        return res;
    }
    
    private static String getFormattedWeekToAdd(MyCalendar cal) {
        return "Lun " + cal.get_DAY_OF_MONTH() + " " + cal.get_NAME_OF_MONTH();
    }
    
    public static MyCalendar getFirstWorkingMonday(String year, String month) {
        MyCalendar cal = getFirstDayOfMonth(year, month);
        cal.goToFirstMonday();
        
        return cal;
    }
    
    public static MyCalendar getFirstDayOfMonth(String year, String month) {
        try {
            return MyCalendar.getCalendar(("" + year + "/" + month + "/" + 1));
        } catch(TimeException e) {
            throw new Error("metodo MyCalendar.getWeeksOfYear ha generato un errore inaspettato con parametri: year = " + year + ", FIRST_WORKING_MONTH = " + FIRST_WORKING_MONTH + ", LAST_WORKING_MONTH = " + LAST_WORKING_MONTH + ", inviare foto di questo messaggio a Kim");
        }
    }
    //Utility---------------------------------------------------------------------------------------------------------------------------------
    /**
     * @var monthNumber
     * the month number is indexed 1-12 (January-December)
     */
    public static void change_FIRST_OPERATIVE_MONTH(int monthNumber) throws ProjectExceptions {
        if(monthNumber < 1 || monthNumber > 12) {throw new ProjectExceptions("Errore, il mese inserito deve essere maggiore di 0 e minore di 13");}
        else if(monthNumber > get_LAST_OPERATIVE_MONTH()) {throw new ProjectExceptions("Errore, il mese di inizio dell'anno lavorativo deve essere precedente (o lo stesso) del mese di conclusione dell'anno lavorativo (provare a modificare prima il mese di conclusione)");}
        else {
            set_FIRST_OPERATIVE_MONTH(monthNumber);
        }
    }
    
    public static void change_LAST_OPERATIVE_MONTH(int monthNumber) throws ProjectExceptions {
        if(monthNumber < 1 || monthNumber > 12) {throw new ProjectExceptions("Errore, il mese inserito deve essere maggiore di 0 e minore di 13");}
        else if(monthNumber < get_FIRST_OPERATIVE_MONTH()) {throw new ProjectExceptions("Errore, il mese di fin dell'anno lavorativo deve essere successivo (o lo stesso) del mese di inizio dell'anno lavorativo (provare a modificare prima il mese di inizio)");}
        else {
            set_LAST_OPERATIVE_MONTH(monthNumber);
        }
    }
    
    public static int get_FIRST_OPERATIVE_MONTH() {return FIRST_WORKING_MONTH;}
    public static int get_LAST_OPERATIVE_MONTH() {return LAST_WORKING_MONTH;}
    
    public static void set_FIRST_OPERATIVE_MONTH(int newMonthValue) {
        FIRST_WORKING_MONTH = newMonthValue;
        //may introduce different behaviour of the program handling
    }
    
    public static void set_LAST_OPERATIVE_MONTH(int newMonthValue) {
        LAST_WORKING_MONTH = newMonthValue;
        //may introduce different behaviour of the program handling
    }
    
    @Override
    public String toString() {
        return "" + getYEAR() + "/" + getMONTH() + "/" + get_DAY_OF_MONTH();
    }
}

/*class MyCalendarDemo {
    public static void test01() throws Exception {
        MyCalendar cal = null, cal2 = null;
        try {
            cal = MyCalendar.getCalendar("2019/12/21");

            System.out.println("First calendar created in date: " + cal.toString() + " ed e' " + cal.get_DAY_OF_WEEK());

            cal2 = cal.get_last_day_of_week();

            System.out.println("Second calendar created, end of week in date: " + cal2.toString() + " ed e' " + cal2.get_DAY_OF_WEEK());
        } catch(Exception e) {throw e;}
    }

    public static void main(String[] args) {
        try {
            test01();
        }catch(Exception e) {System.out.println(e.getMessage());}
    }
}*/
