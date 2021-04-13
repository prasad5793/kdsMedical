package lk.kdsMedical.asset.additionalService.service;


import lk.kdsMedical.asset.additionalService.dao.AdditionalServiceDao;
import lk.kdsMedical.asset.additionalService.entity.AdditionalService;
import lk.kdsMedical.util.interfaces.AbstractService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditionalServiceService implements AbstractService< AdditionalService, Integer > {
    private final AdditionalServiceDao additionalServiceDao;

    public AdditionalServiceService(AdditionalServiceDao additionalServiceDao) {
        this.additionalServiceDao = additionalServiceDao;
    }


    public List< AdditionalService > findAll() {
        return additionalServiceDao.findAll();
    }

    public AdditionalService findById(Integer id) {
        return additionalServiceDao.getOne(id);
    }

    public AdditionalService persist(AdditionalService additionalService) {
        return additionalServiceDao.save(additionalService);
    }

    public boolean delete(Integer id) {
        additionalServiceDao.deleteById(id);
        return false;
    }

    public List< AdditionalService > search(AdditionalService additionalService) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example< AdditionalService > additionalServiceExample = Example.of(additionalService, matcher);

        return additionalServiceDao.findAll(additionalServiceExample);
    }
}
