package com.sportyshoes.controllers;

import com.sportyshoes.exceptions.ResourceNotFound;
import com.sportyshoes.models.Admin;
import com.sportyshoes.models.Customer;
import com.sportyshoes.models.PurchasedProduct;
import com.sportyshoes.models.User;
import com.sportyshoes.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;
    @Autowired
    private ICustomerService custService;
    @Autowired
    private IPurchasedProductService prodService;
    @Autowired
    private IUserService userService;

    @PostMapping("/insertadmin")
    public Admin insertAdmin(@RequestBody Admin admin)	{
        return adminService.insertAdminInDB(admin);
    }

    @PutMapping("/updateadminbyid/{adminid}")
    public void updateAdmin(@PathVariable("adminid") Long adminId, @RequestBody Admin admin) throws ResourceNotFound {
        adminService.updateAdminInDB(admin, adminId);
    }

    @GetMapping("/getallvalidcustomers")
    public List<Customer> getAllUsers(){
        return custService.getAllCustomers();
    }
    @GetMapping("/getallcustomerbyname/{custname}")
    public List<Customer> findByCustomerName(@PathVariable("custname") String customerName){
        return custService.findByCustomerName(customerName);
    }
    @GetMapping("/getallcustomerbydate/{date}")
    public List<Customer> getAllCustomersByDateAndCategory(@PathVariable("date") String date) {
        return custService.findByDate(date);
    }

    @GetMapping("/getallproductsbycategory/{category}")
    public List<PurchasedProduct> getAllProductssByCategory(@PathVariable("category") String category) {
        return prodService.findByCategory(category);
    }

    @GetMapping("/getallusers")
    public List<User> getAllUsers1()    { return userService.getAllUsers(); }

}
