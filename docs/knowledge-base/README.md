# Knowledge Base

The knowledge base teaches transferable DevOps concepts learned during this project.

It is separate from project memory. Project-specific decisions belong in `docs/project-memory.md`.

## Organization

Notes are organized by subject first, then by concept.

Example future structure:

```text
docs/knowledge-base/
├── git-github/
├── linux/
├── networking/
├── spring-boot/
├── react/
├── postgresql/
├── docker/
├── docker-compose/
├── nginx/
├── github-actions/
├── jenkins/
├── terraform/
├── ansible/
├── kubernetes/
├── monitoring/
├── logging/
└── incident-response/
```

Subject directories are created only when useful. They should not be added as empty placeholders.

## Available Notes

- [Git Repository State Verification](git-github/repository-state-verification.md)
- [HTTP Status Troubleshooting](networking/http-status-troubleshooting.md)
- [Spring Boot Backend Foundation](spring-boot/backend-foundation.md)

## Note Standards

Each note should be concise and interview-ready.

When appropriate, notes should include:

- Concept
- Purpose
- How it works
- Why it exists
- Real-world usage
- Common mistakes
- Troubleshooting tips
- Interview questions and answers
- Related concepts

Small concepts may use a shorter format.

## What to Document

Document durable knowledge from:

- completed milestones
- new DevOps concepts
- production issues
- incident investigations
- recurring mistakes
- important troubleshooting lessons
- better approaches discovered later

## What Not to Document

Do not document:

- trivial commands
- temporary fixes
- repetitive information
- raw logs without durable lessons
- project-specific decisions already recorded in project memory

## Maintenance Rules

Update existing notes instead of creating duplicates.

When a better approach is discovered, revise the note instead of appending contradictory information.

The knowledge base should eventually support interview preparation without separate manual note-taking.
