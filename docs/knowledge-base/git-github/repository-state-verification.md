# Git Repository State Verification

## Concept

A Git repository has distinct local and remote states. Before building, deploying, or troubleshooting, verify the working tree, branch, commit, and remote-tracking reference instead of assuming they match.

## How It Works

- **Working tree:** Files currently present on disk.
- **Index:** Changes selected for the next commit.
- **HEAD:** The currently checked-out commit.
- **Remote-tracking reference:** The last known state of a remote branch, such as `origin/main`.
- **Remote repository:** The actual shared repository hosted by GitHub.

`HEAD` matching `origin/main` proves the local tracking reference is synchronized. After fetching, it also confirms the latest known remote state.

## Production Usage

Repository-state verification prevents building or deploying:

- uncommitted local changes
- the wrong branch
- an unpushed commit
- an outdated commit
- content from an incorrect remote

A deployment should identify the exact commit SHA so the running version can be reproduced and compared during incidents.

## Common Mistakes

- Treating a clean working tree as proof that the branch is current.
- Assuming a successful commit was pushed.
- Deploying from a workstation without recording the commit SHA.
- Using destructive reset commands before preserving incident evidence.
- Confusing `origin/main` with a live query of GitHub when no fetch was performed.

## Troubleshooting Tips

Verify state in this order:

1. Confirm repository root and configured remotes.
2. Inspect working-tree and branch status.
3. Inspect recent commit history.
4. Fetch the remote when network access is available.
5. Compare local and remote commit SHAs.
6. Review the committed file list before deployment.

## Interview Questions and Answers

### What is the difference between `git fetch` and `git pull`?

`git fetch` updates remote-tracking references without modifying the current branch. `git pull` fetches and then integrates remote changes through merge or rebase.

### Does a clean `git status` mean the local branch matches GitHub?

No. It only means the working tree and index match the current local commit. The branch may still be ahead of or behind the remote.

### Why record the deployed commit SHA?

It provides traceability, enables rollback and comparison, and connects runtime behavior to an exact source version.

## Related Concepts

- Git branches and remote tracking
- CI checkout behavior
- immutable build artifacts
- deployment traceability
- rollback
