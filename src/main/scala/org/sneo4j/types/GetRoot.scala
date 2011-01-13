package org.sneo4j.types

import reflect._
import sjson.json._
import annotation.target._

/**
 * Class used to represent the response from a "Get root" request.
 *
 * @see http://components.neo4j.org/neo4j-server/milestone/rest.html#Get_root
 *
 * @author Daniel Hackney
 */
@BeanInfo
case class GetRoot(@(JSONProperty @getter)(value = "relationship_index")
                   relationshipIndex:String,

                   @(JSONProperty @getter)(value = "node")
                   nodePath:String,

                   @(JSONProperty @getter)(value = "extensions_info")
                   extensionsInfo:String,

                   @(JSONProperty @getter)(value = "node_index")
                   nodeIndex:String,

                   @(JSONProperty @getter)(value = "reference_node")
                   referenceNode:String) {
  def this() = this(null, null, null, null, null)
}
