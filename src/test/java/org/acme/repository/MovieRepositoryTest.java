package org.acme.repository;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class MovieRepositoryTest {

  @Inject
  MovieRepository movieRepository;

  @Test
  void findByCountryOK() {}

  @Test
  void findByCountryKO() {}
}
