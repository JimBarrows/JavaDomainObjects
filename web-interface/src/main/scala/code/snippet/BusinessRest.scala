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
import bizondemand.party.model.Organization
import code.model.Model

object BusinessRest extends RestHelper {
	

	serve {
		case Req( "business" :: "organisation" ::  _, "json", PostRequest ) => {
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

		case Req( "business" ::_, "json", PostRequest) => {
			try {
				var organization = new Organization()
				organization.name = param("BizOnDemand.Party.PartyForm.NameField").open_! 
				println("organization name: " + organization.name)
				Model.mergeAndFlush(organization)
			}
			JsRaw("succes: true")
		}

	}

}
