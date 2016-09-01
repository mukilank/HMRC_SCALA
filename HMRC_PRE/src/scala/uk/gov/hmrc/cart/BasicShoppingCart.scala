package scala.uk.gov.hmrc.cart

import scala.uk.gov.model.Fruit
import scala.uk.gov.model.Orange
import scala.uk.gov.model.Apple

class BasicShoppingCart extends ShoppingCart{

  def calculateTotal(basket: Seq[Fruit]): BigDecimal = {
    basket.map(_.price).sum
  } 

}

object Tester{
     def main(args: Array[String]): Unit = {
       val cart = new BasicShoppingCart
       val fruits = List(Orange, Apple, Orange)       
       println(cart.calculateTotal(fruits))
  }
}