package pbdirect

object TestToPB extends App {

  case class InnerMessage(value: Int)
  case class OuterMessage(text: Option[String], inner: Option[InnerMessage])
  val message = OuterMessage(Some("Hello"), None)
  val a: Array[Byte] = message.toPB
  val e: Array[Byte] = Array[Byte](10, 5, 72, 101, 108, 108, 111)
  assert(a.sameElements(e))

}
