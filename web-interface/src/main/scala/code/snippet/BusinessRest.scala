package code.snippet

import net.liftweb.common._
import net.liftweb.util.BasicTypesHelpers._
import net.liftweb.http._
import net.liftweb.http.S._
import net.liftweb.http.js._
import net.liftweb.http.js.JE._
import net.liftweb.http.rest._
import net.liftweb.json._
import net.liftweb.json.Serialization.{read,write}
import code.lib.TreeNode

object BusinessRest extends RestHelper {
	
	serve {
		case Req( "organisation" ::  _, "json", PostRequest ) => {
			S.param("node") match {
				case Full("source") => {
					val list = TreeNode( text="adapter", id="source/adapater",cls="folder", leaf=false) ::
						TreeNode( text="dd", id="source/dd", cls="folder", leaf=false) ::
						TreeNode( text="debug.js", id="source/debug.js", leaf=true,cls="file", expandable=false)::
						Nil
					JsRaw(write(list))
				}
				case _ => JsRaw("")
			}
		}
	}
}
