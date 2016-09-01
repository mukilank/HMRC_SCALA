package test.scala.uk.gov.hmrc.cart

import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import scala.uk.gov.hmrc.cart.OfferShoppingCart
import scala.uk.gov.model._

class OfferShoppingCartSpec extends FeatureSpec with GivenWhenThen with Matchers{
 
   
 feature("Offer Fruit Shopping cart - Calculate Total for 2 apples and 1 orange") {
    scenario("Test Calculate total - Buy 1 get 1 free apples") {

      Given("FruitsShoppingCart and Fruits")
	      val shoppingCart = new OfferShoppingCart
	      val basket = List(Apple, Apple, Orange) 
      
      Then("Basket total price must be 0.85")
      shoppingCart.calculateTotal(basket).toDouble should be(0.85)      

    }
   }
    
    feature("Offer Fruit Shopping cart - Calculate Total for 0 apples and 1 orange") {
    scenario("Test Calculate total") {

      Given("FruitsShoppingCart and Fruits")
	      val shoppingCart = new OfferShoppingCart
	      val basket = List(Orange) 
      
      Then("Basket total price must be 0.25")
      shoppingCart.calculateTotal(basket).toDouble should be(0.25)      

    }
   }
        
  feature("Offer Fruit Shopping cart - Calculate Total for 2 apples and 0 orange") {
    scenario("Test Calculate total - Buy 1 get 1 free apples") {

      Given("FruitsShoppingCart and Fruits")
	      val shoppingCart = new OfferShoppingCart
	             val basket = List(Apple, Apple) 

      
      Then("Basket total price must be 0.60")
      shoppingCart.calculateTotal(basket).toDouble should be(0.60)      

    }
   }
            
  feature("Offer Fruit Shopping cart - Calculate Total for 2 apples and 2 oranges") {
    scenario("Test Calculate total - - Buy 1 get 1 free apples") {

      Given("FruitsShoppingCart and Fruits")
	      val shoppingCart = new OfferShoppingCart
	             val basket = List(Apple, Apple, Orange, Orange) 

      
      Then("Basket total price must be 1.10")
      shoppingCart.calculateTotal(basket).toDouble should be(1.10)      

    }
   }
                
  feature("Offer Fruit Shopping cart - Calculate Total for 3 apples and 3 oranges") {
    scenario("Test Calculate total - Buy 1 get 1 free apples & But 3 for the price of 2 oranges") {

      Given("FruitsShoppingCart and Fruits")
	      val shoppingCart = new OfferShoppingCart
	             val basket = List(Apple, Apple, Apple, Orange, Orange, Orange) 
      
      Then("Basket total price must be 1.70")
      shoppingCart.calculateTotal(basket).toDouble should be(1.70)      

    }
   }
  
    feature("Offer Fruit Shopping cart - Calculate Total for 1 apple and 5 oranges") {
    scenario("Test Calculate total - But 3 for the price of 2 oranges") {

      Given("FruitsShoppingCart and Fruits")
	      val shoppingCart = new OfferShoppingCart
	             val basket = List(Orange, Apple, Orange, Orange, Orange, Orange) 

      
      Then("Basket total price must be 1.60")
      shoppingCart.calculateTotal(basket).toDouble should be(1.60)      

    }
   }
 
 
}