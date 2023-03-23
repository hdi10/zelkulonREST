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
------------------------------------------------------------------------------------------------------------------------
---                                     Smartphone Controller API Documentation                                      ---
------------------------------------------------------------------------------------------------------------------------
The SmartphoneController is a RESTful web service that provides CRUD (Create, Read, Update, and Delete) operations for Smartphone resources. The following are the available endpoints for this API:

| HTTP Method | URI Path            | Method Name               | Description                                          |
|-------------|---------------------|---------------------------|------------------------------------------------------|
| GET         | `/smartphones/{id}` | `getFoodById`             | Retrieve a specific smartphone by ID                 |
| GET         | `/smartphones`      | `getFoods`                | Retrieve all smartphones                             |
| DELETE      | `/smartphones/{id}` | `deleteFoodById`          | Delete a specific smartphone by ID                   |
| POST        | `/smartphones`      | `createSmartphone`        | Create a new smartphone                              |

## Method Details

### `getFoodById`

```java
@GetMapping("/{id}")
public ResponseEntity<Smartphone> getFoodById(@PathVariable(value = "id") Long id) {
    Optional<Smartphone> product = this.smartphoneRepository.findById(id);
    return product.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(product.get());
}
```

Retrieves a specific smartphone by ID. The method returns a `ResponseEntity` object containing a `Smartphone` object if the smartphone was found, or a 404 status code if the smartphone was not found.

**getFoods**
```java
@GetMapping("")
public ResponseEntity<List<Smartphone>> getFoods() {
    return ResponseEntity.ok(this.smartphoneRepository.findAll());
}
```

Retrieves all smartphones. The method returns a `ResponseEntity` object containing a list of all `Smartphone` objects.

**deleteFoodById**
```java
@DeleteMapping("/{id}")
public ResponseEntity<Smartphone> deleteFoodById(@PathVariable(value = "id") Long id) {
    Optional<Smartphone> product = this.smartphoneRepository.findById(id);
    this.smartphoneRepository.deleteById(id);
    return product.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(product.get());
}
```


Deletes a specific smartphone by ID. The method returns a `ResponseEntity` object containing the deleted `Smartphone` object if the smartphone was found, or a 404 status code if the smartphone was not found.

**createSmartphone**
```java
@PostMapping(path = "")
public ResponseEntity<Smartphone> createSmartphone(@RequestBody @Valid Smartphone smartphone) {
    Smartphone saved = this.smartphoneRepository.save(smartphone);
    return ResponseEntity.ok(saved);
}
```

Creates a new smartphone. The method returns a `ResponseEntity` object containing the saved `Smartphone` object. The `@RequestBody` annotation indicates that the method parameter should be populated with the body of the HTTP request, and the `@Valid` annotation ensures that the `Smartphone object is validated before being saved.


