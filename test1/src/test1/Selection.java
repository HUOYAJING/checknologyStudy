package test1;

import java.util.Random;

/**
 * Create with IntelliJ IDEA
 * User: huoyajing
 * Date: 2017/3/12
 * Time: 14:54
 * To change this template use File | Settings | File Templates.
 */
public class Selection {

   /* public static void main(String[] args) {
        //json字符串
        String jsonTest="[{\"createTime\":0,\"inviterUserId\":\"4030591477558046\",\"modifyTime\":0},\n" +
                "{\"createTime\":0,\"inviteeUserId\":\"4080812890880454\",\"inviterUserId\":\"4030591477558046\"," +
                "\"modifyTime\":1488425074},\n" +
                "{\"createTime\":0,\"inviteeUserId\":\"4081230765194878\",\"inviterUserId\":\"4030591477558046\"," +
                "\"modifyTime\":1488527480},\n" +
                "{\"createTime\":0,\"inviteeUserId\":\"4080819396246036\",\"inviterUserId\":\"4030591477558046\"," +
                "\"modifyTime\":1488426625}]";
        //将json转成JsonArray格式
		//修改注释，减少文字
        JsonArray array = new JsonParser().parse(jsonTest).getAsJsonArray();
        for (final JsonElement elem : array) {
            //ObjectMapper objectMapper = new ObjectMapper();
            String bkInvite = String.valueOf(elem);
        }
    }*/


    public static void main(String[] args) {
        String copy = "";
        Integer[] numbers = {1, 2, 3, 4, 5};
        Random random = new Random();
        int index = random.nextInt(numbers.length);
        System.out.println(index);
        if (BkCouponWchatRelation.RedPackageCopy.COPYZEO.getValue() == index) {
            copy = BkCouponWchatRelation.RedPackageCopy.COPYZEO.getText();
        }
        if (BkCouponWchatRelation.RedPackageCopy.COPYONE.getValue() == index) {
            copy = BkCouponWchatRelation.RedPackageCopy.COPYONE.getText();
        }
        if (BkCouponWchatRelation.RedPackageCopy.COPYTWO.getValue() == index) {
            copy = BkCouponWchatRelation.RedPackageCopy.COPYTWO.getText();
        }
        if (BkCouponWchatRelation.RedPackageCopy.COPYTHREE.getValue() == index) {
            copy = BkCouponWchatRelation.RedPackageCopy.COPYTHREE.getText();
        }
        if (BkCouponWchatRelation.RedPackageCopy.COPYFOUR.getValue() == index) {
            copy = BkCouponWchatRelation.RedPackageCopy.COPYFOUR.getText();
        }
        if (BkCouponWchatRelation.RedPackageCopy.COPYFIVE.getValue() == index) {
            copy = BkCouponWchatRelation.RedPackageCopy.COPYFIVE.getText();
        }
        System.out.println(copy);
    }

}
