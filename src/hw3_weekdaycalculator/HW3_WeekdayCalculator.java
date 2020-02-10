/**
 * This code will compute the weekday of any date in 
 * the Gregorian calendar by following the "Doomsday Algorithm"
 */
package hw3_weekdaycalculator;


public class HW3_WeekdayCalculator {
    
    /**
     * Compute the century anchor
     * 
     * @param c The century digits for a particular year 
     *                  (e.g. 19 for 1971)
     * @return The anchor for that century
     */
    public static int getCenturyAnchor(int c) {
        int anchor = 0;
        // TODO: Fill this in
        
        return anchor;
    }
    
    /**
     * Return the doomsday for a particular year.  This should
     * call getCenturyAnchor at some point
     * 
     * @param year The year
     * @return The doomsday for that year as an integer
     *         (where 0 - Sunday, 1 - Monday, ..., 6 - Saturday)
     */
    public static int getDoomsdayYear(int year) {
        int doomsday = 0;
        // TODO: Fill this in
        
        return doomsday;
    }
    
    /**
     * Return the weekday for a particular date in the
     * Gregorian calendar
     * 
     * @param year The year of a date
     * @param month The month of the date (between 1 and 12)
     * @param day The day of the date
     * @return The weekday of the specified date
     *         (where 0 - Sunday, 1 - Monday, ..., 6 - Saturday)
     */
    public static int getWeekday(int year, int month, int day) {
        int weekday = 0;
        // TODO: Fill this in
        
        return weekday;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO: Fill in some stuff that helps you test
        // the program
    }
    
}
