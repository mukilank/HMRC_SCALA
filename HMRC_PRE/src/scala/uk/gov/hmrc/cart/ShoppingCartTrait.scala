package scala.uk.gov.hmrc.cart

import scala.uk.gov.model.Fruit

trait ShoppingCart {
  def calculateTotal(basket: Seq[Fruit]): BigDecimal
}