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

    public List<Spces> getSpcesList();

    public boolean addSpces(Spces spces);
}
