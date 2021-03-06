package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.Target;
import com.mycollab.module.crm.domain.TargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface TargetMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    long countByExample(TargetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int deleteByExample(TargetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    @Delete({
        "delete from m_crm_target",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    @Insert({
        "insert into m_crm_target (id, prefixname, ",
        "firstname, lastname, ",
        "title, department, ",
        "birthday, accountname, ",
        "isCallable, officePhone, ",
        "mobile, homePhone, ",
        "otherPhone, fax, ",
        "assistant, assistantPhone, ",
        "primaryAddress, primaryCity, ",
        "primaryState, primaryPostal, ",
        "primaryCountryId, description, ",
        "email, createdTime, ",
        "createdUser, sAccountId, ",
        "assignUser, lastUpdatedTime)",
        "values (#{id,jdbcType=INTEGER}, #{prefixname,jdbcType=VARCHAR}, ",
        "#{firstname,jdbcType=VARCHAR}, #{lastname,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{department,jdbcType=VARCHAR}, ",
        "#{birthday,jdbcType=DATE}, #{accountname,jdbcType=VARCHAR}, ",
        "#{iscallable,jdbcType=BIT}, #{officephone,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{homephone,jdbcType=VARCHAR}, ",
        "#{otherphone,jdbcType=VARCHAR}, #{fax,jdbcType=VARCHAR}, ",
        "#{assistant,jdbcType=VARCHAR}, #{assistantphone,jdbcType=VARCHAR}, ",
        "#{primaryaddress,jdbcType=VARCHAR}, #{primarycity,jdbcType=VARCHAR}, ",
        "#{primarystate,jdbcType=VARCHAR}, #{primarypostal,jdbcType=VARCHAR}, ",
        "#{primarycountryid,jdbcType=INTEGER}, #{description,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{createdtime,jdbcType=TIMESTAMP}, ",
        "#{createduser,jdbcType=VARCHAR}, #{saccountid,jdbcType=INTEGER}, ",
        "#{assignuser,jdbcType=VARCHAR}, #{lastupdatedtime,jdbcType=TIMESTAMP})"
    })
    int insert(Target record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int insertSelective(Target record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    List<Target> selectByExample(TargetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    @Select({
        "select",
        "id, prefixname, firstname, lastname, title, department, birthday, accountname, ",
        "isCallable, officePhone, mobile, homePhone, otherPhone, fax, assistant, assistantPhone, ",
        "primaryAddress, primaryCity, primaryState, primaryPostal, primaryCountryId, ",
        "description, email, createdTime, createdUser, sAccountId, assignUser, lastUpdatedTime",
        "from m_crm_target",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.TargetMapper.BaseResultMap")
    Target selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int updateByExampleSelective(@Param("record") Target record, @Param("example") TargetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int updateByExample(@Param("record") Target record, @Param("example") TargetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    int updateByPrimaryKeySelective(Target record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    @Update({
        "update m_crm_target",
        "set prefixname = #{prefixname,jdbcType=VARCHAR},",
          "firstname = #{firstname,jdbcType=VARCHAR},",
          "lastname = #{lastname,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "department = #{department,jdbcType=VARCHAR},",
          "birthday = #{birthday,jdbcType=DATE},",
          "accountname = #{accountname,jdbcType=VARCHAR},",
          "isCallable = #{iscallable,jdbcType=BIT},",
          "officePhone = #{officephone,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "homePhone = #{homephone,jdbcType=VARCHAR},",
          "otherPhone = #{otherphone,jdbcType=VARCHAR},",
          "fax = #{fax,jdbcType=VARCHAR},",
          "assistant = #{assistant,jdbcType=VARCHAR},",
          "assistantPhone = #{assistantphone,jdbcType=VARCHAR},",
          "primaryAddress = #{primaryaddress,jdbcType=VARCHAR},",
          "primaryCity = #{primarycity,jdbcType=VARCHAR},",
          "primaryState = #{primarystate,jdbcType=VARCHAR},",
          "primaryPostal = #{primarypostal,jdbcType=VARCHAR},",
          "primaryCountryId = #{primarycountryid,jdbcType=INTEGER},",
          "description = #{description,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP},",
          "createdUser = #{createduser,jdbcType=VARCHAR},",
          "sAccountId = #{saccountid,jdbcType=INTEGER},",
          "assignUser = #{assignuser,jdbcType=VARCHAR},",
          "lastUpdatedTime = #{lastupdatedtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Target record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    Integer insertAndReturnKey(Target value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_target
     *
     * @mbg.generated Fri Oct 13 12:37:16 ICT 2017
     */
    void massUpdateWithSession(@Param("record") Target record, @Param("primaryKeys") List primaryKeys);
}