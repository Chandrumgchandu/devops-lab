# devops-lab

`devops-lab` is a Production DevOps Training Laboratory.

The purpose of this repository is to build professional DevOps and SRE skill through a small realistic full-stack application and a gradually evolving production-like environment.

The application is secondary. Operational learning is primary.

## Mission

This project exists to practice:

- Linux
- Git and GitHub
- networking
- React deployment
- Spring Boot deployment
- PostgreSQL administration
- Docker
- Docker Compose
- NGINX
- GitHub Actions
- Jenkins
- Terraform
- Ansible
- Kubernetes
- Prometheus
- Grafana
- logging
- monitoring
- production troubleshooting
- incident response
- recovery

Every artifact must answer:

> Which DevOps or operational skill does this teach?

## Application Direction

The application will be a minimal Incident Notes App using:

```text
React + Spring Boot + PostgreSQL
```

The app exists to create realistic operational scenarios. Business features are allowed only when they improve deployment, configuration, observability, monitoring, troubleshooting, incident response, or recovery practice.

## Operating Model

```text
Local WSL = developer workstation
GitHub = source of truth
AWS EC2 = DevOps laboratory
```

Local WSL is used for writing and reviewing code, running local development servers, running local tests, and Git operations.

AWS EC2 is used for Docker, Docker Compose, Jenkins, Kubernetes, NGINX, monitoring, logging, deployments, troubleshooting, and incident response practice.

## Current Repository Structure

```text
devops-lab/
├── .gitignore
├── AGENTS.md
├── README.md
├── backend/
│   └── .gitkeep
├── docs/
│   ├── knowledge-base/
│   │   └── README.md
│   ├── learning-roadmap.md
│   ├── project-memory.md
│   └── project-state.md
└── frontend/
    └── .gitkeep
```

`frontend/` and `backend/` are intentionally empty during Milestone 0. The `.gitkeep` files preserve these repository boundaries in Git.

## Milestone Workflow

Every milestone follows:

```text
Discussion
Architecture
Plan
Approval
Implementation
Technical Lead Review
Acceptance Verification
Commit
Failure Scenario
Investigation
Resolution
Knowledge Base Update
Project Memory Update
```

Work does not proceed to the next milestone without explicit approval.

## Current Milestone

Milestone 0: Repository Foundation.

The goal is to establish the project identity, operating standards, learning roadmap, project memory, project state, knowledge base policy, Git foundation, and repository boundaries before application code exists.

