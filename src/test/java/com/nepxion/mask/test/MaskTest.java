package com.nepxion.mask.test;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.mask.core.MaskType;

public class MaskTest {
    public static void main(String[] args) throws Exception {
        // 业务脱敏
        System.out.println("手机号码 13812345678，脱敏值=" + MaskType.MOBILE.mask("13812345678"));
        System.out.println("银行卡号 1234 1234 1234 1234 123，脱敏值=" + MaskType.BANK_CARD.mask("1234 1234 1234 1234 123"));
        System.out.println("身份证号 331012198001013030，脱敏值=" + MaskType.ID_CARD.mask("331012198001013030"));
        System.out.println("姓名 张三丰，脱敏值=" + MaskType.NAME.mask("张三丰"));
        System.out.println("信用卡CVV 123，脱敏值=" + MaskType.CVV.mask("123"));
        System.out.println("信用卡有效期 12/20，脱敏值=" + MaskType.EXP.mask("12/20"));
        System.out.println("密码 1234567890，脱敏值=" + MaskType.PASSWORD.mask("1234567890"));
        System.out.println("验证码 1234，脱敏值=" + MaskType.CAPTCHA.mask("1234"));
        System.out.println("地址 上海市浦东新区浦建路1000弄1幢101室，脱敏值=" + MaskType.ADDRESS.mask("上海市浦东新区浦建路1000弄1幢101室"));
        System.out.println("邮件地址 1394997@qq.com，脱敏值=" + MaskType.EMAIL.mask("1394997@qq.com"));
        System.out.println("IP地址 192.168.0.1，脱敏值=" + MaskType.IP_ADDRESS.mask("192.168.0.1"));

        System.out.println("");

        // 智能脱敏
        System.out.println("手机号码 13812345678，脱敏值=" + MaskType.AI.mask("13812345678"));
        System.out.println("银行卡号 1234 1234 1234 1234 123，脱敏值=" + MaskType.AI.mask("1234 1234 1234 1234 123"));
        System.out.println("身份证号 331012198001013030，脱敏值=" + MaskType.AI.mask("331012198001013030"));
        System.out.println("姓名 张三丰，脱敏值=" + MaskType.AI.mask("张三丰"));
        System.out.println("信用卡CVV 123，脱敏值=" + MaskType.AI.mask("123"));
        System.out.println("信用卡有效期 12/20，脱敏值=" + MaskType.AI.mask("12/20"));
        System.out.println("密码 1234567890，脱敏值=" + MaskType.AI.mask("1234567890"));
        System.out.println("验证码 1234，脱敏值=" + MaskType.AI.mask("1234"));
        System.out.println("地址 上海市浦东新区浦建路1000弄1幢101室，脱敏值=" + MaskType.AI.mask("上海市浦东新区浦建路1000弄1幢101室"));
        System.out.println("邮件地址 1394997@qq.com，脱敏值=" + MaskType.AI.mask("1394997@qq.com"));
        System.out.println("IP地址 192.168.0.1，脱敏值=" + MaskType.AI.mask("192.168.0.1"));
    }
}