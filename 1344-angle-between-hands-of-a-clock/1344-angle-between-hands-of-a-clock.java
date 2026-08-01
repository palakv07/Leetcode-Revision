class Solution {
    public double angleClock(int hour, int minutes) {
        //for 1 hour = +30 degree
        //for 1 minute = +5.5 degree
        double angle = Math.abs(hour*30 - minutes*5.5);
        if(angle > 180){
            angle -= 360.00000;
        }
        return Math.abs(angle);        
    }
}