package edu.ie3.sample

import com.typesafe.scalalogging.LazyLogging
import org.scalatest._

/**
  * //ToDo: Class Description
  *
  * @version 0.1
  * @since 11.12.19
  */
class EmptySpec
    extends Matchers
    with WordSpecLike
    with OptionValues
    with Inside
    with Inspectors
    with PrivateMethodTester
    with LazyLogging
    with TryValues {

  "An empty spec" should {
    "just print" in {
      println("empty spec")
    }
  }

}
