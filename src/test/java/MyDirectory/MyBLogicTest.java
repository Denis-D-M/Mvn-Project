package MyDirectory;

import org.junit.Test;
import org.mockito.Mockito;


import java.sql.SQLException;

import static org.junit.Assert.*;

public class MyBLogicTest {

//  Для ожидания исключения  @Test(expected = ArithmeticException.class)
    @Test
    public void editItem() throws SQLException {
        System.out.println("editItem");
        int id = 5;
        String newName = "ewf";
        DBaseInterface db = Mockito.mock(DBaseInterface.class);
//      Deprecated!!!  Mockito.stub(db.find(Mockito.any(Integer.class))).toReturn("Searched");
        Mockito.when(db.find(Mockito.any(Integer.class))).thenReturn("Searched");

        MyBLogic myBLogic = new MyBLogic();
        int expResult = 1;
        int result = myBLogic.editItem(id, newName, db);

        Mockito.verify(db, Mockito.times(5)).find(Mockito.any(Integer.class));

    }

}