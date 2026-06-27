# Spring Boot Backend Foundation

## Concept

A minimal Spring Boot backend combines build metadata, an application entry point, configuration, HTTP routing, service logic, response serialization, and automated verification.

## Purpose

The smallest deployable backend provides a stable artifact and HTTP contract for later deployment, proxy, container, observability, and troubleshooting exercises.

## How It Works

The request flow is:

1. Embedded Tomcat accepts the HTTP request.
2. Spring MVC matches the effective URL to a controller method.
3. The controller delegates behavior to a service.
4. The service returns an immutable response record.
5. Spring serializes the record as JSON.

`@SpringBootApplication` enables configuration, component scanning, and auto-configuration from its package downward. The entry class should therefore remain in the base package.

## Configuration and Routing

The effective application route can include:

- server address and port
- servlet context path
- controller-level mapping
- method-level mapping
- reverse-proxy prefixes or rewrites

A changed context path can make a healthy application return `404` at the previously published URL.

## Testing Approach

A random-port integration test starts the real application context and embedded server. It verifies component discovery, dependency injection, routing, HTTP behavior, and JSON serialization together.

Use a unit test for isolated logic and an integration test for framework wiring and external contracts. Do not replace all tests with full-context tests because they are slower.

## Common Mistakes

- Placing the application entry class below packages that must be scanned.
- Adding database, security, or observability dependencies before they are required.
- Hard-coding a test port and causing port conflicts.
- Treating successful startup as proof that every route works.
- Creating a custom health endpoint when Actuator is the intended operational interface.
- Changing tests to accept accidental API behavior.

## Troubleshooting Tips

- Read the first meaningful exception and its deepest cause.
- Separate compilation, context startup, listener binding, routing, and response failures.
- Confirm the effective URL rather than inspecting controller annotations alone.
- Compare configuration with the last known-good commit.
- Use an integration test to protect the published API contract.

## Interview Questions and Answers

### What does `@SpringBootApplication` provide?

It combines configuration declaration, component scanning, and Spring Boot auto-configuration.

### Why use constructor injection?

It makes required dependencies explicit, supports immutability, and simplifies testing.

### Why run an integration test on a random port?

It exercises the real HTTP stack while avoiding dependence on a fixed port that may already be occupied.

### Why prefer Actuator over a custom health controller?

Actuator provides standardized, extensible health and management endpoints that can incorporate dependency health and integrate with monitoring systems.

## Related Concepts

- Maven lifecycle
- dependency injection
- Spring MVC
- externalized configuration
- Spring Boot Actuator
- reverse proxies
