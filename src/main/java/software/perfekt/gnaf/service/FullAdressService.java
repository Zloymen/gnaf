package software.perfekt.gnaf.service;

import software.perfekt.gnaf.entity.FullAdress;
import software.perfekt.gnaf.param.AdressParam;

import java.util.List;

/**
 * Created by Zloy on 03.04.2018.
 */
public interface FullAdressService {
    Iterable<FullAdress> getAll();

    List<FullAdress> fetchAdress(AdressParam param);
}
