package com.xueyuan.beans;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_users.id
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_users.username
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_users.password
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_users.email
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_users.id
     *
     * @return the value of bs_users.id
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_users.id
     *
     * @param id the value for bs_users.id
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_users.username
     *
     * @return the value of bs_users.username
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_users.username
     *
     * @param username the value for bs_users.username
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_users.password
     *
     * @return the value of bs_users.password
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_users.password
     *
     * @param password the value for bs_users.password
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_users.email
     *
     * @return the value of bs_users.email
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_users.email
     *
     * @param email the value for bs_users.email
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
    
    
}