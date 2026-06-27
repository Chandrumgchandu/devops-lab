package com.chandru.devopslab.incident;

import org.springframework.stereotype.Service;

@Service
public class IncidentSummaryService {

    public IncidentSummaryResponse getSummary() {
        return new IncidentSummaryResponse(3, 2, 1);
    }
}
