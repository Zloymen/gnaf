package software.perfekt.gnaf.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.perfekt.gnaf.dao.FullAdressDao;
import software.perfekt.gnaf.entity.FullAdress;
import software.perfekt.gnaf.param.AdressParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Zloy on 03.04.2018.
 */
@Service
@RequiredArgsConstructor
public class FullAdressServiceImpl implements FullAdressService {


    private final FullAdressDao fullAdressDao;

    @Transactional
    @Override
    public Iterable<FullAdress> getAll(){
        return new ArrayList<>();
    }

    @Transactional
    @Override
    public List<FullAdress> fetchAdress(AdressParam param) {

        return fullAdressDao.fetchAdress(param.getSearch(),  PageRequest.of(0, Objects.isNull(param.getSize()) || param.getSize() > 100 ? 100 :  param.getSize()));
    }
}
