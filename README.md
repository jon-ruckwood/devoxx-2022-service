# devoxx-2022-service-repo

Demonstrating workflows for a repository.

## Workflows

* Build Pull Request – runs automatically when PRs are opened are pushed to the `main` branch
* Build and Push – runs automatically when commits are pushed to `main` (i.e. when a PR is merged) builds the project and produces an image

## Usage

Build

```shell
mvn verify
```

Package

```shell
docker build . -t devoxx-2022-service-repo:latest
```

Run
```shell
docker run --rm -p 7000:7000 devoxx-2022-service-repo:latest
```

Invoke
```shell
curl http://localhost:7000/ping
```
