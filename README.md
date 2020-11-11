# A Yelp-like Application with searching, sorting, recommendation systems using Elasticsearch + Spark MLlib + Spring Boot + SQL

## Overview
<image src="readme_resources/Overview.png" width =600px />

## Demo
<image src="readme_resources/Search_Demo.gif" width =300px />

## Features
#### (1) Search and Recommend Systems
- Designed register / login pages using **HTML, CSS, JavaScript**.
- Built an advanced search systems using **Elasticsearch** and **Kibana**, supporting fast search, fine-tune relevancy, and powerful analytics.
- Built the real-time index (full + incremental) structures using **canal** pipeline.
- Developed the personalized recommend system using Machine Learning techniques (**Logistic Regression** and **Decision Tree**) in the **Spark MLlib**.

<table>
 <tr>
    <td><b style="font-size:16px">Search Page</b></td>
    <td><b style="font-size:16px">Recommend Page</b></td>
 </tr>
 <tr>
    <td><image src="readme_resources/11_Search_Demo.png" width =300px /></td>
    <td><image src="readme_resources/13_Recommendations.png" width =300px /></td>
 </tr>
<table>
 <tr>
    <td><b style="font-size:16px">Elasticsearch + Kibana</b></td>
 </tr>
 <tr>
    <td><image src="readme_resources/20_ES and Kibana.png" width =600px /></td>
 </tr>
 </table>


#### (2) Admin
The admin user is able to manage all information in the application, including seller, category, and shop.
<table>
 <tr>
    <td><b style="font-size:16px">Home Page</b></td>
    <td><b style="font-size:16px">Seller Management</b></td>
 </tr>
 <tr>
    <td><image src="readme_resources/00_Admin_Home_Page.png" width =300px /></td>
    <td><image src="readme_resources/01_Admin_Seller_Management.png" width =300px /></td>
 </tr>
 <tr>
    <td><b style="font-size:16px">Category Management</b></td>
    <td><b style="font-size:16px">Shop Management</b></td>
 </tr>
 <tr>
    <td><image src="readme_resources/02_Admin_Category_Management.png" width =300px /></td>
    <td><image src="readme_resources/03_Admin_Shop_Management.png" width =300px /></td>
 </tr>
 </table>

#### (3) User
 Allow user to register and login to the application.
<table>
 <tr>
    <td><b style="font-size:16px">User Login</b></td>
    <td><b style="font-size:16px">User Register</b></td>
 </tr>
 <tr>
    <td><image src="readme_resources/14_User_login.png" width =300px /></td>
    <td><image src="readme_resources/15_Register_Page.png" width =300px /></td>
 </tr>
 </table>

#### (4) Database
Utilize the MySQL database to store all information.
<table>
 <tr>
    <td><b style="font-size:16px">MySQL Tables</b></td>
 </tr>
 <tr>
    <td><image src="readme_resources/12_SQL.png" width =600px /></td>
 </tr>
 </table>


## Requirements
- Front-end: HTML, CSS, JavaScript, jQuery
- Back-end: Java (jdk1.8), SpringBoot (2.1.5)
- Database: MySQL (5.6), mybatis
- Searching System: Elasticsearch (7.3.0), canal (1.1.3)
- Recommend System: Spark MLlib (2.4.4)


