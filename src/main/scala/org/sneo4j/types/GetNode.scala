package org.sneo4j.types

import reflect._
import annotation.target._
import java.net.URI
import util.matching.Regex

import sjson.json._

/**
 * Class used to represent the response from a "Get node" request.
 *
 * @see http://components.neo4j.org/neo4j-server/milestone/rest.html#Get_node
 *
 */
case class GetNode(@BeanProperty var self: URI,
                   @BeanProperty var data: Map[String, String],
                   @BeanProperty var create_relationship: URI,
                   @BeanProperty var all_relationships: URI,
                   @BeanProperty var all_typed_relationships: URI,
                   @BeanProperty var incoming_relationships: URI,
                   @BeanProperty var incoming_typed_relationships: URI,
                   @BeanProperty var outgoing_relationships: URI,
                   @BeanProperty var outgoing_typed_relationships: URI,
                   @BeanProperty var properties: URI,
                   @BeanProperty var property: URI,
                   @BeanProperty var traverse: URI
                 ) {
//  def this() = this(null, null, null, null, null)
}

object Implicits {
  implicit def string2URI(x: String) = new URI(x)
}

import Implicits._

trait UriFormatter {
  val token = new Regex("\\{.+?\\}")
}

class UriFormat1(val formatString: String) extends UriFormatter {
  def format(arg: String) = token.replaceFirstIn(formatString, arg)
}

class UriFormat2(val formatString: String) extends UriFormatter {
  def format(arg1: String, arg2: String) = {
    val inter = token.replaceFirstIn(formatString, arg1)
    token.replaceFirstIn(inter, arg2)
  }
}

class UriFormat0List(val formatString: String) extends UriFormatter {
  def format(list: List[String]) =
    token.replaceFirstIn(formatString, list.mkString("&"))
}
class UriFormat1List(val formatString: String) extends UriFormatter {
  def format(arg:String, list: List[String]) = {
    val inter = token.replaceFirstIn(formatString, arg)
    token.replaceFirstIn(inter, list.mkString("&"))
  }
}

