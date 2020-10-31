package com.imooc.dianping.dal;

import com.imooc.dianping.model.CategoryModel;

import java.util.List;

public interface CategoryModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Mon Oct 26 21:35:26 MDT 2020
     */
    int deleteByPrimaryKey(Integer id);

    List<CategoryModel> selectAll();
    Integer countAllCategory();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Mon Oct 26 21:35:26 MDT 2020
     */
    int insert(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Mon Oct 26 21:35:26 MDT 2020
     */
    int insertSelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Mon Oct 26 21:35:26 MDT 2020
     */
    CategoryModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Mon Oct 26 21:35:26 MDT 2020
     */
    int updateByPrimaryKeySelective(CategoryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Mon Oct 26 21:35:26 MDT 2020
     */
    int updateByPrimaryKey(CategoryModel record);
}