package com.stackroute.repository;

import com.stackroute.domain.Movie;
import com.stackroute.mapper.MovieRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class SpringJdbcRepository {
    private JdbcTemplate jdbcTemplate;
    public SpringJdbcRepository(){ }

    @Autowired
    public void  setDataSource(final DataSource dataSource){

        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<Movie> getAll()
    {
       return jdbcTemplate.query("select * from movies", new MovieRowMapper());

    }
    public int add(Movie movie) {
        return jdbcTemplate.update("INSERT INTO movies VALUES (?, ?,?,?)", movie.getId(), movie.getMovieName() ,movie.getReleaseYear(),movie.getReleaseYear());
    }
    public Movie get(final String id) {
        final String query = "SELECT * FROM movies WHERE Id = ?";
        return jdbcTemplate.queryForObject(query, new Object[] { id }, new MovieRowMapper());
    }
    public int update(Movie entity) {
        return jdbcTemplate.update("UPDATE movies SET movieName=? WHERE Id=? ", entity.getMovieName(), entity.getId());
    }
    public int delete(Movie entity) {
        return jdbcTemplate.update("DELETE FROM movies WHERE Id=?", entity.getId());
    }


}
