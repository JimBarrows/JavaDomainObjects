package code.lib

import scala.xml._
import net.liftweb.common._
import net.liftweb.util.BasicTypesHelpers._
import net.liftweb.http._
import net.liftweb.http.S._
import net.liftweb.http.js._
import net.liftweb.http.js.JE._
import net.liftweb.http.rest._
import net.liftweb.json._
import net.liftweb.json.JsonAST._
import net.liftweb.json.Serialization.{read,write}

/**
	* This class mimics the Ext.tree.TreeNode class, and will convert itself to JSON.
	*/
case class TreeNode (
	allowChildren:Boolean = true,
	allowDrag:Boolean = true,
	allowDrop:Boolean = true,
	checked : Option[Boolean] = None,
	cls:String = "",
	disabled:Boolean = false,
	draggable:Boolean=true,
	editable:Boolean = true,
	expandable:Boolean=true,
	expanded:Boolean=false,
	hidden:Boolean = false,
	href:String="#",
	hrefTarget:String="",
	icon:String="",
	iconCls:String="",
	id:String,
	isTarget :Boolean= true,
	leaf :Boolean= true,
	qtip:String="",
	singleClickExpand:Boolean=true,
	text:String 
) 

