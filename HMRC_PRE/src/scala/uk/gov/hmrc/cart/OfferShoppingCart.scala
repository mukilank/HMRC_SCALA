package scala.uk.gov.hmrc.cart

import scala.annotation.tailrec
import scala.uk.gov.model.Apple
import scala.uk.gov.model.Fruit
import scala.uk.gov.model.Orange

class OfferShoppingCart extends ShoppingCart {

  def calculateTotal(basket: Seq[Fruit]): BigDecimal = {

    def calculateOffer(offerBasket: Seq[Fruit], appCount: Int, oraCount: Int, offerSum: BigDecimal): BigDecimal = {
      if (!offerBasket.isEmpty) {
        var sumVal: BigDecimal = offerBasket(0).name match {
          case "Apple" => calculateOffer(offerBasket.tail, (appCount + 1) % 2, oraCount, offerSum + (offerBasket(0).price * ((appCount + 1) % 2)))
          case "Orange" => calculateOffer(offerBasket.tail, appCount, (oraCount + 1) % 3, if ((oraCount + 1) % 3 != 0) offerSum + (offerBasket(0).price) else offerSum)
        }
        sumVal
      } else {
        offerSum
      }
    }
    return calculateOffer(basket, 0, 0, 0.0)
  }

}

object OfferTester {
  def main(args: Array[String]): Unit = {
    val cart = new OfferShoppingCart
    val fruits = List(Orange, Apple, Orange, Orange, Orange, Orange, Orange)
    println(cart.calculateTotal(fruits))
  }
}
