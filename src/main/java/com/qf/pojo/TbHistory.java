package com.qf.pojo;

public class TbHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_history.histroyid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer histroyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_history.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_history.key
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String key;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_history.histroyid
     *
     * @return the value of tb_history.histroyid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getHistroyid() {
        return histroyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_history.histroyid
     *
     * @param histroyid the value for tb_history.histroyid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setHistroyid(Integer histroyid) {
        this.histroyid = histroyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_history.user_id
     *
     * @return the value of tb_history.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_history.user_id
     *
     * @param userId the value for tb_history.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_history.key
     *
     * @return the value of tb_history.key
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_history.key
     *
     * @param key the value for tb_history.key
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
}