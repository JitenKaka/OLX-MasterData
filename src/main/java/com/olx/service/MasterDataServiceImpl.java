package com.olx.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.dto.Category;
import com.olx.dto.Status;
import com.olx.entity.CategoryEntity;
import com.olx.entity.StatusEntity;
import com.olx.repo.MasterCategoryDataRepo;
import com.olx.repo.MasterStatusDataRepo;

@Service
public class MasterDataServiceImpl implements MasterDataService{


	@Autowired
	private MasterCategoryDataRepo categoryDataRepo; 
	@Autowired
	private MasterStatusDataRepo statusDataRepo; 
	@Autowired
	private ModelMapper modelMapper;
	
	
	
private CategoryEntity getCategoryEntityFromDTO(Category category) {
	
	CategoryEntity categoryEntity=this.modelMapper.map(category, CategoryEntity.class);
		return categoryEntity;
	}
	
private Category getCategoryDTOFromEntity(CategoryEntity categoryEntity) {
	
	Category categoryDTO=this.modelMapper.map(categoryEntity, Category.class);
	return categoryDTO;
	}
	
	
private List<Category> getCategoryDTOListFromEntityList(List<CategoryEntity> categoryEntityList){
	List<Category> categoryDTOList=new ArrayList<Category>();
	for(CategoryEntity categoryEntity : categoryEntityList){
		categoryDTOList.add(getCategoryDTOFromEntity(categoryEntity));
	}
   return categoryDTOList;
}
	

private StatusEntity getStatusEntityFromDTO(Status status) {
	StatusEntity statusEntity=this.modelMapper.map(status, StatusEntity.class);
		return statusEntity;
	}
	
private Status getStatusDTOFromEntity(StatusEntity statusEntity) {
	Status statusDTO=this.modelMapper.map(statusEntity, Status.class);
	return statusDTO;
	}
	
	
private List<Status> getStatusDTOListFromEntityList(List<StatusEntity> statusEntityList){
	List<Status> statusDTOList=new ArrayList<Status>();
	for(StatusEntity statusEntity : statusEntityList){
		statusDTOList.add(getStatusDTOFromEntity(statusEntity));
	}
   return statusDTOList;

}
	
	@Override
	public List<Category> getAllCategories() {
		 List<CategoryEntity> categoryEntityList=categoryDataRepo.findAll();
			return getCategoryDTOListFromEntityList(categoryEntityList);
	}

	@Override
	public List<Status> getAllStatus() {
		 List<StatusEntity> statusEntityList=statusDataRepo.findAll();
			return getStatusDTOListFromEntityList(statusEntityList);
	}

}
