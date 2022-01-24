# quarkus-flyway Project

This project uses Quarkus, the Supersonic Subatomic Java Framework with Flyway extension.
Generated from https://code.quarkus.io/ 

Used to illustrate this blog article : (TODO replace when ready).
Every commit is related to a specific part of this article.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.
