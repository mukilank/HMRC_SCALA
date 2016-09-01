package scala.uk.gov.model

trait Fruit {
  val price: Double
  def name = "Fruit"
}

case object Apple extends Fruit {
  override val price = .60
  override def name = "Apple"
}

case object Orange extends Fruit {
  override val price = .25
  override def name = "Orange"
}