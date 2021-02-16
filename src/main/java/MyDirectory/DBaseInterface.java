package MyDirectory;

import java.sql.SQLException;

public interface DBaseInterface {
    String find(int id);

    int save(int id, String name) throws SQLException;

}
