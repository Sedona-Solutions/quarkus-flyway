package db.callback;

import org.flywaydb.core.api.callback.BaseCallback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomMigrationCallback extends BaseCallback {

    private static final Logger LOGGER = Logger.getLogger("CustomMigrationCallback");

    @Override
    public void handle(Event event, Context context) {
        LOGGER.info("This is a custom FLYWAY callback action for event : " + event.name());
    }

}
