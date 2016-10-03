# Install
## Bulid Docker Image

	package docker:build

# Troubleshooting
## Cert Issue
	[ERROR] Failed to execute goal com.spotify:docker-maven-plugin:0.2.3:build (default-cli) on project gs-spring-boot-docker: Exception caught: java.util.concurrent.ExecutionException: com.spotify.docker.client.shaded.javax.ws.rs.ProcessingException: javax.net.ssl.SSLHandshakeException: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target -> [Help 1]

To solve above problem add new env varible

	DOCKER_CERT_PATH = C:\Users\dldi\.docker\machine\certs

## SLF4J in inteliJ
If you got below error after run "package docker:build"  in inteliJ, let's try run the same command with mvn from CLI

	 SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder". SLF4J: Defaulting to no-operation (NOP) logger implementation SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.


## Travis Parsing issue
WebLint for travis .yaml files

	http://lint.travis-ci.org/