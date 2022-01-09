package poc.grails.selenium


import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration
import org.openqa.selenium.By

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class HomeSpec extends GebSpec {

    def setup() {
    }

    def cleanupSpec() {
        close()
    }

    def cleanup() {
    }

    void "test something"() {
        when: "The home page is visited"
            go '/'

        then: "The title is correct"
        	title == "Home"
    }

    void "test failure authentication"() {
        when: "The home page is visited and the incorrect credentials are used"
            go "/user"

            $(By.id("username")).value("user")
            $(By.id("password")).value("password")
            $(By.id("Enviar")).click()

        then: "Login form is submitted"
            assert title == "Login"
            assert $(By.id("message")).text() == "Incorrect user or password"
    }

    void "test success authentication"() {
        when: "The home page is visited and the correct credentials are used"
            go "/user"

            $(By.id("username")).value("user")
            $(By.id("password")).value("secret")
            $(By.id("Enviar")).click()

        then: "Login form is submitted"
            assert title == "Home"
    }

}

