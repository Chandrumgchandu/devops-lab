# HTTP Status Troubleshooting

## Concept

HTTP status codes classify request outcomes. They narrow the investigation area, but they are symptoms rather than complete root causes.

## Purpose

Use the status code to form an initial hypothesis, then verify the full request path, application state, dependencies, and recent changes before selecting a fix.

## How It Works

An HTTP request can pass through DNS, firewalls, load balancers, reverse proxies, application servers, security filters, route mappings, and business logic. The component returning the response determines the status code.

| Symptom | First Investigation |
| --- | --- |
| `404 Not Found` | Wrong URL, context path, proxy rewrite, or missing route mapping? |
| `401 Unauthorized` | Missing, invalid, or expired authentication credentials? |
| `403 Forbidden` | Authenticated identity lacks permission, or a security policy denied access? |
| `500 Internal Server Error` | Unhandled application exception or invalid runtime state? |
| `502 Bad Gateway` | Reverse proxy cannot obtain a valid response from its upstream? |
| `503 Service Unavailable` | Service stopped, unhealthy, overloaded, or intentionally unavailable? |
| Connection refused | No listener on the target address and port, wrong port, or active rejection? |

## Production Troubleshooting Workflow

1. Reproduce the exact request and record URL, method, status, headers, body, and timestamp.
2. Identify which component returned the response.
3. Confirm DNS resolution, target address, port, and process listener.
4. Verify the effective path through proxy prefixes, rewrites, application context paths, and controller routes.
5. Check application and proxy logs using the request timestamp or correlation ID.
6. Compare configuration and deployment state with the last known-good version.
7. Test one hypothesis at a time, apply the smallest corrective change, and rerun the original request.

## Common Mistakes

- Calling the status code itself the root cause.
- Assuming successful process startup means every endpoint is reachable.
- Changing a test to match accidental behavior instead of restoring the approved contract.
- Checking application code while ignoring proxy and server path configuration.
- Treating `401` and `403` as interchangeable.
- Treating every `502` as an application defect without checking upstream connectivity.

## Troubleshooting Tips

- Build the effective URL from every routing layer. In Spring Boot, a servlet context path prefixes controller mappings.
- Use `curl -i` to inspect both status and response headers.
- Use `ss -ltnp` on Linux to verify that the expected process is listening.
- Check recent Git and configuration changes early when the failure began after a deployment.
- Distinguish:
  - **Symptom:** what was observed, such as `404`.
  - **Root cause:** the specific condition that produced it.
  - **Resolution:** the justified change that restores the intended contract.

## Interview Questions and Answers

### What is the difference between `401` and `403`?

`401` means valid authentication is required or the supplied credentials were rejected. `403` means the server understood the request but refuses to authorize it.

### How do `502` and `503` differ?

`502` usually means a gateway or proxy received an invalid response from an upstream. `503` means the responding service is currently unable or unwilling to handle the request.

### An application starts successfully but an endpoint returns `404`. What do you check?

Verify the exact URL, controller mapping, application context path, reverse-proxy prefix or rewrite, deployed version, and which component generated the `404`.

### Why is "the URL was not found" not a sufficient root cause?

It restates the symptom. A root cause identifies why the effective route did not match, such as a changed context path, missing deployment, or incorrect proxy rewrite.

## Related Concepts

- Spring Boot externalized configuration
- Reverse-proxy routing
- NGINX upstreams and rewrites
- Authentication and authorization
- TCP listeners and firewalls
- Health checks and service discovery
