package com.chandru.devopslab.incident;

public record IncidentSummaryResponse(
        int total,
        int open,
        int resolved
) {
}
