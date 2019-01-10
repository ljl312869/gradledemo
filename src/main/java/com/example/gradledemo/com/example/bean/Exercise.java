package com.example.gradledemo.com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {
    //日志信息
    private String jzbJson;//发送至jzb的报文
    private String jzbReJson;//jzb返回报文
    private String jzbReCode;//jzb返回码
    private String jzbReInfo;//jzb返回信息
    private String apiSendJs;//发送至外部平台的报文
    private String apiReJson;//外部平台返回报文
    private String apiReCode;//api接口返回码
    private String apiReInfo;//api接口返回信息

    //会员相关接口公共字段
    private String baseDcaUserId;//钱包用户id
    private String dcaBizUserId;//云账户会员表主键
    private String mobileNo;//创建会员手机号
    private String memberType;//创建会员类型2-企业会员 3-个人会员
    private String userId;//云账户用户唯一标识
    private String isInit;//是否初始化 0-未初始化 1-已初始化

    //银行卡信息相关字段
    private String bankName;//银行卡号
    private String bankCardNo;//银行卡号
    private String realName;//姓名
    private String idCard;//身份证号
    private String sendData;//发送数据

    //初始化钱包用户

    private String userLevel;//用户等级
    private String accountInit;//初始化状态 0：未初始化 1：成功 2失败
    private String bindInit;//初始化状态 0：未初始化 1：成功 2失败
    private String shimingInit;//初始化状态 0：未初始化 1：成功 2失败
    private String bandCardInit;//初始化状态 0：未初始化 1：成功 2失败
    private String baseDcaBankCardId;

    private int startPage;
    private int endPage;
    private String pageSize;//固定数量

    //初始化账号余额
    private String subBalance;
    private String balanceInit;
    private String transStatus;
    private String tlOrderNo;
    private String jzbTlTransId;
    private String fromBizUserId;
    private String toBizUserId;
    private String amount;

    private String transDesc;//处理描述

    //查询云账号余额
    private String allAmount;//总金额
    private String freezenAmount;//冻结金额
    private String subAmount;//可用金额

    //钱包用户信息
    private String mobileNoForAcct;
    private String dcaAccount;//钱包账号
    private String nickName;
    private String payPwd;
    private String subOutBalance;
    private String userType;
    private String addType;
    private String loginUserId;
    private String orgId;
    private String dcaAccountNumber;//钱包账号序列号
    private String usableBal;//可用余额
    private String balance;
    private String isBindCard;//是否绑定银行卡 0-绑定,1-未绑定

    private String isNewAdd;//是否是一体化新增的 0-是 1-否

    private String userKey;//钱包ID/钱包账号AES加密传输
    private String userFlag;//1-根据钱包ID查询,2-根据钱包账号查询
    private String authType;//认证类型 0-五要素开户 1-三要素开户
    private String isGetReceiptCodeURL;//是否获取收款码URL
    private String dcaReceiptCodeURL;//收款码URL

    private String jumpUrl;//签约协议回调地址
    private String signContractUrl;//签约地址
    private String contractNo;//协议编号
    private String contractStatus;//协议状态
    private String status;//异步通知返回状态

    private String bindType;//0:三要素 1:通联通协议支付签约  （没传时默认0）
    private String bankMobileNo;//银行预留手机号 bindType=1时必传

    private String verificationCode;//验证码
    private String tranceNum;//绑卡流水号
    private String dcaBindCardId;//绑卡主键

    private String state;
    private String cardCheck;
    private String cardCheckDesc;
    private String operType;// 0-新增 1-修改

    private String payPwdBefore;// 加密之前的密码
    private String isIdentical;//是否一致 0-是 1-否
    private String note;//备注

    private String orderNo;//订单号
    private String orderStatus;//订单状态

    private String belongActSys;//所属体系
    private String driverId;//路歌司机体系用户id
    private String optUserId;//操作者id
    private String optSource;//操作来源

    private String balanceType;//余额类型
    private String balanceName;//余额类型名称

    private String dcaBalanceInfoId;
    private String jzbYfszInfoId;

    public static void main(String[] args) {
        Exercise exercise=new Exercise();
        System.out.println(exercise);
        exercise.setAmount("11111111111111");
        System.out.println(exercise.getAmount());
    }
}
