package test.scala.uk.gov.hmrc.cart

import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import scala.uk.gov.hmrc.cart.BasicShoppingCart
import scala.uk.gov.model._

class BasicShoppingCartSpec extends FeatureSpec with GivenWhenThen with Matchers{
 
   
    feature("Basic Shopping Cart - Calculate Total for 2 apples and 1 orange") {
    scenario("Test Calculate total") {

      Given("BasicShoppingCart and Fruits")
	   val shoppingCart = new BasicShoppingCart
       val basket = List(Apple, Apple, Orange)       
      
      Then("Basket total price must be 1.45")
      shoppingCart.calculateTotal(basket).toDouble should be(1.45)      

    }
   }
    
   feature("Basic Shopping Cart - Calculate Total for 0 apples and 1 orange") {
    scenario("Test Calculate total") {

      Given("BasicShoppingCart and Fruits")
	      val shoppingCart = new BasicShoppingCart
	      val basket = List(Orange)
      
      Then("Basket total price must be 0.25")
      shoppingCart.calculateTotal(basket).toDouble should be(0.25)      

    }
   }
        
  feature("Basic Shopping Cart - Calculate Total for 2 apples and 0 orange") {
    scenario("Test Calculate total") {

      Given("BasicShoppingCart and Fruits")
	      val shoppingCart = new BasicShoppingCart
	      val basket = List(Apple, Apple)
      
      Then("Basket total price must be 1.20")
      shoppingCart.calculateTotal(basket).toDouble should be(1.20)      

    }
   }
            
  feature("Basic Shopping Cart - Calculate Total for 2 apples and 2 oranges") {
    scenario("Test Calculate total") {

      Given("BasicShoppingCart and Fruits")
	      val shoppingCart = new BasicShoppingCart
	      val basket = List(Apple, Apple, Orange, Orange)
      
      Then("Basket total price must be 1.70")
      shoppingCart.calculateTotal(basket).toDouble should be(1.70)      

    }
   }
                
  feature("Basic Shopping Cart - Calculate Total for 3 apples and 3 oranges") {
    scenario("Test Calculate total") {

      Given("BasicShoppingCart and Fruits")
	      val shoppingCart = new BasicShoppingCart
	      val basket = List(Apple, Apple, Apple, Orange, Orange, Orange)
      
      Then("Basket total price must be 2.55")
      shoppingCart.calculateTotal(basket).toDouble should be(2.55)      

    }
   }
 
}