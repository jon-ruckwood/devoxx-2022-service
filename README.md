# devoxx-2022-service

Simulates a microservice repository using trunk development where features are added using Pull Requests.

## Workflows

* Build Pull Request – runs automatically when PRs are opened are pushed to the `main` branch
* Build and Push – runs automatically when commits are pushed to `main` (i.e. when a PR is merged) and will...
  * Builds the project,
  * Builds and pushes a docker image to `ghcr.io`,
  * Using the docker image tag, triggers the `update-image-tag.yaml` workflow on the [`jon-ruckwood/devoxx-2022-infrastructure`](https://github.com/jon-ruckwood/devoxx-2022-infrastructure) repository to deploy it.

## Usage

Build

```shell
mvn verify
```

Package

```shell
docker build . -t devoxx-2022-service:latest
```

Run
```shell
docker run --rm -p 7000:7000 devoxx-2022-service:latest
```

Invoke
```shell
curl http://localhost:7000/ping
```
