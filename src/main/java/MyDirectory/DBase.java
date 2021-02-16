package MyDirectory;

import java.sql.SQLException;

public class DBase implements DBaseInterface {
    @Override
    public String find(int id) {
        System.out.println("find " + id);
        if (id < 100) return "test name";
        else return null;
    }

    @Override
    public int save(int id, String name) throws SQLException {
        System.out.println("save " + id);
        if (id<10) return 1;
        else throw new SQLException("Sql error");
    }
}
