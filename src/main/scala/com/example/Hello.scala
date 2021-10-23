package com.example

import org.slf4j.LoggerFactory
import org.slf4j.bridge.SLF4JBridgeHandler
import scalaj.http.Http

object Hello {

  private val logger = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]): Unit = {
    SLF4JBridgeHandler.removeHandlersForRootLogger()
    SLF4JBridgeHandler.install()

    val response = Http("https://httpbin.org/post")
      .postForm(Seq("q" -> "test"))
      .asString
      .body
    logger.info(response)
  }

}
