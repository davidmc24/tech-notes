package technotes

import ratpack.groovy.Groovy
import ratpack.groovy.handling.GroovyContext
import ratpack.groovy.handling.GroovyHandler
import ratpack.server.PublicAddress

class InfoHandler extends GroovyHandler {
    @Override
    void handle(GroovyContext context) {
        def publicAddress = context.get(PublicAddress)
        context.render(Groovy.groovyMarkupTemplate("info.gtpl", address:publicAddress.getAddress(context)))
    }
}
