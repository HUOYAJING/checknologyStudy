

import java.io.Serializable;

/**
 * Create with IntelliJ IDEA
 * User: huoyajing
 * Date: 2017/3/15
 * Time: 18:45
 * To change this template use File | Settings | File Templates.
 */
public class BkCouponWchatRelation implements Serializable{
    private long phone;
    private String wchatPhoto;
    private String wchatNick;
    private long couponId;
    private long createTime;
    private Integer isRegister;
    private String unionId;
    private float redMoney;
    private Integer mode;
    private Integer couponType;
    private String copy;

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public float getRedMoney() {
        return redMoney;
    }

    public void setRedMoney(float redMoney) {
        this.redMoney = redMoney;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public Integer getIsRegister() {
        return isRegister;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getWchatPhoto() {
        return wchatPhoto;
    }

    public void setWchatPhoto(String wchatPhoto) {
        this.wchatPhoto = wchatPhoto;
    }

    public String getWchatNick() {
        return wchatNick;
    }

    public void setWchatNick(String wchatNick) {
        this.wchatNick = wchatNick;
    }

    public long getCouponId() {
        return couponId;
    }

    public void setCouponId(long couponId) {
        this.couponId = couponId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public Integer getIsRegister(Integer value) {
        return isRegister;
    }

    public void setIsRegister(Integer isRegister) {
        this.isRegister = isRegister;
    }

    public enum IsRegisterWchat {
        WCHATISREGISTER(1, "微信注册库拍"),
        WCHATNOREGISTER(2, "微信未注册库拍");

        private Integer value = null;
        private String text = null;

        IsRegisterWchat(Integer v, String text) {
            value = v;
            text = text;
        }

        public Integer getValue() {
            return value;
        }

        public String getText() {
            return text;
        }
    }

    public enum IsRegisterALL {
        NOREGISTER(1, "微信,手机号都未注册库拍"),
        OTHER(2, "其他三种情况");

        private Integer value = null;
        private String text = null;

        IsRegisterALL(Integer v, String text) {
            value = v;
            text = text;
        }

        public Integer getValue() {
            return value;
        }

        public String getText() {
            return text;
        }
    }

    public enum RedPackageCopy {
        COPYZEO(0,"抢好红包，拍稀罕货"),
        COPYONE(1, "换个姿势领、金额会更高"),
        COPYTWO(2, "莫愁前路无知己，来个红包都欢喜"),
        COPYTHREE(3,"抢好红包，拍稀罕货"),
        COPYFOUR(4,"挥一挥衣袖，大红包就跟我走咯~"),
        COPYFIVE(5,"哇哦，好大的包~");

        private int value;
        private String text;

        RedPackageCopy(int value, String text) {
            this.value = value;
            this.text = text;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public enum CouponType {
        activityCoupon(1, "活动优惠券"),
        shareCoupon(2, "分享优惠券");

        private Integer value = null;
        private String text = null;

        CouponType(Integer v, String text) {
            value = v;
            text = text;
        }

        public Integer getValue() {
            return value;
        }

        public String getText() {
            return text;
        }
    }
}
