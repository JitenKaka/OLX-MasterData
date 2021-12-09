package com.olx.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.olx.dto.Category;
import com.olx.dto.Status;
import com.olx.service.MasterDataService;
import com.olx.service.MasterDataServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("olx/masterdata")
public class MasterDataController {
	
	@Autowired
	MasterDataService mastersDataService;
	
@GetMapping(value="/advertise/category", 
produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
@ApiOperation(value="Get All Categories")
public List<Category> getAllCategories()
{

	return mastersDataService.getAllCategories();
}
	
@GetMapping(value="/advertise/status", 
produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
@ApiOperation(value="Get All Status")
public List<Status> getAllStatus()
{
return mastersDataService.getAllStatus();
}


}
