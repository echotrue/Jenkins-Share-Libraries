package org.dgame.jenkins.pipeline

final class JenkinsHelper {
    private final script

    JenkinsHelper(final script) {
        this.script = Objects.requireNonNull(script)
    }

    static void say() {
        println("this is function say of class JenkinsHelper")
    }
}

