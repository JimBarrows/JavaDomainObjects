package code.snippet

import net.liftweb.common._
import net.liftweb.util.BasicTypesHelpers._
import net.liftweb.http._
import net.liftweb.http.js._
import net.liftweb.http.js.JE._
import net.liftweb.http.rest._
import net.liftweb.json.JsonAST._

object BusinessRest extends RestHelper {
	
	serve {
		case Req( "organisation" ::Nil, "json", PostRequest) => {
			println("YAY")
			JsRaw("""
			[{
    "text": "adapter",
    "id": "source\/adapter",
    "cls": "folder"
}, {
    "text": "dd",
    "id": "source\/dd",
    "cls": "folder"
}, {
    "text": "debug.js",
    "id": "source\/debug.js",
    "leaf": true,
    "cls": "file"
}]
"""
			)
		}
	}
}
