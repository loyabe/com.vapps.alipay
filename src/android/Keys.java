/**
 * Copyright (C) 2010 The MobileSecurePay Project
 * All right reserved.
 * author: shiqun.shi@alipay.com
 * 
 *  提示：如何获取安全校验码和合作身份者id
 *  1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *  2.点击“商家服务”(https://b.alipay.com/order/myorder.htm)
 *  3.点击“查询合作者身份(pid)”、“查询安全校验码(key)”
 */

package com.vapps.alipay;

//
// 请参考 Android平台安全支付服务(msp)应用开发接口(4.2 RSA算法签名)部分，并使用压缩包中的openssl RSA密钥生成工具，生成一套RSA公私钥。
// 这里签名时，只需要使用生成的RSA私钥。
// Note: 为安全起见，使用RSA私钥进行签名的操作过程，应该尽量放到商家服务器端去进行。
public final class Keys {

	//合作身份者id，以2088开头的16位纯数字
	public static final String PARTNER = "2088911723410750";

	//收款支付宝账号
	public static final String SELLER = "cbq9899@163.com";

	//商户私钥，自助生成   pkcs8格式
	public static final String RSA_PRIVATE =   "MIICXQIBAAKBgQDlsWNmWS30bcSXsylodD3+F0IHzXMKgU8t51BQ4LSF+cz3BxJ6"+
                                                 "jO/bHQ24gIrLn8XL5Qf6MXPLdfUT56xNePvsNoA60HOQXvfyR8WE8hck5LHjMn7T"+
                                                 "dnJJie02qkdJQhy8HfhlU61ly95b9+jQuYhJAoqpHbA3T6c59o3TYPvLwQIDAQAB"+
                                                 "AoGBAJ7ZyzChRFLjBy8SzPRcT/NGCnhy8bi2LRhF/RmyDacKV2IQFguDJO6YbUDI"+
                                                 "RTUFzjlwr8+sG7T+YvvdISCDJ1Wp7TFiBdCeMydSJfH2lbNn63eDTHYOB9zXb/tY"+
                                                 "Th/FaAMDbxgNJIc19SRYUfRSPTU5IeZOwJzjpohhPZ+oByfxAkEA+BBKpldXnHiT"+
                                                 "5jCOSa8eTyccaAk11BDROJ9yGqVI7KJ3E/Bu76FxO1kaV7skMf/XQk5E/J+QTCP0"+
                                                 "S+pY13InEwJBAO0KorKqir/PbeUn3KC6BtLSA93MkXFSHPp/TF2DdI3qdq3Lh4az"+
                                                 "bzUQAkRZEj3Ti89VOU/ca29OhH+n1YJteFsCQQDLFONYXMb/9YL3f6btUe1ZVaae"+
                                                 "0XN9AquWVIqgn9Ic0ED2VO8tRRkjQiYbzryqJk5/HP7DZopGm2TDxb4n2297AkAJ"+
                                                 "v2E3Zan0/0uum7gH5/511usPyOTGOzEz3949DjXRzC17Mh5tnJ1bGkBtnRgR8MwU"+
                                                 "B5YmwZKtbhYmxbkS9vt3AkBsR6CHxbtLZfFx40xX9JxzWVFuWFFRyyH5IKqBhc9x"+
                                                 "v7j176a+srWA79bm8WVynTvnUSAkHMht5qDE0iNMhnuw";
   
   //支付宝默认公钥 ，请勿修改
	public static final String PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

}
