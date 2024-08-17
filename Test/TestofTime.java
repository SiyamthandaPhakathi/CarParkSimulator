import org.junit.*;

import static org.junit.Assert.*;

public class TestofTime {
    //Check that a Time object does actually store the time value
    //provided as a parameter during creation (by calling toString).

    @Test public void CheckForTime(){
        Time time = new Time("12:00");
        String result = time.toString();
        Assert.assertEquals("12:00:00",result);

    }


    //Check that subtracting a Time from itself produces a zero
    //Duration.

    @Test public void  CheckForZero(){
        Time t1 =  new Time("10:00");
        Duration r = t1.subtract(t1);
        Assert.assertEquals(0,r.intValue());

    }
    //heck that subtracting an earlier Time from a later Time produces
    //a Duration of the correct length
    @Test public void CorrectDuration(){
        Time t1 =  new Time("10:00");
        Time t2 = new Time("12:00");
        Duration r = t2.subtract(t1);
        Assert.assertEquals(2,r.intValue("hour"));
    }

    //Check that the ‘intValue’ method works with a parameter of
    //“millisecond”

    @Test public void ParamCheckMillisecond(){
        Time t1 = new Time("15:00");
        Time t2 = new Time("18:00");
        Duration r = t2.subtract(t1);
        Assert.assertEquals(10800000,r.intValue("millisecond"));
    }

    //Check that the ‘intValue’ method works with a parameter of
    //“second”

    @Test public void ParamCheckSecond(){
        Time t1 = new Time("15:00");
        Time t2 = new Time("18:00");
        Duration r = t2.subtract(t1);
        Assert.assertEquals(10800,r.intValue("second"));
    }

    //Check that the ‘intValue’ method works with a parameter of
    //“minute”

    @Test public void ParamCheckMinute(){
        Time t1 = new Time("15:00");
        Time t2 = new Time("18:00");
        Duration r = t2.subtract(t1);
        Assert.assertEquals(180,r.intValue("minute"));
    }

    //Check that the ‘intValue’ method works with a parameter of
    //“hour”

    @Test public void ParamCheckHour(){
        Time t1 = new Time("15:00");
        Time t2 = new Time("18:00");
        Duration r = t2.subtract(t1);
        Assert.assertEquals(3,r.intValue("hour"));
    }


}