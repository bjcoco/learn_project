/*
 *  @(#) Main.java 1.0 2017/12/25
 *
 *  Copyright (c) 2017-2020 coco All Rights Reserved.
 *  PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  Author Email: heke_coco@126.com
 */

package mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @author heke ,2017/12/25:17:30
 * @version 1.0.0
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({StaticTest.class})
public class Main {
    @Test
    public void test1() {
        PowerMockito.mockStatic(StaticTest.class);
        PowerMockito.when(StaticTest.static1()).thenReturn("static");
        String result = StaticTest.static1();
        System.out.println(result);
    }
}


/*mockito static*/
/*
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:nj-app-bootstrap.xml"})
@RunWith(PowerMockRunner.class)
@PrepareForTest({HttpUtil.class})
@PowerMockIgnore("javax.management.*")
public class BaseControllerTest{

    @Mock
    HttpServletRequest request;

    @Autowired
    private BaseController baseController;

    @Before
    public void init(){
        PowerMockito.mockStatic(HttpUtil.class);
    }

    @Test
    public void intercept_not_partner() throws Exception {
        PowerMockito.when(HttpUtil.getJdpin(request)).thenReturn("apppin1");
        String response = baseController.intercept(request);
        System.out.println("response:" + response);
        ApiResponse apiResponse = JSON.parseObject(response, ApiResponse.class);
        Map<String, Object> map = (Map<String, Object>) apiResponse.getData();
        Assert.assertEquals(3500, map.get("res_code"));
    }

    @Test
    public void intercept_partner() throws Exception {
        PowerMockito.when(HttpUtil.getJdpin(request)).thenReturn("ncjrtest");
        String response = baseController.intercept(request);
        System.out.println("response:" + response);
        ApiResponse apiResponse = JSON.parseObject(response, ApiResponse.class);
        Map<String, Object> map = (Map<String, Object>) apiResponse.getData();
        Assert.assertEquals(2000, map.get("res_code"));
    }
} */


/*mockito normal*/

/*
* package com.jd.jr.rf.country.baitiao.facade;

import com.jd.jr.rf.country.baitiao.dto.*;
import com.jd.jr.rf.country.baitiao.logic.BtAccountStatusLogic;
import com.jd.jr.rf.country.baitiao.rpc.QueryBtAccountInfoRpc;
import com.jd.jr.rf.country.baitiao.rpc.QueryDataCenterInfoRpc;
import com.wangyin.commons.util.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

import static org.mockito.Matchers.any;
@ContextConfiguration(locations = {"classpath:/spring-junit.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BtActiveServiceImplTest {

    String jdPin = "TEST008";
    String certNo = "42098120110305720X";
    String name = "泰斯特留";
    String telephone = "13477662222";

    @Autowired
    private BtAccountStatusLogic btAccountStatusLogic;
    @Mock
    private QueryDataCenterInfoRpc queryDataCenterInfoRpc;
    @Mock
    private QueryBtAccountInfoRpc queryBtAccountInfoRpc;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", "1");
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(){{
            add(new HashMap<String ,Object>(){{
                put("idcard", certNo);
                put("hit", "0");
                put("name", name);
            }});
        }};
        result.put("data", list);
        Mockito.when(queryDataCenterInfoRpc.verifyBreakFaith(any(String.class),any(String.class))).thenReturn(result);

        Map<String, Object> xbResult = new HashMap<String, Object>();
        xbResult.put("result", "1");
        xbResult.put("msg","");
        Map<String, Object> data = new HashMap<String, Object>(){{
            put("jdAccount", jdPin);
            put("idCard", certNo);
            put("freeDays", 30);
            put("phone", telephone);
            put("creditBeginTime", 2017-12-18);
            put("creditEndTime", 2017-12-31);
            put("name", name);
            put("userType", "TGY");
            put("cooperationName", "推广员");
            put("creditlimit", 500);
            put("overRate", 0.0003);
        }};
        xbResult.put("data",data);
        Mockito.when(queryDataCenterInfoRpc.queryXbCredit("notXbUser")).thenReturn(xbResult);// 非预授信名单用户
        Mockito.when(queryDataCenterInfoRpc.queryXbCredit(jdPin)).thenReturn(xbResult);

        Mockito.when(queryBtAccountInfoRpc.btAccountOpenedStatus(any(String.class))).thenReturn(new BtAccountInfoDto(){{
            setOpen(false);
        }});
        Mockito.when(queryBtAccountInfoRpc.btAccountRealNameStatus(any(String.class))).thenReturn(new BtAccountInfoDto(){{
            setRealName(true);
        }});
        Mockito.when(queryBtAccountInfoRpc.btAccountRealNameInfo(any(String.class))).thenReturn(new BtAccountInfoDto(){{
            setRealName(true);
            setName(name);
            setPin(jdPin);
            setCertNo(certNo);
            setMobile(telephone);
        }});
        btAccountStatusLogic.setQueryBtAccountInfoRpc(queryBtAccountInfoRpc);
        btAccountStatusLogic.setQueryDataCenterInfoRpc(queryDataCenterInfoRpc);

        countryBaiTiaoInfoServiceJsf.setAccountStatusLogic(btAccountStatusLogic);
    }

    @Test
    public void testGetAccoutStatus() throws Exception {
        AccountStatusRequest request = new AccountStatusRequest();
        Random random = new Random();
        String applyNo = String.valueOf(random.nextInt(1000000000));
        request.setApplyNo(applyNo);
        request.setPin("test001");
        request.setDeviceInfo(preDeviceInfo());
        AccountStatusResponse statusResponse = countryBaiTiaoInfoServiceJsf.getAccountStatus(request);
        LOGGER.info("白条账户状态查询，正常流程，request:" , request , "。返回：", statusResponse);
    }

    @Test
    public void testActiveApply_Normal() throws Exception {
        BaitiaoActiveApplyRequest activeApplyRequest = new BaitiaoActiveApplyRequest();
        Random random = new Random();
        String applyNo = String.valueOf(random.nextInt(1000000000));
        activeApplyRequest.setApplyNo(applyNo);
        activeApplyRequest.setPin(jdPin);//576温岭市李春林
        activeApplyRequest.setProvince("北京");
        activeApplyRequest.setCity("北京");
        activeApplyRequest.setArea("通州区");
        activeApplyRequest.setAddress("亦庄经济开发区");
        activeApplyRequest.setRelativeName("绿豆饼");
        activeApplyRequest.setRelativeRelation("兄弟");
        activeApplyRequest.setRelativeMobile("13521625780");
        activeApplyRequest.setNonRelativeName("油条");
        activeApplyRequest.setNonRelativeRelation("朋友");
        activeApplyRequest.setNonRelativeMobile("13521625781");
        activeApplyRequest.setRequestIp("172.0.0.1");
        activeApplyRequest.setActiveSource("JD_M");
        activeApplyRequest.setDeviceInfo(preDeviceInfo());

        BaitiaoActiveApplyResponse applyResponse = countryBaiTiaoInfoServiceJsf.active(activeApplyRequest);
        Assert.assertEquals("00000", applyResponse.getResCode());
        LOGGER.info("白条激活申请，正常流程，request:" , activeApplyRequest , "。返回：", applyResponse);
    }

    public DeviceInfo preDeviceInfo(){
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceType("xiaomi");
        deviceInfo.setTraceIp("172.0.0.1");
        deviceInfo.setOs("IOS");
        deviceInfo.setOsVersion("10.0");
        deviceInfo.setChannelInfo("h5");
        return deviceInfo;
    }

    @Autowired
    private BtActiveServiceImpl countryBaiTiaoInfoServiceJsf;

    private static final Logger LOGGER = new Logger();

}*/

/*pom*/
/*
<dependency>
<groupId>org.mockito</groupId>
<artifactId>mockito-all</artifactId>
<version>1.10.19</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>org.powermock</groupId>
<artifactId>powermock-api-mockito</artifactId>
<version>1.6.2</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>org.powermock</groupId>
<artifactId>powermock-module-junit4</artifactId>
<version>1.6.2</version>
<scope>test</scope>
</dependency>*/
