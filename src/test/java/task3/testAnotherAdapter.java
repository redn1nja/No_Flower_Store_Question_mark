package task3;

import org.junit.Assert;
import org.junit.Test;

public class testAnotherAdapter {
    @Test
    public void testTranslate(){
        Database db = new Database();
//        ReportBuilder rb = new ReportBuilder(db);
        Assert.assertEquals(db.getUserData(), "hello");
    }
}
