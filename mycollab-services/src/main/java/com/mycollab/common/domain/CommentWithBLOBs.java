package com.mycollab.common.domain;

import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
public class CommentWithBLOBs extends Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.comment
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    @Length(max=65535, message="Field value is too long")
    @Column("comment")
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.typeId
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    @Length(max=65535, message="Field value is too long")
    @Column("typeId")
    private String typeid;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.comment
     *
     * @return the value of m_comment.comment
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.comment
     *
     * @param comment the value for m_comment.comment
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.typeId
     *
     * @return the value of m_comment.typeId
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public String getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.typeId
     *
     * @param typeid the value for m_comment.typeId
     *
     * @mbg.generated Fri Oct 13 12:37:22 ICT 2017
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public enum Field {
        id,
        createduser,
        createdtime,
        type,
        saccountid,
        extratypeid,
        comment,
        typeid;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}