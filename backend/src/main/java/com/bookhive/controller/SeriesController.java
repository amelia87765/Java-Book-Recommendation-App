package com.bookhive.controller;

import com.bookhive.models.Series;
import com.bookhive.service.SeriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/series")
@CrossOrigin
public class SeriesController {

    private final SeriesService seriesService;

    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @GetMapping
    public List<Series> getAllSeries() {
        return seriesService.getAllSeries();
    }

    @GetMapping("/{id}")
    public Optional<Series> getSeriesById(@PathVariable String id) {
        return seriesService.getSeriesById(id);
    }

    @PostMapping
    public Series saveSeries(@RequestBody Series series) {
        return seriesService.saveSeries(series);
    }

    @DeleteMapping("/{id}")
    public void deleteSeries(@PathVariable String id) {
        seriesService.deleteSeries(id);
    }

    @GetMapping("/by-name")
    public List<Series> getSeriesByName(@RequestParam String name) {
        return seriesService.getSeriesByName(name);
    }
}
