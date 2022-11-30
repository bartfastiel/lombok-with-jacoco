# Lombok with jacoco

This is a minimalistic example of how to use lombok with jacoco.

The `Cat`-class uses lombok's `@With`-annotation. The `lombok.config`-file is used to configure lombok to add
the `@Generated`-annotation to the generated code. This allows us to maintain a high test coverage.

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=bartfastiel_lombok-with-jacoco&metric=coverage)](https://sonarcloud.io/summary/new_code?id=bartfastiel_lombok-with-jacoco)
