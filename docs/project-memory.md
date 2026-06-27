# Project Memory

This file is the single authoritative memory for this repository. It records why the project is structured and operated the way it is.

Do not duplicate project decisions in separate decision documents. When a decision changes, update this file and mark the old decision as superseded.

## Project Identity

- Repository name: `devops-lab`
- Repository root: `~/workspace/devops-lab`
- Purpose: Production DevOps Training Laboratory
- Application direction: minimal Incident Notes App
- Application stack: React, Spring Boot, PostgreSQL
- Primary goal: DevOps, infrastructure, deployment, observability, troubleshooting, and SRE training
- Business features: secondary and allowed only when they create operational learning value

## Current Status

- Current milestone: Milestone 1 - Minimal Backend Skeleton
- Completed milestones: Milestone 0 - Repository Foundation
- Next milestone: Milestone 2 - Minimal Frontend Skeleton, pending explicit approval after Milestone 1 completion

## Major Decisions

### Decision 1: Repository Is a Production DevOps Training Laboratory

- Decision: Treat this repository as a Production DevOps Training Laboratory, not as a feature-first software product.
- Reason: The primary objective is to learn professional DevOps and SRE practices through a realistic but intentionally small application.
- Alternatives Considered: Build a feature-rich business application; build isolated DevOps exercises without an application.
- Trade-offs: A small application limits product complexity but may feel less feature-rich. This is acceptable because operational learning is the goal.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 2: Use Local WSL Only as Developer Workstation

- Decision: Use local WSL for authoring, local app development, testing, review, and Git operations only.
- Reason: Docker, Jenkins, Kubernetes, monitoring, deployments, and troubleshooting should be practiced in the AWS EC2 laboratory to build real server and networking skill.
- Alternatives Considered: Run Docker, Kubernetes, Jenkins, and monitoring locally.
- Trade-offs: Remote practice costs more setup time and may incur AWS cost, but it teaches realistic Linux, networking, and operational workflows.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 3: Use GitHub as Source of Truth

- Decision: Treat GitHub as the source of truth after local development.
- Reason: Professional DevOps workflows depend on pull requests, CI/CD, review, history, and remote automation from a shared source.
- Alternatives Considered: Use local-only Git workflow; deploy directly from the workstation.
- Trade-offs: GitHub-centered workflow adds process overhead but improves traceability and automation readiness.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 4: Use AWS EC2 as DevOps Laboratory

- Decision: Run DevOps tools and production-like operations on AWS EC2.
- Reason: EC2 provides realistic Linux hosts for Jenkins, Docker, Compose, NGINX, Kubernetes, monitoring, logging, and incident response.
- Alternatives Considered: Local virtualization; managed cloud services first; local Docker Desktop.
- Trade-offs: EC2 requires more administration and cost awareness, but it directly supports the target operational skills.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 5: Build a Minimal Incident Notes App

- Decision: Use a minimal Incident Notes App as the application domain.
- Reason: It aligns with DevOps and SRE practice while requiring only a small realistic React, Spring Boot, and PostgreSQL application.
- Alternatives Considered: Task Manager; Support Ticket System.
- Trade-offs: Incident Notes is less generic than a Task Manager and smaller than a Support Ticket System. It may have fewer business workflows, but it better supports incident response training.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 6: Grow the Repository Gradually

- Decision: Add directories, tools, and configuration only when required by the active milestone.
- Reason: Premature structure creates noise and encourages shallow tool usage.
- Alternatives Considered: Create a full enterprise-style repository skeleton on day one.
- Trade-offs: Gradual growth may require later restructuring, but it keeps each artifact tied to a learning objective.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 7: Maintain Separate Knowledge Base and Project Memory

- Decision: Use project memory for this repository's decisions and use the knowledge base for transferable DevOps concepts.
- Reason: Project-specific context and general learning notes serve different purposes and should not be mixed.
- Alternatives Considered: Put all notes in one documentation file; create many separate decision records immediately.
- Trade-offs: Separate files require discipline, but they prevent confusion between project rationale and general technical knowledge.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 8: Include AGENTS.md as Engineering Handbook and Behavioral Contract

- Decision: Maintain `AGENTS.md` as the authoritative engineering handbook and behavioral contract for AI collaborators in this repository.
- Reason: Future AI agents need a stable operating standard for milestone workflow, review expectations, documentation policy, incident simulation responsibilities, and behavior during implementation.
- Alternatives Considered: Store AI rules only in `README.md`; keep rules only in conversation history.
- Trade-offs: A dedicated handbook adds one more document, but it prevents loss of operating standards across sessions.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 9: Use `~/workspace/devops-lab` as Repository Root

- Decision: The only valid repository location is `~/workspace/devops-lab`.
- Reason: The project must live under the user's development workspace and avoid duplicate repository locations.
- Alternatives Considered: Use `/home/chandru_m_g/devops-lab`; use an existing differently named workspace directory.
- Trade-offs: Moving to the approved workspace requires reviewing the draft implementation, but it prevents long-term confusion.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 10: Include Git in Milestone 0

- Decision: Milestone 0 includes local Git repository initialization and the first commit.
- Reason: Repository foundation is incomplete without local version control and a traceable starting point.
- Alternatives Considered: Delay Git initialization until GitHub setup; create files without a repository.
- Trade-offs: Git adds one setup step now, but it immediately teaches repository hygiene and history discipline.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 11: Track Empty Boundaries with `.gitkeep`

- Decision: Use `frontend/.gitkeep` and `backend/.gitkeep` to preserve intentionally empty repository boundaries in Git.
- Reason: Git does not track empty directories, but the frontend and backend boundaries are part of the approved Milestone 0 structure.
- Alternatives Considered: Leave directories untracked; add README files inside each directory.
- Trade-offs: `.gitkeep` files are implementation details with no application meaning, but they preserve the approved structure without introducing code.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 12: Add Minimal Root `.gitignore`

- Decision: Create a minimal repository-level `.gitignore` in Milestone 0.
- Reason: Basic repository hygiene should exist before the first commit, while language-specific rules can wait for later milestones.
- Alternatives Considered: No `.gitignore`; comprehensive multi-tool `.gitignore`.
- Trade-offs: A minimal file may need future expansion, but it avoids premature tool-specific assumptions.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 13: Maintain High-Level Project State

- Decision: Maintain `docs/project-state.md` as a high-level phase status dashboard.
- Reason: Project Memory records why decisions exist, while Project State quickly shows where the project stands.
- Alternatives Considered: Put phase status only in Project Memory; create a detailed roadmap duplicate.
- Trade-offs: Adds one small document, but avoids mixing dashboard status with decision rationale.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

### Decision 14: Review Existing Artifacts Before Reuse

- Decision: Treat every existing artifact as if it came from another engineer and review it before accepting it.
- Reason: Existing work may be obsolete, incorrect, or outside the approved scope.
- Alternatives Considered: Blindly migrate previous draft content; recreate everything without review.
- Trade-offs: Review takes more time, but it prevents carrying forward stale decisions or accidental scope expansion.
- Date: 2026-06-27
- Current Status: Active
- Superseded By: Not applicable

## Repository Conventions

- Keep the root small.
- Add only milestone-approved files and directories.
- Preserve empty `frontend/` and `backend/` boundaries with `.gitkeep` during Milestone 0.
- Do not add Docker, CI/CD, Terraform, Kubernetes, monitoring, or infrastructure files before their milestones.
- Use concise Markdown for documentation.
- Review existing artifacts before reuse.

## Deployment Decisions

- No deployment decisions implemented yet.

## CI/CD Decisions

- No CI/CD decisions implemented yet.

## Infrastructure Decisions

- No infrastructure code implemented yet.

## Operational Lessons

- Milestone 0 established that repository state must be verified before development begins. Git status, branch, remote, commit history, and tracking documents should be checked before starting a new milestone.

## Recurring Bugs and Mistakes

- None recorded yet.

## Technical Debt

- A draft implementation exists at `/home/chandru_m_g/devops-lab`. It should be archived or deleted only after the official repository is reviewed and committed, and only with explicit user approval.

## Future Improvements

- Add backend application code only after Milestone 1 discussion, architecture, plan, and approval are complete.
- Add tool-specific documentation only when the corresponding milestone starts.
- Expand `.gitignore` only when tool-specific milestones require it.

## Open Questions

- After the official repository is reviewed and committed, decide whether to archive or permanently delete `/home/chandru_m_g/devops-lab`.
