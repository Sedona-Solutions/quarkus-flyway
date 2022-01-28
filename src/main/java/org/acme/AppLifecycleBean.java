package org.acme;

import db.custom.V3_0_0__custom_migration_using_CDI;
import io.quarkus.runtime.StartupEvent;
import org.flywaydb.core.Flyway;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.sql.DataSource;

@ApplicationScoped
public class AppLifecycleBean {

    @Inject
    DataSource dataSource;

    @Inject
    V3_0_0__custom_migration_using_CDI customMigrationUsingCDI;

    private static final Logger LOGGER = Logger.getLogger("AppLifecycleBean");

    void onStart(@Observes StartupEvent ev) {
        var flyway = Flyway.configure()
                .dataSource(dataSource)
                .javaMigrations(customMigrationUsingCDI).load();
        LOGGER.info("Clearing DB manually...");
        flyway.clean();
        LOGGER.info("Launching Flyway migrate() manually...");
        flyway.migrate();
    }


}
