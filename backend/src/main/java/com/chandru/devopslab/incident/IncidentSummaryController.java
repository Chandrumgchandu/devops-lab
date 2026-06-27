package com.chandru.devopslab.incident;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/incidents")
public class IncidentSummaryController {

    private final IncidentSummaryService incidentSummaryService;

    public IncidentSummaryController(IncidentSummaryService incidentSummaryService) {
        this.incidentSummaryService = incidentSummaryService;
    }

    @GetMapping("/summary")
    public IncidentSummaryResponse getSummary() {
        return incidentSummaryService.getSummary();
    }
}
