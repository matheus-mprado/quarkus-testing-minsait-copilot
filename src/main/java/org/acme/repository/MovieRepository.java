package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import org.acme.model.Movie;

@ApplicationScoped
public class MovieRepository implements PanacheRepository<Movie> {

  public List<Movie> findByCountry(String country) {
    return list(
      "SELECT m from Movie m where m.country = ?1 ORDER BY id DESC",
      country
    );
  }
}
