package springboot.study.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "custom")
public class Custom implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户账号
     */
    @Column(name = "account", nullable = false)
    private String account;

    /**
     * 密码
     */
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "salt", nullable = false)
    private String salt;

    /**
     * 昵称
     */
    @Column(name = "alias", nullable = false)
    private String alias;

    /**
     * 性别   M 男性  W 女性  U 未知
     */
    @Column(name = "gender", nullable = false)
    private String gender;

    /**
     * 电话
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 邮箱
     */
    @Column(name = "email", nullable = false)
    private String email;

    /**
     * 注册时间
     */
    @Column(name = "regist_time", nullable = false)
    private Date registTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    /**
     * 用户账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 用户账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }

    /**
     * 昵称
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 昵称
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 性别   M 男性  W 女性  U 未知
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 性别   M 男性  W 女性  U 未知
     */
    public String getGender() {
        return gender;
    }

    /**
     * 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 注册时间
     */
    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    /**
     * 注册时间
     */
    public Date getRegistTime() {
        return registTime;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "id=" + id + '\'' +
                "account=" + account + '\'' +
                "password=" + password + '\'' +
                "salt=" + salt + '\'' +
                "alias=" + alias + '\'' +
                "gender=" + gender + '\'' +
                "phone=" + phone + '\'' +
                "email=" + email + '\'' +
                "registTime=" + registTime + '\'' +
                '}';
    }
}
