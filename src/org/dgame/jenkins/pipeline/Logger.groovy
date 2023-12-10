package org.dgame.jenkins.pipeline

final class Logger{
    private final script
    private boolean color

    Logger(script,boolean color = true){
        this.script = script
        this.color = color
    }

    void debug(String message,...args){
        if (script.&echo) {
            if (color) {
                script.echo('\033[38;5;243m' + String.format('[DEBUG] ' + message, args) + '\033[0m')
            } else {
                script.echo(String.format('[DEBUG] ' + message, args))
            }
        }
    }

    void log(String message, ... args) {
        if (script.&echo) {
            script.echo(String.format(message, args))
        }
    }

    void info(String message, ... args) {
        if (script.&echo) {
            if (color) {
                script.echo('\033[38;5;156m' + String.format(message, args) + '\033[0m')
            } else {
                script.echo(String.format(message, args))
            }
        }
    }
}
