package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai/api")
public class ShoppingCotroller {
	

		
		@Autowired
		ShoppingServiceImpl shoppingServiceImpl;

		// api for add shop details
		@PostMapping("/createshopping")
		Shopping createShopDetails(@RequestBody Shopping shopinfo) {

			Shopping shopinfo1 = shoppingServiceImpl.creatShoppingDetails(shopinfo);

			return shopinfo1;

		}

		// api for get shop details by id
		@GetMapping("/shopping/{id}")
		Shopping updateShoppoingById(@PathVariable(value = "id") Integer id) {

			Shopping prod =shoppingServiceImpl.updateOfShoppingById(id);

			return prod;

		}

		// api for get shop list
		@GetMapping("/listofshops")
		public List<Shopping> listOfshopping(Shopping customer) {

			List<Shopping> listOfShoppingdetails = shoppingServiceImpl.ListOfShopping(customer);

			return listOfShoppingdetails;
		}

		// api for delete product by id
		@DeleteMapping("/customerdeletedbyid/{id}")
		public Map<String,Boolean> deleteById(@PathVariable(value = "id") Integer id) {
		      Map<String,Boolean> response = new HashMap<>();
			
			Shopping prod = shoppingServiceImpl.updateOfShoppingById(id);
			
			if(prod!=null) {
				shoppingServiceImpl.deleteShoppingById(id);
				response.put("deleted", Boolean.TRUE);
				return response;
			}
				
				response.put(" not deleted", Boolean.FALSE);
				return response;
		}

	}


}
