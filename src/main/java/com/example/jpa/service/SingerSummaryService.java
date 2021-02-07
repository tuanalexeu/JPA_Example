package com.example.jpa.service;


import com.example.jpa.view.SingerSummary;

import java.util.List;

public interface SingerSummaryService {
    List<SingerSummary> findAll();
}
