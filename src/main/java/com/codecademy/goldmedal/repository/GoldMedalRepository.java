package com.codecademy.goldmedal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.codecademy.goldmedal.model.GoldMedal;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long>{

    public List<GoldMedal> getByCountryOrderByYearAsc(String country);
    public List<GoldMedal> getByCountryOrderByYearDesc(String country);
    public List<GoldMedal> getByCountryOrderBySeasonAsc(String country);
    public List<GoldMedal> getByCountryOrderBySeasonDesc(String country);
    public List<GoldMedal> getByCountryOrderByCityAsc(String country);
    public List<GoldMedal> getByCountryOrderByCityDesc(String country);
    public List<GoldMedal> getByCountryOrderByNameAsc(String country);
    public List<GoldMedal> getByCountryOrderByNameDesc(String country);
    public List<GoldMedal> getByCountryOrderByEventAsc(String country);
    public List<GoldMedal> getByCountryOrderByEventDesc(String country);
    int countByCountry(String string);
    public List<GoldMedal> getByCountryAndSeasonOrderByYearAsc(String country, String season);
    int countBySeason(String season);
    int countByCountryAndGender(String country, String string);
}
