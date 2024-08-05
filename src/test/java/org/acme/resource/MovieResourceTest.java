package org.acme.resource;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.acme.model.Movie;
import org.acme.repository.MovieRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class MovieResourceTest {

  @InjectMock
  MovieRepository movieRepository;

  @Inject
  MovieResource movieResource;

  private Movie movie;

  @BeforeEach
  void setUp() {}

  @Test
  void getAll() {}

  @Test
  void getByIdOK() {}

  @Test
  void getByIdKO() {}

  @Test
  void getByTitleOK() {}

  @Test
  void getByTitleKO() {}

  @Test
  void getByCountry() {}

  @Test
  void createOK() {}

  @Test
  void createKO() {}

  @Test
  void updateByIdOK() {}

  @Test
  void updateByIdKO() {}

  @Test
  void deleteByIdOK() {}

  @Test
  void deleteByIdKO() {}
}
