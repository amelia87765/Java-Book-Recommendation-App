package com.bookhive.service;

import com.bookhive.models.Series;
import com.bookhive.repository.SeriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeriesService {

    private final SeriesRepository seriesRepository;

    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    public List<Series> getAllSeries() {
        return seriesRepository.findAll();
    }

    public Optional<Series> getSeriesById(String id) {
        return seriesRepository.findById(id);
    }

    public Series saveSeries(Series series) {
        return seriesRepository.save(series);
    }

    public void deleteSeries(String id) {
        seriesRepository.deleteById(id);
    }

    public List<Series> getSeriesByName(String name) {
        return seriesRepository.findByNameContainingIgnoreCase(name);
    }
}
