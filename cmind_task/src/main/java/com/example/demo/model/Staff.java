package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.employee_id
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
	@Id
    private String employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.name
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.password
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.created_at
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.created_user
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    private String createdUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.update_at
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.update_user
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    private String updateUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.employee_id
     *
     * @return the value of staff.employee_id
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.employee_id
     *
     * @param employeeId the value for staff.employee_id
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.name
     *
     * @return the value of staff.name
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.name
     *
     * @param name the value for staff.name
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.password
     *
     * @return the value of staff.password
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.password
     *
     * @param password the value for staff.password
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.created_at
     *
     * @return the value of staff.created_at
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.created_at
     *
     * @param createdAt the value for staff.created_at
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.created_user
     *
     * @return the value of staff.created_user
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.created_user
     *
     * @param createdUser the value for staff.created_user
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.update_at
     *
     * @return the value of staff.update_at
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.update_at
     *
     * @param updateAt the value for staff.update_at
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.update_user
     *
     * @return the value of staff.update_user
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.update_user
     *
     * @param updateUser the value for staff.update_user
     *
     * @mbg.generated Mon Oct 31 23:29:38 JST 2022
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}