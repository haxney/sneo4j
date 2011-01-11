package org.sneo4j.types

import reflect.BeanProperty
import org.codehaus.jackson.map.annotate._
import org.codehaus.jackson.annotate._

/**
 * Class used to represent the response from a "Get root" request.
 *
 * @see http://components.neo4j.org/neo4j-server/milestone/rest.html#Get_root
 *
 * @author Daniel Hackney
 */
case class GetRoot(@BeanProperty var relationship_index:String,
                   @BeanProperty var node:String,
                   @BeanProperty var extensions_info:String,
                   @BeanProperty var node_index:String,
                   @BeanProperty var reference_node:String) {
  def this() = this(null, null, null, null, null)
}
