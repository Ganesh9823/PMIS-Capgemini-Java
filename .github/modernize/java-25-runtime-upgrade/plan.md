# Modernization Plan: Upgrade Java Runtime to Java 25 LTS

**Project**: java capgemini

## Technical Framework

- **Language**: Java; assessment metadata reports JDK 25, while the affected Maven module currently declares Java source/target 17.
- **Framework**: No application framework identified for the affected module.
- **Build Tool**: Maven (`maven_demo/junit-jupiter/pom.xml`).
- **Database**: Not in scope for this runtime/build upgrade.
- **Key Dependencies**: Existing dependencies remain unchanged unless a compatibility adjustment is required to build or test on Java 25.

## Overview

Upgrade the affected Maven module's Java runtime and build configuration to Java 25 LTS. Keep the change limited to the runtime, build, and toolchain surfaces needed to compile, test, and package the module on the target LTS. Preserve application behavior and avoid unrelated framework, dependency, database, cloud-readiness, or deployment changes.

## Migration Impact Summary

| Surface | Current state | Target state | Comments |
|---------|---------------|--------------|----------|
| Java runtime/build | Maven source/target 17 | Java 25 LTS | Align relevant build/toolchain settings |
| Application behavior | Existing behavior | Preserved | No feature or business-logic changes |
| Validation | Existing Maven tests | Run under JDK 25 | Focus on the affected Maven module |

## Assessment Scope

This plan addresses the assessment finding **“Java Version is not the latest LTS”** (`azure-java-version-02000`) at `maven_demo/junit-jupiter/pom.xml` lines 17–18. The report metadata lists JDK 25, but the Maven compiler source and target declarations remain at 17; reconcile these project settings and verify the module under Java 25.

Other assessment findings concerning cloud readiness are excluded because they are outside the requested Java runtime/build/toolchain scope.

## Scope Boundaries

- Update only Java runtime, Maven build, and toolchain configuration required for Java 25.
- Keep application source behavior and unrelated dependencies unchanged.
- Do not add framework upgrades, cloud migrations, containerization, deployment, or integration-test infrastructure.
- Validate the affected Maven module with its existing tests and build/package lifecycle under JDK 25.

## Focused Validation

1. Confirm the selected JDK reports Java 25 and Maven uses that JDK.
2. Run the affected module's Maven clean verification/build lifecycle under Java 25.
3. Confirm existing unit tests pass and the module packages successfully.
4. Review the final diff to ensure only relevant runtime/build/toolchain changes were made and existing behavior and unrelated working-tree edits were preserved.
