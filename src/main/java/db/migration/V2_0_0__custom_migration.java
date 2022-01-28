package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.PreparedStatement;

/**
 * Java-based migrations are mostly used for things you can't or don't want to do in SQL
 */
public class V2_0_0__custom_migration extends BaseJavaMigration {

    public void migrate(Context context) throws Exception {

        String somethingICantDoWithSQL = "somethingICantDoWithSQL";
        try (PreparedStatement statement = context.getConnection()
                .prepareStatement("INSERT INTO USER (id, firstName, lastName, birth, mail) " +
                        "VALUES (5, 'Chuck5', '" + somethingICantDoWithSQL + "' , '2022-01-15', 'chuck.norris@strong.com');")) {
            statement.execute();
        }
    }
}
