package software.perfekt.gnaf.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *    , address_detail_pid
 *
 * Created by Zloy on 03.04.2018.
 */

@Entity
@Immutable
@Table(name = "full_address")
@Data
public class FullAdress {

    @Id
    @Column(name = "address_detail_pid")
    private String pid;

    @Column(name = "flat_number")
    private Integer flatNumber;

    @Column(name = "number_first")
    private Integer numberFirst;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "street_type_code")
    private String streetTypeCode;

    @Column(name = "locality_name")
    private String locality;

    @Column(name = "state_abbreviation")
    private String state;

    @Column(name = "postcode")
    private String postcode;
}
