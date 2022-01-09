package poc.grails.selenium

class UserController {

    private static final String VALID_PASSWORD = "secret"

    def index() {
        flash.failure = null
        render view: "index"
    }

    def auth(UserCommand userCommand) {
        if (VALID_PASSWORD == userCommand.password) {
            redirect uri: "/"
        } else {
            flash.failure = "Incorrect user or password"
            render view: "index"
        }
    }
}
