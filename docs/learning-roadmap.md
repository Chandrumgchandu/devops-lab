# Learning Roadmap

This file tracks learning progress for the Production DevOps Training Laboratory.

It is not a project decision log. Project-specific decisions belong in `docs/project-memory.md`. High-level phase status belongs in `docs/project-state.md`.

## Current Topic

Milestone 1: Minimal Backend Skeleton - completed, pending closure commit

Focus:

- milestone review and documentation closure
- HTTP troubleshooting
- distinguishing symptoms from root causes

## Completed Topics

- Repository foundation
- Operating standards
- Project memory policy
- Project state tracking
- Knowledge base policy
- Milestone workflow
- Git repository foundation
- Minimal Spring Boot project structure
- Java 21 and Maven build lifecycle
- Local Spring Boot execution
- REST endpoint and JSON response verification
- Spring Boot integration testing on a random port
- GitHub push verification
- HTTP 404 and context-path troubleshooting

## Pending Topics

- Spring Boot local development
- React local development
- PostgreSQL integration
- Git and GitHub workflow
- GitHub Actions
- AWS EC2 fundamentals
- manual deployment on Linux
- NGINX reverse proxy
- Docker on EC2
- Docker Compose on EC2
- Jenkins on EC2
- SonarQube
- Terraform
- Ansible
- Prometheus
- Grafana
- logging
- Kubernetes on EC2
- incident response
- recovery

## Weak Areas Discovered

- Initial incident diagnosis identified the `404` symptom before explaining the configuration mechanism that changed the effective URL. Revisit the distinction between symptom, contributing condition, and root cause.

## Recurring Mistakes

None recorded yet.

## Concepts to Revisit Later

- HTTP status-code triage when NGINX and authentication are introduced
- Spring Boot context paths versus reverse-proxy path routing
- Runtime configuration precedence

## Progress Assessment Policy

The Technical Lead maintains an internal assessment of strengths, weak areas, recurring mistakes, investigation habits, troubleshooting approach, interview readiness, and production readiness.

This assessment is surfaced only when requested, during major milestone reviews, or when a recurring weakness requires intervention.
