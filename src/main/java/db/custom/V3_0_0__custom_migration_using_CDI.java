package db.custom;

import org.acme.service.ComplexService;
import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;


/**
 * Java-based migrations are mostly used for things you can't or don't want to do in SQL
 */
@Dependent
public class V3_0_0__custom_migration_using_CDI extends BaseJavaMigration {

    @Inject
    ComplexService complexService;

    public void migrate(Context context) {
        String somethingICantDoWithSQL = complexService.someComplexCalculation();
        doSomething();
    }

    void doSomething(){
    }
}











