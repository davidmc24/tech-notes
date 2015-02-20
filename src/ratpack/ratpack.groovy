import ratpack.groovy.template.MarkupTemplateModule
import technotes.InfoHandler

import static ratpack.groovy.Groovy.ratpack

ratpack {
    bindings {
        add(new MarkupTemplateModule())
    }
    handlers {
        handler("info", new InfoHandler())
        get("foo") {
            render "from the foo handler"
        }
        get("bar") {
            render "from the bar handler"
        }
    }
}
