package org.dgame.jenkins.pipeline

final class JenkinsHelper {
    private final script
    private final Logger logger

    JenkinsHelper(final script) {
        this.script = Objects.requireNonNull(script)
        logger = new Logger(this.script)
    }

    void say() {
        this.logger.log("this is class JenkinsHelper function say")
    }
}

