package reminder2020.remind.calcdroid20;
import android.os.Parcel;
public class Counters {
    private  char counter;
    private char counter1;
    private char counter3;
    private char counter2;
    private char counter4;
    private char counter5;
    private char counter6;
    private char counter7;
    private char counter8;
    private char counter9;
    private char counter0;
    private char counter_add;
    private char counter_mlt;
    private char counter_sub;
    private char counter_div;
    private char counter_point;

    public Counters(){
        counter3 = '3';
        counter1 = '1';
        counter2 = '2';
        counter4 = '4';
        counter5 = '5';
        counter6 = '6';
        counter7 = '7';
        counter8 = '8';
        counter9 = '9';
        counter0 = '0';
        counter_add = '+';
        counter_mlt = '*';
        counter_div = '/';
        counter_sub = '-';
        counter_point = '.';

    }

    
    public char getCounter() {
        return counter;
    }
    
    public char getCounter1() {
        return counter1;
    }
    public char getCounter2() {
        return counter2;
    }
    public char getCounter3() {
        return counter3;
    }
    public char getCounter4() {
        return counter4;
    }
    public char getCounter5() {
        return counter5;
    }
    public char getCounter6() {
        return counter6;
    }
    public char getCounter7() {
        return counter7;
    }
    public char getCounter8() {
        return counter8;
    }
    public char getCounter9() {
        return counter9;
    }
    public char getCounter0() {
        return counter0;
    }
    public char getCounter_point() {
        return counter_point;
    }
    public char getCounter_add() {
        return counter_add;
    }
    public char getCounter_mlt() {
        return counter_mlt;
    }
    public char getCounter_sub() {
        return counter_sub;
    }
    public char getCounter_div() {
        return counter_div;
    }
        
}
