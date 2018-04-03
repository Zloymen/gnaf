package software.perfekt.gnaf.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import software.perfekt.gnaf.entity.FullAdress;

import java.util.List;

/**
 * Created by Zloy on 03.04.2018.
 */
public interface FullAdressDao extends Repository<FullAdress, String> {

    @Query(value = "SELECT * FROM full_adress WHERE" +
            "  make_tsvector(cast(flat_number AS TEXT), cast(number_first as TEXT),street_name, street_type_code, locality_name, state_abbreviation, postcode)" +
            "  @@ plainto_tsquery(:search)",nativeQuery = true)
    List<FullAdress> fetchAdress(@Param("search") String search);
}
