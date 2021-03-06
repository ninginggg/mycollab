/*Domain class of table s_customer_feedback*/
package com.mycollab.common.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_customer_feedback")
@Alias("CustomerFeedback")
class CustomerFeedback extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_customer_feedback.id
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_customer_feedback.sAccountId
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_customer_feedback.username
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("username")
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_customer_feedback.leaveType
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    @Column("leaveType")
    private Integer leavetype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_customer_feedback.otherTool
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    @Length(max=400, message="Field value is too long")
    @Column("otherTool")
    private String othertool;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        CustomerFeedback item = (CustomerFeedback)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(661, 795).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_customer_feedback.id
     *
     * @return the value of s_customer_feedback.id
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_customer_feedback.id
     *
     * @param id the value for s_customer_feedback.id
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_customer_feedback.sAccountId
     *
     * @return the value of s_customer_feedback.sAccountId
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_customer_feedback.sAccountId
     *
     * @param saccountid the value for s_customer_feedback.sAccountId
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_customer_feedback.username
     *
     * @return the value of s_customer_feedback.username
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_customer_feedback.username
     *
     * @param username the value for s_customer_feedback.username
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_customer_feedback.leaveType
     *
     * @return the value of s_customer_feedback.leaveType
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public Integer getLeavetype() {
        return leavetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_customer_feedback.leaveType
     *
     * @param leavetype the value for s_customer_feedback.leaveType
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public void setLeavetype(Integer leavetype) {
        this.leavetype = leavetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_customer_feedback.otherTool
     *
     * @return the value of s_customer_feedback.otherTool
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public String getOthertool() {
        return othertool;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_customer_feedback.otherTool
     *
     * @param othertool the value for s_customer_feedback.otherTool
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public void setOthertool(String othertool) {
        this.othertool = othertool;
    }
}