# Modularization
Modularization allows developers to break up their code into small, self-contained modules that can be easily managed and updated. For example, a developer could create a module for the UI layer, another for the business logic, and another for the data access layer. This makes it easier to maintain and update the application, as changes can be made to individual modules without affecting the rest of the application.

# JPMS
- Java 9 introduces a new level of abstraction above packages, formally known as the Java Platform Module System (JPMS), or "Module" for short.
- *Package*: a group of similar types of classes, interfaces and subpackages.
- *Module*: a module is a group of closely related packages with a new module descriptor.

### Directives
#### module
- the module definition, file starts with this keyword followed by its name and definition
#### requires
- specifies that this module depends on another module
#### requires static
- module is required at compile time but optional at runtime
#### exports
- specifies one of the module's packages whose public types (and their nested public and protected types) should be accessible
#### exports...to
- exports to specific modules only
#### uses
- specifies a service used by the module.
- A service is an object of a class that implements the interface or extends the abstract class specified in the *uses* directive
#### provides...with
- The *provides* part of the directive specifies an interface or abstract class listed in a modules *uses* directive
- The *with* part specifies the name of the service provider class that implements the interface or extends the abstract class
#### opens
- allow all of the types in the specified package are accessible via reflection
#### opens...to
- opens specified package to any particular package only
#### open
- If all the packages in the given module should be accessible at runtime and via reflection to all other modules, we may open the entire module
