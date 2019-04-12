package objectorienteddesign;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    
//      When building overloaded construcotrs keep in mind the
//      idea of code reuse and call previously defined constructors
//      from inside the new overloaded Constructor
    
    
//  Constructors ---> Overloaded Constructors
    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    public Time(int hour, int minute){
        this(hour, minute, 0);
    }

    public Time(Time T) {
        this(T.hour, T.minute, T.second);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time() {
        this(0, 0, 0);
    }

    public final int getHour() {
        return hour;
    }

    public final void setHour(int hour) {
        this.hour = hour;
    }

    public final int getMinute() {
        return minute;
    }

    public final void setMinute(int minute) {
        this.minute = minute;
    }

    public final int getSecond() {
        return second;
    }

    public final void setSecond(int second) {
        this.second = second;
    }
    
    @Override // Change the built in Java toString() function
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}//end Class Time
