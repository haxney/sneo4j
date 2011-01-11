package org.sneo4j.test

import org.specs.Specification
import org.codehaus.jackson.map.ObjectMapper
import org.codehaus.jackson.JsonNode
import org.sneo4j.types._

class SerializeTest extends Specification {
  val mapper = new ObjectMapper()
  val rootString = """{"node":"node-path","extensions_info":"ext-info","reference_node":"ref-node","relationship_index":"relation-index","node_index":"node-index"}"""
  val root = GetRoot("relation-index", "node-path", "ext-info", "node-index", "ref-node")

  "A GetRoot object" should {
    "serialize to JSON" in {
      val result = mapper.writeValueAsString(root)
      result must include("\"node\":\"node-path\"")
      result must include("\"extensions_info\":\"ext-info\"")
    }

    "deserialize from JSON" in {
      mapper.readValue(rootString, classOf[GetRoot]) mustEqual root
    }
  }
}
