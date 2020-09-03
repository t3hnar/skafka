package com.evolutiongaming.skafka.consumer


final case class ConsumerGroupMetadata(
  groupId: String,
  generationId: Int,
  memberId: String,
  groupInstanceId: Option[String])

object ConsumerGroupMetadata {

  val Empty: ConsumerGroupMetadata = ConsumerGroupMetadata(
    groupId = "groupId",
    generationId = 0,
    memberId = "memberId",
    groupInstanceId = none)
}