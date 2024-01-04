package com.dataRecord.service;

import com.dataRecord.domain.entity.Spces;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author : iboyang
 * @description :
 * date : 2023/12/12
 */
public interface SpcesService {

    List<Spces> getSpcesList();

    boolean addSpces(Spces spces);

    boolean updateSpces(Spces spces);

    boolean deleteSpces(Integer id);
}
