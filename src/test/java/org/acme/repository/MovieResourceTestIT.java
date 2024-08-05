package org.acme.repository;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.*;

@QuarkusTest
@Tag("integration")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MovieResourceTestIT {

  @Test
  @Order(1)
  void getAll() {}

  @Test
  @Order(1)
  void getById() {}

  @Test
  @Order(1)
  void getByIdKO() {}

  @Test
  @Order(1)
  void getByTitle() {}

  @Test
  @Order(1)
  void getByTitleKO() {}

  @Test
  @Order(2)
  void getByCountry() {}

  @Test
  @Order(2)
  void getByCountryKO() {}

  @Test
  @Order(3)
  void create() {}

  @Test
  @Order(4)
  void updateById() {}

  @Test
  @Order(4)
  void updateByIdKO() {}

  @Test
  @Order(5)
  void deleteById() {}

  @Test
  @Order(5)
  void deleteByIdKO() {}
}
