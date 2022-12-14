# Demo Project

## Getting Started

**Start DB with Docker**

### Start locally with Docker

```bash
docker-compose up
```

### Run tests

```bash
mvn clean package -Dspring-boot.run.profiles=test
```

### Start locally without Docker

**Start DB with Docker**

```bash
docker run --name postgres_container -p 5455:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=db -d postgres
```

**Compile project**

```bash
mvn clean package
```

**Start project**

```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```
