package com.stackroute.mapper;

import com.stackroute.domain.Movie;
import org.springframework.jdbc.core.RowMapper;

;import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<Movie> {
public Movie mapRow(final ResultSet rs, final int rowNum) throws SQLException
{
    final Movie movie=new Movie();
    movie.setId(rs.getInt("Id"));
    movie.setMovieName(rs.getString("movieName"));
    movie.setReleaseYear(rs.getInt("releaseYear"));
    movie.setRating(rs.getInt("rating"));
    return movie;

}


}

